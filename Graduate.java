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
	public void setPay(double pay){ //定义一个参数(局部变量)
		this.pay = pay;  //将局部变量的值传递给成员变量
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