package km2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r45.lw1 f309083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f309084b;

    public d(r45.lw1 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f309083a = info;
        this.f309084b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.d)) {
            return false;
        }
        km2.d dVar = (km2.d) obj;
        return kotlin.jvm.internal.o.b(this.f309083a, dVar.f309083a) && this.f309084b == dVar.f309084b;
    }

    public int hashCode() {
        return (this.f309083a.hashCode() * 31) + java.lang.Integer.hashCode(this.f309084b);
    }

    public java.lang.String toString() {
        return "CgiCover(info=" + this.f309083a + ", updateTime=" + this.f309084b + ')';
    }
}
