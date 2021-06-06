package ex10;

/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items.
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate. Collect the input,
then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
Challenges
Revise the program to ensure that prices and quantities are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered.
The tax and total are computed when there are no more items to be entered.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int quantity1, quantity2, quantity3;
        float price1, price2, price3, item1, item2, item3, subtotal, tax, total, taxRate;
        taxRate = 0.055f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        price1 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 1: ");
        quantity1 = sc.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the price of item 2: ");
        price2 = sc.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 2: ");
        quantity2 = sc.nextInt();

        Scanner s5 = new Scanner(System.in);
        System.out.print("Enter the price of item 3: ");
        price3 = sc.nextInt();

        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 3: ");
        quantity3 = sc.nextInt();

        item1 = price1 * quantity1;
        item2 = price2 * quantity2;
        item3 = price3 * quantity3;

        subtotal = item1 + item2 + item3;
        tax = subtotal * taxRate;
        total = subtotal + tax;

        String strSubtotal = String.format("%.2f", subtotal);

        String output = String.format("Subtotal: $%s\nTax: $%s\nTotal: $%s",strSubtotal, tax, total);
        System.out.println(output);
    }
}
