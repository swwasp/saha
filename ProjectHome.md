SAHA is a browser-based metadata editor and annotation tool for creating data in RDF format for the semantic web. Its main function is to provide a distributed environment where multiple users can simultaneously annotate and edit RDF data through a web interface.

The system is built paying special heed to scalability and concurrency. For example, the persistence is divided into two pieces to avoid the slowness of certain types of search through the whole RDF graph. The system also provides various ways to remotely query the data store, such as a SPARQL endpoint.

For more information, such as user/administrative instructions and a more in-depth description of features, refer to the SAHA Technical Report found on the [Downloads](http://code.google.com/p/saha/downloads/list) page.

Install SAHA On Sparql:

1. $ svn checkout http://saha.googlecode.com/svn/branches/saha-on-sparql saha-on-sparql<br>
2. $ cd saha-on-sparql; mvn jetty:run