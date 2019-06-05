package com.cataloguploadrequestv2;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException, ParserConfigurationException, TransformerException {

        cXMLBuilder cb = new cXMLBuilder();
        cb.createcXML();

        Post p = new Post();
        p.HttpPost();

    }

}
