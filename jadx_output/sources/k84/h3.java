package k84;

/* loaded from: classes3.dex */
public final class h3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305054d;

    public h3(k84.d4 d4Var) {
        this.f305054d = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$3");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        k84.d4 d4Var = this.f305054d;
        android.widget.FrameLayout D = d4Var.D();
        if (D != null) {
            D.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdAlbumCommentListBottomBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = d4Var.f304999p;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f482622cm5) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdAlbumCommentListBottomBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (frameLayout != null) {
            frameLayout.setTranslationY((-a84.d0.a(61)) * (1 - floatValue));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$3");
    }
}
