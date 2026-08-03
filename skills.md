# FocusForge — Skills and Architecture Guide

## Category: Gamified Productivity

## Core Architecture
```
data/
  database/  — Room DB entities and DAOs
  repository/ — Repository implementations
domain/
  model/     — Domain data classes
  usecase/   — Business logic use cases
presentation/
  ui/screens/ — Compose screens
  viewmodel/  — State management ViewModels
```

## Key Android Skills
- Jetpack Compose for all UI rendering
- Room Database for local persistence
- Hilt Dependency Injection
- WorkManager for background scheduling
- AlarmManager for precise daily notifications
- Google Play Billing for in-app subscriptions
- Lottie for celebration/reward animations
- Compose Canvas for custom chart and visual rendering
- DataStore Preferences for lightweight settings

## Play Store Requirements
- App Icon: 512x512 PNG
- Feature Graphic: 1024x500 PNG
- Min 2 screenshots per device type
- Privacy Policy URL (required if collecting any data)
- Target API 34+ for new 2024+ submissions
- Content Rating form completed in Play Console

## Monetization Approach
- Free tier with core functionality
- Premium subscription via Google Play Billing 6.x
- Clear upgrade value proposition shown at paywall
- 7-day free trial recommended to improve conversion
