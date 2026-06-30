package uy3;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f431924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f431925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f431926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f431927h;

    public b(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, boolean z17, float f17, float f18, float f19) {
        this.f431923d = baseBoxDialogView;
        this.f431924e = z17;
        this.f431925f = f17;
        this.f431926g = f18;
        this.f431927h = f19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = com.tencent.mm.plugin.scanner.box.BaseBoxDialogView.F1;
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431923d;
        android.view.View view = baseBoxDialogView.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(floatValue);
        baseBoxDialogView.i(floatValue);
        float f17 = (this.f431924e ? baseBoxDialogView.B1 : baseBoxDialogView.A1).f431921b;
        baseBoxDialogView.getClass();
        float f18 = this.f431925f;
        float f19 = ((floatValue - f18) * 1.0f) / (this.f431926g - f18);
        float f27 = this.f431927h;
        baseBoxDialogView.setBackgroundTranslationY(f27 + (f19 * (f17 - f27)));
    }
}
