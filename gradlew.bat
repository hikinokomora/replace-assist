@echo off
rem ------------------------------------------------------------------------------
rem Gradle startup script for Windows
rem ------------------------------------------------------------------------------

@IF NOT "%JAVA_HOME%"=="" (
    set JAVA_EXE=%JAVA_HOME%\bin\java.exe
) ELSE (
    set JAVA_EXE=java
)

set DEFAULT_JVM_OPTS=
set GRADLE_OPTS=-Dorg.gradle.daemon=true -Dorg.gradle.jvmargs=-Xmx2048m

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_HOME=%DIRNAME%

set GRADLE_HOME=%APP_HOME%\gradle
set GRADLE_USER_HOME=%USERPROFILE%\.gradle

"%JAVA_EXE%" %DEFAULT_JVM_OPTS% -cp "%GRADLE_HOME%\wrapper\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
