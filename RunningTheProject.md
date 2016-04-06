# Running the project #

## Starting servers and Qualitas components ##

To run the project execute the following commands:

  1. Start Qpid server by executing:
```
$QPID_HOME/bin/qpid-server (Linux)
```
  1. Start ActiveMQ server by executing:
```
$ACTIVEMQ_HOME/bin/activemq start (Linux)
```
  1. Run Qualitas web app. Qualitas web app will be available at: http://localhost:8080:
```
mvn -f qualitas-webapp/pom.xml jetty:start
```
  1. Run installation Camel route:
```
mvn -f qualitas-internal-installation-camel/pom.xml camel:run
```
  1. Run web service monitor Camel route (currently only stub which prints all incoming requests to the console). Qualitas Web Service Monitor will be available at: http://localhost:9292/QualitasExecutionMonitorService/QualitasExecutionMonitorWebService.
```
mvn -f qualitas-internal-monitor-camel/pom.xml camel:run
```
  1. Run Apache ODE instance. Apache ODE will be now available at: http://localhost:9191/ode/:
```
mvn -f qualitas-engines-ode-deployment/pom.xml clean jetty:deploy-war -P standalone
```

## Running sample WS-BPEL process ##

To install, deploy, and run sample WS-BPEL process execute the following steps:

  1. Open Qualitas web app, log in using OpenID then upload the following business process: `qualitas-internal-bpel-instrumentation/src/test/resources/XhGPWWhile.zip`.
  1. Process will be installed and will be available at: http://localhost:9191/ode/processes/xhGPWWhile.
  1. Open soapUI or any other tool and call above process with the following SOAP request (mind the QualitasProcessInstanceId SOAP header):
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xhg="http://examples.bpel.nuntius.xh.org/xhGPWWhile.wsdl">
   <soapenv:Header>
      <monitor:qualitasProcessInstanceId xmlns:monitor="http://qualitas.googlecode.com/internal/monitor/webservice">123</monitor:qualitasProcessInstanceId>
   </soapenv:Header>
   <soapenv:Body>
      <xhg:buy>
         <xhg:companyName>IBM</xhg:companyName>
         <xhg:price>4</xhg:price>
      </xhg:buy>
   </soapenv:Body>
</soapenv:Envelope>
```
  1. Go to qualitas-internal-monitor-camel and watch the console.