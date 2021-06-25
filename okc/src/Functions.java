import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Functions {
    ArrayList <String> words=new ArrayList <String>();
    HashMap<String, Integer> hebkeys = new HashMap<String, Integer>();
	
	
    //--------------------------
    public static final Pattern home= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\home.png");

    public static final Pattern nc= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\nocookies.png");
	public static final Pattern l= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\like.png");
	public static final Pattern urlpic= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\url.png");
	public static final Pattern boxpic= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\textbox.png");
	public static final Pattern mess= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\message.png");
    //--------------------------
	 public static final Pattern email= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\emailsu.png");
	 public static final Pattern pass= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\passwsu.png");
	 public static final Pattern fin= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\finishsu.png");
	///-------------------------
	 public static final Pattern fiddler= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\fiddler.png");
	 public static final Pattern doubletake= new Pattern ("C:\\Users\\roeysdomi\\Desktop\\pics\\women.png");

	 //------------------------------
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub

		
//		
		Functions fun= new Functions();
  		Screen sc =new Screen();
		
		//fun.randomclick(fun.l, (float)1);
         System.out.println(fun.createmessege());
		
	}
	
	
	public Functions()
	{
		try {
			Readwordsfile("words");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
    public void openfirefox() 
    {
    	try {
			Process p3t = Runtime
			        .getRuntime()
			        .exec("cmd /c start FireFox.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public void changeip()
	{
		try {
			Process p3t = Runtime
			        .getRuntime()
			        .exec("cmd /c netsh interface set interface Roey2 disable");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Process p3t2 = Runtime
			        .getRuntime()
			        .exec("cmd /c netsh interface set interface Roey2 enable");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public void openfirefox(String website) 
	    {
	    	try {
				Process p3t = Runtime
				        .getRuntime()
				        .exec("cmd /c start FireFox.exe -new-window \""+website+"\"");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
    //---------------------------------	
	public void Readwordsfile(String filename) throws IOException
	{
		File file = new File("C:\\Users\\roeysdomi\\Desktop\\program\\"+filename+".txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
		       String sp[]=st.split(" ");
		  
		        for(String s:sp)
		        {
		        	
		        	words.add(s);
		        }
		  } 
	}	
	public void changeurl(String s)
	{
		Screen sc =new Screen();
		Match m;
		try {
			m = sc.find(urlpic.similar((float) 0.9));
		
		
				
				Location loc =new Location(0, 0) ;
				loc.x= m.x+500;
				loc.y=m.y;
			
				System.out.println(loc);
				sc.click(loc);
		
		        sc.type(s);
		        Robot r = new Robot();
		        r.keyPress(KeyEvent.VK_ENTER);
		        r.keyRelease(KeyEvent.VK_ENTER);
		
		} catch (FindFailed | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   ///--------------------------------
	public void sendmess()
	{
		Screen sc =new Screen();
		randomclick(mess, (float)0.9);
		try {
		
		randomclick(boxpic, (float)0.9);
		String m=createmessege();
		 Robot r;
			
			r = new Robot();
		
		 r.keyPress(KeyEvent.VK_SHIFT);
		 r.keyPress(KeyEvent.VK_ALT);
	     r.keyRelease(KeyEvent.VK_SHIFT);
	     r.keyRelease(KeyEvent.VK_ALT);
		typemess();
		
		
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
		} catch (AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void typemess() throws AWTException, InterruptedException
	    {
			Screen sc =new Screen();
				
				Robot r = new Robot();
				
				TimeUnit.SECONDS.sleep(2);
				
				String str=createmessege();
				System.out.println(str);
				  for (int i = 0; i < str.length(); i++) {
					       
					      if(String.valueOf(str.charAt(i))!=null)
		               {
					    	  String g=String.valueOf(str.charAt(i));
					     if(hebkeys.containsKey(g))
					     {
					    	 System.out.println(g);
					    	 clickkey(r,hebkeys.get(g));
					     }
		               }
				    }
				  
				sc.type("?");
	    }
	public String createmessege()
	{
		
		Collections.shuffle(words);
		Random rn = new Random();
	
		int a =rn.nextInt(25 - 5 + 1) + 5;
		
		String mes="";
		for(int i=0;i<a;i++)
		{
			mes=mes+words.get(i)+" ";
		}
		
		mes=mes+"?";
		
		return mes;
	}
   //----------------------------------------------------------
	public void clickkey(Robot r,int num)
    {
    	r.keyPress(num);
		r.keyRelease(num);
    }
	public void randomclick (Pattern h,float sim)
	{
		Screen sc =new Screen();
		if(sc.exists(h) != null)
    	{
    		
    		Match m;
			try {
				m = sc.find(h.similar(sim));
			
    		System.out.println("x:"+m.x+" y:"+m.y+" col:"+h.getImage().getSize());
    		int width=h.getImage().getSize().width+m.x;
    		int height=h.getImage().getSize().height+m.y;
    		Location loc =new Location(0, 0) ;
    		loc.x= new java.util.Random().nextInt((width - m.x) + 1)+m.x;
    		loc.y=new java.util.Random().nextInt((height - m.y) + 1)+m.y;
    	
    		System.out.println(loc);
    		sc.click(loc);
			} catch (FindFailed e) {
				
				e.printStackTrace();
			}
    		
    	}
		
	}
    //------------------------------------------
	public  ArrayList <String> readtxtfile(String filename)
	{
		 ArrayList <String> txtinput=new ArrayList <String>();
		 try {
		File file = new File("C:\\Users\\roeysdomi\\Desktop\\program\\"+filename+".txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		 
			while ((st = br.readLine()) != null) 
			  {
			       String sp[]=st.split(" ");
			  
			        for(String s:sp)
			        {
			        	
			        	txtinput.add(s);
			        }
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		  return txtinput;
	}
}

