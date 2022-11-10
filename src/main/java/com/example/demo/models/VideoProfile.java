package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class VideoProfile extends BaseModel {
    @ManyToOne
    private Profile profile;
    @ManyToOne
    private Video video;
    private String status;
    private LocalDateTime lastWatchTime;
}
