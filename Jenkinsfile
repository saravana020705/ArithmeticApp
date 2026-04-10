pipeline {
    agent any

    environment {
        // Set JAVA_HOME
        JAVA_HOME = 'C:\\Users\\User\\AppData\\Local\\Programs\\Eclipse Adoptium\\jdk-17.0.18.8-hotspot'
        // Add JAVA_HOME to the Path, BUT keep the existing system Path
        PATH = "$JAVA_HOME\\bin;${env.PATH}"
    }

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
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running JUnit tests...'
                bat 'mvn test'
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
                bat 'mvn package'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t arithmetic-app:latest .'
            }
        }

        stage('Run Docker Container') {
            steps {
                echo 'Running Docker container...'
                bat 'docker run --rm arithmetic-app:latest'
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
