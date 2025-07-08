package com.tobias.identity_service.service;


import com.tobias.identity_service.dto.request.UserCreationRequest;
import com.tobias.identity_service.dto.request.UserUpdateRequest;
import com.tobias.identity_service.entity.User;
import com.tobias.identity_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(UserCreationRequest request){
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBrith(request.getDateOfBrith());

        return userRepository.save(user);

    }

    public List<User> getListUser(){
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public User updateUser(String id,UserUpdateRequest request){
        User user = getUserById(id);
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBrith(request.getDateOfBrith());
        return userRepository.save(user);
    }

    public void deteleUser(String id){
        userRepository.deleteById(id);
    }
}
