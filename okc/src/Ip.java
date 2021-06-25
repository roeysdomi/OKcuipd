import java.util.Random;

public class Ip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions fun= new Functions();
		//fun.changeip();
          Ip p=new Ip();
          p.number();
	}
	
	public String number()

	{
		String num="053";
		 Random g = new Random();
         
		for(int i=0;i<7;i++)
		{
			
			num=num+g.nextInt(9);
		}
		return num;
	}
}
