package j14;

/* loaded from: classes8.dex */
public final class k extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        gm0.j1.a();
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a()) {
            i95.m c17 = i95.n0.c(vd0.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            jm0.o oVar = (jm0.o) c17;
            if (!jm0.g.class.isAssignableFrom(xd0.b.class)) {
                throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.b.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            l14.c.f315001a.tryReport();
        }
    }
}
