package me.anna.NIFB.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=1,max=20)
    private String name;

    @NotNull
    @Min(10)
    @Max(1000)
   // @Size(min=10, max=1000)
    private int number;

    private String fizzBuzz;


    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNIFB() {
        String fizzBuzz = "";
        int number = this.number;
        for (int counter = 10; counter <= number; counter++) {
            if (counter % 2 == 0)
                fizzBuzz +="Copy";  // Print number which is multiples of two

            if (counter % 10 == 0)
                fizzBuzz +="Cat";  // Print number which is multiples of ten

            if (counter % 3 == 0)
                fizzBuzz +="Fizz";      // Print number which is multiples of three

            if (counter % 5 == 0)
                fizzBuzz +="Buzz";      // Print number which is multiples of five

            if (counter % 2 != 0 && counter % 10 != 0 && counter % 3 != 0 && counter % 5 != 0)
                fizzBuzz +=counter;     // Print number which is not multiples of two, three, five, or ten)
            fizzBuzz += "/n";
        }
        return fizzBuzz;
    }

    public void setNIFB(String fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

}
