package ai.iqoocca.enums

/**
 * 시스템에서 발생하는 이벤트 타입을 정의하는 열거형 클래스
 * Outbox 이벤트의 타입을 명확하게 분류하기 위해 사용됨
 */
enum class EventType(val value: String, val eventOrderingType: EventOrderingType) {
  CARD_STATUS_CHANGED("CardStatusChanged", EventOrderingType.ORDERED),
  MONEY_TRANSFER_COMPLETED("MoneyTransferCompleted", EventOrderingType.UNORDERED);

  companion object {
    /**
     * 문자열 값으로부터 EventType을 찾아 반환
     * @param value 찾고자 하는 이벤트 타입의 문자열 값
     * @return 찾은 EventType 또는 null
     */
    fun fromString(value: String): EventType? = EventType.entries.find { it.value == value }
  }
}
