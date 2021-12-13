package com.tp_rest.Service;

import com.tp_rest.DTO.UserDTO;
import com.tp_rest.Entity.User;

import java.util.List;

public interface UserInterface {
    List<User> List();
    User Save(User user);
    User Get(long id);
    UserDTO Update(Long id, User personne);
    void Delete(long id);
}

