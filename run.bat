@echo off
chcp 65001 > nul

javac -encoding UTF-8 Question.java Main.java

if errorlevel 1 (
    echo.
    echo ❌ Compilation failed!
    pause
    exit /b
)

java -Dfile.encoding=UTF-8 Main

pause



