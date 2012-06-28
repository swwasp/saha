
package fi.helsinki.cs.seco.onki.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "IOnkiQuery", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", wsdlLocation = "http://www.yso.fi/onkiwebservice/wsdl/?o=koko&k=51d3cdaa81331c9117d77f443a2c5404")
public class IOnkiQuery
    extends Service
{

    private final static URL IONKIQUERY_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(fi.helsinki.cs.seco.onki.service.IOnkiQuery.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = fi.helsinki.cs.seco.onki.service.IOnkiQuery.class.getResource(".");
            url = new URL(baseUrl, "http://www.yso.fi/onkiwebservice/wsdl/?o=koko&k=51d3cdaa81331c9117d77f443a2c5404");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://www.yso.fi/onkiwebservice/wsdl/?o=koko&k=51d3cdaa81331c9117d77f443a2c5404', retrying as a local file");
            logger.warning(e.getMessage());
        }
        IONKIQUERY_WSDL_LOCATION = url;
    }

    public IOnkiQuery(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IOnkiQuery() {
        super(IONKIQUERY_WSDL_LOCATION, new QName("http://service.onki.seco.cs.helsinki.fi", "IOnkiQuery"));
    }

    /**
     * 
     * @return
     *     returns IOnkiQueryPortType
     */
    @WebEndpoint(name = "onkiQuery")
    public IOnkiQueryPortType getOnkiQuery() {
        return super.getPort(new QName("http://service.onki.seco.cs.helsinki.fi", "onkiQuery"), IOnkiQueryPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOnkiQueryPortType
     */
    @WebEndpoint(name = "onkiQuery")
    public IOnkiQueryPortType getOnkiQuery(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.onki.seco.cs.helsinki.fi", "onkiQuery"), IOnkiQueryPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns IOnkiQueryPortType
     */
    @WebEndpoint(name = "IOnkiQueryHttpPort")
    public IOnkiQueryPortType getIOnkiQueryHttpPort() {
        return super.getPort(new QName("http://service.onki.seco.cs.helsinki.fi", "IOnkiQueryHttpPort"), IOnkiQueryPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOnkiQueryPortType
     */
    @WebEndpoint(name = "IOnkiQueryHttpPort")
    public IOnkiQueryPortType getIOnkiQueryHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.onki.seco.cs.helsinki.fi", "IOnkiQueryHttpPort"), IOnkiQueryPortType.class, features);
    }

}
