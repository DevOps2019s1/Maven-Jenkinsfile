
// Jenkinsfile!
pipeline {
    agent any
    environment {
        Message = "well done!"
    }
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Greg', description: 'Who should I say hello to?')
        password(name: 'PASSWORD' , defaultValue: 'chut! c\'est secret')
    }
    stages {
        stage ('checkout') {
            environment {
                stage = "checkout"
            }
            steps {
                git branch: 'develop', credentialsId: '5a468570-e6fa-4c92-b9ff-011ca7674005', url: 'https://github.com/GregLebreton/maven_pipeline.git'
                echo 'step: checkout'
            }
        }
        
        stage ('test') {
            environment {
            stage = "test"
            }
            steps {
                echo 'step: test'
            }
        }
        
        stage ('deploy') {
            options {
                timeout(time: 10, unit: 'SECONDS')
            }
            steps {
                echo 'step: deploy'
 //               echo "Hello ${PERSON}"
 //               echo "Le password est: ${PASSWORD}"
            }
        }
        stage ('Build') {
            steps {
                echo 'building'
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
        }  
    }
    post {
        success {
            echo "$Message"
        }
        failure {
            echo 'oh no! failure!'
        }
    }
}
}