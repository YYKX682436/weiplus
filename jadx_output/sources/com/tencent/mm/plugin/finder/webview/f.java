package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.BaseBoxDialogView f136865d;

    public f(com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView, float f17, float f18) {
        this.f136865d = baseBoxDialogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView = this.f136865d;
        android.view.View view = baseBoxDialogView.f136791m;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        float translationY = view.getTranslationY();
        android.widget.LinearLayout linearLayout = baseBoxDialogView.f136794p;
        if (linearLayout != null) {
            linearLayout.setTranslationY(translationY - 0);
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        baseBoxDialogView.setBackgroundTranslationY((((java.lang.Float) animatedValue).floatValue() * 0.0f) + 0.0f);
    }
}
