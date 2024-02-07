import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> greg = new ArrayList<String>(10);
    public static void main(String[] args) {
        greg.addAll(Arrays.asList("Thuggin","Thuggalicous","Big Thug", "Lil Thug","Medium Thug",
                                "Kinda Thug", "Hecka Thug", "Mega Thug", "Complete Thug", "Thugmazing"
        ));

        Helper.getRegExString(scan, "Would you like to A - Add an item to the list,\nD - Delete an Item from the List\nP - Print the List\nQ - Quit the Program", "AaDdPpQq");


    }

    public static void addString(Scanner scan, String prompt,String input){
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (input.length() > 0) {
                greg.add(input);
                valid = true;
            } else {
                System.out.println("Your input was inlaid. Try Again.");
            }
        }while (!valid);
    }

    public static void deleteString(Scanner scan, String prompt,int index){
        System.out.println(prompt);
        boolean valid = false;

        do {
            if(index >= 0 && index <= greg.size()){
                greg.remove(index);
                valid = true;
            }else{
                System.out.println("Your input was invalid. Try Again.");
            }
        }while(!valid);

    }
}