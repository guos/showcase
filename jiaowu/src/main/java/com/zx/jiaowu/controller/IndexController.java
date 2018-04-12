package com.zx.jiaowu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("main")
public class IndexController {

	@GetMapping("menu")
	String getHome() {
		return "/pages/menu.html";
	}

	@GetMapping("json")
	@ResponseBody
	String getHome2() {
		return "/pages/menu.html";
	}

}
