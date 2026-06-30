package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class u1 implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179501d;

    public u1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179501d = wcPayRealnameVerifyCodeUI;
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "phone valid change: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179501d;
        if (!wcPayRealnameVerifyCodeUI.f179267d.n() || wcPayRealnameVerifyCodeUI.f179276p) {
            wcPayRealnameVerifyCodeUI.f179269f.setEnabled(false);
        } else {
            wcPayRealnameVerifyCodeUI.f179269f.setEnabled(true);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.U6(wcPayRealnameVerifyCodeUI);
    }
}
