[![N|Solid](https://2.bp.blogspot.com/-VUZybgJyzTE/WRKDMNCahvI/AAAAAAAAABA/4Ng2zbgjZeInJqAYq246Iar6MxVNIhj7ACLcB/s1600/EBEL.png)](https://www.belcorp.biz/en/)

# Serenity BDD
This project shows Serenity framework integration to run sample test case for IKU's emails.


# Setting up
To run this tutorial, you will need [JDK 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html), [Maven](https://maven.apache.org/) and [Git](https://git-scm.com/downloads).

Java IDE:
* [IntelliJ IDE](https://www.jetbrains.com/idea/download/) (you can use the free Community Edition)
* [Eclipse IDE](https://www.eclipse.org/downloads/)

> Make sure that the bundled Cucumber for Java plugin is enabled.

Now clone this project to your local machine:

```sh
$ git clone https://github.com/elionavarretev/emails-Belcorp.git
```

# Building the project
This project uses a Maven build. To run the tests and build an executable jar, open the terminal and run:

```sh
$ mvn install
```

The first time you run this it may take some time to download the dependencies.

# How To Edit Test Cases
Open dat.xlsx file in this path: 
```sh
../src/test/resources/DataDriven/dat.xlsx
```
> Make sure that the correct path in your computer.

COLUMNS:
* bandeja: The name of the mailinator tray is placed.

    Example:
[![N|Solid](https://raw.githubusercontent.com/elionavarretev/elionavarretev.github.io/master/assets/doc/iku1.PNG)]()

* asunto: The subject of the email so that the robot can identify it and enter the email.
[![N|Solid](https://raw.githubusercontent.com/elionavarretev/elionavarretev.github.io/master/assets/doc/iku2.PNG)]()

* link: Each link is validated one by one. The link that the email should have is placed.
[![N|Solid](https://raw.githubusercontent.com/elionavarretev/elionavarretev.github.io/master/assets/doc/iku3.PNG)]()


# How To Run From Command Line

```sh
$ mvn verify serenity:aggregate -e -Dwebdriver.driver=chrome
```

# Note:
Please run and review the code
If you think something needs to be improved; you can indicate the file issue or submit PR.


