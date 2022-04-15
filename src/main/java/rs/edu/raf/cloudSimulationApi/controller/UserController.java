package rs.edu.raf.cloudSimulationApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import rs.edu.raf.cloudSimulationApi.domain.User;
import rs.edu.raf.cloudSimulationApi.service.UserService;

@RestController
@RequestMapping(path="/user")
@CrossOrigin()
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(@Qualifier("UserServiceImpl") UserService userService){
        this.userService=userService;
    }
    @PostMapping()
    @CrossOrigin()
    public void createUser(@RequestBody User user){
        System.out.println(user.toString());
        System.out.println("ide gasssssssss");
        this.userService.createUser(user);
    }
}
