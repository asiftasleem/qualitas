# Proof of concept Qualitas releases #

For instructions on how to build and run the project please refer to [Building the Project](BuildingTheProject.md) for more details.



# 0.0.4-SNAPSHOT #

0.0.4-SNAPSHOT is a proof of concept release. You can checkout 0.0.4-SNAPSHOT tag from the Hg repository: <a href='http://code.google.com/p/qualitas/source/browse/'><a href='http://code.google.com/p/qualitas/source/browse/'>http://code.google.com/p/qualitas/source/browse/</a></a>. Release date: 20.03.2012.

## New and newsworthy ##

The following new features are supported:
  * added full implementation of qualitas-engines-api-`*` for Apache ODE
  * added generic WS-BPEL instrumentor
  * added initial implementation of Camel route which installs business processes on remote servers
  * refactored most of pom.xml files and reduced number of dependencies and their sizes (23 MB less in total)
  * added new build profiles: sourcecheck, fastinstall, windows, unix (last 2 are activated automatically based on OS family), production, and development, all Qualitas components are now configurable via qualitas-parent/src/main/filters/filter-${qualitas.env}-${qualitas.os}.properties files
  * tests are now configurable via properties files (which in turn are automatically filtered by Maven, see above)

# 0.0.3-SNAPSHOT #

0.0.3-SNAPSHOT is a proof of concept release. You can checkout 0.0.3-SNAPSHOT tag from the Hg repository: <a href='http://code.google.com/p/qualitas/source/browse/'><a href='http://code.google.com/p/qualitas/source/browse/'>http://code.google.com/p/qualitas/source/browse/</a></a>. Release date: 10.02.2012.

## New and newsworthy ##

The following new features are supported:
  * project now builds in Maven 3.x (previously worked only in Maven 2.2), updated Maven dependencies and plugins
  * tests amended so that all tests now pass on both Windows and Linux machines (previously 4 tests failed on Linux machines)
  * introduced OpenID authentication mechanism

# 0.0.2-SNAPSHOT #

0.0.2-SNAPSHOT is a proof of concept release. You can checkout 0.0.2-SNAPSHOT tag from the Hg repository: <a href='http://code.google.com/p/qualitas/source/browse/'><a href='http://code.google.com/p/qualitas/source/browse/'>http://code.google.com/p/qualitas/source/browse/</a></a>. Release date: 01.02.2012.

## New and newsworthy ##

The following features are supported:
  * overhauled definition of engines interfaces and Apache ODE implementation (missing components: ConfigurationResolver)
  * simple Spring MVC application which, using integration services, sends uploaded process bundles to the AMQP queue
  * stub of Apache Camel route which consumes messages (process bundles) posted to AMQP queue