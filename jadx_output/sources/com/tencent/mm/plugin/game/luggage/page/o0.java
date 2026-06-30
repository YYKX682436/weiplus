package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139926d;

    public o0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139926d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139926d;
        x0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "continueBackground, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        x0Var.f139949a2 += java.lang.System.currentTimeMillis() - x0Var.f139950b2;
        x0Var.f139950b2 = java.lang.System.currentTimeMillis();
    }
}
