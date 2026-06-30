package rp1;

/* loaded from: classes13.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f398543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398547h;

    public w(int i17, int i18, int i19, int i27, com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398543d = i17;
        this.f398544e = i18;
        this.f398545f = i19;
        this.f398546g = i27;
        this.f398547h = contentFloatBallView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f398543d;
        int i18 = this.f398545f;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView.P(this.f398547h, i17 + ((int) (((this.f398544e * 1.0f) - i17) * floatValue)), java.lang.Integer.valueOf(i18 + ((int) (((this.f398546g * 1.0f) - i18) * floatValue))), false, false, true, false, 32, null);
    }
}
