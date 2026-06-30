package uy3;

/* loaded from: classes8.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f431942e;

    public h(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, int i17) {
        this.f431941d = baseBoxDialogView;
        this.f431942e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f431941d.U = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431941d;
        baseBoxDialogView.U = false;
        baseBoxDialogView.D1 = 0;
        uy3.u uVar = baseBoxDialogView.f158697s;
        if (uVar != null) {
            uVar.e();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new uy3.g(baseBoxDialogView, this.f431942e));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        uy3.u uVar = this.f431941d.f158697s;
        if (uVar != null) {
            uVar.c();
        }
    }
}
