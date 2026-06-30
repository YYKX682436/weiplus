package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class b4 implements com.tencent.mm.plugin.wallet_core.ui.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI f152591a;

    public b4(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f152591a = activity;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.r3
    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEnableUIC", "do offline enable token cgi");
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI = this.f152591a;
        walletCheckPwdNewUI.showLoading();
        kotlin.jvm.internal.o.d(str);
        pq5.g l17 = new wo3.a(str).l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.tencent.mm.plugin.offline.ui.a4(this)).f(walletCheckPwdNewUI);
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.r3
    public boolean onClickClose() {
        return false;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.r3
    public void onCreate() {
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.r3
    public void onDestroy() {
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.r3
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
