package xb4;

/* loaded from: classes4.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.f f452914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.x f452915e;

    public b(xb4.f fVar, w64.x xVar) {
        this.f452914d = fVar;
        this.f452915e = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        xb4.f fVar = this.f452914d;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        boolean z17 = fVar.f452933c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
            return;
        }
        w64.x xVar = this.f452915e;
        if (!vb4.a.a(xVar.b())) {
            vb4.a.b(xVar.b(), true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdCommonBackAnimation", "holder is busy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAnimatorSet$p", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAnimatorSet$p", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        android.animation.AnimatorSet animatorSet = fVar.f452932b;
        java.util.ArrayList<android.animation.Animator> childAnimations = animatorSet != null ? animatorSet.getChildAnimations() : null;
        if (childAnimations == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
            return;
        }
        java.util.Iterator<android.animation.Animator> it = childAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$2");
    }
}
