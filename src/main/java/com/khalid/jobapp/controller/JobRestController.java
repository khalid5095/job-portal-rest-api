package com.khalid.jobapp.controller;

import com.khalid.jobapp.model.JobPost;
import com.khalid.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    JobService jobService;
    // get all jobs
    @GetMapping("/jobposts")
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }
    // get job by id
    @GetMapping("/jobpost/{id}")
    public JobPost getJobById(@PathVariable int id){
        return jobService.getJob(id);
    }
    // add jobs
    @PostMapping("/jobposts")
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        return jobService.addJob(jobPost);
    }
    //delete by id
    @DeleteMapping("/jobpost/{id}")
    public void deleteJob(@PathVariable int id){
        jobService.deleteJob(id);
    }
    //update a job
    @PutMapping("/jobpost/{id}")
    public JobPost updateJob(@PathVariable int id, @RequestBody JobPost jobPost){
        return jobService.updateJob(id,jobPost);
    }
}
