pipeline {

agent any 

tools {

maven "maven-3.8.5"



}

stages {

stage('Compile and Clean') { 

steps {

// Run Maven on a Unix agent.



sh "mvn clean"

}

}

stage('deploy') { 



steps {

sh "mvn install"

}

}

stage('Build Docker Image') {
            steps {
                script {
                  sh 'docker build -t 705720/mydockerrepo3 .'
                }
            }
        }

stage('Docker Login'){
steps {
 script {
 withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
   sh 'docker login -u 705720 -p ${dockerhubpwd}'
   
   sh 'docker push 705720/mydockerrepo3'
}
}
}}



}

}
