package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public interface MethodCodec {
    java.lang.Object decodeEnvelope(java.nio.ByteBuffer byteBuffer);

    io.flutter.plugin.common.MethodCall decodeMethodCall(java.nio.ByteBuffer byteBuffer);

    java.nio.ByteBuffer encodeErrorEnvelope(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    java.nio.ByteBuffer encodeErrorEnvelopeWithStacktrace(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3);

    java.nio.ByteBuffer encodeMethodCall(io.flutter.plugin.common.MethodCall methodCall);

    java.nio.ByteBuffer encodeSuccessEnvelope(java.lang.Object obj);
}
