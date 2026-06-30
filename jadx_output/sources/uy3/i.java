package uy3;

/* loaded from: classes8.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f431945e;

    public i(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, float f17, float f18) {
        this.f431944d = baseBoxDialogView;
        this.f431945e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431944d;
        android.view.View view = baseBoxDialogView.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        baseBoxDialogView.i(view.getTranslationY());
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f431945e;
        baseBoxDialogView.setBackgroundTranslationY(f17 + ((0.0f - f17) * floatValue));
    }
}
