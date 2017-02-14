package com.hanbit.hp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanbit.hp.dao.MainDAO;
import com.hanbit.hp.dao.SuckDAO;

@Service
public class MainService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MemberService.class);
	
	private static final String SECRET_KEY ="hanbit";
	
	
	@Autowired
	private	MainDAO mainDAO;
	
	public List<String> getMainImgs(){
		return mainDAO.selectMainImgs();

	}
	
}
