package com.ss.demo.forFun;

import org.junit.Test;

import java.io.File;

/*
删除重复文件(递归)

*/
public class deleteDuplicate {

	@Test
	public void main( ) {

		File file = new File("G:\\test\\代码 - 副本 - 副本");
		testFile(file);
	}
	public void testFile(File file){
		System.out.println(file.getName());
		String test = "(1)";
		File[] files = file.listFiles();
		for(File file1 : files){
			//如果是文件先判断文件名是否含(1),是就删除
			if(file1.isFile()){
				//str.indexOf()函数，如果含有指定字符返回-1
				if(file1.getName().indexOf(test)!=-1){
					file1.delete();
				}
				// 如果是文件夹，走递归循环，将本文件名以参数形式传过去
			}else if(file1.isDirectory()){
				testFile(file1);
			}
		}
	}

}
