# Setting up development environment #



# Introduction #

The following page contains detailed instructions on how to setup the development environment on Oracle Linux 5 Weblogic Developer VM. Oracle Linux 5 Weblogic Developer VM was chosen because it already has JDK 1.6, Maven 3.0.1, Eclipse 3.7, etc. You may use any OS. Qualitas is a Java project after all.

# Developer's VM #

Download and install VirtualBox from: https://www.virtualbox.org/wiki/Downloads.

Next download Oracle Linux 5 Weblogic Developer VM from here:
http://www.oracle.com/technetwork/middleware/weblogic/downloads/weblogic-developer-vm-303434.html.

Run the virtual machine. And remember to setup your own account.

# Prerequisites #

## Hg ##

Oracle Linux 5 has no `/etc/yum.repos.d/yum-public-yum-el5.repo` file, create it and copy its contents from the first post from this page: https://forums.oracle.com/forums/thread.jspa?threadID=1018322.

Most probably there still won't be any mercurial packages in yum. But no worries the answer is here: http://fedoraproject.org/wiki/EPEL.

From the terminal execute the following commands:
```
su
wget http://dl.fedoraproject.org/pub/epel/5/i386/epel-release-5-4.noarch.rpm
rpm -i epel-release-5-4.noarch.rpm
yum install mercurial
exit
```

## Apache ODE ##

Apache ODE is required by the qualitas-engines-ode-validator module. Download Apache ODE 1.3.4 WAR Distribution from here: http://ode.apache.org/getting-ode.html. It is important to use 1.3.4 version not 1.3.5 (there is a bug with bpelc compiler script).

## Apache Qpid ##

Apache Qpid is used as an AMQP broker. Latest available version is 0.14 and can be found here: http://qpid.apache.org/download.html.

## Development IDE ##

Oracle Linux 5 Weblogic Developer is shipped with Eclipse 3.7, but you may want to install STS for convenient Spring development: http://www.springsource.org/springsource-tool-suite-download.