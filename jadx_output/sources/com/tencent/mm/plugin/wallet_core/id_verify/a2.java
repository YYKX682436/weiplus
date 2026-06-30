package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class a2 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI, long j17, long j18) {
        super(j17, j18);
        this.f179333a = wcPayRealnameVerifyCodeUI;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179333a;
        wcPayRealnameVerifyCodeUI.f179269f.setText(wcPayRealnameVerifyCodeUI.getString(com.tencent.mm.R.string.l4c));
        wcPayRealnameVerifyCodeUI.f179276p = false;
        if (!wcPayRealnameVerifyCodeUI.f179267d.n() || wcPayRealnameVerifyCodeUI.f179276p) {
            wcPayRealnameVerifyCodeUI.f179269f.setEnabled(false);
        } else {
            wcPayRealnameVerifyCodeUI.f179269f.setEnabled(true);
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179333a;
        android.widget.Button button = wcPayRealnameVerifyCodeUI.f179269f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j18 = j17 / 1000;
        sb6.append(j18);
        sb6.append("s");
        button.setText(wcPayRealnameVerifyCodeUI.getString(com.tencent.mm.R.string.l4b, sb6.toString()));
        wcPayRealnameVerifyCodeUI.f179269f.setContentDescription(wcPayRealnameVerifyCodeUI.getString(com.tencent.mm.R.string.l4d, j18 + ""));
    }
}
