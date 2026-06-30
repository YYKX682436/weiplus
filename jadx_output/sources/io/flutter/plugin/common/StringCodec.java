package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public final class StringCodec implements io.flutter.plugin.common.MessageCodec<java.lang.String> {
    private static final java.nio.charset.Charset UTF8 = java.nio.charset.Charset.forName("UTF8");
    public static final io.flutter.plugin.common.StringCodec INSTANCE = new io.flutter.plugin.common.StringCodec();

    private StringCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.lang.String decodeMessage(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr;
        int i17;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i17 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i17 = 0;
        }
        return new java.lang.String(bArr, i17, remaining, UTF8);
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.nio.ByteBuffer encodeMessage(java.lang.String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(UTF8);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
