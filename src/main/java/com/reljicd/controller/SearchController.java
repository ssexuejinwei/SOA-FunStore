package com.reljicd.controller;

import com.reljicd.model.Product;
import com.reljicd.service.ProductService;
import com.reljicd.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class SearchController {
    private static final int INITIAL_PAGE = 0;

    private final ProductService productService_s;

    @Autowired
    public SearchController(ProductService productService) {
        this.productService_s = productService;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView search(String name) {

        Iterable<Product> products = productService_s.findByNameIsContaining(name);

        ModelAndView modelAndView_s = new ModelAndView();
        modelAndView_s.addObject("products", products);
        modelAndView_s.setViewName("/home");
        return modelAndView_s;
    }
}
