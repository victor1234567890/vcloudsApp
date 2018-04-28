
package com.boco.app.simbaWS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AppCenterWS", targetNamespace = "http://ws.appcenter.isimba.cn", wsdlLocation = "http://111.204.35.206:8081/AppCenter/services/AppCenterWS?wsdl")
public class AppCenterWS
    extends Service
{

    private final static URL APPCENTERWS_WSDL_LOCATION;
    private final static WebServiceException APPCENTERWS_EXCEPTION;
    private final static QName APPCENTERWS_QNAME = new QName("http://ws.appcenter.isimba.cn", "AppCenterWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://111.204.35.206:8081/AppCenter/services/AppCenterWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPCENTERWS_WSDL_LOCATION = url;
        APPCENTERWS_EXCEPTION = e;
    }

    public AppCenterWS() {
        super(__getWsdlLocation(), APPCENTERWS_QNAME);
    }

    public AppCenterWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), APPCENTERWS_QNAME, features);
    }

    public AppCenterWS(URL wsdlLocation) {
        super(wsdlLocation, APPCENTERWS_QNAME);
    }

    public AppCenterWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APPCENTERWS_QNAME, features);
    }

    public AppCenterWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppCenterWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AppCenterWSPortType
     */
    @WebEndpoint(name = "AppCenterWSHttpSoap11Endpoint")
    public AppCenterWSPortType getAppCenterWSHttpSoap11Endpoint() {
        return super.getPort(new QName("http://ws.appcenter.isimba.cn", "AppCenterWSHttpSoap11Endpoint"), AppCenterWSPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppCenterWSPortType
     */
    @WebEndpoint(name = "AppCenterWSHttpSoap11Endpoint")
    public AppCenterWSPortType getAppCenterWSHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.appcenter.isimba.cn", "AppCenterWSHttpSoap11Endpoint"), AppCenterWSPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APPCENTERWS_EXCEPTION!= null) {
            throw APPCENTERWS_EXCEPTION;
        }
        return APPCENTERWS_WSDL_LOCATION;
    }

}
