package e94;

/* loaded from: classes4.dex */
public class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView f250390d;

    public u(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView) {
        this.f250390d = twistCoverView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.os.Handler handler = this.f250390d.f163934y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        handler.sendEmptyMessageDelayed(4, 500L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$4");
    }
}
