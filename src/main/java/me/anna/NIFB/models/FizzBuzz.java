package me.anna.NIFB.models;

public class FizzBuzz {

    private String fizzBuzz;

    public String getFizzBuzz() {
        return fizzBuzz;
    }

    public String setFizzBuzz(int number) {
        String newFizzBuzz = "";
        for (int counter = 1; counter <= number; counter++) {
            if (counter % 2 == 0)
                newFizzBuzz +="Copy";  // Print number which is multiples of two

            if (counter % 10 == 0)
                newFizzBuzz +="Cat";  // Print number which is multiples of ten

            if (counter % 3 == 0)
                newFizzBuzz +="Fizz";      // Print number which is multiples of three

            if (counter % 5 == 0)
                newFizzBuzz +="Buzz";      // Print number which is multiples of five

            if (counter % 2 != 0 && counter % 10 != 0 && counter % 3 != 0 && counter % 5 != 0)
                newFizzBuzz +=counter;     // Print number which is not multiples of two, three, five, or ten)
            newFizzBuzz += "\n";
        }
        return newFizzBuzz;
    }


//    public void setFizzBuzz(String fizzBuzz) {
//        this.fizzBuzz = fizzBuzz;
//    }




//    public String getNIFB() {
//        String fizzBuzz = "";
//        int number = this.number;
//        for (int counter = 1; counter <= number; counter++) {
//            if (counter % 2 == 0)
//                fizzBuzz +="Copy";  // Print number which is multiples of two
//
//            if (counter % 10 == 0)
//                fizzBuzz +="Cat";  // Print number which is multiples of ten
//
//            if (counter % 3 == 0)
//                fizzBuzz +="Fizz";      // Print number which is multiples of three
//
//            if (counter % 5 == 0)
//                fizzBuzz +="Buzz";      // Print number which is multiples of five
//
//            if (counter % 2 != 0 && counter % 10 != 0 && counter % 3 != 0 && counter % 5 != 0)
//                fizzBuzz +=counter;     // Print number which is not multiples of two, three, five, or ten)
//            fizzBuzz += "\n";
//        }
//        return fizzBuzz;
//    }
//
//    public void setNIFB(String fizzBuzz) {
//        this.fizzBuzz = fizzBuzz;
//    }
//


}
