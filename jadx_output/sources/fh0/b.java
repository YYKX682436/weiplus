package fh0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f262518a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f262519b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f262520c;

    /* renamed from: d, reason: collision with root package name */
    public int f262521d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f262522e;

    public b(long j17, boolean z17, java.lang.String status, int i17, java.lang.String firstChunk, int i18, kotlin.jvm.internal.i iVar) {
        status = (i18 & 4) != 0 ? "ACTIVE" : status;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        firstChunk = (i18 & 16) != 0 ? "" : firstChunk;
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(firstChunk, "firstChunk");
        this.f262518a = j17;
        this.f262519b = z17;
        this.f262520c = status;
        this.f262521d = i17;
        this.f262522e = firstChunk;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0.b)) {
            return false;
        }
        fh0.b bVar = (fh0.b) obj;
        return this.f262518a == bVar.f262518a && this.f262519b == bVar.f262519b && kotlin.jvm.internal.o.b(this.f262520c, bVar.f262520c) && this.f262521d == bVar.f262521d && kotlin.jvm.internal.o.b(this.f262522e, bVar.f262522e);
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f262518a) * 31) + java.lang.Boolean.hashCode(this.f262519b)) * 31) + this.f262520c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f262521d)) * 31) + this.f262522e.hashCode();
    }

    public java.lang.String toString() {
        return "StreamItemData(msgSvrId=" + this.f262518a + ", isThinking=" + this.f262519b + ", status=" + this.f262520c + ", dataLength=" + this.f262521d + ", firstChunk=" + this.f262522e + ')';
    }
}
