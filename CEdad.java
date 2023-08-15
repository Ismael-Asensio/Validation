import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class CEdad{
  
   public static void main(String args[])throws IOException{
      String Anac; int an = 0,edad;
       boolean r=false;

     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);

     Pattern p= Pattern.compile("\\d*");

     do{
        System.out.println("En que año naciste");
        Anac=br.readLine();
        Matcher m = p.matcher(Anac);
	r = m.matches();
        if(r)
          an=Integer.parseInt(Anac);

     }while(an<=1922 || an>2022 || !r);
     edad=2022-an;
     
     System.out.println("Su edad es: "+edad);
   }
}