package me.anna.NIFB.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User extends FizzBuzz {
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

    private String fizzString;

    public String getFizzString() {
        return fizzString;
    }

    public void setFizzString(int number) {
        this.fizzString = setFizzBuzz(number);
    }


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


}
