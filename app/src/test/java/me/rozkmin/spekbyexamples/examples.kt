package me.rozkmin.spekbyexamples

import BddDsl.xAnd
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertTrue

class ManyCaseScenarioSample : Spek({
    Feature("looking for a bus") {
        Scenario("user is looking for a bus") {
            Given("bus list screen") {
            }
            When("user exists screen") {
            }
            Then("save data ") {
            }
        }
        Scenario("user is looking for a bus with favorites") {
            Given("bust list screen") {
            }
            When("enters bus list screen") {
            }
            And("has favorite stops") {
            }
            Then("display list of bus with favorites on top") {
                assertTrue(true)
            }
            And("has not favorite stops") {
            }
            Then("display list of bus") {
                assertTrue(true)
            }
        }
        Scenario("user is entering bus detail") {
            When("enters bus detail screen") {
            }
            Then("display detailed bus stop") {
                assertTrue(true)
            }
        }
    }
})

class ManyCaseScenarioAndOneDisabledSample : Spek({
    Feature("looking for a bus") {
        Scenario("user is looking for a bus") {
            Given("bus list screen") {
            }
            When("user exists screen") {
            }
            Then("save data ") {
            }
        }
        Scenario("user is looking for a bus with favorites") {
            Given("bust list screen") {
            }
            When("enters bus list screen") {
            }
            xAnd("has favorite stops", "NOT IMPLEMENTED") {
            }
            Then("display list of bus with favorites on top") {
                assertTrue(true)
            }
            And("has not favorite stops") {
            }
            Then("display list of bus") {
                assertTrue(true)
            }
        }
        Scenario("user is entering bus detail") {
            When("enters bus detail screen") {
            }
            Then("display detailed bus stop") {
                assertTrue(true)
            }
        }
    }
})

class VanillaSpek : Spek({
    describe("something") {
        context("user action") {
            it("should respond to action") {
                assertTrue(false)
            }
            it("should do another action") {
                assertTrue(true)
            }
        }
    }
})
