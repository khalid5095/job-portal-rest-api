package com.khalid.jobapp.service;

import com.khalid.jobapp.model.JobPost;
import com.khalid.jobapp.repository.JobRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepo repo;

    // Constructor Injection
    public JobService(JobRepo repo) {
        this.repo = repo;
    }

    //  Add Job
    public JobPost addJob(JobPost job) {
        return repo.save(job);
    }

    //  Get All Jobs
    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    //  Get Job by ID
    public JobPost getJob(int id) {
        return repo.findById(id).orElse(null);
    }

    // Delete Job
    public void deleteJob(int id) {
        repo.deleteById(id);
    }
    // update the job
    public JobPost updateJob(int id, JobPost jobPost) {
        JobPost existJob=repo.findById(id).orElse(null);

        if (existJob != null){
            existJob.setPostProfile(jobPost.getPostProfile());
            existJob.setPostDesc(jobPost.getPostDesc());
            existJob.setReqExperience(jobPost.getReqExperience());
            existJob.setPostTechStack(jobPost.getPostTechStack());
            return repo.save(existJob);
        }
        return null;
    }
}