package qc4;

/* loaded from: classes4.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout f361518d;

    public e(com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout) {
        this.f361518d = snsImproveCoverLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout = this.f361518d;
        yz5.l dragCallback = snsImproveCoverLayout.getDragCallback();
        if (dragCallback != null) {
            dragCallback.invoke(java.lang.Float.valueOf(0.0f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStage$p", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        snsImproveCoverLayout.f169067e = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStage$p", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$recoverAfterDrag$1");
    }
}
