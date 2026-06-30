package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.u f139922d;

    public n(com.tencent.mm.plugin.game.luggage.page.u uVar) {
        this.f139922d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b53.c h5GameMenuHelp;
        com.tencent.mm.plugin.game.luggage.page.u uVar = this.f139922d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(uVar.E.f406657n.getString("game_hv_menu_appid"))) {
            uVar.G = new a53.b(uVar.E, 0, uVar.getMenuHelp());
            return;
        }
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = uVar.E;
        h5GameMenuHelp = uVar.getH5GameMenuHelp();
        uVar.H = new b53.f(x0Var, h5GameMenuHelp);
    }
}
