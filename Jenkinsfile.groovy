@Library('jenkinsdocker')
import com.docker.dockerOperation

pipelne {
    agent {
        label 'Slave1' }
            stages {
                stage {
                    steps {
                    echo "Hello"
                }
            }
        }
    post {
        always {
            DockerOp()
        }
    }
}

