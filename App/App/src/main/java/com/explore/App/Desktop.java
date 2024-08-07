package com.explore.App;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary - used to give priority to select particular implementation
public class Desktop implements Computer {

    public void compile(){

        System.out.println("Compiling faster  ...");
    }
}
