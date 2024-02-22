package com.example.candidateservice.CandidateService;

import com.example.candidateservice.CustomExceptions.NotFoundException;
import com.example.candidateservice.Model.Candidate;
import com.example.candidateservice.Repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepo candidateRepo;

    public Candidate addCandidate(Candidate candidate){
            if(candidateRepo.existsById(candidate.getId())) return null;
            return candidateRepo.save(candidate);
    }

    public Candidate getCandidate(int id) throws NotFoundException{
        Candidate candidate = candidateRepo.findById(id).orElseThrow(NotFoundException::new);
        return candidate;
    }

    public List<Candidate> Listcandidates(){
        return candidateRepo.findAll();
    }

    public Boolean deleteCandidate(int id){
        if(candidateRepo.existsById(id)){
            candidateRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public Boolean updateCandidate(Candidate candidate){
        if(candidateRepo.existsById(candidate.getId())){
            candidateRepo.save(candidate);
            return true;
        }
        return false;
    }
}

