def mavenBuild(){
  def mavenHome = tool name: "Maven-3.9.6", type: "maven"
  def mavenCMD = "${mavenHome}/bin/mvn"
  sh "${mavenCMD} clean package"
}
