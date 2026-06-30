package y94;

/* loaded from: classes4.dex */
public final class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f460404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y94.a0 f460405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f460406f;

    public y(float f17, y94.a0 a0Var, float f18) {
        this.f460404d = f17;
        this.f460405e = a0Var;
        this.f460406f = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        if (this.f460406f == 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.widget.TextView G = this.f460405e.G();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (G != null) {
                G.setVisibility(4);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        if (this.f460404d == 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.widget.TextView G = this.f460405e.G();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (G != null) {
                G.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
    }
}
