package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.plugin.game.luggage.page.x0 {
    public a(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = this.f406656m;
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        ((com.tencent.mm.plugin.game.luggage.page.b0) this.f182180p).setShouldCleanPkgWhenDestroy(true);
        this.f406654h.setTag("game_float_view_tag");
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0
    public void D(int i17, java.lang.String str, java.lang.String str2) {
        p(false);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public void H(java.lang.String str) {
        this.f182183q.setPullDownEnabled(false);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public void I(java.lang.String str, int i17) {
        super.I("微信游戏", i17);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0
    public void T(boolean z17) {
        super.T(z17);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0
    public void U() {
    }

    @Override // sd.u0, sd.k
    public boolean c() {
        q();
        return true;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatLayerWebPage", "onForeground");
        super.g();
        I("微信游戏", 0);
        this.f182183q.g();
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0, sd.u0
    public android.view.View k() {
        android.view.View k17 = super.k();
        this.f182185s.setBackgroundColor(0);
        return k17;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public boolean n() {
        return false;
    }
}
