package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        if (value == null) {
            return Collections.emptyList();
        }

        ArrayList<String> arrayList = new ArrayList<>();

        do {
            arrayList.add(value);
            value = value.substring(1);
        } while (value.length() > 0);

        arrayList.add(value);

        return arrayList;
    }

}
