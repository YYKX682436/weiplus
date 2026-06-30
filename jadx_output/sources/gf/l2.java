package gf;

/* loaded from: classes5.dex */
public final class l2 implements e06.h {

    /* renamed from: d, reason: collision with root package name */
    public final gf.k2 f271121d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.k2 f271122e;

    public l2(gf.k2 k2Var, gf.k2 k2Var2, kotlin.jvm.internal.i iVar) {
        this.f271121d = k2Var;
        this.f271122e = k2Var2;
    }

    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        return e06.g.a(this, (gf.k2) comparable);
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return this.f271121d;
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return this.f271122e;
    }

    @Override // e06.h
    public boolean isEmpty() {
        return ((gf.k2) h()).compareTo(g()) > 0;
    }
}
