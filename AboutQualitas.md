# Qualitas #

Qualitas is a distributed system for measuring quality and performance of distributed business processes running in SOA environment.

Follow the project to get updates on the progress. And yes, you are most welcomed to join the project!

# The background #

Qualitas is an open sourced (and completely overhauled) Łukasz Budnik's PhD system. The original system (code name: MS DIES) is written in Java EE 5. The frontent is JSF 1.2 (Facelets, MyFaces, Tomahawk) and the backend is EJB 3.0 (Web Services, SLSB, MDB). The original system runs on Apache Geronimo 2.2 and uses IBM DB2 pureXML as its database.

Here are some screenshots of the original system: [Screenshots of the old system](ScreenshotsOfTheOldSystem.md).

# The new system #

New system got a new name: Qualitas. It will be more lightweight (Spring 3.0 and/or Geronimo 3.0 + Aries). I also would like to replace all internal processes (Web Services, EJB, MDB) with Apache Camel routes and use some other sexy technologies (JBoss Drools for computing quality scores, AMQP instead of JMS, etc.). I already know IBM DB2 pureXML so I'm considering evaluating Oracle and its XML support.