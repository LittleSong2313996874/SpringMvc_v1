package com.ss.demo.forFun;

import org.junit.Test;

import java.io.File;

/*
ɾ���ظ��ļ�(�ݹ�)

*/
public class deleteDuplicate {

	@Test
	public void main( ) {

		File file = new File("G:\\test\\���� - ���� - ����");
		testFile(file);
	}
	public void testFile(File file){
		System.out.println(file.getName());
		String test = "(1)";
		File[] files = file.listFiles();
		for(File file1 : files){
			//������ļ����ж��ļ����Ƿ�(1),�Ǿ�ɾ��
			if(file1.isFile()){
				//str.indexOf()�������������ָ���ַ�����-1
				if(file1.getName().indexOf(test)!=-1){
					file1.delete();
				}
				// ������ļ��У��ߵݹ�ѭ���������ļ����Բ�����ʽ����ȥ
			}else if(file1.isDirectory()){
				testFile(file1);
			}
		}
	}

}
