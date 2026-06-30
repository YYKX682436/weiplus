package pk3;

/* loaded from: classes8.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f356445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f356446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f356447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView f356448h;

    public f(int i17, int i18, int i19, int i27, com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView) {
        this.f356444d = i17;
        this.f356445e = i18;
        this.f356446f = i19;
        this.f356447g = i27;
        this.f356448h = multiTaskFloatBallView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f356444d;
        int i18 = i17 + ((int) (((this.f356445e * 1.0f) - i17) * floatValue));
        int i19 = this.f356446f;
        int i27 = i19 + ((int) (((this.f356447g * 1.0f) - i19) * floatValue));
        int i28 = com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView.E;
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = this.f356448h;
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i29 = marginLayoutParams.leftMargin;
        int i37 = marginLayoutParams.topMargin;
        if (i29 == i18 && i37 == i27) {
            return;
        }
        marginLayoutParams.leftMargin = i18;
        marginLayoutParams.topMargin = i27;
        try {
            multiTaskFloatBallView.o(i18, i27, false, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallView", th6, "updateBallPosition fail", new java.lang.Object[0]);
        }
    }
}
