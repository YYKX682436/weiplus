package e94;

/* loaded from: classes4.dex */
public class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView f250371d;

    public b0(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView) {
        this.f250371d = twistRoateCardsView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$4");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView.f163951y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView = this.f250371d;
        twistRoateCardsView.f163961p = floatValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        twistRoateCardsView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$4");
    }
}
