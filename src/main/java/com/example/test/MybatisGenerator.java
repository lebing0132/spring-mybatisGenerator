package com.example.test;

import org.mybatis.generator.api.ShellRunner;

public class MybatisGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args = new String[] { "-configfile", "src\\main\\resources\\dbtools\\dbConfig.xml", "-overwrite" };
        ShellRunner.main(args);

	}

}
