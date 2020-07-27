# eCommerce

#Steps to runs the Project

1)Copy the URL ( https://github.com/codingNinja0111/eCommerce.git )<br/><br/>
2)In Eclipse , goTo Windows-Show View -> Others ->Git Rpositieres<br/><br/>
3)Select the Clone a Git repositires Button<br/><br/>
4)Right Click on the Repositories just cloned and Select Import Projects.<br/><br/>
5)Get the m2 dataBase from http://www.h2database.com/html/main.html.<br/><br/>
6)Download All Platforms.<br/><br/>
7)Extract The Zip file. Go on the bin directory where you hae extracted the zip file abd double click in h2 jar file.<br/><br/>
8) Go to bin directory of h2 , get access of console to create a blank database ( previously blank database was created automatically not supported in current version)
	java -cp h2-1.4.200.jar org.h2.tools.Shell
	
	Enter URL by replacing test wth onlineshopping (databaseName)
	Driver = org.h2.Driver (hit enter if same)
	user = sa
	Password = blank
9)Test connection in h2 console <br/><br/>
10)Run sql queries mentioned in H2-DatabaseQueries.sql <br/><br/>
11)	Create a tomcat Server version 8 , add the project into tomcat and just run the server !!!!<br/><br/>
12)Check http://localhost:8080/onlineshopping/<br/><br/>
12) For admin user login with (	vk@gmail.com , admin)<br/><br/>
13) For non-admin user login with (		pradeeprai0111@gmail.com , 123)<br/><br/>
