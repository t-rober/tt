package org.example;

public class OneValue {
    private int id;
    private String value;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "\n" + "{id=" + id + ", value=" + value + "}";
    }

}
