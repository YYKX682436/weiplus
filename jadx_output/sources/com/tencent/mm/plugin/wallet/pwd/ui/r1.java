package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class r1 implements com.tencent.mm.wallet_core.model.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179064a;

    public r1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f179064a = walletPasswordSettingUI;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.f0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void c(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:continue");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void d(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:none");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void e(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:former_page");
    }

    @Override // com.tencent.mm.wallet_core.model.e0
    public void f(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:exit");
        this.f179064a.finish();
    }
}
