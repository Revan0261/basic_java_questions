package com.api.controller;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {


    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }


    @GetMapping
    public ResponseEntity<List<RegistrationDto>> getAllRegistration() {
        List<RegistrationDto> dtos = registrationService.getAllRegistration();
        return new ResponseEntity<>(dtos, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<RegistrationDto> createReg(@RequestBody RegistrationDto registrationDto) {
        RegistrationDto regdto = registrationService.createRegistration(registrationDto);
        return new ResponseEntity<>(regdto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRegistration(@PathVariable long id, @RequestBody Registration registration) {

        registrationService.deleteRegistration(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDto> getRegistrationById(@PathVariable long id) {
        RegistrationDto dto = registrationService.getRegistrationById(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}