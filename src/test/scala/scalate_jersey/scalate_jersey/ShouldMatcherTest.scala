package scalate_jersey.scalate_jersey

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class ShouldMatcherTest extends Spec with ShouldMatchers {
  describe("Demo") {
    it("should run") {
      1 + 1 should be(2)
    }
    it("should be able to add") {
      2 + 2 should be(4)
    }
    it("should be able to multiply") {
      8 * 8 should be(64)
    }

  }
}