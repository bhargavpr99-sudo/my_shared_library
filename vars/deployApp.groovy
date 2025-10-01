def call(String warName = "my-java-project-1.0-SNAPSHOT.war") {
    echo "🚀 Deploying WAR to Tomcat..."
    sh """
        sudo cp target/${warName} /opt/tomcat/webapps/ROOT.war
        sudo /opt/tomcat/bin/shutdown.sh || true
        sudo /opt/tomcat/bin/startup.sh
    """
}
