package simulations

import common.GoogleDefaults
import io.gatling.core.Predef._
import scenarios.GoogleScenarios

// this simulation just adds more atOnceUsers
// it is meant to show-off how you can launch specific simulations
// from the 'run-gatling' action.
class GoogleStressSimulation extends Simulation  {
  setUp(
    GoogleScenarios.homepageScn.inject(
      atOnceUsers(10)
    ).protocols(GoogleDefaults.httpProtocols)
  )
    .assertions(
      global.responseTime.percentile(90).lt(200)
    )
}