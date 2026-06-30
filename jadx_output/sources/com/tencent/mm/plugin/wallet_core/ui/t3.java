package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class t3 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180624a;

    public t3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI) {
        this.f180624a = walletCheckPwdUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        android.os.Bundle bundle;
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI = this.f180624a;
            walletCheckPwdUI.f179989q = walletCheckPwdUI.f179979d.getText();
            com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletCheckPwdUI);
            java.lang.String e17 = g17 != null ? g17.e() : null;
            if (walletCheckPwdUI.f179986n && !"UnbindProcess".equals(e17)) {
                walletCheckPwdUI.doSceneProgress(new ss4.y(walletCheckPwdUI.f179989q, walletCheckPwdUI.f179988p));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15021, 1);
            } else {
                if (walletCheckPwdUI.getNetController().d(walletCheckPwdUI.f179989q, walletCheckPwdUI.getPayReqKey())) {
                    return;
                }
                java.lang.String str = "";
                if (g17 != null && (bundle = g17.f213801c) != null) {
                    str = bundle.getString("bus_info", "");
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    walletCheckPwdUI.doSceneProgress(new ss4.x(walletCheckPwdUI.f179989q, 1, walletCheckPwdUI.getPayReqKey()));
                } else {
                    walletCheckPwdUI.doSceneProgress(new ss4.x(walletCheckPwdUI.f179989q, 10, walletCheckPwdUI.getPayReqKey(), str));
                }
            }
        }
    }
}
