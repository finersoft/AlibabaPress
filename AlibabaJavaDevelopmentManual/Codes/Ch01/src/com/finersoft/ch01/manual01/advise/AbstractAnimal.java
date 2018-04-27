package com.finersoft.ch01.manual01.advise;

/**
 * 
 * 名称：动物类-抽象类<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年4月27日
 */
public abstract  class AbstractAnimal extends BaseLivings {
	/**
	 * 动物一般没有叶绿体，是靠吃东西来维持新陈代谢的。<br/>
	 * 但是有一种例外，说某种动物可以吃进植物，把叶绿体保存在体内进行光合作用。逆天了。
	 */
	public abstract  void eat();
}