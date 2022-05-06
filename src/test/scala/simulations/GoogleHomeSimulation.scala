package simulations

import common.GoogleDefaults
import io.gatling.core.Predef._
import scenarios.GoogleScenarios

class GoogleHomeSimulation extends Simulation  {
    setUp(
      GoogleScenarios.homepageScn.inject(
        atOnceUsers(1)
      ).protocols(GoogleDefaults.httpProtocols)
    )
    .assertions(
      global.responseTime.percentile(90).lt(200)
    )
}
