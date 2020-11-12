package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Override
    public Orders findById(String ordersId) throws Exception {
        return iOrdersDao.findById(ordersId);
    }

    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return iOrdersDao.findAll();
    }
}
