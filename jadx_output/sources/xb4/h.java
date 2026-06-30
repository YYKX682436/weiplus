package xb4;

/* loaded from: classes4.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.l f452939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.x f452940e;

    public h(xb4.l lVar, w64.x xVar) {
        this.f452939d = lVar;
        this.f452940e = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        xb4.l lVar = this.f452939d;
        lVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        boolean z17 = lVar.f452959d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
            return;
        }
        w64.x xVar = this.f452940e;
        if (!vb4.a.a(xVar.b())) {
            vb4.a.b(xVar.b(), true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdCommonClickAnimation", "holder is busy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        android.animation.AnimatorSet animatorSet = lVar.f452958c;
        if (animatorSet != null) {
            animatorSet.end();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$2");
    }
}
