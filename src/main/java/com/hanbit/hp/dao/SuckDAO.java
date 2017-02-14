package com.hanbit.hp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Driver;

@Repository
public class SuckDAO {
	private static final String URL ="jdbc:mysql://localhost:3306/hanbit?charsetEncoding=utf8";
	private static final String USERNAME ="hanbit";
	private static final String PASSWORD ="hanbit";
	
	public List selectMainImgs(){
		List imgs = new ArrayList();
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement statement=null;
		
		
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
			
			String sql = "SELECT img_url FROM tbl_main_img";
			
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			
			while(resultSet.next()){
				String imgUrl = resultSet.getString(1);
				imgs.add(imgUrl);
			}
			
			
		}
		catch(Exception e){
			
		}
		finally{
			if(resultSet !=null){
				try{
					resultSet.close();
				}
				catch(Exception e){
					
				}
			}
		}
		return imgs;
	}
}
