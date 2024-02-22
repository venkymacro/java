package com.example.candidateservice.Controller;


import com.example.candidateservice.CandidateService.CandidateService;
import com.example.candidateservice.CustomExceptions.NotFoundException;
import com.example.candidateservice.Model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {
    @Autowired
    private CandidateService candidateService;
    @PostMapping("/candidate")
    public ResponseEntity<?> addCandidate(@RequestBody Candidate candidate){
        if(candidateService.addCandidate(candidate)==null)
            return new ResponseEntity<String>("Candidate Already Present with id " + candidate.getId(),HttpStatus.CONFLICT);
        return new ResponseEntity<String>("Candidate with id "+ candidate.getId() + " created",HttpStatus.CREATED);
    }


    @GetMapping("/candidate/{id}")
    public ResponseEntity<?> getCandidate(@PathVariable int id){
        try {
            Candidate candidate = candidateService.getCandidate(id);
            return new ResponseEntity<Candidate>(candidate, HttpStatus.OK);
        }
        catch (NotFoundException exp){
            return new ResponseEntity<String>("Candidate with id " + id + " not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/candidates")
    public ResponseEntity<List<Candidate>> getCandidates(){
        List<Candidate> candidates = candidateService.Listcandidates();
        return new ResponseEntity<List<Candidate>>(candidates,HttpStatus.OK);
    }

    @DeleteMapping("/candidate/{id}")
    public ResponseEntity<?> deleteCandidate(@PathVariable int id){
        if(candidateService.deleteCandidate(id) == false){
            return new ResponseEntity<String>("Candidate with id "+id +" not present",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>("Candidate deleted", HttpStatus.ACCEPTED);
    }

    @PutMapping("/candidate")
    public ResponseEntity<?> updateCandidate(@RequestBody Candidate candidate){
        if(candidateService.updateCandidate(candidate) == true)
            return new ResponseEntity<String>("Candidate details updated", HttpStatus.CREATED);
        return new ResponseEntity<String>("Candidate not found to update", HttpStatus.NOT_FOUND);
    }

}
