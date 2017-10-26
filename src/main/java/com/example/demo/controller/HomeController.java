package com.example.demo.controller;

import com.example.demo.entity.GirlMapper;
import com.example.demo.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 80657 on 2017/10/26.
 */
@RestController
public class HomeController {

    @Autowired
    GirlMapper mapper;

    @GetMapping("index")
    public List<Girl> Test() {
      return   mapper.selectAll();
    }

}
