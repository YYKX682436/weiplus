package re;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f394267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(re.n nVar) {
        super(0);
        this.f394267d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        re.n nVar = this.f394267d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) nVar.f394285h).getValue();
        java.lang.String str = nVar.f394279b;
        b4Var.d();
        try {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onSuspend appId[" + str + "] try pause all pages's rendering");
            java.util.Iterator v17 = nVar.f394278a.v1();
            while (true) {
                com.tencent.mm.plugin.appbrand.z2 z2Var = (com.tencent.mm.plugin.appbrand.z2) v17;
                if (!z2Var.hasNext()) {
                    break;
                }
                java.util.Iterator h07 = ((com.tencent.mm.plugin.appbrand.page.i3) z2Var.next()).h0(false);
                while (true) {
                    com.tencent.mm.plugin.appbrand.page.g4 g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
                    if (g4Var.hasNext()) {
                        com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) g4Var.next();
                        kotlin.jvm.internal.o.d(w2Var);
                        re.n.a(nVar, w2Var);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]onSuspend appId[" + str + ']', new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
