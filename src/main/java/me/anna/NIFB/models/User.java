package me.anna.NIFB.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User extends FizzBuzz {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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

    public String getFizzString() {
        return fizzString;
    }

    public void setFizzString(int number) {
        this.fizzString = setFizzBuzz(number);
    }

//
//    public ArrayList<String> runFizzBuzz()
//    {
//        ArrayList fBO = new ArrayList();
//
//        String fizzBuzzString="";
//        for(int i=1; i<=this.getNumber(); i++)
//        {
//            if(i%2==0)
//                fizzBuzzString+="Copy";
//            if(i%3==0)
//                fizzBuzzString+="Fizz";
//            if(i%5==0)
//                fizzBuzzString+="Buzz";
//            if(i%10==0)
//                fizzBuzzString+="Cat";
//            if(i%2!=0&&i%3!=0&&i%5!=0&&i%10!=0)
//                fizzBuzzString=""+i;
//
//            fBO.add(fizzBuzzString);
//            fizzBuzzString="";
//        }
//
//        return fBO;
//
//
//    }


}
