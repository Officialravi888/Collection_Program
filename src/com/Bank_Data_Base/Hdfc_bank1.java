package com.Bank_Data_Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hdfc_bank1 {
    public static void main(String[] args) {
        List<Hdfc_bank> FileList = new ArrayList<>();
        FileList.add(new Hdfc_bank("raj","HDFC",787206741, 43567, "Noida"));
        FileList.add(new Hdfc_bank("shiv","indian",997206741, 89567, "Gurugon"));
        FileList.add(new Hdfc_bank("devid","kotak",772848741, 74567, "karnatak"));
        FileList.add(new Hdfc_bank("kelash","union",957206741, 98788, "bengulor"));
        FileList.add(new Hdfc_bank("ravi","HDcm",057206741, 86474, "dheli"));
        FileList.add(new Hdfc_bank("rajfhf","HDmcFC",758206741, 75755, "lucknow"));
        FileList.add(new Hdfc_bank("rajmnf","HxffC",750406741, 34567, "kanpur"));
        FileList.add(new Hdfc_bank("mohan","Hmfnkf",957206741, 34583, "channai"));
        FileList.add(new Hdfc_bank("rajesh","jjff",257206741, 38389, "jhashi"));
        FileList.add(new Hdfc_bank("mohit","HDjfnfk",757906741, 84389, "faridabad"));


    //    FileList.stream().filter(x-> x.getName().startsWith("r")).collect(Collectors.toList()).forEach(System.out::println);
//        FileList.forEach(System.out::println);// method Refrence
       FileList.forEach(name -> System.out.println(name)); //https://interview-easy.com/java-8-interview-questions-and-answers/ Lambda Expression
    }
}
