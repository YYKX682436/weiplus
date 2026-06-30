package x41;

/* loaded from: classes15.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f451770e;

    public d(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView, boolean z17) {
        this.f451769d = baseDialogView;
        this.f451770e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f451770e;
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451769d;
        baseDialogView.M = z17;
        android.view.View view = baseDialogView.f72311n;
        if (view != null) {
            baseDialogView.f72318t = view.getTranslationY();
        } else {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
