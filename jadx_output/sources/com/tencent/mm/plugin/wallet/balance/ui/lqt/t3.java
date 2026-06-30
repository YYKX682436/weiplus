package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class t3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f178375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f178376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178377f;

    public t3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, float f17, float f18) {
        this.f178377f = walletLqtPlanAddUI;
        this.f178375d = f17;
        this.f178376e = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float abs = (int) java.lang.Math.abs(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        float f17 = this.f178375d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178377f;
        if (abs >= f17) {
            float f18 = this.f178376e;
            if (abs <= f18) {
                walletLqtPlanAddUI.D = true;
                walletLqtPlanAddUI.setTitleAlpha((abs - f17) / (f18 - f17));
                return;
            }
        }
        if (walletLqtPlanAddUI.D) {
            walletLqtPlanAddUI.setTitleAlpha(0.0f);
            walletLqtPlanAddUI.setMMTitle("");
        }
        walletLqtPlanAddUI.D = false;
    }
}
