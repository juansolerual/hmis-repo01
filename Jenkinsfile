pipeline {
  agent any

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "maven 3.3.3"
  }

  stages {
    stage('Git fetch') { 
      steps {
        // Get some code from a GitHub repository
        git 'https://github.com/juansolerual/hmis-repo01.git'
      }
    }
    stage('Compile, Test, Package') { 
      steps {
        // When necessary, use '-f path-to/pom.xml' to give the path to pom.xml
        // Run goal 'package'. It includes compile, test and package.
        sh "mvn  -f sesion07/pom.xml clean package" 
      }
      post { 
        // Record the test results and archive the jar file.
        success {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts '**/target/*.jar'
        jacoco(
            execPattern: '**/target/jacoco.exec',
            classPattern: '**/target/classes',
            sourcePattern: '**/src/',
            exclusionPattern: '**/test/'
        )
        publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')]
        }
      }
    }
    stage ('Analysis') {
        steps {
	         // Warnings next generation plugin required
	        sh "mvn -f sesion07/pom.xml site"
            }
        post {
     // Record the test results and archive the jar file.
        success {
            dependencyCheckPublisher pattern: '**/target/site/dependency-check-report.xml'
            recordIssues enabledForFailure: true, tool: checkStyle()
            recordIssues enabledForFailure: true, tool: pmdParser()
            recordIssues enabledForFailure: true, tool: cpd()
            recordIssues enabledForFailure: true, tool: findBugs()
            recordIssues enabledForFailure: true, tool: spotBugs()
            }
        }
    }
    stage ('Documentation') {
     steps {
	    sh "mvn -f sesion07/pom.xml javadoc:javadoc javadoc:aggregate"
     }
     post{
       success {
         step $class: 'JavadocArchiver', javadocDir: 'sesion07/target/site/apidocs', keepAll: false
         publishHTML(target: [reportName: 'Maven Site', reportDir: 'sesion07/target/site', reportFiles: 'index.html', keepAll: false])
       }
     }
    }
  }
}
