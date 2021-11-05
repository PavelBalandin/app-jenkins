pipeline {
    agent none
    stages {
        stage('Build') {
            agent {docker 'maven:3.8.1-adoptopenjdk-8'}
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            agent {docker 'maven:3.8.1-adoptopenjdk-8'}
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Deploy') {
                agent any
                steps {
                    sh 'docker-compose up'
                }
            }
    }
}