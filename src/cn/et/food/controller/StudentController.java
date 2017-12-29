package cn.et.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.service.StudentService;
import cn.et.food.utils.PageTools;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	@ResponseBody
	@RequestMapping("/queryStudent")
	public PageTools queryStudent(String sname,Integer page,Integer rows){
		return service.queryStudent(sname,page,rows);
	}
}
