package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class u9 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180658a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI, long j17, long j18) {
        super(j17, j18);
        this.f180658a = walletVerifyCodeUI;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180658a;
        walletVerifyCodeUI.f180112f.setClickable(true);
        walletVerifyCodeUI.f180112f.setEnabled(true);
        walletVerifyCodeUI.f180112f.setText(walletVerifyCodeUI.getString(com.tencent.mm.R.string.l0y));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180658a;
        walletVerifyCodeUI.f180112f.setText(walletVerifyCodeUI.getString(com.tencent.mm.R.string.l0y) + "(" + (j17 / 1000) + ")");
    }
}
