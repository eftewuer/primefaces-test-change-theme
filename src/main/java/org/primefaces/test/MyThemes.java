package org.primefaces.test;

public enum MyThemes {
    NORMAL("theme1"),
    DARK("theme2");

    private final String value;
    private MyThemes(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public static MyThemes fromValue(String value) {
        for (MyThemes dt : MyThemes.values()) {
            if (dt.value.equalsIgnoreCase(value)) {
                return dt;
            }
        }
        return null;
    }
}
