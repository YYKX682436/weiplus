package yg5;

/* loaded from: classes10.dex */
public abstract class f extends xm3.a {
    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return getPriority() - other.getPriority();
    }

    public abstract int getPriority();

    @Override // xm3.a
    /* renamed from: l */
    public boolean s0(xm3.d dVar) {
        yg5.f other = (yg5.f) dVar;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(n(), other.n());
    }

    public abstract java.lang.String n();

    @Override // xm3.a, xm3.d
    public boolean s0(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(n(), other.n());
    }

    @Override // xm3.d
    public java.lang.String v() {
        return n();
    }
}
