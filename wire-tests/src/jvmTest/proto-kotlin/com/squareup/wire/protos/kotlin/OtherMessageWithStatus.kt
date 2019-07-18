// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: same_name_enum.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireEnum
import kotlin.AssertionError
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

data class OtherMessageWithStatus(
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<OtherMessageWithStatus, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing {
    throw AssertionError()
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<OtherMessageWithStatus> = object :
        ProtoAdapter<OtherMessageWithStatus>(
      FieldEncoding.LENGTH_DELIMITED, 
      OtherMessageWithStatus::class
    ) {
      override fun encodedSize(value: OtherMessageWithStatus): Int = 
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: OtherMessageWithStatus) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): OtherMessageWithStatus {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return OtherMessageWithStatus(
          unknownFields = unknownFields
        )
      }

      override fun redact(value: OtherMessageWithStatus): OtherMessageWithStatus = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }

  enum class Status(
    override val value: Int
  ) : WireEnum {
    A(1);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Status> = object : EnumAdapter<Status>(
        Status::class
      ) {
        override fun fromValue(value: Int): Status = Status.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): Status = when (value) {
        1 -> A
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }
}
