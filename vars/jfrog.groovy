def call()
{
  sshagent(['419e7697-10ac-47a2-be23-9e5a09ccaed3']) {
   sh "curl -X PUT -u admin:Aravind@111 -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://13.233.136.69:8082/artifactory/libs-snapshot/"
  }
}
