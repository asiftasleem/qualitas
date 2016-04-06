# Road map #

Qualitas is an overhauled version of Łukasz Budnik's PhD. The PhD system is written in Java EE 5 and is in stable state (including web application). For screenshots of the old system please see [Screenshots of the Old System](ScreenshotsOfTheOldSystem.md). However the system overhaul is so great that Qualitas is currently in proof of concept state and is practically re-written from the scratch.

## Short term road map ##

I would like to release Little-Q in 6 months time (July 2012). The prototype will support gathering, analysing, and computing quality scores of WS-BPEL processes running on Apache ODE engine.

A more detailed road map is as follows:

| **Release** | **Features** | **Status** | **Comments** |
|:------------|:-------------|:-----------|:-------------|
| 0.0.6-SNAPSHOT |  Amend installation Camel route so that it handles errors<br /> Implement route analyst which will analyse and compute basic performance and quality scores | <font color='blue'>In progress</font> | Repo branch: master |
| 0.0.5-SNAPSHOT |  Improve internal integration<br /> Fix cache coordination <br /> Amend installation Camel route<br /> Amend generic WS-BPEL instrumentor which will allow gathering partial results | <font color='green'>Completed</font> | Repo tag: 0.0.5-SNAPSHOT  |
| 0.0.4-SNAPSHOT | Implement ConfigurationResolver <br />  Implement happy path installation Camel route | <font color='green'>Completed</font> | Repo tag: 0.0.4-SNAPSHOT |
| 0.0.3-SNAPSHOT |   Implement OpenID security <br /> Convert project definitions, plugins, and dependencies to Maven 3.x <br /> Amend tests so that they are not platform-dependant (on Linux 4 tests are failing: 2 because of \r\n, 2 because of the path to Apache ODE BpelC tool) | <font color='green'>Completed</font> | Repo tag: 0.0.3-SNAPSHOT |
| 0.0.2-SNAPSHOT | Create engines interfaces (qualitas-engines-api-`*` projects) <br />  Provide Apache ODE implementation of engines interfaces (qualitas-engines-ode-`*` projects) <br />  Implement new configuration module (qualitas-engines-api-configuration project) <br /> Create integration API and provide its AMQP implementation (qualitas-integration-api and qualitas-integration-amqp projects) <br />  Implement Apache Camel route which will integrate all engine interfaces | <font color='green'>Completed</font> | ConfigurationResolver interface missing, stub of Apache Camel route consuming AMQP messages provided <br /> Repo tag: 0.0.2-SNAPSHOT |

## Long term road map ##

I'm especially tempted with using Apache Geronimo 3.0 and Aries! But that's a longer term objective. The very first one would be to create a Little-Q distribution which will contain all core processes and will offer means of embedding it into other products. On top of Little-Q I plan to create the complete system, the fully fledged Qualitas. The front-end would most probably look like the original one ([Screenshots of the Old System](ScreenshotsOfTheOldSystem.md) show MyFaces + Tomahawk and maybe I will use RichFaces or some other JSF + AJAX stuff).