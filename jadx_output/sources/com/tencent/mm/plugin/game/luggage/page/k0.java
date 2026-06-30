package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class k0 extends com.tencent.mm.plugin.wepkg.event.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139909a;

    public k0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139909a = x0Var;
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139909a;
        x0Var.T1 = true;
        x0Var.M.postDelayed(new com.tencent.mm.plugin.game.luggage.page.i0(this), 500L);
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onPkgReady");
        this.f139909a.M.post(new com.tencent.mm.plugin.game.luggage.page.j0(this));
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void c() {
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = (com.tencent.mm.plugin.game.luggage.page.b0) this.f139909a.f406655i.h();
        if (com.tencent.mm.sdk.platformtools.t8.K0(b0Var.S)) {
            return;
        }
        b0Var.post(new com.tencent.mm.plugin.game.luggage.page.x(b0Var));
    }
}
