package com.example.demo.user.controller;


import com.example.demo.common.vo.LastPageReq;
import com.example.demo.user.entity.User;
import com.example.demo.user.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Ryan
 * @since 2021-06-18
 */
@RestController
@RequestMapping("/v1/user/")
public class UserController {

    private final IUserService userService;


    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("getById/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @ApiOperation("禁止分页， 只允许查下一页")
    @PostMapping("page")
    public List<User> page(@RequestBody LastPageReq<User> req) {
        return userService.getPage(req);
    }

    @PostMapping("/insert")
    public Long insert(@RequestBody User user) {
        userService.save(user);
        return user.getId();
    }


}

