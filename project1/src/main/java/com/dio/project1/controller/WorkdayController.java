package com.dio.project1.controller;

import com.dio.project1.model.Workday;
import com.dio.project1.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/work")
public class WorkdayController {
    @Autowired
    WorkService workService;

    @PostMapping
    public Workday createWork(@RequestBody Workday workday){
        return workService.saveWork(workday);
    }

    @GetMapping
    public List<Workday> getWorkList(){
        return  workService.findALl();
    }

    @GetMapping("/{idWok}")
    public ResponseEntity<Workday> getWorkByID(@PathVariable("idWork") long idWork) throws Exception {
      return ResponseEntity.ok(workService.getById(idWork).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Workday UpdateWork(@RequestBody Workday workday){

        return workService.updateWork(workday);
    }

    @DeleteMapping("/{idWok}")
    public ResponseEntity deleteByID(@PathVariable("idWork") long idWork) throws Exception {
        try {
            workService.deleteWork(idWork);
        } catch (Exception e){
            System.out.println(e.getMessage());
            final var gone = HttpStatus.GONE;
        }
        return (ResponseEntity<Workday>) ResponseEntity.ok();
    }

}
