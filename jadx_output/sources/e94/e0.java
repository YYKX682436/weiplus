package e94;

/* loaded from: classes4.dex */
public class e0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView f250376d;

    public e0(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView) {
        this.f250376d = twistRoateCardsView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6");
        if (com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView.a(this.f250376d) != null) {
            com.tencent.mm.sdk.platformtools.u3.i(new e94.d0(this), 800L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6");
    }
}
