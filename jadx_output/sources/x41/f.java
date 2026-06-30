package x41;

/* loaded from: classes15.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f451774e;

    public f(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView, int i17) {
        this.f451773d = baseDialogView;
        this.f451774e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f451773d.N = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451773d;
        baseDialogView.N = false;
        x41.n nVar = baseDialogView.f72315q;
        if (nVar != null) {
        }
        ((ku5.t0) ku5.t0.f312615d).B(new x41.e(this.f451773d, this.f451774e));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        x41.n nVar = this.f451773d.f72315q;
        if (nVar != null) {
        }
    }
}
