def call(String repoUrl, String branch = "master", String credentialsId = "") {
    echo "📥 Cloning repository: ${repoUrl} [branch: ${branch}]"
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: repoUrl, credentialsId: credentialsId]]
    ])
}
