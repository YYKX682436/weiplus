package u84;

/* loaded from: classes4.dex */
public final class q0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425656d;

    public q0(u84.m1 m1Var) {
        this.f425656d = m1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        u84.m1 m1Var = this.f425656d;
        android.view.ViewGroup B = u84.m1.B(m1Var);
        if (B != null) {
            B.setAlpha(0.0f);
        }
        android.view.ViewGroup B2 = u84.m1.B(m1Var);
        if (B2 != null) {
            B2.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAlphaInObjectAnimator$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.animation.ObjectAnimator objectAnimator = m1Var.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAlphaInObjectAnimator$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        u84.m1 m1Var = this.f425656d;
        android.view.ViewGroup B = u84.m1.B(m1Var);
        if (B != null) {
            B.setVisibility(0);
        }
        android.view.ViewGroup B2 = u84.m1.B(m1Var);
        if (B2 != null) {
            B2.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }
}
