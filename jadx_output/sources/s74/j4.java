package s74;

/* loaded from: classes4.dex */
public final class j4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.a1 f404371d;

    public j4(s74.a1 a1Var) {
        this.f404371d = a1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        s74.a1 a1Var = this.f404371d;
        if (a1Var.c().getAlpha() == 1.0f) {
            a1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicViewContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicViewContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
            int optInt = a1Var.d().optInt("click-index");
            s74.f3 f3Var = a1Var.f404200d;
            f3Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f3Var.W = optInt;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$1$1");
    }
}
