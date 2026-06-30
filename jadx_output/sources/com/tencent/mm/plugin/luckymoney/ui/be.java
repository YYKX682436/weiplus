package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class be implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146752a;

    public be(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f146752a = luckyMoneyNewReceiveUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.luckymoney.ui.zd zdVar = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Q1;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f146752a;
        android.os.ResultReceiver resultReceiver = luckyMoneyNewReceiveUI.A1;
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        luckyMoneyNewReceiveUI.finish();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        long j17 = luckyMoneyNewReceiveUI.D1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        g0Var.d(22105, 4, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - j17) / 1000));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
