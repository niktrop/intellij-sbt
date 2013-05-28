package org.jetbrains.sbt
package project

import com.intellij.openapi.externalSystem.model.ProjectSystemId

/**
 * @author Pavel Fatin
 */
object SbtProjectSystem {
  val Id = new ProjectSystemId("SBT")

  val Icon = SbtIcon

  val Name = "SBT"

  val ProjectName = "SBT project"
}