def call(Map config = [:]) {
  if (!config.containsKey("name")) {
    error "The configuration is missing a name"
  }
  echo "Hello Library ${config.name}!"
  def scriptContent = libraryResource 'za/ac/saao/deploy.sh'
  writeFile file: 'deploy.sh', text: scriptContent
  sh 'bash deploy.sh "Finder Chart Generator" dev.example.com'
}
