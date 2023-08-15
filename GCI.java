import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GCI{
   public static CInss ci=new CInss();

   public static void main(String args[]){
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
    
      String ing;double ingre=0.0;
      boolean r=false;

      Pattern p= Pattern.compile("\\d*");

      try{
        do{
           System.out.println("Digite sus ingresos");
           ing=br.readLine();
           Matcher m = p.matcher(ing);
	    r = m.matches();
            if(r)
             ingre=Double.parseDouble(ing);
        }while(ingre<4800 || ingre>500000);
  
        System.out.println("Su Inss es: "+ci.CI(ingre));
      }catch(IOException ex){
        System.out.println(ex.getMessage());
      }
   }

}