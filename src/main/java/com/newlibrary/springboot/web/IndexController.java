package com.newlibrary.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * トップページのコントローラー
 *
 * @author yamaguchi.saori
 *
 */
@Controller
public class IndexController {

	/**
	 * トップページを表示する
	 *
	 * @return テンプレートのパス
	 */
	@RequestMapping("/")
	public String showTopPage() {
		return "Index";
	}
}
