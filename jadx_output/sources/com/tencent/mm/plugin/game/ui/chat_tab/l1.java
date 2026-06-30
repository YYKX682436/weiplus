package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class l1 implements com.tencent.mm.plugin.game.luggage.page.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI f141290a;

    public l1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI) {
        this.f141290a = gameWebTabUI;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public boolean a() {
        p53.u uVar = this.f141290a.f141197m;
        if (uVar != null) {
            return uVar.getGameTabWidget().f141190h;
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public int b() {
        p53.u uVar = this.f141290a.f141197m;
        int height = uVar != null ? uVar.getHeight() : 0;
        int e17 = ik1.w.e(height);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "tabHeight:%d, heightInH5:%d", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(e17));
        return e17;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public boolean c() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141290a.f141199o;
        return gameTabData2 != null && gameTabData2.f141151d.size() <= 1;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public void d(boolean z17) {
        p53.u uVar = this.f141290a.f141197m;
        if (uVar != null) {
            uVar.getGameTabWidget().setPageChanging(z17);
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public java.lang.String e() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141290a.f141199o;
        return gameTabData2 != null ? gameTabData2.e() : "";
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public boolean f() {
        return this.f141290a.getIntent().getBooleanExtra("game_has_entrance_info", false);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public void g(java.lang.String str) {
        p53.u uVar = this.f141290a.f141197m;
        if (uVar != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget = uVar.getGameTabWidget();
            gameTabWidget.getClass();
            gameTabWidget.post(new com.tencent.mm.plugin.game.ui.chat_tab.t0(gameTabWidget, str));
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.k
    public int h() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI = this.f141290a;
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = gameWebTabUI.f141199o;
        if (gameTabData2 == null) {
            return 0;
        }
        if (gameTabData2.f141151d.containsKey("chat")) {
            return 2;
        }
        return r53.n.a(gameWebTabUI.f141199o) ? 1 : 0;
    }
}
