package org.example;

import java.util.HashMap;
import java.util.List;

public class Tests {
    private int id;
    private String title;
    private String value;
    private List<Tests> values;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public List<Tests> getValues() {
        return values;
    }
    public void setValues(List<Tests> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "\n" + "id=" + id + ", title=" + title + ", value=" + value + ", values=" + values;
    }

    public void mergeValues (HashMap<Integer, String> valuesMap) {
        this.value = valuesMap.get(this.id);
        if (this.values != null) {
            for(Tests test : this.values) {
                test.mergeValues(valuesMap);
            }
        }
    }
}