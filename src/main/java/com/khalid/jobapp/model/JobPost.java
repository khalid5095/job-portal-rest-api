package com.khalid.jobapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity   // Marks this class as database table
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    private String postProfile;
    private String postDesc;
    private Integer reqExperience;

    @ElementCollection
    private List<String> postTechStack;

    // Default constructor
    public JobPost() {}

    // Getters and Setters

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public Integer getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(Integer reqExperience) {
        this.reqExperience = reqExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }
}