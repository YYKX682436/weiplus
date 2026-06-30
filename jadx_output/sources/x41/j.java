package x41;

/* loaded from: classes15.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451778d;

    public j(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView) {
        this.f451778d = baseDialogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451778d;
        android.view.View view = baseDialogView.f72311n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        baseDialogView.f72318t = view.getTranslationY();
        android.view.View view2 = baseDialogView.f72311n;
        if (view2 != null) {
            baseDialogView.g(view2.getTranslationY());
        } else {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
    }
}
