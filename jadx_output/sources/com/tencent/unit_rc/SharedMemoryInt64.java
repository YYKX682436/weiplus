package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/tencent/unit_rc/SharedMemoryInt64;", "Lcom/tencent/unit_rc/SharedMemoryBase;", "", "Ljava/nio/ByteBuffer;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "valueFromData", "(Ljava/nio/ByteBuffer;)Ljava/lang/Long;", "value", "Ljz5/f0;", "valueToData", "getBuffer", "()Ljava/nio/ByteBuffer;", "buffer", "Lcom/tencent/unit_rc/ByteBuffer;", "byteBuffer", "", "cacheSize", "<init>", "(Lcom/tencent/unit_rc/ByteBuffer;I)V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public final class SharedMemoryInt64 extends com.tencent.unit_rc.SharedMemoryBase<java.lang.Long> {
    /* JADX WARN: Multi-variable type inference failed */
    public SharedMemoryInt64() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    private final java.nio.ByteBuffer getBuffer() {
        return getByteBuffer().getData();
    }

    @Override // com.tencent.unit_rc.SharedMemoryBase
    public /* bridge */ /* synthetic */ void valueToData(java.nio.ByteBuffer byteBuffer, java.lang.Long l17) {
        valueToData(byteBuffer, l17.longValue());
    }

    public /* synthetic */ SharedMemoryInt64(com.tencent.unit_rc.ByteBuffer byteBuffer, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? null : byteBuffer, (i18 & 2) != 0 ? 3 : i17);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.unit_rc.SharedMemoryBase
    public java.lang.Long valueFromData(java.nio.ByteBuffer data) {
        kotlin.jvm.internal.o.g(data, "data");
        return java.lang.Long.valueOf(getBuffer().asLongBuffer().get());
    }

    public void valueToData(java.nio.ByteBuffer data, long j17) {
        kotlin.jvm.internal.o.g(data, "data");
        data.asLongBuffer().put(j17);
    }

    public SharedMemoryInt64(com.tencent.unit_rc.ByteBuffer byteBuffer, int i17) {
        super(byteBuffer, 8, i17);
    }
}
