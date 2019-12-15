package com.springmvcdemo.controller;

import com.springmvcdemo.mapper.VideoMapper;
import com.springmvcdemo.pojo.Video;
import com.springmvcdemo.pojo.VideoExample;
import com.springmvcdemo.system.service.SystemService;
import com.springmvcdemo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/13 17:47
 */
@RequestMapping("/Video")
@Controller
public class VideoControll {

	@Autowired
	private VideoMapper videoMapper;
	@Autowired
	private SystemService systemService;

	@RequestMapping(params = "list")
	public ModelAndView getAll(Model model, HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
		systemService.say();
		int pageSize = StringUtil.isNumeric(req.getParameter("pageSize")) ? StringUtil.toInt(req.getParameter("pageSize")) : 10;
		int pageNum = StringUtil.isNumeric(req.getParameter("pageNum")) ? StringUtil.toInt(req.getParameter("pageNum")) : 1;
		String searchName = req.getParameter("searchName");

		ModelAndView modelAndView = new ModelAndView();
		VideoExample videoExample = new VideoExample();
		VideoExample.Criteria criteria = videoExample.createCriteria();
		criteria.andIdIsNotNull();
		videoExample.setOrderByClause(" name,'pname' ASC ");
		if (StringUtil.isNotEmpty(searchName)) {
			criteria.andPathLike("%" + searchName + "%");
		} else {
			searchName = "";
		}
		long cnt = videoMapper.countByExample(videoExample);
		videoExample.setLimmitClause((pageNum - 1) * pageSize, pageSize);
		List<Video> videos = videoMapper.selectByExample(videoExample);
		//设置模型视图用于传递到jsp
		modelAndView.addObject("items", videos);
		modelAndView.addObject("pageSize", pageSize);
		modelAndView.addObject("itemsCnt", cnt);
		modelAndView.addObject("pageNum", pageNum);
		modelAndView.addObject("searchName", searchName);

		modelAndView.setViewName("hello");
		return modelAndView;
	}

}
