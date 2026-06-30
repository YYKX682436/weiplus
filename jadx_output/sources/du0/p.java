package du0;

/* loaded from: classes.dex */
public final class p implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f243406d;

    public p(du0.i0 i0Var, yz5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f243406d = result;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        yz5.l lVar = this.f243406d;
        if (z17) {
            lVar.invoke(new jz5.l(java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17)));
            return true;
        }
        lVar.invoke(null);
        return true;
    }
}
