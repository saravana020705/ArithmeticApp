pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning from GitHub...'
                checkout scm
            }
        }
        
        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running JUnit tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                echo 'Packaging JAR...'
                sh 'mvn package'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                sh 'docker build -t arithmetic-app:latest .'
            }
        }
        
        stage('Run Docker Container') {
            steps {
                echo 'Running Docker container...'
                sh 'docker run --rm arithmetic-app:latest'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}