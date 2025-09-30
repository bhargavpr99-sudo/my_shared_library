def call(String warFile, String tomcatPath) {
    echo "Deploying WAR file from ${warFile} to Tomcat at ${tomcatPath}..."

    sh """
        # Stop Tomcat if running
        sudo systemctl stop tomcat || true

        # Copy WAR file
        sudo cp ${warFile} ${tomcatPath}/

        # Start Tomcat
        sudo systemctl start tomcat
    """
}
