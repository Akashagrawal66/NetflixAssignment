package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Video extends BaseModel{
    private String title;
    private String description;
    @ManyToMany(mappedBy = "videos")
    private List<Actor> actors;
}
