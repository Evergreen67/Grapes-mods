@echo off
title Push Grapes Mod to GitHub
echo ============================================
echo   Grapes Mod GitHub Uploader (Forge 1.20.1)
echo ============================================
echo.

echo --- Navigating to sigma project folder ---
cd /d "%~dp0"

rem --- Verify that we're in the correct project folder ---
if not exist build.gradle (
    echo Error: You must place this file inside your sigma project folder.
    pause
    exit /b
)

rem --- Initialize git if not already ---
if not exist .git (
    echo Initializing Git repository...
    git init
)

echo Adding files...
git add .

echo Creating commit...
git commit -m "Initial Grapes Mod"

echo Setting main branch...
git branch -M main

echo Adding remote...
git remote remove origin >nul 2>&1
git remote add origin https://github.com/Evergreen67/Grapes-mods.git

echo Pushing to GitHub...
git push -u origin main

echo.
echo ============================================
echo ✅ Done! Your mod has been uploaded.
echo Open this link to watch it build:
echo     https://github.com/Evergreen67/Grapes-mods/actions
echo.
echo When it finishes, download your .jar from the Artifacts section.
echo ============================================
pause
