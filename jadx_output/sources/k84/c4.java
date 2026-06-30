package k84;

/* loaded from: classes4.dex */
public final class c4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f304973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f304975f;

    public c4(int i17, int i18, k84.d4 d4Var) {
        this.f304973d = i17;
        this.f304974e = i18;
        this.f304975f = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$triggerCheerContainerAnim$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        int c17 = e3.b.c(this.f304973d, this.f304974e, f17 != null ? f17.floatValue() : 0.0f);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getGlobalGoldColor$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        k84.d4 d4Var = this.f304975f;
        int i17 = d4Var.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getGlobalGoldColor$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.ColorDrawable(e3.b.c(c17, i17, 0.2f)));
        stateListDrawable.addState(new int[0], new android.graphics.drawable.ColorDrawable(c17));
        android.widget.LinearLayout N = d4Var.N();
        if (N != null) {
            N.setBackground(stateListDrawable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$triggerCheerContainerAnim$1");
    }
}
