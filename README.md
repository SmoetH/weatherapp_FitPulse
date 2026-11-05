FitPulse — Mobile Fitness & Health Tracker

Module: OPSC6312 — Open Source Coding (Intermediate)

Assessment: Portfolio of Evidence (POE) Final Submission

Target Platform: Android (API 31+)

Language: Kotlin

📌 Project Overview

FitPulse is a comprehensive, open-source mobile fitness tracking application built with modern Android architecture guidelines. It enables users to register, log in securely, track workouts, manage fitness goals, and sync data seamlessly across online and offline states.

The application integrates external REST APIs for real-time fitness/weather insights, utilizes local Room database storage for offline resilience, and features automated push notifications via Firebase Cloud Messaging (FCM) / Android Local Notifications.

✨ Key Features

Secure Authentication & User Management

User Registration & Login with hashed credential verification.

Profile management and persistent session state.

REST API Integration

Fetches dynamic exercise libraries and real-time environment data via REST endpoints.

Fallback error handling for network latency and offline fallback.

Offline First Architecture

Built using Room DB / SQLite for local caching.

Changes made offline automatically queue and sync when internet connectivity is re-established.

Real-time Notifications

Automated push/local notifications for workout reminders and motivational alerts.

Multi-Language Support

Fully localized user interface supporting English and isiZulu.

Modern Material UI / UX

Clean, accessible interface with cohesive typography, color contrast, and intuitive navigation.

🎬 Video Demonstration Link

YouTube Video Demo: [Insert Unlisted YouTube Link Here]

(The video contains a full walkthrough of user authentication, REST API data fetch, offline syncing, multi-language switching, and local notifications).

🛠️ Repository & Version Control

GitHub Repository: [Insert GitHub Repository URL Here]

Branching Model: Feature-based workflow (main, dev, feature/*)

CI/CD Actions: Automated lint checks and Gradle build testing configured via GitHub Actions (.github/workflows/build.yml).

🚀 Setup & Installation Instructions

Prerequisites

Android Studio Jellyfish / Ladybug or newer

JDK 17

Android SDK 31+

Physical device or Emulator running Android 12.0+ (API 31+)

Steps to Run

Clone the Repository:

git clone https://github.com/your-username/FitPulse.git
cd FitPulse


Open in Android Studio:

Launch Android Studio and select Open Project.

Navigate to the cloned FitPulse directory.

Gradle Sync:

Allow Gradle to download all required dependencies automatically.

Build & Run:

Select your target device/emulator and click the green Run (Shift + F10) button.

Alternatively, build the APK via Build > Build Bundle(s) / APK(s) > Build APK(s).

📂 Project Structure

com.example.weatherapp / fitpulse
├── data/
│   ├── local/ (Room Database, Entities, DAOs)
│   ├── remote/ (Retrofit API interfaces & DTOs)
│   └── repository/ (Data Sync Layer)
├── ui/
│   ├── auth/ (LoginActivity, RegisterActivity)
│   ├── main/ (MainActivity, HomeFragment, DashboardFragment)
│   └── components/ (Custom Views, RecyclerAdapters)
├── utils/
│   ├── NotificationHelper.kt
│   └── NetworkObserver.kt
└── NotificationHelper.kt


📄 Licensing & Credits

Developed as an educational project under IIE Academic Guidelines for OPSC6312.

© 2026 FitPulse Project Team.
