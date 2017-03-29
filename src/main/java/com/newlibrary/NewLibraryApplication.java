package com.newlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//起動クラス
@SpringBootApplication
public class NewLibraryApplication {

	/**
	 * 処理を実行する
	 * @param args 引数
	 * @throws Exception 例外が発生した場合
	 */
	public static void main(String[] args) {
		SpringApplication.run(NewLibraryApplication.class, args);
	}
}
