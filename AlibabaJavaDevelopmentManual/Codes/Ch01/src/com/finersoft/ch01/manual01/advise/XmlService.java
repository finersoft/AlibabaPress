package com.finersoft.ch01.manual01.advise;

import java.util.ArrayList;
import java.util.List;

public class XmlService {
	public Object getXmlObject() {
		return new Object();
	}
	
	public List<Object> listXmlObject() {
		return new ArrayList<Object>();
	}
	
	public int countXmlObjects()
	{
		return 0;
	}
	
	public int saveXmlObject(Object obj)
	{
		//�ɹ����淵��Ϊ1
		return 1;
	}
	
	public int insertXmlObject(Object obj)
	{
		//�ɹ����淵��Ϊ1
		return saveXmlObject(obj);
	}
	
	public int removeXmlObject(Object obj)
	{
		//�ɹ�ɾ������Ϊ1
		return 1;
	}
	
	public int deleteXmlObject(Object obj)
	{
		//�ɹ�ɾ������Ϊ1
		return removeXmlObject(obj);
	}
	
	public int updateXmlObject(Object obj )
	{
		return 1;
	}
}
