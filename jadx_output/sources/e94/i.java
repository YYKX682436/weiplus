package e94;

/* loaded from: classes4.dex */
public class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f250379d;

    public i(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f250379d = gLTwistRoateCardsView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$2");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.f163901J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = this.f250379d;
        int i18 = gLTwistRoateCardsView.f163906u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.f163905t = (int) (i18 * floatValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$2");
    }
}
