package k84;

/* loaded from: classes3.dex */
public final class u0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f305268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f305269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f305271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f305272h;

    public u0(float f17, float f18, k84.q1 q1Var, float f19, float f27) {
        this.f305268d = f17;
        this.f305269e = f18;
        this.f305270f = q1Var;
        this.f305271g = f19;
        this.f305272h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startBreezeAnim$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        float f18 = this.f305269e;
        float f19 = this.f305268d;
        k84.q1 q1Var = this.f305270f;
        if (floatValue < 0.25f) {
            float f27 = 1;
            float interpolation = f27 - s74.q4.f404513a.f().getInterpolation(floatValue / 0.25f);
            float f28 = f19 + ((f27 - f19) * interpolation);
            float f29 = f18 + (interpolation * (f27 - f18));
            android.view.ViewGroup H = q1Var.H();
            if (H != null) {
                H.setScaleX(f28);
            }
            android.view.ViewGroup H2 = q1Var.H();
            if (H2 != null) {
                H2.setScaleY(f29);
            }
        } else if (floatValue < 0.25f || floatValue >= 0.75f) {
            android.view.ViewGroup H3 = q1Var.H();
            if (H3 != null) {
                H3.setScaleX(1.0f);
            }
            android.view.ViewGroup H4 = q1Var.H();
            if (H4 != null) {
                H4.setScaleY(1.0f);
            }
        } else {
            float interpolation2 = s74.q4.f404513a.f().getInterpolation((floatValue - 0.25f) / 0.75f);
            android.view.ViewGroup H5 = q1Var.H();
            if (H5 != null) {
                H5.setScaleX(f19 + ((1 - f19) * interpolation2));
            }
            android.view.ViewGroup H6 = q1Var.H();
            if (H6 != null) {
                H6.setScaleY(f18 + ((1 - f18) * interpolation2));
            }
        }
        float f37 = this.f305272h;
        float f38 = this.f305271g;
        if (floatValue > 0.125f && floatValue < 0.375f) {
            float interpolation3 = s74.q4.f404513a.f().getInterpolation((floatValue - 0.125f) / 0.25f);
            float f39 = 1;
            float f47 = ((f38 - f39) * interpolation3) + f39;
            float f48 = f39 + ((f37 - f39) * interpolation3);
            android.view.ViewGroup I = q1Var.I();
            if (I != null) {
                I.setScaleX(f47);
            }
            android.view.ViewGroup I2 = q1Var.I();
            if (I2 != null) {
                I2.setScaleY(f48);
            }
        } else if (floatValue < 0.375f || floatValue >= 0.75f) {
            android.view.ViewGroup I3 = q1Var.I();
            if (I3 != null) {
                I3.setScaleX(1.0f);
            }
            android.view.ViewGroup I4 = q1Var.I();
            if (I4 != null) {
                I4.setScaleY(1.0f);
            }
        } else {
            float f49 = 1;
            float interpolation4 = f49 - s74.q4.f404513a.f().getInterpolation((floatValue - 0.375f) / 0.375f);
            float f57 = ((f38 - f49) * interpolation4) + f49;
            float f58 = f49 + ((f37 - f49) * interpolation4);
            android.view.ViewGroup I5 = q1Var.I();
            if (I5 != null) {
                I5.setScaleX(f57);
            }
            android.view.ViewGroup I6 = q1Var.I();
            if (I6 != null) {
                I6.setScaleY(f58);
            }
        }
        q1Var.j();
        android.view.ViewGroup I7 = q1Var.I();
        if (I7 != null) {
            I7.getScaleX();
        }
        android.view.ViewGroup I8 = q1Var.I();
        if (I8 != null) {
            I8.getScaleY();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startBreezeAnim$1");
    }
}
