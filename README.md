# Emma

EMMA is a free Java code coverage tool developed by `Vlad Roubtsov`, you can see details on: 

<http://emma.sourceforge.net/index.html>

However, Emma hasn't been updated in nearly a decade. 

EclEmma is a free Java code coverage tool for Eclipse. 

<http://www.eclemma.org/>

Originally EclEmma was inspired by and technically based on the EMMA library. Because of the stopping update of Emma, since version 2.0 EclEmma is based on the JaCoCo code coverage library.

<https://www.eclemma.org/jacoco/index.html>

But there are lots of project depended on Emma, so it is necessary to maintain the Emma project. `Eric Helms` transport the Emma source code from SourceForge to GitHub(2012), and merge some changes, but after that this repository also stopped updating. 

I forked Eric Helms's repository and will keep it active. Nevertheless, I suggest you using JaCoCo instead if possible.

## What I update in this repository:

* Change the ant build to Maven build
* Fixed the source code encoding issue
* Upload the Emma library to Maven center
* Develop an emma-maven-plugin and upload it to Maven center <https://github.com/jiangxincode/emma-maven-plugin>
* Add some Java 8 support(merge the patch of dkrinke)

## Some common problems have been solved in this repository:

* Testng, Emma, Cobertura, coverage and JDK 7 result in ClassFormatError and VerifyError: <https://stackoverflow.com/questions/7010665/testng-emma-cobertura-coverage-and-jdk-7-result-in-classformaterror-and-verif>
* Java 6 -> 7 migration ClassFormatError: Illegal local variable table length: <https://stackoverflow.com/questions/21917985/java-6-7-migration-classformaterror-illegal-local-variable-table-length>
* java.lang.IllegalStateException: CONSTANT_info: invalid tag value [18]: <https://sourceforge.net/p/emma/discussion/373867/thread/3524de7f/>
* Maven Emma coverage Report failed: <https://stackoverflow.com/questions/28937585/maven-emma-coverage-report-failed>