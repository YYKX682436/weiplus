package e94;

/* loaded from: classes4.dex */
public class j extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f250380e;

    public j(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f250380e = gLTwistRoateCardsView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$3");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.f163901J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = this.f250380e;
        gLTwistRoateCardsView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRoateEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.sdk.platformtools.u3.h(new e94.l(gLTwistRoateCardsView));
        gLTwistRoateCardsView.postDelayed(new e94.n(gLTwistRoateCardsView), 20L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRoateEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$3");
    }
}
