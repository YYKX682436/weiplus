package f26;

/* loaded from: classes16.dex */
public abstract class o0 implements p06.a, i26.i {

    /* renamed from: d, reason: collision with root package name */
    public int f259203d;

    public o0(kotlin.jvm.internal.i iVar) {
    }

    public abstract y16.s V();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f26.o0)) {
            return false;
        }
        f26.o0 o0Var = (f26.o0) obj;
        if (x0() == o0Var.x0()) {
            f26.c3 a17 = z0();
            f26.c3 b17 = o0Var.z0();
            kotlin.jvm.internal.o.g(a17, "a");
            kotlin.jvm.internal.o.g(b17, "b");
            if (f26.d.f259140a.b(g26.w.f268018a, a17, b17)) {
                return true;
            }
        }
        return false;
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        return f26.p.a(v0());
    }

    public final int hashCode() {
        int i17 = this.f259203d;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = f26.s0.a(this) ? super.hashCode() : (((w0().hashCode() * 31) + u0().hashCode()) * 31) + (x0() ? 1 : 0);
        this.f259203d = hashCode;
        return hashCode;
    }

    public abstract java.util.List u0();

    public abstract f26.r1 v0();

    public abstract f26.c2 w0();

    public abstract boolean x0();

    public abstract f26.o0 y0(g26.l lVar);

    public abstract f26.c3 z0();
}
