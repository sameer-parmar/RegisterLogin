package com.example.RegisterLogin.EmployeeController;

import com.example.RegisterLogin.Dto.EmployeeDto;
import com.example.RegisterLogin.Dto.LoginDto;
import com.example.RegisterLogin.Service.EmployeeService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")



public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path="/register")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto){
        String id=employeeService.addEmployee(employeeDto);
        return id;
    }
    @PostMapping(path="/login")
    public ResponseEntity<?>loginEmployee(@RequestBody LoginDto loginDto)
    {
        LoginResponse loginResponse=employeeService.loginEmployee(loginDto);
        return ResponseEntity.ok(loginResponse);
    }
    @GetMapping(path="/fetch/{username}")
    public ResponseEntity<?> fetchEmployee(@PathVariable String username){
        EmployeeDto employeeDto = employeeService.fetchEmployeeByUsername(username);
        if(employeeDto!=null){
            return ResponseEntity.ok(employeeDto);
        }else{
            return ResponseEntity.status(404).body("no user found");
        }

    }
}
