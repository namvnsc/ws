/* @vannamsc */

package Model;


public class Product {
    private int id;
    private String code;
    private String name;
    private float importPrice;
    private float exportPrice;
    private String creadtedUser;
    private static final long serialVersionUID = 20151107;
    
    public Product(){
        
    }

    public Product(int id, String code, String name, float importPrice, float exportPrice, String creadtedUser) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.creadtedUser = creadtedUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getCreadtedUser() {
        return creadtedUser;
    }

    public void setCreadtedUser(String creadtedUser) {
        this.creadtedUser = creadtedUser;
    }
    
}
