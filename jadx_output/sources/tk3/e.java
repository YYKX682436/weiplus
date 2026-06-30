package tk3;

/* loaded from: classes8.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f419916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f419917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f419918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f419919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView f419920h;

    public e(int i17, int i18, int i19, int i27, com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView) {
        this.f419916d = i17;
        this.f419917e = i18;
        this.f419918f = i19;
        this.f419919g = i27;
        this.f419920h = multiTaskNewFloatBallView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f419916d;
        int i18 = this.f419918f;
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView.w(this.f419920h, i17 + ((int) (((this.f419917e * 1.0f) - i17) * floatValue)), i18 + ((int) (((this.f419919g * 1.0f) - i18) * floatValue)), false, false, false, 16, null);
    }
}
