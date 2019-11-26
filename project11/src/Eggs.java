
/*
11. Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a
dozen. Write a program that prompts a user for the number of eggs in the
order and then display the amount owed with a full explanation. For example,
typical output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per
dozen and 3 loose eggs at 45 cents each for a total of $7.85. Save the program
as Eggs.java.
*/
public class Eggs {

    public static void main(String[] args) {
        int iIntEggs;
        double DOZEN_PRICE = 3.25, SINGLE_PRICE = 0.45;

        int cIntDozen, cIntIndv;
        double cDbDozenCost, cDbIndvCost, cDbTotCost;


        //ask for egg count

        //use integer division for getting number of dozen
        cIntDozen = iIntEggs/12;
        //use modulus to get number of individual eggs
        cIntIndv = iIntEggs%12;
        //Calculate price for how many dozen eggs, then individual eggs, and total
        cDbDozenCost = cIntDozen * DOZEN_PRICE;
        cDbIndvCost = cIntIndv * SINGLE_PRICE;
        cDbTotCost = cDbDozenCost + cDbIndvCost;
    }
}
