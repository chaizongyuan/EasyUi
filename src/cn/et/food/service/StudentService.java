package cn.et.food.service;

import cn.et.food.utils.PageTools;

public interface StudentService {

	public abstract PageTools queryStudent(String sname,Integer page,Integer rows);

}