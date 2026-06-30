package h14;

/* loaded from: classes5.dex */
public final class m0 implements com.tencent.mm.storage.p3 {
    @Override // com.tencent.mm.storage.p3
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        i95.m c17 = i95.n0.c(vd0.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        xd0.a aVar = (xd0.a) ((jm0.g) a17);
        if (gm0.j1.a()) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = aVar.f453613f;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            java.lang.Object l17 = gm0.j1.u().c().l(7, null);
            java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
            boolean z17 = !(num != null && (num.intValue() & 2) == 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsEmailFSC", "notifyUserInfoStatusChanged verified : " + z17);
            if (z17 && com.tencent.mm.sdk.platformtools.x2.n()) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    v14.x xVar = (v14.x) ((xd0.d) it.next());
                    if (z17) {
                        v14.y yVar = xVar.f432590a;
                        if (!yVar.f432591d) {
                            yVar.f432591d = true;
                            yVar.T6();
                            d75.b.g(new v14.w(yVar));
                        }
                    } else {
                        xVar.getClass();
                    }
                }
            }
        }
    }
}
