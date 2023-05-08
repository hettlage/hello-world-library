def call(String name) {
  echo "Hello Library ${name}!"
  def scriptContent = loadLibraryResource 'za/ac/saao/deploy.sh'
  writeFile file: 'deploy.sh', text: scriptContent
  sh 'bash deploy.sh "Finder Chart Generator" dev.example.com'
}
