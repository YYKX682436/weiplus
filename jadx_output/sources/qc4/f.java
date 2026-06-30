package qc4;

/* loaded from: classes4.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout f361520e;

    public f(int i17, com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout) {
        this.f361519d = i17;
        this.f361520e = snsImproveCoverLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout.f169065o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStage$p", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout = this.f361520e;
        int i18 = this.f361519d;
        snsImproveCoverLayout.f169067e = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStage$p", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        if (i18 == 2) {
            com.tencent.mm.feature.sns.api.ICoverStatusChanged statusChangedCallback = snsImproveCoverLayout.getStatusChangedCallback();
            if (statusChangedCallback != null) {
                statusChangedCallback.onPostOpen();
            }
        } else {
            com.tencent.mm.feature.sns.api.ICoverStatusChanged statusChangedCallback2 = snsImproveCoverLayout.getStatusChangedCallback();
            if (statusChangedCallback2 != null) {
                statusChangedCallback2.onPostClose();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = this.f361519d;
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout = this.f361520e;
        if (i17 == 2) {
            com.tencent.mm.feature.sns.api.ICoverStatusChanged statusChangedCallback = snsImproveCoverLayout.getStatusChangedCallback();
            if (statusChangedCallback != null) {
                statusChangedCallback.onPreOpen();
            }
        } else {
            com.tencent.mm.feature.sns.api.ICoverStatusChanged statusChangedCallback2 = snsImproveCoverLayout.getStatusChangedCallback();
            if (statusChangedCallback2 != null) {
                statusChangedCallback2.onPreClose();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
    }
}
