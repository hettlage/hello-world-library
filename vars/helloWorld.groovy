def call(String name) {
  echo "Hello Library${name}!"
  docker.image(name)
}
