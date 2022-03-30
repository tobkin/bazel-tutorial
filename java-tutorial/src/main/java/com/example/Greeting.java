package com.example;

import com.engflow.fancytext.*;

public class Greeting {
    public static void sayHi() {
        FancyFormatter ff = FancyFormatter.standard();
        String greeting = ff.format("Hello World!");
        System.out.println(greeting);
    }
}
