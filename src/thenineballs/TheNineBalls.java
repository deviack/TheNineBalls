/*
 * To change this license header, choose License Headers in Project Properties.To change this template file, choose Tools | Templates, and open the template in the editor.
 */
package thenineballs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Citla
 */
public class TheNineBalls {

    public static void main(String[] args) {

        // WE'RE GONNA FIND THE ONLY BALL WITH A BIGGER WEIGHT
        boolean bandera = false;//We create the flag, to make a cicle 
        while (bandera == false) {//we star the cicle
            try {
                Scanner scan = new Scanner(System.in);//We create the scanner, for the user tu introduce the numbers
                System.out.println("No hagas patrañas >:(");//Warning :v
                System.out.println("Ingrese 8 números IGUALES y 1 MAYOR");//We ask for the 9 numbers to be given by the user
                int[] numbers = new int[9];//We create a List for the 9 numbers
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Ingresa tu numero: " + (i + 1));//we ask the user for a number (nine times)
                    numbers[i] = scan.nextInt();//It adds the numbers to the list 
                }//Closing the 'for' cicle
                bandera = true;//If there's nothing wrong with the code, we set the flag as true, to stop  the cicle
                System.out.println("Introdujo en total " + numbers.length + " números");

                //We divide the 9 numbers in 3 blocks of 3 (the 3rd block is not needed)
                int x = numbers[0] + numbers[1] + numbers[2];
                int y = numbers[3] + numbers[4] + numbers[5];

                //We compare the blocks to know in wich one the different number is:       
                if (x == y) { //WE COMPARE: If the blocks 1 & 2 are equal, it means the different number is in Block 3
                    System.out.println("Número distinto está en bloque 3");////WE COMPARE THE NUMBERS OF THE BLOCK 3
                    if (numbers[6] == numbers[7]) {//If 7 & 8 are equals, it means the different number is the 9th (displayed as [8])
                        System.out.println("Numero es: " + numbers[8]);
                    } else if (numbers[6] > numbers[7]) {//Else, if 7 (displayed as [6]) is bigger, then it is the BIGGER number
                        System.out.println("El número es: " + numbers[6]);
                    } else { //Else, it means the Bigger number is 8 (displayed as [7])
                        System.out.println("El número es: " + numbers[7]);
                    }

                } else if (x > y) {//WE COMPARE AGAIN: If the block 1 is bigger, it means the different number is in Block 
                    System.out.println("Número está en bloque 1");//WE COMPARE THE NUMBERS OF THE BLOCK 1
                    if (numbers[0] == numbers[1]) {//If 1 & 2 are equals, it means the different number is the 3rd (displayed as [2])
                        System.out.println("El número es: " + numbers[2]);
                    } else if (numbers[0] > numbers[1]) {//Else, if 1 (displayed as [0]) is bigger, then it is the BIGGER number
                        System.out.println("El número es: " + numbers[0]);
                    } else { //Else, it means the Bigger number is 2 (displayed as [1])
                        System.out.println("El número es: " + numbers[1]);
                    }

                } else {//FINAL OPTION: If none of the cases above are correct, it means the different number is in Block 2
                    System.out.println("Número está en bloque 2");//WE COMPARE THE NUMBERS OF THE BLOCK 2
                    if (numbers[3] == numbers[4]) {//If 4 & 5 are equals, it means the different number is the 6th (displayed as [5])
                        System.out.println("El número es: " + numbers[5]);
                    } else if (numbers[3] > numbers[4]) {//Else, if 4 (displayed as [3]) is bigger then it is the BIGGER number
                        System.out.println("El número es: " + numbers[3]);
                    } else {//Else, it means the Bigger number is 5 (displayed as [4])
                        System.out.println("El número es: " + numbers[4]);
                    }//Closing the second ELSE
                }//Closing the first ELSE

            } catch (InputMismatchException e) {
                //If the user doesn't enter a NUMBER, we warn them and star from the beginning again
                System.out.println("Te pedí un número, morro :v");
            }//Closing the catch
            
        }//Closing the While cicle

    }//Closing the main()

}//Closing the Class

