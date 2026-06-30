package km2;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final long f309224a;

    /* renamed from: b, reason: collision with root package name */
    public final km2.m f309225b;

    public x(long j17, km2.m live) {
        kotlin.jvm.internal.o.g(live, "live");
        this.f309224a = j17;
        this.f309225b = live;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.x)) {
            return false;
        }
        km2.x xVar = (km2.x) obj;
        return this.f309224a == xVar.f309224a && kotlin.jvm.internal.o.b(this.f309225b, xVar.f309225b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f309224a) * 31) + this.f309225b.hashCode();
    }

    public java.lang.String toString() {
        return "PreInHistory(comeInTime=" + this.f309224a + ", live=" + this.f309225b + ')';
    }
}
