pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            echo 'Testing build'
          }
        }
        stage('package') {
          steps {
            sh 'mvn clean package'
          }
        }
      }
    }
    stage('Deploy To Dev') {
      steps {
        echo 'Deploying DEV'
      }
    }
    stage('Deploy to HML') {
      steps {
        echo 'Deploy to PROD'
      }
    }
  }
}