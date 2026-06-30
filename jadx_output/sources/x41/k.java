package x41;

/* loaded from: classes15.dex */
public final class k implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451779d;

    public k(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView, float f17, float f18) {
        this.f451779d = baseDialogView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f451779d.N = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        ah5.a aVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451779d;
        x41.n nVar = baseDialogView.f72315q;
        if (nVar != null && (aVar = ((w41.h) nVar).f442858a.f442861g) != null) {
            aVar.a();
        }
        baseDialogView.P = true;
        baseDialogView.N = false;
        android.view.View view = baseDialogView.f72311n;
        if (view != null) {
            view.getTranslationY();
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
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451779d;
        x41.n nVar = baseDialogView.f72315q;
        if (nVar != null) {
            int i17 = baseDialogView.f72317s;
            int i18 = baseDialogView.I;
            w41.j jVar = ((w41.h) nVar).f442858a;
            jVar.getClass();
            jVar.f442866o = i18;
            ah5.a aVar = jVar.f442861g;
            if (aVar != null) {
                aVar.e();
            }
        }
    }
}
