package com.tencent.pigeon.mega_video;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoNativeApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class MegaVideoNativeApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
    public static final com.tencent.pigeon.mega_video.MegaVideoNativeApiCodec INSTANCE = new com.tencent.pigeon.mega_video.MegaVideoNativeApiCodec();

    private MegaVideoNativeApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public java.lang.Object readValueOfType(byte type, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object readValue = readValue(buffer);
            java.util.List<? extends java.lang.Object> list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
            if (list != null) {
                return com.tencent.pigeon.mega_video.LVSnapshotInfo.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object readValue2 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
            if (list2 != null) {
                return com.tencent.pigeon.mega_video.MegaMainFeedListContext.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -126) {
            java.lang.Object readValue3 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list3 = readValue3 instanceof java.util.List ? (java.util.List) readValue3 : null;
            if (list3 != null) {
                return com.tencent.pigeon.mega_video.MegaVideoContact.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type != -125) {
            return super.readValueOfType(type, buffer);
        }
        java.lang.Object readValue4 = readValue(buffer);
        java.util.List<? extends java.lang.Object> list4 = readValue4 instanceof java.util.List ? (java.util.List) readValue4 : null;
        if (list4 != null) {
            return com.tencent.pigeon.mega_video.MegaVideoFeedInfo.INSTANCE.fromList(list4);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stream, "stream");
        if (obj instanceof com.tencent.pigeon.mega_video.LVSnapshotInfo) {
            stream.write(128);
            writeValue(stream, ((com.tencent.pigeon.mega_video.LVSnapshotInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.mega_video.MegaMainFeedListContext) {
            stream.write(129);
            writeValue(stream, ((com.tencent.pigeon.mega_video.MegaMainFeedListContext) obj).toList());
        } else if (obj instanceof com.tencent.pigeon.mega_video.MegaVideoContact) {
            stream.write(130);
            writeValue(stream, ((com.tencent.pigeon.mega_video.MegaVideoContact) obj).toList());
        } else if (!(obj instanceof com.tencent.pigeon.mega_video.MegaVideoFeedInfo)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(131);
            writeValue(stream, ((com.tencent.pigeon.mega_video.MegaVideoFeedInfo) obj).toList());
        }
    }
}
