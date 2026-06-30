package uy3;

/* loaded from: classes8.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431934d;

    public e(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView) {
        this.f431934d = baseBoxDialogView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431934d;
        baseBoxDialogView.D1 = 1;
        uy3.s sVar = baseBoxDialogView.f158699u;
        baseBoxDialogView.f158701w = sVar != null ? sVar.getBackgroundTransY() : 0.0f;
        uy3.s sVar2 = baseBoxDialogView.f158699u;
        if (sVar2 != null) {
            sVar2.getBackgroundTransY();
        }
        uy3.s sVar3 = baseBoxDialogView.f158699u;
        if (sVar3 != null) {
            sVar3.getMarkViewTransY();
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
