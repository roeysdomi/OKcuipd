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

public class comment {

	Http2site ht;
	Functions fun;
	Switch sw;
	
	String cookies="__cfduid=d9486289d494b3c9c95dc984bde2e489e1571953470; OptanonConsent=isIABGlobal=false&datestamp=Sun+Oct+27+2019+23%3A28%3A51+GMT%2B0200+(Israel+Standard+Time)&version=5.3.0&landingPath=NotLandingPage&groups=1%3A1%2C3%3A1%2C4%3A1%2C0_175959%3A1%2C0_175960%3A1%2C0_175961%3A1%2C0_183847%3A1%2C0_183846%3A1%2C0_183848%3A1&AwaitingReconsent=false; _gcl_au=1.1.167404774.1571953472; amplitude_id_f90f10ee203f3f5f1e142ad0a976ee20_desktopokcupid.com=eyJkZXZpY2VJZCI6IjBmOGM3ZjE2LWE3NjktNDEwNi04OTc0LTBkMWE0MzZjZDYwZVIiLCJ1c2VySWQiOiI4Njg4MTAwMTQxNjY1NjU0OTMzIiwib3B0T3V0IjpmYWxzZSwic2Vzc2lvbklkIjoxNTcyMjExMzM3ODMzLCJsYXN0RXZlbnRUaW1lIjoxNTcyMjExNzM4MjQzLCJldmVudElkIjozMywiaWRlbnRpZnlJZCI6MzQsInNlcXVlbmNlTnVtYmVyIjo2N30=; _fbp=fb.1.1571953471894.361189364; __ssid=809a54050445019051e5fc9891ec48d; session=8688100141665654933%3a15862518365217761451; secure_login=1; secure_check=1; ab.storage.userId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%228688100141665654933%22%2C%22c%22%3A1571953490488%2C%22l%22%3A1571953490488%7D; siftsession=659089971242633223; authlink=1d0646e7; nano=k%3Diframe_prefix_lock_1%2Ce%3D1572211802868%2Cv%3D1; crfgL0cSt0r=true; __gads=ID=ffdb82eb6de8cc28:T=1572211338:S=ALNI_Mb6zcCkDD0sPAoBNc6jCRS5yye6ew; ab.storage.sessionId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%22656c4a78-79f9-f50e-de71-b1a21af8d201%22%2C%22e%22%3A1572213535678%2C%22c%22%3A1572211334541%2C%22l%22%3A1572211735678%7D";
    String auto ="Bearer 1,0,1572298127,0x7892550c1d009895;3bf13cd717801ecac0667e5ac26dbf890df2fc13";
    
	///---------------------------------------
	 ArrayList <User> users=new ArrayList <User>();
	 //--------------------------------------------
	public static void main(String[] args) throws InterruptedException, IOException {
        
		
//		System.setProperty("http.proxyHost", "127.0.0.1");
//	      System.setProperty("https.proxyHost", "127.0.0.1");
//	      System.setProperty("http.proxyPort", "8888");
//	      System.setProperty("https.proxyPort", "8888");
//	      System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\roeysdomi\\Desktop\\FiddlerKeystore");
//	      System.setProperty("javax.net.ssl.trustStorePassword", "12345678");
//	      
		    
				comment w=null;
				CM c=new CM();
				try {
					w = new comment();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int counter=0;
				w.ht.Cookie=w.cookies;
				w.ht.auto=w.auto;
				 while(true)
				 {
					 
					

                      String msg=w.number();
                      w.commentuser(msg, "6598693025204185380");
                      
                      w.randomwait();
                      
                      
                      
					
				 }
				
			
		    
		
	}
   
	
	
	public comment() throws ClassNotFoundException, IOException
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
    	
    	int a=r.nextInt(10)+4;
    	
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
		 return null;
		  	
		 
		 
		
	}

    
    public void siquililike()
    {
    	
    	fun.openfirefox("www.okcupid.com/profile/6598693025204185380?cf=quickmatch");
    	
    	
    	
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
