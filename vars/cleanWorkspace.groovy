def call() {
    stage('Clean Workspace') {
        echo "Cleaning workspace..."
        deleteDir()
    }
}
