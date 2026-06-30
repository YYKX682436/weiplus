package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tencent/unit_rc/ByteBufferCpp;", "Lcom/tencent/unit_rc/ByteBuffer;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "isProxy", "", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class ByteBufferCpp extends com.tencent.unit_rc.ByteBuffer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferCpp(java.nio.ByteBuffer data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public boolean isProxy() {
        return true;
    }
}
