package yd;

/* loaded from: classes7.dex */
public abstract class y {
    public abstract void a();

    public yd.x b(java.lang.String str) {
        yd.e eVar = ((yd.b) this).f460917a;
        java.io.InputStream a17 = eVar.f460940b.x() != null ? eVar.f460940b.x().a(str) : null;
        if (a17 == null) {
            return null;
        }
        return new yd.x(this, q75.g.c(str), com.tencent.mapsdk.internal.rv.f51270c, a17);
    }
}
