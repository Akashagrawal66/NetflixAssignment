package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel {
    private String name;
    @ManyToMany
    private List<Video> videos;
}
