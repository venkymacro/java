package com.example.candidateservice.Repository;

import com.example.candidateservice.Model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CandidateRepo extends JpaRepository<Candidate,Integer> {
;   Optional<Candidate> findById(int id);
}
