package com.tobias.identity_service.dto.request;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserCreationRequest {

    @Size(min=6,message = "Username must have 6 character")
    private String username;
    @Size(min=4,message = "Password must have 4 character")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBrith;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }
}
