#!/usr/bin/env groovy

def call(args) {
  echo "Welcome, ${name}."
  steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
}
