pipeline {
    agent any
    stages {
        
        stage('Build') {
            steps {
                sh "./gradlew build"
            }
        }
        stage('Test') {
            steps {
               sh "./gradlew check"
            }
        }
        
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "./gradlew sonarqube"
                }
            }
        }
        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
    }
}
