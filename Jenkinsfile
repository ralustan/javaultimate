pipeline {
    agent any
    stages {
        stage('Clone sources') {
            steps {
                git url: 'https://github.com/ralustan/javaultimate.git'
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
