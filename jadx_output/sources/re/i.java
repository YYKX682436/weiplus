package re;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f394272d;

    public i(re.n nVar) {
        this.f394272d = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        re.n nVar = this.f394272d;
        try {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onBackground appId[" + nVar.f394279b + "] try pause all pages's rendering, delay[" + ((java.lang.Number) ((jz5.n) nVar.f394284g).getValue()).longValue() + "] switch[" + nVar.f394282e + ']');
            if (nVar.f394282e) {
                java.util.Iterator v17 = nVar.f394278a.v1();
                int i17 = 0;
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
                            i17++;
                            if (i17 > nVar.f394283f) {
                                kotlin.jvm.internal.o.d(w2Var);
                                re.n.a(nVar, w2Var);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]onBackground appId[" + nVar.f394279b + ']', new java.lang.Object[0]);
        }
        return false;
    }
}
