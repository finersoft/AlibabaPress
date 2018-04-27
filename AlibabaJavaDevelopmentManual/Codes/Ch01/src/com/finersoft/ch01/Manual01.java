package com.finersoft.ch01;

/**
 * 
 * ���ƣ���̹�Լ-�������<br/>
 * ˵����<br/>
 * 
 * @author Finersoft
 * @date 2018��4��27��
 */
public class Manual01 {

	// 1. ��ǿ�ơ� �����е��������������»��߻���Ԫ���ſ�ʼ��Ҳ�������»��߻���Ԫ���Ž�����
	// ����
	private String name;
	// ���������ᱨ�����ǲ����Ϲ淶
	private String _name;
	private String __name;
	private String $name;
	private String name_;
	private String name$;
	private String name__;

	// 2. ��ǿ�ơ� �����е������Ͻ�ʹ��ƴ����Ӣ�Ļ�ϵķ�ʽ����������ֱ��ʹ�����ĵķ�ʽ��
	// ˵���� ��ȷ��Ӣ��ƴд���﷨�������Ķ���������⣬�������塣ע�⣬��ʹ��ƴ��������ʽҲҪ������á�
	// ������ alibaba / taobao / youku / hangzhou �ȹ���ͨ�õ����ƣ� ����ͬӢ�ġ�
	// ���û��д��aLiBaBa,taoBao,youKu��hangZhou����������Ϊ��Щ��Ӣ������һ�����ʣ���ʹ��ʱ�������м䴩��ո�Finersoft
	// ��ע��
	private String alibaba;
	private String taobao;
	private String youku;
	private String hangzhou;
	// ������ DaZhePromotion [����] / getPingfenByName() [����] / int ĳ���� = 3
	private String DaZhePromotion;

	/**
	 * ͨ�����ƻ�ȡ����
	 * 
	 * @return
	 */
	public int getPingfenByName() {
		return 0;
	}

	private int ĳ���� = 3;
	// 3. ��ǿ�ơ�����ʹ�� UpperCamelCase ��񣬵������������⣺ DO / BO / DTO / VO / AO / PO �ȡ�
	// ������ MarcoPolo / UserDO / XmlService / TcpUdpDeal / TaPromotion
	// ������ macroPolo / UserDo / XMLService / TCPUDPDeal / TAPromotion
	// 			�����ļ���

	// 4. ��ǿ�ơ�������������������Ա�������ֲ�������ͳһʹ�� lowerCamelCase ��񣬱�������շ���ʽ��
	// ������ localValue / getHttpMessage() / inputUserId
	private int localValue;
	public Object getHttpMessage() {
		return null;
	}
	public int inputUserId;
	// 5. ��ǿ�ơ���������ȫ����д�����ʼ����»��߸��������������������������Ҫ�����ֳ���
	// ������ MAX_STOCK_COUNT
	
	/**
	 * ���������
	 */
	public static final  int  MAX_STOCK_COUNT=1000;
	// ������ MAX_COUNT
	/**
	 * �����ˣ��������
	 * �����ˣ����ʲô�����������ʺţ�
	 */
	public static final  int  MAX_COUNT=1000;
	
	// 6. ��ǿ�ơ�����������ʹ�� Abstract �� Base ��ͷ�� �쳣������ʹ�� Exception ��β�� ��������������Ҫ���Ե�������ʼ���� Test ��β��
	//		�����ļ��� AbstractAnimal ,BaseLivings,AlibabaInterfaceException,Manual01Test
	// 7. ��ǿ�ơ������������Ž����������������顣
	// ������ ������������ int[] arrayDemo;
	private  int[] arrayDemo; 
	// ������ �� main �����У�ʹ�� String args[]�����塣
	public static void main(String args[]) {

	}

	// 8. ��ǿ�ơ� POJO ���в������͵ı���������Ҫ�� is ǰ׺�����򲿷ֿ�ܽ������������л�����
	private  boolean alreadyDeleted ;
	// ������ ����Ϊ������������ Boolean isDeleted�� �����ԣ����ķ���Ҳ�� isDeleted()�� RPC����Ͱ� Java �����ֲ����ڷ��������ʱ�� ������Ϊ�� ��Ӧ������������ deleted���������Ի�ȡ�����������׳��쳣��
	private  boolean isDeleted ;
	private  boolean isDeleted() {
		return false;
	} ;

	// 9. ��ǿ�ơ�����ͳһʹ��Сд����ָ���֮�����ҽ���һ����Ȼ�����Ӣ�ﵥ�ʡ�����ͳһʹ��
	// ������ʽ��������������и������壬��������ʹ�ø�����ʽ��
	// ������ Ӧ�ù��������Ϊ com.alibaba.ai.util������Ϊ MessageUtils���˹���ο� spring
	// �Ŀ�ܽṹ��
	
	//������������д�Ǻö��ļ��н�������2333
	//		com.finersoft.ch01 
	
	
	// 10. ��ǿ�ơ��ž���ȫ���淶����д�� �������Ĳ�֪�塣
	// ������ AbstractClass����д�� ������ AbsClass�� condition����д�� ������ condi��������
	// ����д���ؽ����˴���Ŀ��Ķ��ԡ�
	//finersoft�����abs������һ������ȡ����ֵ�����������Ƿ�����ϵͳ���������׻�����condiһ�ۿ�������condition����д�������ڲ²�͸(�����ʱ��ʱ���ĳ�Ĭ����Ҳ����ȥ׷��~̫�࣬����̽Ϊ�˴˵���������)
	// 11. ���Ƽ���Ϊ�˴ﵽ�����Խ��͵�Ŀ�꣬�κ��Զ�����Ԫ��������ʱ��ʹ�þ��������ĵ���
	// �����������⡣
	// ������ ��Զ�ֿ̲���ȡ�����������Ϊ PullCodeFromRemoteRepository��
	// ������ ���� int a; ������������ʽ��
	private int a; 
	// 12. ���Ƽ������ģ�顢 �ӿڡ��ࡢ����ʹ�������ģʽ��������ʱ���ֳ�����ģʽ��
	// ˵���� �����ģʽ�����������У��������Ķ��߿������ܹ�������
	// ������ public class OrderFactory;
	// public class LoginProxy;
	// public class ResourceObserver;
	// 13. ���Ƽ����ӿ����еķ��������Բ�Ҫ���κ����η��ţ�public Ҳ��Ҫ�ӣ� �����ִ���ļ��
	// �ԣ���������Ч�� Javadoc ע�͡�������Ҫ�ڽӿ��ﶨ����������һ��Ҫ����������϶���
	// ��ӿڷ�����أ�����������Ӧ�õĻ���������
	// ������ �ӿڷ���ǩ�� void f();
	// �ӿڻ������� String COMPANY = "alibaba";
	// ������ �ӿڷ������� public abstract void f();
	// ˵���� JDK8 �нӿ�������Ĭ��ʵ�֣���ô��� default �������Ƕ�����ʵ���඼�м�ֵ��Ĭ
	// ��ʵ�֡�
	// 14. �ӿں�ʵ��������������׹���
	// 1�� ��ǿ�ơ����� Service �� DAO �࣬���� SOA �������¶�����ķ���һ���ǽӿڣ��ڲ�
	// ��ʵ������ Impl �ĺ�׺��ӿ�����
	// ������ CacheServiceImpl ʵ�� CacheService �ӿڡ�
	// 2�� ���Ƽ��� ��������������Ľӿ����ƣ�ȡ��Ӧ�����ݴ�Ϊ�ӿ�����ͨ���ǨCable ����ʽ�� ��
	// ������ AbstractTranslator ʵ�� Translatable������Ͱ� Java �����ֲ�
	// 3/36
	// 15. ���ο���ö������������� Enum ��׺��ö�ٳ�Ա������Ҫȫ��д�����ʼ����»��߸�����
	// ˵���� ö����ʵ��������ĳ����࣬�ҹ��췽����Ĭ��ǿ����˽�С�
	// ������ ö������Ϊ ProcessStatusEnum �ĳ�Ա���ƣ� SUCCESS / UNKNOWN_REASON��
	// 16. ���ο�������������Լ��
	// A) Service/DAO �㷽��������Լ
	// 1�� ��ȡ��������ķ����� get ��ǰ׺��
	// 2�� ��ȡ�������ķ����� list ��ǰ׺��
	// 3�� ��ȡͳ��ֵ�ķ����� count ��ǰ׺��
	// 4�� ����ķ����� save/insert ��ǰ׺��
	// 5�� ɾ���ķ����� remove/delete ��ǰ׺��
	// 6�� �޸ĵķ����� update ��ǰ׺��
	// B) ����ģ��������Լ
	// 1�� ���ݶ��� xxxDO�� xxx ��Ϊ���ݱ�����
	// 2�� ���ݴ������ xxxDTO�� xxx Ϊҵ��������ص����ơ�
	// 3�� չʾ���� xxxVO�� xxx һ��Ϊ��ҳ���ơ�
	// 4�� POJO �� DO/DTO/BO/VO ��ͳ�ƣ���ֹ������ xxxPOJO
	//
	//


}
