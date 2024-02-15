package com.practice.practice1.controller;

import com.practice.practice1.model.Model;
import com.practice.practice1.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class PracticeController {
    @Autowired
    ModelRepository modelRepository;
    @GetMapping("/practice1")
    public List<Model> getAllElementsOfModel() {
        return modelRepository.findAll();
    }

    @GetMapping("/practice1/{id}")
    public Optional<Model> getModelById(@PathVariable Long id) {
        Optional<Model> model = modelRepository.findById(id);
        return model;
    }

    @PostMapping("/practice1")
    public Model addElementToModel(@RequestBody Model model){
        return modelRepository.save(model);
    }

    @DeleteMapping("/practice1/{id}")
    public ResponseEntity<Void> deleteElementFromModel(@PathVariable Long id){
        modelRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
