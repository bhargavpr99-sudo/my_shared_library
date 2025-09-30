def call(String targetServer) {
    echo "Deploying to ${targetServer}..."
    sh "scp target/*.jar user@${targetServer}:/opt/apps/"
    sh "ssh user@${targetServer} 'systemctl restart myapp'"
}
