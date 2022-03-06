pipeline{
    agent any
    tools{
        maven 'maven3'
    }
    stages{
       stage('SonarQube analysis') {
            when {
                    branch 'master'
            }
            steps{
                    sh """
                        java -version
                        mvn clean package sonar:sonar 
                    """
             }
        }
         
    }
}
