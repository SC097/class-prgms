class Casting
{
    public static void main(String[] args)
    {
        char letter = 'A';
        int taj = letter -32;
        char ex = (char)taj;
         System.out.println("ascii value of" + letter+ "is" +taj);
         System.out.println("ascii value of" + taj+ "is"  +ex );
    }
}