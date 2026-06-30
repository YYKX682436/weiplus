package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class x implements com.tencent.mm.plugin.wallet_index.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f181220a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181221b;

    public x(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        this.f181221b = walletBrandUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public int a() {
        return 2755;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public com.tencent.mm.modelbase.m1 b() {
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181221b;
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = walletBrandUI.f181086h;
        nt4.k kVar = new nt4.k(walletJsapiData.f192129d, walletJsapiData.f192131f, walletJsapiData.f192132g, walletJsapiData.f192134i, walletJsapiData.f192138p, walletJsapiData.f192133h, walletJsapiData.f192140r, walletJsapiData.f192141s, walletJsapiData.f192144v, walletJsapiData.f192142t, walletJsapiData.f192147y);
        kVar.setProcessSessionId(java.lang.System.currentTimeMillis());
        kVar.setProcessName("PayProcess");
        kVar.setScene(walletBrandUI.f181086h.f192142t);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(kVar);
        return kVar;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public java.lang.String c() {
        return this.f181220a;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181221b;
        if (i17 != 0 || i18 != 0) {
            walletBrandUI.finish();
            return;
        }
        nt4.k kVar = (nt4.k) m1Var;
        java.lang.String str2 = kVar.f339834f;
        this.f181220a = str2;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str2;
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = walletBrandUI.f181086h;
        payInfo.f192116o = walletJsapiData.f192129d;
        payInfo.f192117p = kVar.f339835g;
        int i19 = walletJsapiData.f192142t;
        payInfo.f192109e = i19;
        payInfo.f192121t = str;
        payInfo.f192111g = walletJsapiData.f192144v;
        payInfo.F = kVar.sessionId;
        com.tencent.mm.wallet_core.model.a2.b(i19, str2, i18);
        h45.a0.f(walletBrandUI, payInfo, 1);
    }
}
