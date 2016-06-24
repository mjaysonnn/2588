import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        new Main().run();
    }

    private void run() 
    {
        Scanner sc = new Scanner(System.in);
      
        int[] array=new int[2];
        for (int i = 0; i < 2; i++) 
        {
            array[i] = sc.nextInt();
        }

        sum(array);
      
        sc.close();
    }



    private void sum(int[] array) 
    {
        int num = array[1];
        String number = String.valueOf(num); //이게 핵심이다. String.valueOf(num);이 String이다.
        for(int i = 2; i>=0; i--) {
            int j = Character.digit(number.charAt(i), 10); //10진수로 나타내는것이다.
            System.out.println(array[0]*j);
        }
        System.out.println(array[0]*array[1]);

    }
}