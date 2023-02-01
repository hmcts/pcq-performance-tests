# PCQ Performance Tests

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Purpose

This is the Protected Characteristic Questions Performance Tests implemented in Scala using Gatling.

## Overview

<p align="center">
<b><a href="https://github.com/hmcts/pcq-performance-tests">pcq-performance-tests</a></b> • <a href="https://github.com/hmcts/pcq-frontend">pcq-frontend</a> • <a href="https://github.com/hmcts/pcq-backend">pcq-backend</a> • <a href="https://github.com/hmcts/pcq-consolidation-service">pcq-consolidation-service</a> • <a href="https://github.com/hmcts/pcq-shared-infrastructure">pcq-shared-infrastructure</a> • <a href="https://github.com/hmcts/pcq-loader">pcq-loader</a>
</p>

<p align="center">
  <img src="pcq_overview.png" width="500"/>
</p>

## Getting Started

This is repository for the PCQ Performance Tests
- Step1: Clone the repo to your local/VM to run
- Step2: cd into the pcq-performance-tests directory
- Step3: Edit the run time settings from the PCQ.scala simulation file
- Step4: Run the test with the command `gradle gatlingRun`

## Building and deploying the application

### Building the application

The project uses [Gradle](https://gradle.org) as a build tool. It already contains
`./gradlew` wrapper script, so there's no need to install gradle.

To build the project execute the following command:
```bash
  ./gradlew build
```

### Running the application

To run locally: - Performance test against the perftest environment: ./gradlew gatlingRun

Flags: - Debug (single-user mode): -Ddebug=on e.g. ./gradlew gatlingRun -Ddebug=on - Run against AAT: Denv=aat e.g. ./gradlew gatlingRun -Denv=aat

Before running locally, update the client secret in src/gatling/resources/application.conf then run git update-index --assume-unchanged src/gatling/resources/application.conf to ensure the changes aren’t pushed to github.

To make other configuration changes to the file, first run git update-index --no-assume-unchanged src/gatling/resources/application.conf, ensuring to remove the client secret before pushing to origin


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details..

