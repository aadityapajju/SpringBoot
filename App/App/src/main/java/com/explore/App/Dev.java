package com.explore.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //private Laptop laptop;

    //field injection
   @Autowired
   @Qualifier("laptop") //this annotation uses to give priority to a particluar class implementation,
                        //also name should be same as class name but in small caps
    private Computer comp;

    //constructor injection - doesn't require @Autowired
    /*public  Dev(Laptop laptop){
       this.laptop = laptop;
    }*/

    //setter injections
   /* @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public void build(){
        comp.compile();
        System.out.print("Welcome to spring");
    }
}
