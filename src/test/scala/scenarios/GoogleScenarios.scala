package scenarios

import io.gatling.core.Predef._
import requests.GoogleRequests

object GoogleScenarios {
  val homepageScn = scenario("Homepage Scenario").exec(GoogleRequests.getHome)
}
