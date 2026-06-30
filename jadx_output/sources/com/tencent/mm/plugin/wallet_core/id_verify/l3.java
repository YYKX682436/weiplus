package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class l3 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.m3 f179414a;

    public l3(com.tencent.mm.plugin.wallet_core.id_verify.m3 m3Var) {
        this.f179414a = m3Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        com.tencent.mm.plugin.wallet_core.id_verify.m3 m3Var = this.f179414a;
        if (z17) {
            if (i17 == 1) {
                java.lang.String format = java.lang.String.format("%04d/%02d/%02d", 9999, 12, 31);
                com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = m3Var.f179420d;
                wcPayRealnameVerifyIdInputUI.L = 9999;
                wcPayRealnameVerifyIdInputUI.M = 12;
                wcPayRealnameVerifyIdInputUI.N = 31;
                wcPayRealnameVerifyIdInputUI.A.f179472t.setValue(format);
            } else {
                java.lang.String format2 = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI2 = m3Var.f179420d;
                wcPayRealnameVerifyIdInputUI2.L = i17;
                wcPayRealnameVerifyIdInputUI2.M = i18;
                wcPayRealnameVerifyIdInputUI2.N = i19;
                wcPayRealnameVerifyIdInputUI2.A.f179472t.setValue(format2);
            }
        }
        m3Var.f179420d.f179296w.b();
    }
}
