import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {

        Scanner nba2k = new Scanner(System.in);

        int [] monthlySales = new int[6];
        // int[] monthlySales = {1200, 1500, 1800, 1350, 2000, 2200};
        System.out.println("Input the monthly sales: ");

        for (int i = 0; i < monthlySales.length; i++) {
            boolean noString = false;
            while (!noString) {
                System.out.print("Enter sales for Month " + (i + 1) + ": $");
                if (nba2k.hasNextInt()) {
                    monthlySales[i] = nba2k.nextInt();
                    noString = true;  
                }                 
                else   {
                    System.out.println("The current input is a non integer. Please input an integer! :D");
                    nba2k.next(); 
                }
            }
        }

        nba2k.close();

        int total = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            total += monthlySales[i];
        }

        double average = (double) total / monthlySales.length;

        double max = monthlySales[0];
        double min = monthlySales[0];

        for (int i = 0; i < monthlySales.length; i++){
            if (monthlySales[i] > max){
                max = monthlySales[i];
            }
            if (monthlySales[i] < min){
                min = monthlySales[i];
            }
        }


        System.out.println("Average Monthly Sales: $" + average);
        System.out.println("The Maximum Sales: $" + max);
        System.out.println("The Minimum Sales: $" + min);
    }

    
}
