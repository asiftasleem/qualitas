# Building the project #

There is a shell script prepared which builds and installs all Qualitas projects.

The shell script works in Cygwin and Linux bash.

## Environment and OS properties ##

Qualitas uses Maven filtering, before building the project the following properties files must be updated with environment- and OS-specific properties. The properties files are:

  * qualitas-parent/src/main/filters/filter-development-linux.properties
  * qualitas-parent/src/main/filters/filter-development-windows.properties
  * qualitas-parent/src/main/filters/filter-production-linux.properties
  * qualitas-parent/src/main/filters/filter-production-windows.properties

By default Qualitas uses development environment. The OS is determined automatically.

## Invoking the build script ##

In order to build all projects execute the following shell script:

```
./install_and_validate_all_projects.sh
```

All parameters to this script are passed directly to Maven, so to run Maven in quiet mode and activate fastinstall profile the above script has to be called with parameters.

```
./install_and_validate_all_projects.sh -q -P fastinstall
```

## Profiles ##

There are 4 profiles which can be used globally:

  * development - activates development profile which sets qualitas.env property to development (this property is later on used by Maven filtering).
  * production - activates production profile which sets qualitas.env property to production (this property is later on used by Maven filtering)
  * fastinstall - skips all tests
  * sourcecheck - performs source checks like checkstyle and cobertura

## Sample build times ##

Building 0.0.3-SNAPSHOT on quad i7 machine takes: 1m59.845s

Building 0.0.3-SNAPSHOT on dual i5 machine takes: 5m0.910s