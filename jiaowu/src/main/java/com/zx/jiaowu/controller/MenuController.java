package com.zx.jiaowu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zx.jiaowu.data.pojo.Student;
import com.zx.jiaowu.service.MenuService;
/**
 * 
 * @author farmer
 * @time 2018年4月12日 下午10:39:08
 */
@RequestMapping("menu")
@RestController
public class MenuController {
	@Autowired
	MenuService menuService;

	@GetMapping()
	public List<Student> queryAll() {
		List<Student> students = new ArrayList<>();

		Student student = new Student();
		student.setName("张三");
		student.setMath("99");
		student.setSex("男");
		students.add(student);
		student = new Student();
		student.setName("李四");
		student.setMath("98");
		student.setSex("女");
		students.add(student);

		return students;
	}

	// @GetMapping("/{name}")
	// public Student sayHello(@PathVariable String name) {
	//
	// Student student = new Student();
	// student.setName(name);
	// student.setMath("99");
	// student.setSex("男");
	//
	// return student;
	// }

	@GetMapping("/{name}")
	public String sayHello(@PathVariable String name) {

		return menuService.sayHello(name);
	}

}
