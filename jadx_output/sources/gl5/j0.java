package gl5;

/* loaded from: classes5.dex */
public final class j0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f273022e;

    public j0(gl5.d1 d1Var, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f273021d = d1Var;
        this.f273022e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        gl5.d1 d1Var = this.f273021d;
        d1Var.f272929f = false;
        android.view.View e17 = d1Var.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(e17, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fl5.i iVar = d1Var.f272925b;
        iVar.getSizeAnimController().a(false);
        d1Var.g(d1Var.f272926c);
        iVar.l().post(new gl5.r0(d1Var));
        this.f273022e.setListener(null);
        d1Var.d().setTranslationY(0.0f);
        d1Var.d().setTranslationX(0.0f);
    }
}
