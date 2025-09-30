def call(String repoUrl, String branch = "main") {
    echo "Cloning repository: ${repoUrl} (branch: ${branch})"
    git branch: branch, url: repoUrl
}
