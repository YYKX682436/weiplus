package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f175716a;

    /* renamed from: b, reason: collision with root package name */
    public final long f175717b;

    public r(java.nio.ByteBuffer buffer, long j17) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f175716a = buffer;
        this.f175717b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.vlog.model.r)) {
            return false;
        }
        com.tencent.mm.plugin.vlog.model.r rVar = (com.tencent.mm.plugin.vlog.model.r) obj;
        return kotlin.jvm.internal.o.b(this.f175716a, rVar.f175716a) && this.f175717b == rVar.f175717b;
    }

    public int hashCode() {
        return (this.f175716a.hashCode() * 31) + java.lang.Long.hashCode(this.f175717b);
    }

    public java.lang.String toString() {
        return "PendingYuvBuffer(buffer=" + this.f175716a + ", timestamp=" + this.f175717b + ')';
    }
}
