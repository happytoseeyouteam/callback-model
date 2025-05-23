package ai.iqoocca.enums

/**
 * 시스템에서 사용되는 엔티티 타입을 정의하는 열거형 클래스
 * 이 타입들은 Outbox 이벤트에서 Aggregate Type으로 사용됨
 */
enum class EntityType(val value: String) {
  CARD_STATUS_CHANGED("CardStatusChanged"),
  INVENTORY("Inventory"),
  PAYMENT("Payment");

  companion object {
    /**
     * 문자열 값으로부터 EntityType을 찾아 반환
     * @param value 찾고자 하는 타입의 문자열 값
     * @return 찾은 EntityType 또는 null
     */
    fun fromString(value: String): EntityType? = EntityType.entries.find { it.value == value }
  }
}
