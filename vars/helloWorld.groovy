def call(String name) {
  echo "Hello Library${name}!"
  docker.withRegistry("${DOCKER_REGISTRY}", "docker-registry-credentials") {
    dockerImage.push()
  }
}
