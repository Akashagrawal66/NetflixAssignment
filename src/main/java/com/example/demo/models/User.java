package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class User extends  BaseModel{
    private String email;
    private String password;
    @OneToMany
    List<Profile> profiles;
}
