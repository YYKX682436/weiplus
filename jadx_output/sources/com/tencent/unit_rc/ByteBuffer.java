package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/unit_rc/ByteBuffer;", "Lcom/tencent/unit_rc/BaseObject;", "capacity", "", "(I)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "getData", "()Ljava/nio/ByteBuffer;", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public class ByteBuffer extends com.tencent.unit_rc.BaseObject {
    private final java.nio.ByteBuffer data;

    public ByteBuffer(int i17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(capacity)");
        this.data = allocateDirect;
    }

    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    public ByteBuffer(java.nio.ByteBuffer data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data.isDirect()) {
            this.data = data;
            return;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(data.capacity());
        allocateDirect.put(data);
        this.data = allocateDirect;
    }
}
