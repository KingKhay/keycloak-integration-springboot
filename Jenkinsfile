pipeline {
    agent any
    tools {
        maven 'Maven_3'
    }
    stages  {
        stage('Checkout Code') {
            checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/KingKhay/keycloak-integration-springboot.git']])
        }
        stage('Build Project') {
            sh 'mvn clean package'
        }
    }
}