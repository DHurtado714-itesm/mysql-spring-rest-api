package com.api.crud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

@Service
public class UserService {

    /**
     * Use for dependency injection. It will inject the IUserRepository instance.
     */
    @Autowired
    IUserRepository userRepository;

    /**
     * Get all users.
     * 
     * @return ArrayList<UserModel> - List of all users.
     */
    public ArrayList<UserModel> getAllUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    /**
     * Get user by id.
     * 
     * @param id
     *            - User id.
     * 
     * @return UserModel - User object.
     */
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * Save user.
     * 
     * @param user
     * 
     * @return UserModel - User object.
     */
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    /**
     * Update user by id.
     * 
     * @param request
     * @param id
     * 
     * @return UserModel - User object.
     */
    public UserModel updateById(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).get();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());

        return userRepository.save(user);
    }

    /**
     * Delete user by id.
     * 
     * @param id
     */
    public Boolean deleteById(Long id) {
        try {
            userRepository.deleteById(id);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
