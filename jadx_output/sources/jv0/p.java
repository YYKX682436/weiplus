package jv0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f302205a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f302206b;

    public p(com.tencent.maas.model.time.MJTime time, boolean z17) {
        kotlin.jvm.internal.o.g(time, "time");
        this.f302205a = time;
        this.f302206b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv0.p)) {
            return false;
        }
        jv0.p pVar = (jv0.p) obj;
        return kotlin.jvm.internal.o.b(this.f302205a, pVar.f302205a) && this.f302206b == pVar.f302206b;
    }

    public int hashCode() {
        return (this.f302205a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f302206b);
    }

    public java.lang.String toString() {
        return "SnapTime(time=" + this.f302205a + ", isStartTime=" + this.f302206b + ')';
    }
}
