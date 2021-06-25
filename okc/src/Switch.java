import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import com.jcraft.jsch.Random;



public class Switch {

	public File firefoxcookie=new File("C:\\Users\\roeysdomi\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\oemkqiq5.default\\cookies.sqlite");
	public String lastuser="";
	public static void main(String[] args) throws InterruptedException, IOException  {
		

		
		
		Switch s=new Switch();
		
		//s.savecookies();
		//s.uplouadcookie("frjfnrjnf");
		
	    
		
	}
	
	
///------mainfunction----------------
  public void newuser(String name)
  {
	  try {
		    Process p = Runtime
		          .getRuntime()
		          .exec("TASKKILL /IM Firefox.exe");
	
	    
			  String dest="C:\\Users\\roeysdomi\\Desktop\\program\\cookies\\";
			  dest=dest+name;
			  TimeUnit.SECONDS.sleep(1);
				copyAndDelete(firefoxcookie, new File(dest));
		} 
	  
	  catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  public void savecookies(String userid)
  {
	  try {
		    Process p = Runtime
		          .getRuntime()
		          .exec("TASKKILL /IM Firefox.exe");
	
		    TimeUnit.SECONDS.sleep(2);
			  String dest="C:\\Users\\roeysdomi\\Desktop\\program\\cookies\\";
			  dest=dest+userid;
			  TimeUnit.SECONDS.sleep(1);
				copyAndDelete(firefoxcookie, new File(dest));
		} 
	  
	  catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
  public void uplouadcookie(String userid)
  {
	  try {
		Process p = Runtime
		          .getRuntime()
		          .exec("TASKKILL /IM Firefox.exe");
		TimeUnit.SECONDS.sleep(1);
		String path="C:\\Users\\roeysdomi\\Desktop\\program\\cookies\\"+userid;
		
		 copyAndDelete(new File(path), firefoxcookie);
		
		
	} catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
  public void closefirefox()
  {
	  try {
		Process p = Runtime
		          .getRuntime()
		          .exec("TASKKILL /IM Firefox.exe");
		TimeUnit.SECONDS.sleep(2);
	} catch (IOException | InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
 
	  if (Files.exists(firefoxcookie.toPath())) { // if the target folder exists, delete it first;
			
			 try {
				Files.deleteIfExists(firefoxcookie.toPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
  }
  ///--------------------------
  public static void copyAndDelete(File source, File dest) throws IOException {
 		
 		/**
		 * copy cookies from source to dest and delete source
		 */
 		
    	
		if (Files.exists(dest.toPath())) { // if the target folder exists, delete it first;
			
			 Files.deleteIfExists(dest.toPath());
	    }
	  
	    try {
	        Files.copy(source.toPath(), dest.toPath());
	    	
	       
	        
	    } catch (IOException ignored) {
	        ignored.printStackTrace();
	    }
	    
	}
  public String  randomfilename(String loc)
  {
      ArrayList<String> list = new ArrayList<String>(); 

	  File folder = new File(loc);
	  File[] listOfFiles = folder.listFiles();

	  for (File file : listOfFiles) {
	      if (file.isFile()) {
	          list.add(file.getName());
	         
	      }
	  }
	   
	  Collections.shuffle(list);
	  
	  while(list.get(0).compareTo(lastuser)==0)
	  {
		  Collections.shuffle(list);
	  }
	  lastuser=list.get(0);
	  
	  return list.get(0);
	 
  }
  public File randomcookie()
  {
	 
	  String loc ="C:\\Users\\roeysdomi\\Desktop\\program\\cookies";
	  String filename=randomfilename(loc);
	  System.out.println("this is file name :"+filename);
	  String file=loc+"\\"+filename;
	  System.out.println(file);
	  File f =new File (file);
	  
	  return f;
  }
  ///------------------------------
}
