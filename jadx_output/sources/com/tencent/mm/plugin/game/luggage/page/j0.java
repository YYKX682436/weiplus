package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.k0 f139908d;

    public j0(com.tencent.mm.plugin.game.luggage.page.k0 k0Var) {
        this.f139908d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.k0 k0Var = this.f139908d;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = k0Var.f139909a;
        if (x0Var.T1) {
            x0Var.T1 = false;
            if (((android.app.Activity) x0Var.f406610d).isFinishing()) {
                return;
            }
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var2 = k0Var.f139909a;
            x0Var2.U1 = true;
            sd.w wVar = ((sd.u) x0Var2.f406612f).f406653a;
            java.lang.String s17 = x0Var2.s();
            android.os.Bundle bundle = x0Var2.f406657n;
            sd.k a17 = wVar.f406666g.a(s17, bundle);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("LuggagePageContainer", "No page specified for url %s", s17);
                return;
            }
            a17.b(s17, bundle);
            wVar.f406662c.postDelayed(new sd.q(wVar, a17), 500L);
        }
    }
}
