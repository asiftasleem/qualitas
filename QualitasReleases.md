# 0.0.2-SNAPSHOT #

0.0.2-SNAPSHOT is a proof of concept release. You can checkout 0.0.2-SNAPSHOT tag from the Hg repository: <a href='http://code.google.com/p/qualitas/source/browse/'><a href='http://code.google.com/p/qualitas/source/browse/'>http://code.google.com/p/qualitas/source/browse/</a></a>.

## New and newsworthy ##

The following features are supported:
  * overhauled definition of engines interfaces and Apache ODE implementation (missing components: ConfigurationResolver)
  * simple Spring MVC application which, using integration services, sends uploaded process bundles to the AMQP queue
  * stub of Apache Camel route which consumes messages (process bundles) posted to AMQP queue

## Running the application ##

The prerequisite is to have Apache Qpid installed on your machine. Default settings are used for development. So all you have to do is download Apache Qpid 0.14 and run the server. Next execute the following commands:

  1. start Qpid server by executing:
```
$QPID_HOME/bin/qpid-server # Linux
%QPID_HOME%/bin/qpid-server.bat # Windows
```
  1. compile, install, and validate all Qualitas (and Qualitas-related utils) projects:
```
./install_and_validate_all_projects.sh # on Windows I'm using Cygwin
```
  1. run Camel route:
```
cd qualitas-internal-installation
mvn camel:run
```
  1. run Jetty:
```
cd qualitas-webapp
mvn jetty:run-war
```