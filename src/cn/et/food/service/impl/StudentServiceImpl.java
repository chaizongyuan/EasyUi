package cn.et.food.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.food.dao.StudentMapper;
import cn.et.food.service.StudentService;
import cn.et.food.utils.PageTools;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper sm;
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	public PageTools queryStudent(String sname,Integer page,Integer rows){
		if(sname==null){
			sname="";
		}
		//发起sql语句查询总记录数
		int total=queryStudentCount(sname);
		// limit 开始位置,总记录数
		PageTools pts=new PageTools(page, total, rows);
		pts.setRows(sm.queryStudent(sname, pts.getStartIndex()-1, rows));
		return pts;
	}
	
	public int queryStudentCount(String sname){
		return sm.queryStudentCount(sname);
	}
	
}
