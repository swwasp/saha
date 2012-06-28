
package fi.helsinki.cs.seco.onki.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IOnkiQueryPortType", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IOnkiQueryPortType {


    /**
     * 
     * @param in1
     * @param in0
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.ArrayOfOnkiHierarchyRelation
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "getConceptTree", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetConceptTree")
    @ResponseWrapper(localName = "getConceptTreeResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetConceptTreeResponse")
    public ArrayOfOnkiHierarchyRelation getConceptTree(
        @WebParam(name = "in0", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in0,
        @WebParam(name = "in1", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in1);

    /**
     * 
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "getAvailableTypeUris", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetAvailableTypeUris")
    @ResponseWrapper(localName = "getAvailableTypeUrisResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetAvailableTypeUrisResponse")
    public ArrayOfString getAvailableTypeUris();

    /**
     * 
     * @param in2
     * @param in1
     * @param in4
     * @param in3
     * @param in0
     * @param in5
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.OnkiQueryResults
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "search", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.SearchResponse")
    public OnkiQueryResults search(
        @WebParam(name = "in0", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in0,
        @WebParam(name = "in1", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in1,
        @WebParam(name = "in2", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        Integer in2,
        @WebParam(name = "in3", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        ArrayOfString in3,
        @WebParam(name = "in4", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        ArrayOfString in4,
        @WebParam(name = "in5", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        ArrayOfString in5);

    /**
     * 
     * @param in2
     * @param in1
     * @param in0
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.ArrayOfStatement
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "getProperties", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetProperties")
    @ResponseWrapper(localName = "getPropertiesResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetPropertiesResponse")
    public ArrayOfStatement getProperties(
        @WebParam(name = "in0", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in0,
        @WebParam(name = "in1", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        ArrayOfString in1,
        @WebParam(name = "in2", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in2);

    /**
     * 
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "getAvailableLanguages", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetAvailableLanguages")
    @ResponseWrapper(localName = "getAvailableLanguagesResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetAvailableLanguagesResponse")
    public ArrayOfString getAvailableLanguages();

    /**
     * 
     * @param in2
     * @param in1
     * @param in3
     * @param in0
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.OnkiQueryResults
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "expandQuery", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.ExpandQuery")
    @ResponseWrapper(localName = "expandQueryResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.ExpandQueryResponse")
    public OnkiQueryResults expandQuery(
        @WebParam(name = "in0", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        ArrayOfString in0,
        @WebParam(name = "in1", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in1,
        @WebParam(name = "in2", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        Integer in2,
        @WebParam(name = "in3", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        ArrayOfString in3);

    /**
     * 
     * @param in1
     * @param in0
     * @return
     *     returns fi.helsinki.cs.seco.onki.service.OnkiQueryResult
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
    @RequestWrapper(localName = "getLabel", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetLabel")
    @ResponseWrapper(localName = "getLabelResponse", targetNamespace = "http://service.onki.seco.cs.helsinki.fi", className = "fi.helsinki.cs.seco.onki.service.GetLabelResponse")
    public OnkiQueryResult getLabel(
        @WebParam(name = "in0", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in0,
        @WebParam(name = "in1", targetNamespace = "http://service.onki.seco.cs.helsinki.fi")
        String in1);

}