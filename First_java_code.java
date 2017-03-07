class Main {

 //static int int1;

  public static void main(String[] args) {

  	int int1;
    Float float1;
    String string2;

    char char1;
    double double2;
    Object object3;


    System.out.println("Hello Craig Dejean");
    String string1 = "Welcome to java";
    System.out.println(string1);
    int1 = 124;

    printLine();
   /////////////////////////////////////////
    System.out.println(int1);

    printLine();
    ///////////////////////////////////////
    printInt(int1);
    printString(string1);

  }

	public static void printString(String object){
  	System.out.println(object);
  }

  	public static void printInt(int object){
  		System.out.println(object);
  	}

  	public static void printLine(){
  		System.out.println("____________________________");
  	}

}
