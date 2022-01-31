package customfirrtl

import firrtl._
import firrtl.ir._

class MyCustomFirrtlTransform extends Transform with DependencyAPIMigration {
  override def prerequisites = Seq.empty
  override def optionalPrerequisites = Seq.empty
  override def optionalPrerequisiteOf = Seq.empty
  override def invalidates(xform: Transform) = false
  def execute(state: CircuitState): CircuitState = {
    logger.info(s"Found ${state.circuit.modules.size} module definitions in the circuit")
    state
  }
}
