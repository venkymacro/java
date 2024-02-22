package com.example.candidateservice.Model;

import jakarta.persistence.*;
@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    private int id;
    private String name;
    private int exp;

    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
