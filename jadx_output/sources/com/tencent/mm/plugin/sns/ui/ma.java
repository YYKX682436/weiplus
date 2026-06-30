package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class ma implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.la f169902d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.AnimatorSet f169903e;

    public ma(com.tencent.mm.plugin.sns.ui.la laVar, android.animation.AnimatorSet animatorSet) {
        this.f169902d = laVar;
        this.f169903e = animatorSet;
    }

    public abstract void a(com.tencent.mm.plugin.sns.ui.pa paVar, float f17);

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$SellAnimatorUpdateListener");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.la laVar = this.f169902d;
        laVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
        java.lang.ref.WeakReference weakReference = laVar.f169735a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
            obj = null;
        } else {
            obj = weakReference.get();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
        }
        com.tencent.mm.plugin.sns.ui.pa paVar = (com.tencent.mm.plugin.sns.ui.pa) obj;
        if (paVar != null) {
            a(paVar, floatValue);
        } else {
            this.f169903e.cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$SellAnimatorUpdateListener");
    }
}
