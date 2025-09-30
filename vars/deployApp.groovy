def call(String warFile, String tomcatPath) {
    echo "Deploying WAR to Tomcat..."

    sh """
        cp ${warFile} ${tomcatPath}/webapps/
    """
}
