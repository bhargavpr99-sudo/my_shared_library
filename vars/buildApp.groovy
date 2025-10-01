def call() {
    echo "⚙️ Building WAR with Maven..."
    sh "mvn clean package"
}
