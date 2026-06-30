package s74;

/* loaded from: classes3.dex */
public final class k4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f404397d;

    public k4(android.animation.AnimatorSet animatorSet) {
        this.f404397d = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$2$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f404397d.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$2$1");
    }
}
