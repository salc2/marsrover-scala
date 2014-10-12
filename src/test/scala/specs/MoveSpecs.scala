package specs;

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import scala.collection.mutable.Stack

class MoveSpecs extends FeatureSpec with GivenWhenThen {

  feature("You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing") {
 
    info("As a rover's operator")
    info("I want to be able to send an array command to the rover")
    info("So that the rover can move or change its face direction")
 
    scenario("The rover is on a 100x100 grid at location (0, 0) and facing NORTH") { 
      given("the commands 'ffrff'")
      when("the command is sent to the rover")
      then("end up at (2, 2) and facing WEST")
      pending
    }


  }

}
