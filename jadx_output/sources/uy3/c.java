package uy3;

/* loaded from: classes8.dex */
public final class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f431930e;

    public c(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, boolean z17) {
        this.f431929d = baseBoxDialogView;
        this.f431930e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431929d;
        boolean z17 = this.f431930e;
        baseBoxDialogView.T = z17;
        android.view.View view = baseBoxDialogView.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        baseBoxDialogView.f158708z = view.getTranslationY();
        uy3.s sVar = baseBoxDialogView.f158699u;
        baseBoxDialogView.f158701w = sVar != null ? sVar.getBackgroundTransY() : 0.0f;
        baseBoxDialogView.D1 = z17 ? 2 : 1;
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
