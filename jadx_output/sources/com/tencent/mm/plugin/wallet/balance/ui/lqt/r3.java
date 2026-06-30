package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class r3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f178350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f178351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178352f;

    public r3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, float f17, float f18) {
        this.f178352f = walletLqtPlanAddUI;
        this.f178350d = f17;
        this.f178351e = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float abs = (int) java.lang.Math.abs(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        float f17 = this.f178350d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178352f;
        if (abs >= f17) {
            float f18 = this.f178351e;
            if (abs <= f18) {
                if (!walletLqtPlanAddUI.D) {
                    walletLqtPlanAddUI.setTitleAlpha(0.0f);
                    walletLqtPlanAddUI.setMMTitle(com.tencent.mm.sdk.platformtools.t8.K0(walletLqtPlanAddUI.E) ? walletLqtPlanAddUI.getString(com.tencent.mm.R.string.kqr) : walletLqtPlanAddUI.E);
                }
                walletLqtPlanAddUI.D = true;
                walletLqtPlanAddUI.setTitleAlpha((abs - f17) / (f18 - f17));
                return;
            }
        }
        if (walletLqtPlanAddUI.D) {
            walletLqtPlanAddUI.setActionbarColor(walletLqtPlanAddUI.getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        walletLqtPlanAddUI.D = false;
    }
}
