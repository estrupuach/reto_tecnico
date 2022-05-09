package co.com.reto.tecnico.model;

public class BusinessUnit {
    private String strName;
    private String strParentUnit;

    public BusinessUnit() {
    }
    public BusinessUnit(String strName, String strParentUnit) {
        this.strName = strName;
        this.strParentUnit = strParentUnit;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrParentUnit() {
        return strParentUnit;
    }

    public void setStrParentUnit(String strParentUnit) {
        this.strParentUnit = strParentUnit;
    }
}
