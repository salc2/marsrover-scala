package specs;

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import scala.collection.mutable.Stack

class MoveSpecs extends FeatureSpec with GivenWhenThen {

  feature("You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing") {
 
    info("As a rover's operator")
    info("I want to be able to send an array command to the rover")
    info("So that the rover can move or change its face direction")
 
    scenario("the rover is in x=0 and y=0 position and facing N (North) ") { 
      given("a command: LL")
      when("the command is sent to the rover")
      then("now the new state of the rover must be x=0 , y=0 and S (South)")
      pending
    }


  }

}
