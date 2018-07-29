package com.epm.lab.collections;

import java.util.List;

public interface Dictionary {

    void add(String word);

    List<String> startWith(String prefix);

    int countByPrefix(String prefix);

    int size();

}
