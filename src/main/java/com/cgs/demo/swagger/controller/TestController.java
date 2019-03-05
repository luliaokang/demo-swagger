package com.cgs.demo.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
@Api(value = "测试", tags = "hello service")
public class TestController {
	
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	@ApiOperation(value = "测试接口1")
	public String hello(
			@ApiParam(required = false, value = "姓名") @RequestParam(required = false) String name) {
		return "hello," + name;
	}
	
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	@ApiOperation(value = "测试接口2")
	public String hello2(
			@ApiParam(required = false, value = "姓名") @RequestParam(required = false) String name) {
		return "hello," + name;
	}
}
