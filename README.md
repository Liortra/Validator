# Validator
[![](https://jitpack.io/v/Liortra/Validator.svg)](https://jitpack.io/#Liortra/Validator)

## Table of Contents
* [Explanation](https://github.com/Liortra/Validator/blob/master/README.md#explanation)
* [Setup](https://github.com/Liortra/Validator/blob/master/README.md#setup)
* [How To Use](https://github.com/Liortra/Validator/blob/master/README.md#how-to-use)
* [License](https://github.com/Liortra/Validator/blob/master/README.md#license)

## Explanation
A simple library that help you to vaild your registration forms.
It check if First Name, Last Name, Email, Phone Number and Password(By rules that i decided), are valid.
Here you have a simple app that use the library to show you how to works.

## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```

Step 2. Add the dependency:

```
dependencies {
  implementation 'com.github.Liortra:Validator:1.00.01'
}
```

##  How To Use
**1.** Exmaple of the methods
```Java
    private boolean validateName(String name) {
        return Validator.validateName(name);
    }

    private boolean validateEmail(String email) { 
        return Validator.validateEmail(email); 
    }

    private boolean validatePhone(String phone) {
        return Validator.validatePhone(phone);
    }

    private boolean validatePassword(String password) {
        return Validator.validatePassword(password);
    }
  ```

## License

    Copyright 2020 Lior Trachtman

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

