/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "Wrapper")
public class Wrapper {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getDictionaryPart")
    public List<String> getDictionaryPart(){
       return list; 
    }
    @WebMethod(operationName = "getPasswordFile")
    public List<String> getPasswordFile(){
        return list;
    }
    @WebMethod(operationName = "sendCracked")
    public void sendCracked(List<String> list){
        
    }
}
