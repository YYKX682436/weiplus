package re;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f394268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(re.n nVar) {
        super(0);
        this.f394268d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        re.n nVar = this.f394268d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) nVar.f394285h).getValue();
        java.lang.String str = nVar.f394279b;
        b4Var.d();
        try {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]onForeground appId[" + str + "] try restore top[" + nVar.f394280c + "] pages's rendering");
            com.tencent.mm.plugin.appbrand.page.i3 x07 = nVar.f394278a.x0();
            if (x07 != null) {
                java.util.Iterator h07 = x07.h0(false);
                int i17 = 0;
                while (true) {
                    com.tencent.mm.plugin.appbrand.page.g4 g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
                    if (!g4Var.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) g4Var.next();
                    i17++;
                    if (i17 <= nVar.f394280c) {
                        kotlin.jvm.internal.o.d(w2Var);
                        nVar.c(w2Var);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]onForeground appId[" + str + ']', new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
