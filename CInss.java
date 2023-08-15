public class CInss{
  double ingresos;

  public CInss(){}

  public CInss(double ingresos){this.ingresos=ingresos;}

  public void seting(double ingresos){this.ingresos=ingresos;}

  public double geting(){return ingresos;}

  public double CI(double x){return geting()*0.07;}

}