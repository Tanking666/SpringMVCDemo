package com.springmvcdemo.system.service.impl;

import com.springmvcdemo.system.service.SystemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author KXY
 * @date Created in 2019/12/16 0:24
 */
@Service("systemService")
@Transactional
public class SystemServiceImpl implements SystemService {

	@Override
	public void say() {
		System.out.println(123456);
	}
}
