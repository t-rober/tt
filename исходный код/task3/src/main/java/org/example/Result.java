package org.example;

import java.util.HashMap;
import java.util.List;

public class Result {
    private List<Tests> tests;

    public List<Tests> getTests() {
        return tests;
    }
    public void setTests(List<Tests> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Result [tests=" + tests + "]";
    }

    public void merdge (Values values) {
        HashMap<Integer, String> valuesMap = new HashMap<>();
        for (int i = 0; i < values.getValues().size(); i++) {
            valuesMap.put(values.getValues().get(i).getId(), values.getValues().get(i).getValue());
        }
        for(Tests test : this.tests) {
            test.mergeValues(valuesMap);
        }
    }
}
