package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;


import java.util.List;


public interface IPermissionService {

    List<Permission> findAll()throws Exception;

    void save(Permission permission)throws Exception;

    Permission findById(String id) throws Exception;


    void deleteById(String id) throws Exception;
}

