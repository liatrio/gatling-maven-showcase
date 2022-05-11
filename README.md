# gatling-maven-showcase
Gatling performance test suite to showcase the GitHub action [`liatrio/run-gatling`](https://github.com/liatrio/run-gatling/).

# Test Folder Structure
There are many ways of structuring `Gatling` test suites. We believe that it is best to 
separate the suite by Gatling's core concepts:

* Requests
  * `requests` refer to HTTP requests. One could be very granular and
    separate requests by services or api endpoints. But one Scala `Object` could also
    hold all the requests for one specific component.


* Scenarios
  * Scenarios refer to different user scenario within an app or service. For example,
    add an item to a cart:
    1. Click on shop
    2. Click on category
    3. Click on item
    4. Click on add to cart
  * In that `scenario`, 5 different `requests` were made. Therefore, `scenarios` are essentially
    a group of requests that form a user story.


* Simulations
  * `simulations` are where one defines what type of performance testing is being done.
    * Regression test
    * Load Test
    * Stress Test
    * Spike Test
    * Endurance Test
  * This is where one would define SLAs, throughput, vUsers, etc.

```text
.
|__ src
   |__ test
      |__ scala
         |__ common # common requests or configurations (i.e: authenticate)
         |__ requests
         |__ scenarios
         |__ simulations
```
