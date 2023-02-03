//def welcomeMsg(String name){
def welcomeMsg(Map config = [:]){
  sh "echo Hello ${config.fname} ${config.lname}"
}
