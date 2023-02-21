#!/usr/bin/env bash

# Example: Create assets folder
mkdir android/app/src/main/assets

# Example: Remove old bundle
rm android/app/src/main/assets/index.android.bundle

# Example: Create new bundle
npm run build:prod