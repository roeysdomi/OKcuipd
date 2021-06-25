import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Women {

	Http2site ht;
	Functions fun;
	Switch sw;
	///---------------------------------------
	 ArrayList <User> users=new ArrayList <User>();
	 //--------------------------------------------
	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        
		
		System.setProperty("http.proxyHost", "127.0.0.1");
	      System.setProperty("https.proxyHost", "127.0.0.1");
	      System.setProperty("http.proxyPort", "8888");
	      System.setProperty("https.proxyPort", "8888");
	      System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\roeysdomi\\Desktop\\FiddlerKeystore");
	      System.setProperty("javax.net.ssl.trustStorePassword", "12345678");
	      
		    
				Women w = new Women();
				
				
				CM c=new CM();
				
				int counter=0;
				
				 while(true)
				 {
					 
					 Collections.shuffle(w.users);
					 for(User currentuser :w.users)
					 {
						 
						 
						
						//System.out.println(w.checkroey());
						w.ht.Cookie=currentuser.cookies;
						w.ht.auto=currentuser.auto;
						w.ht.userid=currentuser.userid;
						w.sw.uplouadcookie(w.ht.userid);
						
						
						
						TimeUnit.SECONDS.sleep(1);
						
						
						//w.fun.openfirefox("www.okcupid.com/doubletake");
						 w.siquililike();
						TimeUnit.SECONDS.sleep(3);
						User newuser=w.getuserfiddler();
						w.ht.Cookie=newuser.cookies;
						w.ht.auto=newuser.auto;
						
						String msg=w.number();
						 w.commentuser(msg, "6598693025204185380");
						TimeUnit.SECONDS.sleep(2);
						w.fun.randomclick(w.fun.home, (float)0.9);
                          //  w.siquililike();
							//TimeUnit.SECONDS.sleep(2);
							
						
//						   if(w.checkroey().compareTo("2")==0)
//						   {
//						      w.commentuser("su2p", "483831592231073068");
//						   }
						   TimeUnit.SECONDS.sleep(8);
						   Process p = Runtime
							          .getRuntime()
							          .exec("TASKKILL /IM Firefox.exe");
						   
						   Robot r=null;
						try {
								r = new Robot();
							} catch (AWTException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						   r.keyPress(KeyEvent.VK_CONTROL);
							 r.keyPress(KeyEvent.VK_X);
							 r.keyRelease(KeyEvent.VK_CONTROL);
							 r.keyRelease(KeyEvent.VK_X);
							 counter++;
								c.updatesite(c.shit.replace("4", String.valueOf(counter)));
						   w.fun.changeip();
						   TimeUnit.SECONDS.sleep(7);
						   
						   Save.saveobj_byname(w.users, "C:\\Users\\roeysdomi\\Desktop\\program\\users\\s2_users");
						  
						  
					 }
					
				 }
				
			
		    
		
	}
   
	
	
	public Women() throws ClassNotFoundException, IOException
	{
		users=(ArrayList<User>) Save.readobj_byname("C:\\Users\\roeysdomi\\Desktop\\program\\users\\s2_users");
		ht=new Http2site();
		fun=new Functions();
		sw=new Switch();
	}
	
	public void likeuser(String target)
	{
		String body="{\"source\":\"PROFILE\",\"votes\":[{\"userid\":\"9613554566340581545\",\"like\":true,\"time_from_request\":0}]}";
		body=body.replaceAll("9613554566340581545", target);
		ht.sendPost("https://www.okcupid.com/1/apitun/likes/batch", body);
		
	}
	
	public void commentuser(String comment,String target)
	{
		String body="{\"receiverid\":\"8453506054717096213\",\"body\":\"bitch\",\"source\":\"desktop_global\"}";
		body=body.replaceAll("bitch", comment);
		body=body.replaceAll("8453506054717096213", target);
		
		ht.sendPost("https://www.okcupid.com/1/apitun/messages/send", body);
		
	}
	
	public String randomuser(String badid)
	{
		String res= ht.sendGet("https://www.okcupid.com/doubletake");
		int a=1;
		for(int i=0;i<res.length();i=a) {
		  a=res.indexOf("userid\" : \"",i+1);
		int b=res.indexOf("\"",a+13);
		
		//System.out.println("i:"+i+","+res.substring(a+11,b)); 
		String ret=res.substring(a+11,b);
		if(ret.compareTo(badid)!=0)
		{return ret;}
		a=b+13;
		}
		return "";
		
	}

    public String checkroey()
    {
    	return ht.sendGet("https://roeysdomi12.000webhostapp.com/roey.html");
    }
    
    public void randomwait()
    {
    	Random r=new Random();
    	
    	int a=r.nextInt(3)+4;
    	
    	try {
			TimeUnit.SECONDS.sleep(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public User getuserfiddler()
	{
		Functions fun = new Functions();
		 fun.randomclick(fun.doubletake, (float)0.9);
		 
		 Robot r=null;
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 r.keyPress(KeyEvent.VK_SHIFT);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_S);
		 
		 r.keyRelease(KeyEvent.VK_SHIFT);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_S);
		 
		 
		
		 
		 String data="";
		 try {
			 TimeUnit.SECONDS.sleep(2);
			 data = (String) Toolkit.getDefaultToolkit()
			            .getSystemClipboard().getData(DataFlavor.stringFlavor);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 User u=new User();
		 String stall[]=data.split("\\r?\\n");; 
		 for(String st:stall)
		 {
			 
			 if(st.contains("Authorization"))
				   {
					   u =new User();
					   st=st.replace("Authorization: ", "");
					   u.auto=st;
					  
					   
				   }
			 
			   if(st.contains("Cookie"))
			   {
				   st=st.replace("Cookie: ", "");
				   u.cookies=st;
				   int a=u.cookies.indexOf(" session=");
				   int b=u.cookies.indexOf("%",a);
				   u.userid=u.cookies.substring(a+9, b);
				   return u;
			   }
			 
		 }
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_X);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_X);
		 
		 
		 return u;
		  	
		 
		 
		
	}
   
    
    public void siquililike()
    {
    	
    	fun.openfirefox("www.okcupid.com/profile/6598693025204185380?cf=quickmatch");
    	//randomwait();
    	//fun.randomclick(fun.l, (float)0.9);
    	
    }

    public void change2stright()
    {
    	System.setProperty("http.proxyHost", "127.0.0.1");
	      System.setProperty("https.proxyHost", "127.0.0.1");
	      System.setProperty("http.proxyPort", "8888");
	      System.setProperty("https.proxyPort", "8888");
	      System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\roeysdomi\\Desktop\\FiddlerKeystore");
	      System.setProperty("javax.net.ssl.trustStorePassword", "12345678");
	      
    	
    	ht.sendPut("https://www.okcupid.com/1/apitun/profile/me", "{\"gender\":\"woman\",\"gender_tags\":[\"woman\"],\"orientation\":\"straight\",\"orientation_tags\":[],\"gayPrivacy\":true,\"status\":\"single\",\"monogamous\":\"&mdash;\",\"height\":null,\"metric\":0,\"bodytype\":\"&mdash;\",\"gay_privacy\":true,\"partner\":\"\",\"allowPartner\":false,\"showNonbinary\":false}");
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
