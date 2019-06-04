package model;

public class FailureModel {

    String keyValue;
    String expectedValue;
    String actualValue;

    public FailureModel(String keyValue, String expectedValue, String actualValue) {
        this.keyValue = keyValue;
        this.expectedValue = expectedValue;
        this.actualValue = actualValue;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }


    @Override
    public String toString() {
        return "FailureModel{" +
                "keyValue='" + keyValue + '\'' +
                ", expectedValue='" + expectedValue + '\'' +
                ", actualValue='" + actualValue + '\'' +
                '}';
    }
}
