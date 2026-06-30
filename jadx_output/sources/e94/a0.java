package e94;

/* loaded from: classes4.dex */
public class a0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView f250368d;

    public a0(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView) {
        this.f250368d = twistRoateCardsView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$3");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView.f163951y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView = this.f250368d;
        twistRoateCardsView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRoateEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        e94.f0 f0Var = twistRoateCardsView.f163969x;
        if (f0Var != null) {
            f0Var.b();
        }
        twistRoateCardsView.postDelayed(new e94.c0(twistRoateCardsView), 20L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRoateEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$3");
    }
}
