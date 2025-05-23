package ai.iqoocca.model

import java.time.LocalDateTime

data class ErrorResponse(
  val errorCode: String,
  val message: String,
  val timestamp: LocalDateTime = LocalDateTime.now()
)
