
 
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
 
public class CM {
 
    /** The Constant URL_STRING. */
 
    public static CookieManager cookieManager;
    public URLConnection connection ;
    public String shit ="<html lang=\\\"en\\\">\\r\\n<head>\\r\\n<title>Page Title</title>\\r\\n<meta charset=\\\"UTF-8\\\">\\r\\n<meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1\\\">\\r\\n<style>\\r\\n/* Style the body */\\r\\nbody {\\r\\n  font-family: Arial;\\r\\n  margin: 0;\\r\\n}\\r\\n\\r\\n/* Header/Logo Title */\\r\\n.header {\\r\\n  padding: 60px;\\r\\n  text-align: center;\\r\\n  background: #1abc9c;\\r\\n  color: white;\\r\\n  font-size: 30px;\\r\\n}\\r\\n\\r\\n/* Page Content */\\r\\n.content {padding:20px;}\\r\\n</style>\\r\\n</head>\\r\\n<body>\\r\\n\\r\\n<div class=\\\"header\\\">\\r\\n  <h1>Likes number:</h1>\\r\\n  <p>4</p>\\r\\n</div>\\r\\n\\r\\n\\r\\n</body>\\r\\n</html>";

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws Exception the exception
     */
    public static void main(String args[]) 
    {
    	
//  	  System.setProperty("http.proxyHost", "127.0.0.1");
//      System.setProperty("https.proxyHost", "127.0.0.1");
//      System.setProperty("http.proxyPort", "8888");
//      System.setProperty("https.proxyPort", "8888");
//      System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\roeysdomi\\Desktop\\FiddlerKeystore");
//      System.setProperty("javax.net.ssl.trustStorePassword", "12345678");
      
        cookieManager = new CookieManager();
         
        CookieHandler.setDefault(cookieManager);
         
        CM c=new CM();
        
        c.updatesite(c.shit);
        
       
        
       
		
      
        
      

        
        
        
        
       
 
    }

    public void updatesite(String info)
    {
    	try {
    		System.out.println("efef");
			postreq("https://files.000webhost.com/handler.php?action=login","{\"action\":\"login\",\"username\":\"roeysdomi12\",\"password\":\"21232126\"}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			postreq("https://files.000webhost.com/handler.php?action=edit","{\"action\":\"edit\",\"item\":\"/public_html/Likes.html\",\"content\":\""+info+"\"}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String readsite()
    {
    	String a="";
    	try {
			a= getreq("https://roeysdomi12.000webhostapp.com/Main.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return a;
    }
    ///--------------------------
    public String getreq (String urladd) throws IOException
    {
    	
    	
    	URL url = new URL(urladd);
        
    	HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

         
         connection.getContent();
         
         BufferedReader in = new BufferedReader(
 		        new InputStreamReader(connection.getInputStream()));
 		String inputLine;
 		StringBuffer response = new StringBuffer();

 		while ((inputLine = in.readLine()) != null) {
 			response.append(inputLine);
 		}
 		in.close();
         return response.toString();
        
         
    }
    public void postreq(String urladd,String body ) throws IOException
    {
        URL url = new URL(urladd);
        
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
         connection.setRequestMethod("POST");
        
        
       String urlParameters = body;
		
		// Send post request
       connection.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
		connection.getContent();
         
    }
}