# Structure
* 'simple.xml'
  * placed under 'main/webapp'
  * define the job -- via -- JSL
* 'MyReader.java'
  * 'input retrieval part'
    * items are each line of the file
* 'MyProcessor.java'
  * 'business processing part'
* 'MyWriter.java'
  * 'output writing part' 
  * if no checkpoint is provided -> it overwrites the output file,    -- TODO: How to check? --
    * else -> it resumes writing at the end of the file
  * items are written in chunks   -- TODO: How to check? -- 
* 'MyBatchlet.java'
  * task step

# How to run locally?
* `mvn package`
* set up a glassfish server
  * [Example video1](https://www.youtube.com/watch?v=AJxBg90HM4s)
  * [Example video2](https://www.youtube.com/watch?v=Z0fB4Mkmi3A)
* run the glassfish server adding 'hello2.war'
* Open in your browser 'localhost:8080' to check that it shows 'index.html'
* TODO: What else?

# Notes
* Generics are NOT supported   -- Check 'MyWriter' --