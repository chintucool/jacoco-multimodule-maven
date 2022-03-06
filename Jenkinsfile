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
           post {
                always {
                    cobertura(
                        autoUpdateHealth: false,
                        autoUpdateStability: false,
                        coberturaReportFile: 'target/site/cobertura/coverage.xml',
                        enableNewApi: true,
                        failNoReports: false,
                        failUnhealthy: false,
                        failUnstable: false,
                        maxNumberOfBuilds: 10,
                        onlyStable: false,
                        sourceEncoding: 'ASCII',
                        zoomCoverageChart: false
                   )
                }
           }
        }
         
    }
}
