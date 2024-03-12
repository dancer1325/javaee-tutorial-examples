# Structure
* `JsfBean`
  * managed by JSF == interact with it, to start the batch

# How to run locally?
* `mvn package`
* set up a glassfish server
  * [Example video1](https://www.youtube.com/watch?v=AJxBg90HM4s)
  * [Example video2](https://www.youtube.com/watch?v=Z0fB4Mkmi3A)
* run the glassfish server adding 'webserverlog.war'
  * Problems:
    * Problem1: "java.lang.ClassNotFoundException: javax.faces.webapp.FacesServlet"
      * Attempt1: Update OR `mvn clean install`
      * Solution: Add the dependency 'jakarta.faces:jakarta.faces-api'
    * Problems2: "java.lang.IllegalStateException: CDI is not available"
      * Solution: TODO:
* Open in your browser 'localhost:8080' to check that it shows 'index.xhtml'

# Notes
