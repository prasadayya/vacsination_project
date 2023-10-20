package com.project.vaccination.service;

import java.util.List;

import com.project.vaccination.model.UserDetail;

public interface Userser {
    public UserDetail  addUser(UserDetail userdatail);

    public List<UserDetail> getAllUserModels();

    
}
