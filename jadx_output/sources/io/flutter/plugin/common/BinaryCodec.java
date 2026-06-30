package io.flutter.plugin.common;

/* loaded from: classes5.dex */
public final class BinaryCodec implements io.flutter.plugin.common.MessageCodec<java.nio.ByteBuffer> {
    public static final io.flutter.plugin.common.BinaryCodec INSTANCE = new io.flutter.plugin.common.BinaryCodec();
    public static final io.flutter.plugin.common.BinaryCodec INSTANCE_DIRECT = new io.flutter.plugin.common.BinaryCodec(true);
    private final boolean returnsDirectByteBufferFromDecoding;

    private BinaryCodec() {
        this.returnsDirectByteBufferFromDecoding = false;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.nio.ByteBuffer encodeMessage(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.nio.ByteBuffer decodeMessage(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null || this.returnsDirectByteBufferFromDecoding) {
            return byteBuffer;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.capacity());
        allocate.put(byteBuffer);
        allocate.rewind();
        return allocate;
    }

    private BinaryCodec(boolean z17) {
        this.returnsDirectByteBufferFromDecoding = z17;
    }
}
