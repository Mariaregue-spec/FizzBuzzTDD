package org.example;

import org.example.FizzBuzz.FizzBuzz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        for(int index = 1; index <= 15; index++){
            String result = new FizzBuzz().convert(index);
            System.out.println(result);
        }
    }
}
