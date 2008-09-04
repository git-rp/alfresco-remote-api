
package org.alfresco.repo.cmis.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.0.6
 * Tue May 27 14:11:20 EEST 2008
 * Generated source version: 2.0.6
 * 
 */

@WebFault(name = "TypeNotFoundFault", targetNamespace = "http://www.cmis.org/ns/1.0")

public class TypeNotFoundException extends Exception {
    public static final long serialVersionUID = 20080527141120L;
    
    private org.alfresco.repo.cmis.ws.BasicFault typeNotFoundFault;

    public TypeNotFoundException() {
        super();
    }
    
    public TypeNotFoundException(String message) {
        super(message);
    }
    
    public TypeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeNotFoundException(String message, org.alfresco.repo.cmis.ws.BasicFault typeNotFoundFault) {
        super(message);
        this.typeNotFoundFault = typeNotFoundFault;
    }

    public TypeNotFoundException(String message, org.alfresco.repo.cmis.ws.BasicFault typeNotFoundFault, Throwable cause) {
        super(message, cause);
        this.typeNotFoundFault = typeNotFoundFault;
    }

    public org.alfresco.repo.cmis.ws.BasicFault getFaultInfo() {
        return this.typeNotFoundFault;
    }
}
