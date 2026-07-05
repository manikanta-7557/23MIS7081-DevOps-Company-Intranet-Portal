pipeline {
    agent any

    stages {
        stage('Checkout Source') {
            steps {
                echo 'Pulling latest repository updates...'
            }
        }

        stage('Maven Build') {
            steps {
                echo 'Compiling and packaging Java binaries...'
                bat 'mvn clean package'
            }
        }

        stage('Docker Build & Tag') {
            steps {
                echo 'Building container image version v2...'
                bat 'docker build -t company-intranet-portal:v2 .'
            }
        }

        stage('Kubernetes Deployment') {
            steps {
                echo 'Applying manifests to the local cluster...'
                bat 'kubectl --kubeconfig="C:\\ProgramData\\Jenkins\\.kube\\config" apply -f k8s/'
            }
        }
    }
}