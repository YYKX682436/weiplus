package x41;

/* loaded from: classes15.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451768d;

    public c(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView) {
        this.f451768d = baseDialogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = com.tencent.mm.openim.ui.view.BaseDialogView.f72302l1;
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451768d;
        android.view.View view = baseDialogView.f72311n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(floatValue);
        baseDialogView.g(floatValue);
    }
}
