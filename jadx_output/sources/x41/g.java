package x41;

/* loaded from: classes15.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451775d;

    public g(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView) {
        this.f451775d = baseDialogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451775d;
        android.view.View view = baseDialogView.f72311n;
        if (view != null) {
            baseDialogView.g(view.getTranslationY());
        } else {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
    }
}
