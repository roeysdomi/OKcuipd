

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Http2site {
	
    public static String Cookie="__cfduid=d71928cbcdc0d3517171ac9937ce090b11570976757; siftsession=17238313512091971767; OptanonConsent=isIABGlobal=false&datestamp=Sun+Oct+13+2019+17%3A27%3A13+GMT%2B0300+(Israel+Daylight+Time)&version=5.3.0&landingPath=NotLandingPage&groups=1%3A1%2C3%3A1%2C4%3A1%2C0_175959%3A1%2C0_175960%3A1%2C0_175961%3A1%2C0_183847%3A1%2C0_183846%3A1%2C0_183848%3A1&AwaitingReconsent=false; _gcl_au=1.1.1822259133.1570976758; ab.storage.deviceId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%228f020c48-dada-174b-71d6-5da72e7a16f4%22%2C%22c%22%3A1570976758810%2C%22l%22%3A1570976758810%7D; __ssid=4de664393c435cc28eb3b9cea6e668c; ua=531227642bc86f3b5fd7103a0c0b4fd6; override_session=0; secure_login=1; secure_check=1; session=7136646650415152313%3a18373836788124066334; authlink=0fe9e978; nano=k%3Diframe_prefix_lock_1%2Ce%3D1570977190726%2Cv%3D1%7Ck%3Diframe_prefix_lock_2%2Ce%3D1570977260476%2Cv%3D1; ab.storage.userId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%227136646650415152313%22%2C%22c%22%3A1570976800552%2C%22l%22%3A1570976800552%7D; OptanonAlertBoxClosed=2019-10-13T14:27:13.925Z; eupubconsent=BOoYAqTOoYAqTAcABBENCheAAAAp57z-Z_blPUdnX09xNuzuGvzh_Wd9nVU8fnYrMAnyhYZR_mvUDxc4G_0vRU1yMghs5WIrEsgRQ6KCkAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA; ab.storage.sessionId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%22a1fdf9c9-617d-a1ce-a169-213da845eb04%22%2C%22e%22%3A1570978639095%2C%22c%22%3A1570976800554%2C%22l%22%3A1570976839095%7D";
    
    private final String USER_AGENT = "Mozilla/5.0";
    public static String auto="Bearer 1,0,1571045386,0x630a76512579fcb9;84ecb469673ceca400ef68df61877c3d189d5930";
    public static String userid="";
    public CookieManager cookieManager;
    /*
     * __cfduid=d52d4ff9fea61a55733e5409e729d069a1570977433; siftsession=18311650115506858303; OptanonConsent=isIABGlobal=false&datestamp=Sun+Oct+13+2019+17%3A37%3A36+GMT%2B0300+(Israel+Daylight+Time)&version=5.3.0&landingPath=NotLandingPage&groups=1%3A1%2C3%3A1%2C4%3A1%2C0_175959%3A1%2C0_175960%3A1%2C0_175961%3A1%2C0_183847%3A1%2C0_183846%3A1%2C0_183848%3A1&AwaitingReconsent=false; _gcl_au=1.1.2072418574.1570977436; ab.storage.deviceId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%22e6d6f4a7-8eda-0839-f1b2-76453e9b817b%22%2C%22c%22%3A1570977437327%2C%22l%22%3A1570977437327%7D; ua=531227642bc86f3b5fd7103a0c0b4fd6; __ssid=720c0c60bcb04e73a4b8aaca1c2f96e; override_session=0; secure_login=1; secure_check=1; session=5042625918053462193%3a10580618126368663635; authlink=1a11f575; nano=k%3Diframe_prefix_lock_1%2Ce%3D1570977527388%2Cv%3D1; ab.storage.userId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%225042625918053462193%22%2C%22c%22%3A1570977459313%2C%22l%22%3A1570977459313%7D; ab.storage.sessionId.719f8d59-40d7-4abf-b9c3-fa4bf5b7cf54=%7B%22g%22%3A%220f7fdc79-e8e9-6e2d-0cfd-729a2d2d7098%22%2C%22e%22%3A1570979259315%2C%22c%22%3A1570977459315%2C%22l%22%3A1570977459315%7D
     */
    
    /*
     * Bearer 1,0,1571063854,0x45fb018e34c130b1;5bdde975cbb83db7ab2ff5fd5190f7e885cee24a
     * 
     * 7136646650415152313
     */
	public static void main(String[] args) throws Exception {

		
		Http2site http = new Http2site();

		System.setProperty("http.proxyHost", "127.0.0.1");
	      System.setProperty("https.proxyHost", "127.0.0.1");
	      System.setProperty("http.proxyPort", "8888");
	      System.setProperty("https.proxyPort", "8888");
	      System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\Roey\\Desktop\\FiddlerKeystore");
	      System.setProperty("javax.net.ssl.trustStorePassword", "12345678");
		//http.sendGet("")
//	      CookieManager cookieManager = new CookieManager();
//	         
//	        CookieHandler.setDefault(cookieManager);
//		System.out.println("\nTesting 2 - Send Http POST request");
//		String url="https://www.okcupid.com/1/apitun/messages/send";
//		String body="{\"receiverid\":\"8446169543271156333\",\"body\":\"shit2\",\"source\":\"desktop_global\",\"service\":\"home\"}";
//		
//		body=body.replace("shit2", "�������");
//		http.sendPost(url,body);
//		
////		System.out.println("Testing 1 - Send Http GET request");
////		String url2 = "https://roeysdomi11.000webhostapp.com/test.html";
////	
////	    System.out.println(http.sendGet(url2));

	}
    public Http2site()
    {
    	  cookieManager = new CookieManager();
    	  cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
    	 CookieHandler.setDefault(cookieManager);
    }
	// HTTP GET request
	public String sendGet(String url)  {

		
		
		URL obj;
		try {
			obj = new URL(url);
		
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		  con.addRequestProperty("Cookie",Cookie);
		  con.addRequestProperty("Authorization",auto);
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
         
		//print result
		return response.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";

	}
	
	// HTTP POST request
	public void sendPost(String url,String body)  {

		
		URL obj;
		try {
			obj = new URL(url);
		
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		  con.addRequestProperty("Cookie",Cookie);
		  con.addRequestProperty("Authorization",auto);
		  
		String urlParameters = body;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		//System.out.println(response.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendPut(String url,String body)  {

		
		URL obj;
		try {
			obj = new URL(url);
		
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("PUT");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		  con.addRequestProperty("Cookie",Cookie);
		  con.addRequestProperty("Authorization",auto);
		  
		String urlParameters = body;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		//System.out.println(response.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public  String gettext()
	{
		try {
			return sendGet("https://roeysdomi11.000webhostapp.com/test.html");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	
	public void settext(String text)
	{
		String url="https://files.000webhost.com/handler.php?action=edit";
		String body="{\"action\":\"edit\",\"item\":\"/public_html/test.html\",\"content\":\"shit2\"}";
		body=body.replace("shit2", text); 
		
		try {
			sendPost(url, body);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  setpic(String picid) throws IOException
	{
		MultipartUtility m= new MultipartUtility();
		
		String url= "https://www.okcupid.com/photoupload?albumid=&authcode=security&caption=&height=430&okc_api=1&picid=12592956640820905374&picture.add_ajax=1&tn_lower_right_x=409&tn_lower_right_y=409&tn_upper_left_x=22&tn_upper_left_y=22&use_new_upload=1&userid=15352432128440567277&width=430";
		url=url.replace("12592956640820905374", picid);
		url=url.replace("15352432128440567277", userid);
		url=url.replace("security", auto.replace("Bearer ", ""));
		
		String body="";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		con.addRequestProperty("Cookie",Cookie);
		con.addRequestProperty("Authorization",auto);
		
		String urlParameters = body;
		
		// Send post request
//		con.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		wr.writeBytes(urlParameters);
//		wr.flush();
//		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());
	}
	
}
