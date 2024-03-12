# Structure
* 'phonebilling.xml'
  * definition of the batch job
  * 2 chunk steps
* `JsfBean`
  * managed by JSF == interact with it, to start the batch

# How to run locally?
* `mvn package`
* set up a glassfish server
  * [Example video1](https://www.youtube.com/watch?v=AJxBg90HM4s)
  * [Example video2](https://www.youtube.com/watch?v=Z0fB4Mkmi3A)
* run the glassfish server adding 'phonebilling.war'
  * Problems:
    * Problem1: "java.lang.ClassNotFoundException: javax.faces.webapp.FacesServlet"
      * Attempt1: Update OR `mvn clean install`
      * Solution: Add the dependency 'jakarta.faces:jakarta.faces-api'
    * Problems2: "java.lang.IllegalStateException: CDI is not available"
      * Solution: TODO:
* Open in your browser 'localhost:8080' to check that it shows 'index.xhtml'

# Notes
* input retrieval part
  * read items 1 by 1              -- TODO: How to check --
* business processing part
  * apply business logic 1 by 1    -- TODO: How to check --
* checkpoints         -- TODO: How to check --
* batch artifacts
  * Check 'phonebilling.xml'
