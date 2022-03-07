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
                        mvn clean package jacoco:report jacoco:report-aggregate sonar:sonar
                        export JAVA_HOME=/usr/local/Cellar/openjdk@8/1.8.0+312
                        mvn cobertura:cobertura -Dcobertura.report.format=xml
                        unset JAVA_HOME
                    """
            }
        }
         stage('Jacoco coverage') {
            steps {
                jacoco(
                        execPattern: '**/jacoco.exec',
                        classPattern: '**/classes',
                        sourcePattern: '**/src/main/java',
                        minimumBranchCoverage: '75', 
                        minimumClassCoverage: '75', 
                        minimumComplexityCoverage: '75', 
                        minimumInstructionCoverage: '0.75', 
                        minimumLineCoverage: '75', 
                        minimumMethodCoverage: '75'
                        inclusionPattern: '**/*.java'
                )
            }
        }
    }
}
