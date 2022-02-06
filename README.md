# Spring Boot + Angular Auth2 with Google

This example has been taken from the followin original tutorial:

[Creating Backend - Spring REST API - Part 1](https://www.javachinna.com/2020/10/23/spring-boot-angular-10-user-registration-oauth2-social-login-part-1/)

[Creating Backend - Spring REST API - Part 2](https://www.javachinna.com/2020/10/23/spring-boot-angular-10-user-registration-oauth2-social-login-part-2/)

[Creating Angular 10 Client Application - Part 3](https://www.javachinna.com/2020/10/28/spring-boot-angular-10-user-registration-oauth2-social-login-part-3/)

There are only some changes to correct some errors in the original project. That's all!

## Getting Started

It's important to create the Google Credentials in the Google developer console, and configure the Redirect Uri as shown in the following screenshot:
![alt text](https://github.com/tcrurav/SpringAngularAuth2WithGoogle/blob/master/screenshots/screenshot-00.png)

It's also important that you ENTER your Google Client Id and Google Client Secret in the application.properties file.

Finally create the database db_bicycles_oauth2

and in the Angular frontend just:

```
cd angular-11-social-login
npm install

ng serve --port 8081
```

Enjoy!!!

## Prerequisites

You need a working environment with:
* [Git](https://git-scm.com) - You can install it from https://git-scm.com/downloads.
* [MySQL](https://www.mysql.com) - You can install it from https://www.mysql.com/downloads/.
* [Node.js](https://nodejs.org) - Install node.js from https://nodejs.org/es/download/. It's advisable to install the LTS version.
* [Eclipse IDE](https://www.eclipse.org/) - Install it if you want to edit this project backend with Eclipse IDE.
* [Spring Tools Suite](https://spring.io/tools) - Install the plugin in Eclipse IDE.


## General Installation instructions

Follow this video tutorial: https://www.youtube.com/watch?v=DvzGf0cAlg4

## Built With

* [Visual Studio Code](https://www.eclipse.org/) - Install it if you want to edit this project frontend with Visual Studio Code editor.
* [Node.js](https://nodejs.org/) - Node.js® is a JavaScript runtime built on Chrome's V8 JavaScript engine.
* [MySQL Workbench](https://www.mysql.com/products/workbench/) - MySQL Workbench is a unified visual tool for database architects, developers, and DBAs.


## Acknowledgments

* [Creating Backend - Spring REST API - Part 1](https://www.javachinna.com/2020/10/23/spring-boot-angular-10-user-registration-oauth2-social-login-part-1/)

* [Creating Backend - Spring REST API - Part 2](https://www.javachinna.com/2020/10/23/spring-boot-angular-10-user-registration-oauth2-social-login-part-2/)

* [Creating Angular 10 Client Application - Part 3](https://www.javachinna.com/2020/10/28/spring-boot-angular-10-user-registration-oauth2-social-login-part-3/)
