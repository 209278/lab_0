package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        if(value==null){
            return Collections.emptyList();
        }
        
        do{

        }while(!value.equals(""))
        return new ArrayList<>(value.length());
    }

}
