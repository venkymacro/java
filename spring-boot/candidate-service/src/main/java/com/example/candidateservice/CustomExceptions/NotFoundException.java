package com.example.candidateservice.CustomExceptions;
import org.springframework.http.HttpStatus;
public class NotFoundException extends Exception{
    public NotFoundException(){
            super("User Not Found");
    }
}
