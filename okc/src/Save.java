

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.io.*;
import sun.audio.*;
import javax.sound.sampled.Clip;

import java.io.Serializable;
//java.io.Serializable

public class Save {
	
	/**
	 * class that handle the saving and reading of objects
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		///------------------------------
		///------------------------------
				System.setProperty("http.proxyHost", "127.0.0.1");
			      System.setProperty("https.proxyHost", "127.0.0.1");
			      System.setProperty("http.proxyPort", "8888");
			      System.setProperty("https.proxyPort", "8888");
			      System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\Roey\\Desktop\\FiddlerKeystore");
			      System.setProperty("javax.net.ssl.trustStorePassword", "12345678");
			    
				///-------------------------
		MultipartUtility m= new MultipartUtility();
	    
		///-------------------------
		 
	      
	}
	public Save() 
	{
		
	}
	public void saveobj(Object obj) throws IOException
	{
		/**
		 * save object by name
		 */
		FileOutputStream f = new FileOutputStream(new File("lastsave"));
		ObjectOutputStream o = new ObjectOutputStream(f);

		// Write objects to file
		o.writeObject(obj);
	    

		o.close();
		f.close();
	}
	public Object readobj () throws IOException, ClassNotFoundException
	{
		/**
		 * read object by name
		 */
		FileInputStream fi = new FileInputStream(new File("myObjects"));
		ObjectInputStream oi = new ObjectInputStream(fi);
		return oi.readObject();
	}
	////-------------------------
	public static void saveobj_byname(Object obj,String name) throws IOException
	{
		/**
		 * save object by name
		 */
		FileOutputStream f = new FileOutputStream(new File(name));
		ObjectOutputStream o = new ObjectOutputStream(f);

		// Write objects to file
		o.writeObject(obj);
	    

		o.close();
		f.close();
	}
	public static Object readobj_byname (String name) throws IOException, ClassNotFoundException
	{
		/**
		 * read object by name
		 */
		FileInputStream fi = new FileInputStream(new File(name));
		ObjectInputStream oi = new ObjectInputStream(fi);
		return oi.readObject();
	}
    
}
