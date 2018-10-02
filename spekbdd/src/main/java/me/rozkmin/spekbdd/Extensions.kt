import org.spekframework.spek2.dsl.Skip
import org.spekframework.spek2.dsl.TestBody
import org.spekframework.spek2.style.gherkin.ScenarioBody

/**
 * Created by jaroslawmichalik on 27.02.2018
 */
object BddDsl {

    fun ScenarioBody.xGiven(description: String, pendingReason: String = "", body: TestBody.() -> Unit) {
        delegate.test("Given: $description", body = body, skip = Skip.Yes(pendingReason))
    }

    fun ScenarioBody.xWhen(description: String, pendingReason: String = "", body: TestBody.() -> Unit) {
        delegate.test("When: $description", body = body, skip = Skip.Yes(pendingReason))
    }

    fun ScenarioBody.xThen(description: String, pendingReason: String = "", body: TestBody.() -> Unit) {
        delegate.test("Then: $description", body = body, skip = Skip.Yes(pendingReason))
    }

    fun ScenarioBody.xAnd(description: String, pendingReason: String = "", body: TestBody.() -> Unit) {
        delegate.test("And: $description", body = body, skip = Skip.Yes(pendingReason))
    }
}