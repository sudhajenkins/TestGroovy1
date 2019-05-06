#!/usr/bin/env groovy

def packageArtifact(){
    stage("Package artifact") {
        bat "mvn clean"
    }
}
