package com.yingjun.ssm;

import com.micai.jetty.start.JettyServerStart;

public class BeautyStart {

	public static void main(String[] args) throws Exception {
		String webapp = "src/main/webapp";
        new JettyServerStart(webapp, 8090, "/").start();
    }
	
}
