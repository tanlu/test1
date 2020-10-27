package com.gjl.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gjl on 2020/10/27.
 */
@Controller
public class MyController {
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		return "hello";
	}
}
