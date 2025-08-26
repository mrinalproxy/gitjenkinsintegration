pipeline {
    agent any

    environment {
        APP_ENV = 'dev'
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/mrinalproxy/gitjenkinsintegration.git'   // <-- put your GitHub repo URL
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'mvn clean install'   // use 'sh' instead of 'bat' if on Linux
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'   // runs your JUnit tests
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying to ${env.APP_ENV} environment..."
                // your deployment logic (optional)
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline completed successfully.'
        }
        failure {
            echo '❌ Pipeline failed.'
        }
    }
}
