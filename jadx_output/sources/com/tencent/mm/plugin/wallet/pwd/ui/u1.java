package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class u1 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179084d;

    public u1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f179084d = walletPasswordSettingUI;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        int i18 = com.tencent.mm.R.string.f490507x1;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = this.f179084d;
        if (i17 == 1) {
            int i19 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
            db5.e1.K(walletPasswordSettingUI, false, walletPasswordSettingUI.getResources().getString(com.tencent.mm.R.string.f_g), "", walletPasswordSettingUI.getResources().getString(com.tencent.mm.R.string.f490507x1), walletPasswordSettingUI.getResources().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.pwd.ui.j1(walletPasswordSettingUI), new com.tencent.mm.plugin.wallet.pwd.ui.k1(walletPasswordSettingUI));
        } else if (i17 == 2) {
            int i27 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
            walletPasswordSettingUI.c7(false);
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            java.lang.String string = walletPasswordSettingUI.getResources().getString(com.tencent.mm.R.string.kut);
            android.content.res.Resources resources = walletPasswordSettingUI.getResources();
            if (aVar.Nh()) {
                i18 = com.tencent.mm.R.string.kus;
            }
            db5.e1.C(walletPasswordSettingUI, string, "", resources.getString(i18), walletPasswordSettingUI.getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.plugin.wallet.pwd.ui.l1(walletPasswordSettingUI, aVar), new com.tencent.mm.plugin.wallet.pwd.ui.m1(walletPasswordSettingUI));
        } else if (i17 == 3) {
            int i28 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
            walletPasswordSettingUI.c7(false);
            db5.e1.y(walletPasswordSettingUI, walletPasswordSettingUI.getResources().getString(com.tencent.mm.R.string.kur), "", walletPasswordSettingUI.getString(com.tencent.mm.R.string.kuq), new com.tencent.mm.plugin.wallet.pwd.ui.n1(walletPasswordSettingUI));
        }
        return false;
    }
}
