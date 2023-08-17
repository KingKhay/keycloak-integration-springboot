pipeline {
    agent any
    tools {
        maven 'Maven_3'
    }
    stages  {
        stage('Checkout Code') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/KingKhay/keycloak-integration-springboot.git']])
            }
        }
        stage('Build Project') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}