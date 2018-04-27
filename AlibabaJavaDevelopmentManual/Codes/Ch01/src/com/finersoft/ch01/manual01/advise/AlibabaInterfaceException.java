package com.finersoft.ch01.manual01.advise;

/**
 * 
 * 名称：阿里巴巴接口异常类<br/>
 * 说明：当调用接口返回错误码后，可以包装成这个异常抛出<br/>
 * 
 * @author Finersoft
 * @date 2018年4月27日
 */
public class AlibabaInterfaceException extends Exception {
	public AlibabaInterfaceException(String message) {
		super(message);
	}
}
