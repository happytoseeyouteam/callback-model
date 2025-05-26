package ai.iqoocca.enums

enum class ProcessedStatus(val value: String) {
  PENDING("PENDING"),           // 처리 대기 중
  PROCESSING("PROCESSING"),     // 처리 중
  PUBLISHED("PUBLISHED"),       // 발행 완료 (메시지 브로커로 전송 완료)
  FAILED("FAILED"),            // 처리 실패
  RETRY("RETRY")               // 재시도 대기 중 (선택적)
  ;
}
