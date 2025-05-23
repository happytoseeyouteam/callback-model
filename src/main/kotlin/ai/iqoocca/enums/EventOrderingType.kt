package ai.iqoocca.enums

enum class EventOrderingType {
  ORDERED,     // 순서 보장 필요 (시퀀스 번호에 따라 순차적 처리)
  UNORDERED    // 순서 보장 불필요 (병렬 처리 가능)
}
