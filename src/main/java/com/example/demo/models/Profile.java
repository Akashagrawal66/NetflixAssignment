package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Profile extends BaseModel{
    private String name;
    private String profileType;
}
