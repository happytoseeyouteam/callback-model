package ai.iqoocca.enums

enum class ResponseType(
  val code: String,
  val description: String
) {
  SUCCESS("000_000", "Success"),
  FAIL("bbb_ccc", "fail")
}
