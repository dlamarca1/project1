package com.dio.project1.service;

import com.dio.project1.model.Workday;
import com.dio.project1.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkService {

    WorkRepository workRepository;

    @Autowired
    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    public Workday saveWork(Workday workday){
        return workRepository.save(workday);
    }

    public List<Workday> findALl() {
        return workRepository.findAll();
    }

    public Optional<Workday> getById(Long idWork) {
        return workRepository.findById(idWork);
    }

    public Workday updateWork(Workday workday){
        return workRepository.save(workday);
    }

    public void deleteWork(Long idWork) {
        workRepository.deleteById(idWork);
    }
}