package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveNativeRouterApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class LiveNativeRouterApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
    public static final com.tencent.pigeon.live_common.LiveNativeRouterApiCodec INSTANCE = new com.tencent.pigeon.live_common.LiveNativeRouterApiCodec();

    private LiveNativeRouterApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public java.lang.Object readValueOfType(byte type, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object readValue = readValue(buffer);
            java.util.List<? extends java.lang.Object> list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
            if (list != null) {
                return com.tencent.pigeon.live_common.LiveAddressInfo.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type != -127) {
            return super.readValueOfType(type, buffer);
        }
        java.lang.Object readValue2 = readValue(buffer);
        java.util.List<? extends java.lang.Object> list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
        if (list2 != null) {
            return com.tencent.pigeon.live_common.LiveOpenHalfWebParams.INSTANCE.fromList(list2);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stream, "stream");
        if (obj instanceof com.tencent.pigeon.live_common.LiveAddressInfo) {
            stream.write(128);
            writeValue(stream, ((com.tencent.pigeon.live_common.LiveAddressInfo) obj).toList());
        } else if (!(obj instanceof com.tencent.pigeon.live_common.LiveOpenHalfWebParams)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(129);
            writeValue(stream, ((com.tencent.pigeon.live_common.LiveOpenHalfWebParams) obj).toList());
        }
    }
}
