To visualise database of hsql in eclipse:

install DBViewer plugin from market place
browze the hsqldb-2.3.1.jar from resource folder.
You should now be able to see the datbase.

To run:
mvn exec:java

TO create database from list of SQL scripts:
(WHILE database is running locally)
mvn verify -Pcreate-db

TO insert sample data:
(WHILE database is running locally)
mvn verify -Pload-init-data