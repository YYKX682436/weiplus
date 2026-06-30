package uy3;

/* loaded from: classes8.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431932d;

    public d(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView) {
        this.f431932d = baseBoxDialogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f431932d.setBackgroundTranslationY(((java.lang.Float) animatedValue).floatValue());
    }
}
