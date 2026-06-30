package gf;

/* loaded from: classes7.dex */
public final class i2 implements e06.h {

    /* renamed from: d, reason: collision with root package name */
    public final gf.h2 f271095d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.h2 f271096e;

    public i2(gf.h2 h2Var, gf.h2 h2Var2, kotlin.jvm.internal.i iVar) {
        this.f271095d = h2Var;
        this.f271096e = h2Var2;
    }

    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        return e06.g.a(this, (gf.h2) comparable);
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return this.f271095d;
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return this.f271096e;
    }

    @Override // e06.h
    public boolean isEmpty() {
        return ((gf.h2) h()).compareTo(g()) > 0;
    }
}
