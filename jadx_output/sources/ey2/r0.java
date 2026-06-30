package ey2;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.sx2 f257488a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.o0 f257489b;

    public r0(r45.sx2 tab, ey2.o0 cache) {
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(cache, "cache");
        this.f257488a = tab;
        this.f257489b = cache;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.r0)) {
            return false;
        }
        ey2.r0 r0Var = (ey2.r0) obj;
        return kotlin.jvm.internal.o.b(this.f257488a, r0Var.f257488a) && kotlin.jvm.internal.o.b(this.f257489b, r0Var.f257489b);
    }

    public int hashCode() {
        return (this.f257488a.hashCode() * 31) + this.f257489b.hashCode();
    }

    public java.lang.String toString() {
        return "SubTabInfo(tab=" + this.f257488a + ", cache=" + this.f257489b + ')';
    }
}
