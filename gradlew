#!/usr/bin/env sh

################################################################################
## Gradle start up script for UN*X                                             ##
################################################################################

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS=""

APP_NAME="gradlew"
GRADLE_HOME="$(cd "`dirname "$0"`"/gradle; pwd -P)"
GRADLE_USER_HOME="${GRADLE_USER_HOME:-$HOME/.gradle}"
GRADLE_OPTS="${GRADLE_OPTS:--Dorg.gradle.daemon=true -Dorg.gradle.jvmargs=-Xmx2048m}"

if [ -n "$JAVA_HOME" ]; then
    JAVA_BIN="$JAVA_HOME/bin/java"
else
    JAVA_BIN=java
fi

exec "$JAVA_BIN" $DEFAULT_JVM_OPTS -cp "$GRADLE_HOME/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
