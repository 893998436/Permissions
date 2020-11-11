package com.qiao.ssm.controller;

import com.qiao.service.IProductService;
import com.qiao.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAll")
    public  ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Product> ps = iProductService.findAll();
            mv.addObject("productList",ps);
            mv.setViewName("product-list");
        return mv;
    }
}