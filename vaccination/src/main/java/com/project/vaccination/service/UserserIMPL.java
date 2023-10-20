package com.project.vaccination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.vaccination.model.UserDetail;
import com.project.vaccination.repository.Userrepo;

@Service

public class UserserIMPL implements Userser{
    @Autowired
    Userrepo obj;

    public UserserIMPL(){}

    @Override
    public UserDetail addUser(UserDetail userdatail) {
        UserDetail u = obj.save(userdatail);
        return u;
    }
    
    @Override
     public List<UserDetail> getAllUserModels() {
        return obj.findAll();
    }
   
    
}
