Ready to use skyfire. Based on https://github.com/mdsol/skyfire

Tested and runned with:

	- Windows 7
	- Java SE-1.7 (jre1.8.0_66)
	- apache-maven-3.8.1

other versions MAY still be compatible

 Installation:

  	- Install Java
	- Install Maven
	- Set Maven PATH for your SO

	- Run on project root:
		>mvn install:install-file -Dfile=coverage-0.9.jar -DgroupId=edu.gmu.swe -DartifactId=coverage -Dversion=0.9 -Dpackaging=jar
		>mvn install:install-file -Dfile=org.eclipse.uml2.types_1.0.0.v20120913-1441.jar -DgroupId=org.eclipse.uml2 -DartifactId=types -Dversion=1.0.0.v20120913-1441 -Dpackaging=jar
		>mvn install:install-file -Dfile=org.eclipse.uml2.common_1.7.0.v20120913-1441.jar -DgroupId=org.eclipse.uml2 -DartifactId=common -Dversion=1.7.0.v20120913-1441 -Dpackaging=jar

	- Access src/main/Main.java
	- Change string "path" for the path to your UML 4.0.0 version file.
		- look for the following string in your .uml file
		- xmlns:uml="http://www.eclipse.org/uml2/4.0.0/UML"

	- Make sure your UML is compatible (has start state, end state, transitions and no guards)
	- Execute Main file.
	- The 4 features files will be generated in the root directory.
	- Profit.


Notes:

 - This is a project within a project.
 - Root is skyfire folder.
 - The second project 'src/main' is only for the Main.java file
 - If you have any doubts check: https://github.com/mdsol/skyfire
