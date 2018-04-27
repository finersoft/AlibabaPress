package com.finersoft.ch01.manual01.advise;
/**
 * 
 * 名称：生物<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年4月27日
 */
public abstract class BaseLivings {
	/**
	 * 告诉调用方是不是活着。
	 * @return 子类需要重写此方法来告诉调用者，被调用的生物是不是活着。<br/>
	 * 活着的生物是生物，死去的生物是其他生物的食物。 
	 */
	public abstract boolean isLive();
}
