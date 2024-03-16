# SunriseSunsetView Library

[![](https://jitpack.io/v/th3adittya/Sunrise-Sunset-Animation.svg)](https://jitpack.io/#th3adittya/Sunrise-Sunset-Animation)

SunriseSunsetView is an Android library written in Java that provides functionality for displaying sunrise and sunset times with animation.

## Table of Contents

- [Introduction](#introduction)
- [How to Use](#how-to-use)
- [Views](#views)
- [Table for Usage Designs](#table-for-usage-designs)
- [Credits](#credits)
- [License](#license)

## Introduction

SunriseSunsetView library allows developers to easily incorporate sunrise and sunset times in their Android applications. It provides customizable views with animation for a visually appealing user experience.

## How to Use

To use the SunriseSunsetView library in your Android project, follow these steps:

1. Add the JitPack repository to your build file 
```groovy
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

2. Add the library to your project dependencies.
```groovy
dependencies {
    implementation 'com.github.th3adittya:Sunrise-Sunset-Animation:v1.0.0.0'
}
```
3. Instantiate SunriseSunsetView in your layout XML file.
```xml
<com.hexapalsllc.sunrisesunsetanimation.SunriseSunsetView
    android:id="@+id/sunrise_sunset_view"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:ssv_track_color="#FF0000"
    app:ssv_sun_color="#FFFF00"
    app:ssv_label_text_color="#000000"
    />
```
3. Customize the view attributes as needed.
```xml
app:ssv_track_color="#FF0000"
app:ssv_sun_color="#FFFF00"
app:ssv_label_text_color="#000000"
```

4. Set the sunrise and sunset times programmatically.

```java
SunriseSunsetView sunriseSunsetView = findViewById(R.id.sunrise_sunset_view);
sunriseSunsetView.setSunriseTime("6:00 AM");
sunriseSunsetView.setSunsetTime("6:00 PM");
```

5. Optionally, add animation effects to enhance the user experience.

```
sunriseSunsetView.animateSunrise();
sunriseSunsetView.animateSunset();
```

For detailed implementation instructions, refer to the library documentation.

## Views

The following views are provided by the SunriseSunsetView library:

- SunriseSunsetView: The main view for displaying sunrise and sunset times with animation.

## Table for Usage Designs

| Attribute                   | Format            | Default    | Description                     |
|-----------------------------|-------------------|------------|---------------------------------|
| ssv_track_color             | color\|reference  | #FFFFFF    | Track color                     |
| ssv_track_width             | dimension         | 4px        | Track width                     |
| ssv_sun_radius              | dimension         | 20px       | Sun radius                      |
| ssv_sun_color               | color\|reference  | #FFFF00    | Sun color                       |
| ssv_shadow_color            | color\|reference  | #32FFFFFF | Shadow color                    |
| ssv_label_text_size         | dimension         | 40px       | Label text size                 |
| ssv_label_text_color        | color\|reference  | #FFFFFF    | Label text color                |
| ssv_label_vertical_offset   | dimension         | 5px        | Label vertical offset           |
| ssv_label_horizontal_offset | dimension         | 20px       | Label horizontal offset         |

## Credits

* Original Author: [Tianma](https://github.com/tianma8023) 
* Modified for latest version: [th3adittya](https://github.com/th3adittya)

## License

SunriseSunsetView is licensed under the Apache License 2.0 (Apache-2.0) . See the [LICENSE](LICENSE) file for details.
