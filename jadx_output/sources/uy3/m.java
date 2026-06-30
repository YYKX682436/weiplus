package uy3;

/* loaded from: classes8.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f431976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f431977f;

    public m(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, float f17, float f18) {
        this.f431975d = baseBoxDialogView;
        this.f431976e = f17;
        this.f431977f = f18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f431975d.U = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431975d;
        uy3.u uVar = baseBoxDialogView.f158697s;
        if (uVar != null) {
            uVar.f();
        }
        baseBoxDialogView.V = true;
        baseBoxDialogView.U = false;
        android.view.View view = baseBoxDialogView.f158690n;
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
        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView = this.f431975d;
        uy3.u uVar = baseBoxDialogView.f158697s;
        if (uVar != null) {
            uVar.a(baseBoxDialogView.f158705y, this.f431976e, this.f431977f);
        }
    }
}
