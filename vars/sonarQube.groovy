def call(){
  withSonarQubeEnv('Sonar'){
    sh "mvn sonar:sonar"
  }
}
