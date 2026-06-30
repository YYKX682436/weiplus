package q74;

/* loaded from: classes4.dex */
public final class g0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.s0 f360458d;

    public g0(q74.s0 s0Var) {
        this.f360458d = s0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        q74.s0 s0Var = this.f360458d;
        android.widget.FrameLayout e17 = q74.s0.e(s0Var);
        if (e17 != null) {
            e17.setAlpha(0.0f);
        }
        android.widget.FrameLayout e18 = q74.s0.e(s0Var);
        if (e18 != null) {
            e18.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.w("SlideFullCardBreakFrameUICtrl", "doPAGInterruptAnim onAnimationCancel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        q74.s0 s0Var = this.f360458d;
        android.widget.FrameLayout e17 = q74.s0.e(s0Var);
        if (e17 != null) {
            e17.setAlpha(0.0f);
        }
        android.widget.FrameLayout e18 = q74.s0.e(s0Var);
        if (e18 != null) {
            e18.setVisibility(8);
        }
        q74.t c17 = q74.s0.c(s0Var);
        if (c17 != null) {
            c17.y(1.0f);
        }
        q74.t c18 = q74.s0.c(s0Var);
        if (c18 != null) {
            c18.o(false);
        }
        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "doPAGInterruptAnim onAnimationEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.FrameLayout e17 = q74.s0.e(this.f360458d);
        if (e17 != null) {
            e17.setAlpha(1.0f);
        }
        com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "doPAGInterruptAnim onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }
}
