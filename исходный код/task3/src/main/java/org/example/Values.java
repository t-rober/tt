package org.example;
import java.util.List;

public class Values {
    private List<OneValue> values;

    public List<OneValue> getValues() {
        return values;
    }

    public void setValues(List<OneValue> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "values: " + values;
    }
}
