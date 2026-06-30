package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public interface MessageCodec<T> {
    T decodeMessage(java.nio.ByteBuffer byteBuffer);

    java.nio.ByteBuffer encodeMessage(T t17);
}
