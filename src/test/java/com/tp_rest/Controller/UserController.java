package com.tp_rest.Controller;

import com.tp_rest.DTO.UserDTO;
import com.tp_rest.Entity.User;
import com.tp_rest.Service.UserImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserImplement users;

    @GetMapping("")
    public List<User> list() {
        List<User> list = users.List();

        return list;
    }
    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<User>(users.Save(user), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable(value = "id") Long Id) {
        return users.Get(Id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long userId) {
        users.Delete(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable(value = "id") Long Id,
                          @RequestBody User details) {
        return users.Update(Id, details);
    }
}
