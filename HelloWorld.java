/**
 * Hello World Program
 * Please add your own method
 * @author Scott Kerlin
 */
public class HelloWorld
{
  /**
   * Main Method.  Program starts here
   * @param args -- String Array for command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println(kerlin(12));
  }
  
  /**
   * Takes in number and prints Hello World that number of time
   * @param num: How many to print (will take absolute value)
   * @return A String of Hello Worlds
   * @author Scott Kerlin
   */
  public static String kerlin(int num)
  {
    String result = "";
    for (int x = 0; x < Math.abs(num); x++)
    {
      result +="Hello World: " + (x+1) + "\n";
    }
    return result;
  }
}