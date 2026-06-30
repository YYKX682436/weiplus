package e94;

/* loaded from: classes4.dex */
public class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f250386d;

    public p(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f250386d = gLTwistRoateCardsView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7");
        if (com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.h(this.f250386d) != null) {
            com.tencent.mm.sdk.platformtools.u3.i(new e94.o(this), 800L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7");
    }
}
