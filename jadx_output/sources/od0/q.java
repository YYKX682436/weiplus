package od0;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        ko3.o0 o0Var = new ko3.o0();
        try {
            if (!gm0.j1.i().f273218k) {
                com.tencent.mars.xlog.Log.e("TrustRequestManager", "MMKernel was not ready, skip requesting.");
                return;
            }
            fo3.s sVar = fo3.s.INSTANCE;
            if (sVar.He()) {
                byte[] Fi = sVar.Fi(2);
                if (Fi == null || Fi.length == 0) {
                    return;
                }
                o0Var.a();
                if (gm0.j1.d().h(gm0.j1.a() ? new go3.a(false, Fi) : new go3.a(true, Fi), com.tencent.mm.sdk.platformtools.t8.R(600000, 0))) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("TrustRequestManager", "[debug] doScene faild");
                o0Var.b();
                return;
            }
            byte[] Fi2 = sVar.Fi(1);
            if (Fi2 == null || Fi2.length == 0) {
                return;
            }
            o0Var.a();
            if (gm0.j1.d().h(gm0.j1.a() ? new go3.b(false, Fi2) : new go3.b(true, Fi2), 0)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("TrustRequestManager", "[debug] doScene faild");
            o0Var.b();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("TrustRequestManager", th6, "MMKernel was not ready, skip requesting.", new java.lang.Object[0]);
        }
    }
}
