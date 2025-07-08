package com.tobias.identity_service.controller;



import com.tobias.identity_service.dto.request.UserCreationRequest;
import com.tobias.identity_service.dto.request.UserUpdateRequest;
import com.tobias.identity_service.entity.User;
import com.tobias.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
   @Autowired
   private UserService userService;

   @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
       return userService.createUser(request);
   }

   @GetMapping
   List<User> getUser(){
      return userService.getListUser();
   }

   @GetMapping("/{id}")
   User getUserById(@PathVariable String id){
      return userService.getUserById(id);
   }

   @PutMapping("/{id}")
   User updateUser(@PathVariable String id,@RequestBody UserUpdateRequest request){
      return userService.updateUser(id,request);
   }
   @DeleteMapping("/{id}")
   String deleteUser(@PathVariable String id){
      userService.deteleUser(id);
      return "User has been deleted success";
   }
}
