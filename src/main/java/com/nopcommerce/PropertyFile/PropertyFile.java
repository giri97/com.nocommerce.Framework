package com.nopcommerce.PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	static Properties prop;
	public static String getData(String key) {
		prop=new Properties();
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(IConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return prop.getProperty(key);

	}
}
