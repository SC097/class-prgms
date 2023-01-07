class java
{
   
static
{
  System.out.println("Static block");
}
 java()
{
  System.out.println("Const");
}


public void display()
{
System.out.println(" Methog/const ");
}
 
 public static void main(String args[])
{

    System.out.println(" static method");
    java cat=new java();
    cat.display();
  }
   }