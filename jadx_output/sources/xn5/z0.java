package xn5;

/* loaded from: classes13.dex */
public final class z0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.hg7 f455737d;

    public z0(r45.hg7 preloadData) {
        kotlin.jvm.internal.o.g(preloadData, "preloadData");
        this.f455737d = preloadData;
    }

    public void a() {
        r45.hg7 hg7Var = this.f455737d;
        try {
            byte[] byteArray = hg7Var.toByteArray();
            r45.hg7 hg7Var2 = new r45.hg7();
            hg7Var2.parseFrom(byteArray);
            java.lang.String str = hg7Var2.f376140d;
            if (str == null) {
                str = "";
            }
            if (xn5.q0.f455702a.b().d().c(str)) {
                java.util.HashMap hashMap = xn5.e1.f455667e;
                java.lang.Object obj = hashMap.get(str);
                if (obj == null) {
                    try {
                        com.tencent.mm.sdk.platformtools.o4 e17 = xn5.e1.f455663a.e();
                        if (e17 != null) {
                            e17.H(str, byteArray);
                        }
                    } catch (java.lang.Exception e18) {
                        xn5.e1 e1Var = xn5.e1.f455663a;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.X2C.X2CLayoutCachePool", e18, "UpdateLayoutStrategyTask1", new java.lang.Object[0]);
                    }
                    hashMap.put(str, hg7Var2);
                    obj = hg7Var2;
                }
                r45.hg7 hg7Var3 = (r45.hg7) obj;
                if (!kotlin.jvm.internal.o.b(hg7Var3, hg7Var2)) {
                    boolean z17 = hg7Var3.f376141e.size() < hg7Var2.f376141e.size();
                    boolean a17 = xn5.g1.a(hg7Var3, hg7Var2);
                    if (!z17 && !a17) {
                        if (com.tencent.mars.xlog.Log.isDebug()) {
                            xn5.g1.b(hg7Var3);
                            xn5.g1.b(hg7Var2);
                        }
                    }
                    xn5.e1.f455667e.put(str, hg7Var2);
                    try {
                        com.tencent.mm.sdk.platformtools.o4 e19 = xn5.e1.f455663a.e();
                        if (e19 != null) {
                            e19.H(str, byteArray);
                        }
                    } catch (java.lang.Exception e27) {
                        xn5.e1 e1Var2 = xn5.e1.f455663a;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.X2C.X2CLayoutCachePool", e27, "UpdateLayoutStrategyTask2", new java.lang.Object[0]);
                    }
                    if (com.tencent.mars.xlog.Log.isDebug()) {
                        xn5.g1.b(hg7Var2);
                    }
                } else if (com.tencent.mars.xlog.Log.isDebug()) {
                    xn5.g1.b(hg7Var2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "update strategy " + str + ' ' + hg7Var2.f376141e.size());
            }
        } catch (java.lang.Exception e28) {
            xn5.e1 e1Var3 = xn5.e1.f455663a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.X2C.X2CLayoutCachePool", e28, "UpdateLayoutStrategyTask %s", hg7Var.f376140d);
        }
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        a();
        return jz5.f0.f302826a;
    }
}
