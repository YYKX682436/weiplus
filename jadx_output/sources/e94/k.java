package e94;

/* loaded from: classes4.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f250381d;

    public k(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f250381d = gLTwistRoateCardsView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$4");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = this.f250381d;
        gLTwistRoateCardsView.invalidate();
        float abs = 180.0f - java.lang.Math.abs(floatValue);
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.f163901J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        int i18 = gLTwistRoateCardsView.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        if (abs - (i18 * 30) >= 0.0f) {
            ca4.z0.I0(new long[]{0, 40});
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$508", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            gLTwistRoateCardsView.H++;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$508", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vabriate, idx=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            int i19 = gLTwistRoateCardsView.H;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            sb6.append(i19);
            com.tencent.mars.xlog.Log.i("GLTwistRoateCardsView", sb6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$4");
    }
}
