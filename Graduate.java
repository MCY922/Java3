package Interface;
public class Graduate implements student ,teacher{
	String name,sex;
	int age;
	double fee,pay;
	public Graduate(String name,String sex,int age,double fee,double pay){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}
	public void setPay(double pay){ //����һ������(�ֲ�����)
		this.pay = pay;  //���ֲ�������ֵ���ݸ���Ա����
	}
	public double getPay(){
		return this.pay;
	}
	public void setFee(double fee){
		this.fee = fee;
	}
	public double getFee(){
		return this.fee;
	}

}