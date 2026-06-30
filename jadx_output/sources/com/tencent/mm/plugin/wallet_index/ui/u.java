package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class u implements com.tencent.mm.plugin.wallet_index.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f181210a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181211b;

    public u(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        this.f181211b = walletBrandUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public int a() {
        return com.tencent.mm.minigame.download.mmdownloader.i.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public com.tencent.mm.modelbase.m1 b() {
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = this.f181211b.f181086h;
        pt4.a aVar = new pt4.a(walletJsapiData.f192129d, walletJsapiData.f192131f, walletJsapiData.f192132g, walletJsapiData.f192134i, walletJsapiData.f192138p, walletJsapiData.f192133h, walletJsapiData.f192140r, walletJsapiData.f192141s, walletJsapiData.f192144v);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(aVar);
        return aVar;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public java.lang.String c() {
        return this.f181210a;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        pt4.a aVar = (pt4.a) m1Var;
        java.lang.String str2 = aVar.f358264f;
        this.f181210a = str2;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str2;
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181211b;
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = walletBrandUI.f181086h;
        payInfo.f192116o = walletJsapiData.f192129d;
        payInfo.f192117p = aVar.f358265g;
        payInfo.f192109e = walletJsapiData.f192142t;
        payInfo.f192121t = str;
        payInfo.f192111g = walletJsapiData.f192144v;
        h45.a0.f(walletBrandUI, payInfo, 1);
    }
}
