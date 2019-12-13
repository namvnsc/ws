/*
 */
package ProductService;

import Model.Product;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "Product")
public class SV_Product {

    
    @WebMethod(operationName = "get_product")
    public Product getProduct(String code) {
        Product pro = new Product();
        pro.setCode(code);
        return pro;
    }
    
    @WebMethod(operationName = "insert_product")
    public boolean insertProduct(Product pro) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("D:\\out.txt"));
            fos.write((pro.getCode()+" "+pro.getName()+ " " + pro.getExportPrice()+"-"+pro.getImportPrice()).getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SV_Product.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(SV_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
