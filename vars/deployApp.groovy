def call() {
    echo "Archiving build artifact..."
    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
}
