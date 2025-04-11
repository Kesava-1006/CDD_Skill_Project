pipeline {
    agent any

    environment {
        IMAGE_NAME = "cdd-skill-app"
        CONTAINER_NAME = "cdd-skill-container"
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Kesava-1006/CDD_Skill_Project.git'
            }
        }

        stage('Build JAR') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Stop Previous Container') {
            steps {
                sh 'docker stop $CONTAINER_NAME || true'
                sh 'docker rm $CONTAINER_NAME || true'
            }
        }

        stage('Run New Container') {
            steps {
                sh 'docker run -d --name $CONTAINER_NAME -p 8080:8080 $IMAGE_NAME'
            }
        }
    }
}
