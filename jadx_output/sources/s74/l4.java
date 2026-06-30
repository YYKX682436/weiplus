package s74;

/* loaded from: classes4.dex */
public final class l4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f404411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.a1 f404412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f404413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f404414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f404415h;

    public l4(kotlin.jvm.internal.f0 f0Var, s74.a1 a1Var, kotlin.jvm.internal.c0 c0Var, android.animation.AnimatorSet animatorSet, android.animation.Animator animator) {
        this.f404411d = f0Var;
        this.f404412e = a1Var;
        this.f404413f = c0Var;
        this.f404414g = animatorSet;
        this.f404415h = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f404413f.f310112d = true;
        com.tencent.mars.xlog.Log.i("DynamicView.Utils", "onAnimationCancel, anim: " + this.f404415h + ", animId:" + this.f404412e.a().optString("animationId"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.f0 f0Var = this.f404411d;
        f0Var.f310116d++;
        int optInt = this.f404412e.a().optInt("repeat-count");
        if (optInt == 0) {
            optInt = Integer.MAX_VALUE;
        }
        if (f0Var.f310116d < optInt && !this.f404413f.f310112d) {
            this.f404414g.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("DynamicView.Utils", "onAnimationStart, anim: " + this.f404415h + ", animId:" + this.f404412e.a().optString("animationId"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processCustomRepeatAnimation$animatorSet$1$1");
    }
}
