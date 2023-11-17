package java_week_5_programme;

import java.util.ArrayList;

public class UnderGroundTubeName {
    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_lines");
        tubeNames.add("Central_lines");
        tubeNames.add("Circle_lines");
        tubeNames.add("District_lines");
        tubeNames.add("Hammersmith_and_City_line");
        tubeNames.add("Jubilee_line");
        tubeNames.add("Metropolitan_line");
        tubeNames.add("Northern_line");
        tubeNames.add("Picadilly_line");
        tubeNames.add("Victoria_line");
        tubeNames.add("Waterloo_and_City_line");

        if (tubeNames.isEmpty()) {
            System.out.println("Given Array List is Empty!!");
        } else {
            System.out.println("Given Array list is empty!! ");
            System.out.println("Given Array List is not Empty!! ");
        }
    }

    public static void main(String[] args) {
       // Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
     //   obj.isEmpty();


}
}