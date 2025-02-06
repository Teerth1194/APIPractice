pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the code'
                bat "mav clean"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the code'
                bat "mav test"
            }
        }
        stage('Compile') {
             steps {
                 echo 'Testing the code'
                 bat "mav compile"
             }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....'
            }
        }
    }
}