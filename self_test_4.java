public class Main {
  public static void main(String[] args) {
     double savings = 100.0d;
     double expenses = 50.0d;

     if(savings > expenses) {
       System.out.println("Solvent");
       savings = savings - expenses;
       expenses = 0.0d;
     }
     else {
       System.out.println("bankrupt");
     }
  }
}
