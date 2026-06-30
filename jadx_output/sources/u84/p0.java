package u84;

/* loaded from: classes4.dex */
public final class p0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425651d;

    public p0(u84.m1 m1Var) {
        this.f425651d = m1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup A = u84.m1.A(this.f425651d);
        if (A != null) {
            A.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        kotlin.jvm.internal.o.g(animation, "animation");
        u84.m1 m1Var = this.f425651d;
        android.view.ViewGroup A = u84.m1.A(m1Var);
        if (A != null) {
            A.setAlpha(0.0f);
        }
        android.view.ViewGroup A2 = u84.m1.A(m1Var);
        if (A2 != null) {
            A2.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }
}
