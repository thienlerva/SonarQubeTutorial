package com.example.Sonarqube.method;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Errand {

    public void mis() {
        List<String> stringList = Arrays.asList("A", "B");
       // stringList = null;
        System.out.println(stringList);
    }

}
