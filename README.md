Moshi Codegen Failure
=====================

Steps to Reproduce
------------------

 1. clone repo
 2. run `./gradlew test` – tests will pass
 3. run `./gradlew clean test` – tests will fail 
 4. any futher attempts to run `./gradlew test` will also fail, now.
 5. make any code change
 6. running `./gradlew test` will pass again

