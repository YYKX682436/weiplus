package io.flutter.embedding.engine.dart;

/* loaded from: classes15.dex */
public interface PlatformMessageHandler {
    void handleMessageFromDart(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, long j17);

    void handlePlatformMessageResponse(int i17, java.nio.ByteBuffer byteBuffer);
}
