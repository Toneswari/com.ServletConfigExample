package com.ServletConfigExample;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrainServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		ServletConfig cfg=getServletConfig();
		String str=cfg.getInitParameter("JOB");
		res.getWriter().println("training job is"+ str);
	}

}
