package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.BaseBoxDialogView f136844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f136845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f136846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f136847g;

    public b(com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView, boolean z17, float f17, float f18, float f19) {
        this.f136844d = baseBoxDialogView;
        this.f136845e = z17;
        this.f136846f = f17;
        this.f136847g = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = com.tencent.mm.plugin.finder.webview.BaseBoxDialogView.f136783x0;
        com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView = this.f136844d;
        android.view.View view = baseBoxDialogView.f136791m;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(floatValue);
        android.widget.LinearLayout linearLayout = baseBoxDialogView.f136794p;
        if (linearLayout != null) {
            linearLayout.setTranslationY(floatValue - 0);
        }
        float f17 = (this.f136845e ? baseBoxDialogView.W : baseBoxDialogView.V).f136823b;
        baseBoxDialogView.getClass();
        float f18 = this.f136846f;
        baseBoxDialogView.setBackgroundTranslationY(0.0f + ((((floatValue - f18) * 1.0f) / (this.f136847g - f18)) * (f17 - 0.0f)));
    }
}
