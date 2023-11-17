package java_week_5_programme;

import java.util.ArrayList;

/**
 * Write a programme to create new array list
 */
public class ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");
     //   for (String colourList : colourList) {
            System.out.print(colourList + ", ");
        }
    }
