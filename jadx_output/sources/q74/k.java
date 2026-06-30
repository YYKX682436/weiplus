package q74;

/* loaded from: classes4.dex */
public final class k implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f360470d;

    public k(q74.t tVar) {
        this.f360470d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimSecond cancel, mIndex is ");
        q74.t tVar = this.f360470d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.tencent.mars.xlog.Log.w("AdSlideProductItemViewLogic", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimSecond onAnimationEnd, mIndex is ");
        q74.t tVar = this.f360470d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.tencent.mars.xlog.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimSecond onAnimationStart, mIndex is ");
        q74.t tVar = this.f360470d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.tencent.mars.xlog.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        s34.o1 i17 = q74.t.i(tVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.s(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$drawUI", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$2");
    }
}
