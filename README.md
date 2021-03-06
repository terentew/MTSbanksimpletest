# Here are a number of automated tests of main page [МТС-Банк](https://www.mtsbank.ru/)

##Used tools and libraries

<p  align="left">
<code>
<img width="5%" title="Java" src="readme-pics/Java_icon.png">
<img width="5%" title="JUnit5" src="readme-pics/JUnit5_icon.png">
<img width="5%" title="Selenide" src="readme-pics/Selenide_icon.svg">
<img width="5%" title="Gradle" src="readme-pics/Gradle_icon.svg">
<img width="5%" title="Selenoid" src="readme-pics/Selenoid_icon.svg">
<img width="5%" title="Github" src="readme-pics/Github_icon.jpg">
<img width="5%" title="Jenkins" src="readme-pics/Jenkins_icon.svg">
<img width="5%" title="Allure Report" src="readme-pics/Allure_Report_icon.svg">
<img width="5%" title="Telegram" src="readme-pics/Telegram_icon.png">
<img width="5%" title="IntelliJ IDEA" src="readme-pics/Intellij_icon.png">
</code>
</p>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean 
-DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ 
-DvideoStorage=https://selenoid.autotests.cloud/video/ 
-Dthreads=1 
test
```

Serve report:
```bash
allure serve build/allure-results
```

###### For further development there are some example tests in [src/test/java/ru/terentew/qa/mtsbank/tests](https://github.com/terentew/MTSbank/blob/405510f1d1085fa6bfc1c45c6bf71900df7157d8/src/test/java/ru/terentew/mtssimpletest/tests/MTSsimpletest.java)
* remove @Disabled("...") annotation to run desabled tests
```bash
gradle clean MTSsimpletest // to run all tests of main page
```


# Jenkins

## Jenkins parameters

<p  align="left">
<code>
<img width="80%" title="Jenkins-params" src="readme-pics/Jenkins.png">
</code>
</p>

## Jenkins job

<p  align="left">
<code>
<img width="80%" title="Jenkins-job" src="readme-pics/jenkins-job.png">
</code>
</p>

# Allure Report

## Allure overview
<p  align="left">
<code>
<img width="80%" title="Allure overview" src="readme-pics/Allure1.png>
</code>
</p>

## Allure test result
<p  align="left">
<code>
<img width="80%" title="Allure test result" src="readme-pics/Allure Reports.png">
</code>
</p>

## Allure video result
<p  align="left">
<code>
<img width="80%" title="Allure video" src="readme-pics/AlureVideo.gif">
</code>
</p>

# Telegram notification
<p  align="left">
<code>
<img width="60%" title="Telegram notification" src="readme-pics/telega-notifi.png">
</code>
</p>

:heart: <a target="_blank" href="https://hh.ru/resume/e512094fff09924cb20039ed1f644e64444a69/">My HH profile</a><br/>

