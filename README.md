# windowSoftInputMode
Cordova plugin to dynamically change soft input mode on android devices
Currently the plugin supports setting the soft input to adjustPan (SOFT_INPUT_ADJUST_PAN) or adjustResize(SOFT_INPUT_ADJUST_RESIZE). Feel free to extend it and make a pull request

# Installation
~cordova plugin add https://github.com/denkomanceski/windowSoftInputMode.git~

This version no longer works with newer version of Cordova. In case my pull request does not get approved, you can install a working copy from my repo by running this:

`cordova plugin add https://github.com/PetersonRyan/windowSoftInputMode.git`

# Usage
To set the soft input mode to adjustPan: ```windowSoftManager.setMode(windowSoftManager.MODES.SOFT_INPUT_ADJUST_PAN);```

To set the soft input mode to adjustResize: ```windowSoftManager.setMode(windowSoftManager.MODES.SOFT_INPUT_ADJUST_RESIZE);```

To set the soft input mode to adjustNothing: ```windowSoftManager.setMode(windowSoftManager.MODES.SOFT_INPUT_ADJUST_NOTHING);```

Thats it. Simple and clear

# Uninstall
cordova plugin remove com.vertex.windowSoftInputMode
