package fk;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.h f263248a;

    /* renamed from: b, reason: collision with root package name */
    public long f263249b;

    /* renamed from: c, reason: collision with root package name */
    public long f263250c;

    public a(com.tencent.matrix.lifecycle.h foregroundListener, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        j18 = (i17 & 4) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(foregroundListener, "foregroundListener");
        this.f263248a = foregroundListener;
        this.f263249b = j17;
        this.f263250c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk.a)) {
            return false;
        }
        fk.a aVar = (fk.a) obj;
        return kotlin.jvm.internal.o.b(this.f263248a, aVar.f263248a) && this.f263249b == aVar.f263249b && this.f263250c == aVar.f263250c;
    }

    public int hashCode() {
        return (((this.f263248a.hashCode() * 31) + java.lang.Long.hashCode(this.f263249b)) * 31) + java.lang.Long.hashCode(this.f263250c);
    }

    public java.lang.String toString() {
        return "ExposeData(foregroundListener=" + this.f263248a + ", startTime=" + this.f263249b + ", exposeTime=" + this.f263250c + ')';
    }
}
