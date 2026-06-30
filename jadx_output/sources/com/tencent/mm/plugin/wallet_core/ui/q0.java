package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes7.dex */
public class q0 {
    public q0(com.tencent.mm.plugin.wallet_core.ui.o0 o0Var) {
    }

    @android.webkit.JavascriptInterface
    public void marketingSwitchChanged(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowWxPayAgreementsUI", "marketing switch changed, opened = %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15236, 4);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15236, 5);
        }
    }
}
