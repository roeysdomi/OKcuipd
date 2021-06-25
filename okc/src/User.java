import java.io.Serializable;
public class User implements Serializable  {
     
	public String cookies;
	public String auto;
	public String userid;
	
	public User()

	{
		cookies="";
		auto="";
		userid="";
		
	}
	public User(String cookies, String auto,String userid) {
		
		this.cookies = cookies;
		this.auto = auto;
		this.userid=userid;
	}
	public String getCookies() {
		return cookies;
	}
	public void setCookies(String cookies) {
		this.cookies = cookies;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
