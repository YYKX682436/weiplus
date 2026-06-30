package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {
    public p(com.tencent.mm.plugin.wallet_index.ui.q qVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "current top activity: %s", n07);
        if (n07 == null || !n07.equals("WebViewUI")) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletBrandUI", "may be not close success");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.emoji.m.CTRL_INDEX, 9);
    }
}
