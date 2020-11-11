package com.itheima.ssm.controller;


import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/orders")
@Controller
public class OrderController {

    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Orders> all = iOrdersService.findAll();
        mv.addObject("",all);
        mv.setViewName("");
        return mv;
    }

}
