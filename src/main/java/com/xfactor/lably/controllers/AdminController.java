package com.xfactor.lably.controllers;

import java.util.ArrayList;

import com.xfactor.lably.entity.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    ArrayList<admin> admins = new ArrayList<>();

    @PostMapping("/addAdmin")
    public admin addAdmin(@RequestBody admin A1) {
        admins.add(A1);
        return A1;
    }

    @GetMapping("/getAdmin")
    public ArrayList<admin> getAdmin() {
        for(int i =0;i<5;i++)
        {
            admin obj=new admin();
            obj.setName("kkk");
            obj.setPassword("lolz");
            obj.setUser("k.k.k");
            admins.add(obj);
        }
        return admins;
    }

    @GetMapping("/getAdmin/{name}")
    public admin getAdmin(@PathVariable String name) {
        admin res=new admin();
        for (admin k : admins) 
        { 
            if(k.getName().equals(name))
            {
                return k;
            }
        }
        return res;
    }
}