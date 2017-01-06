package com.yingjun.ssm;

import com.yingjun.ssm.server.JettyServerStart;

public class BeautyStart {

	public static void main(String[] args) throws Exception {
		String webapp = "src/main/webapp";
        new JettyServerStart(webapp, 8080, "/").start();
    }
	
}
