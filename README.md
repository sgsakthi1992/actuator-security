#Spring Actuator & Security

**Credentials:** 

Username: `user`
Password: `secret`

* http://localhost:8080/actuator/info - Gives the info about GIT

* http://localhost:8080/actuator/health - Health info
C:\Users\Sakthi_Subramaniam\IdeaProjects\actuator-security>curl http://localhost:8080/actuator/health
`{"status":"UP"}`
C:\Users\Sakthi_Subramaniam\IdeaProjects\actuator-security>curl -u user:secret http://localhost:8080/actuator/health
`{"status":"UP","components":{"diskSpace":{"status":"UP","details":{"total":268435451904,"free":168889901056,"threshold":10485760}},"ping":{"status":"UP"}}}`
