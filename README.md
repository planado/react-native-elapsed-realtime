
# react-native-elapsed-realtime

## Getting started

`$ yarn add react-native-elapsed-realtime`

### Mostly automatic installation

`$ react-native link react-native-elapsed-realtime`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-elapsed-realtime` and add `RNElapsedRealtime.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNElapsedRealtime.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.japanictlearning.elapsedrealtime.RNElapsedRealtimePackage;` to the imports at the top of the file
  - Add `new RNElapsedRealtimePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-elapsed-realtime'
  	project(':react-native-elapsed-realtime').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-elapsed-realtime/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-elapsed-realtime')
  	```


## Usage
```javascript
import RNElapsedRealtime from 'react-native-elapsed-realtime';

RNElapsedRealtime.getElapsedRealtime().then((duration) => console.warn(duration));

```
