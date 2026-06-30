package gl5;

/* loaded from: classes5.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f273043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273044e;

    public m0(android.view.ViewPropertyAnimator viewPropertyAnimator, gl5.d1 d1Var) {
        this.f273043d = viewPropertyAnimator;
        this.f273044e = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f273043d;
        viewPropertyAnimator.setListener(null);
        viewPropertyAnimator.setUpdateListener(null);
        gl5.d1 d1Var = this.f273044e;
        android.view.View d17 = d1Var.d();
        d17.setOutlineProvider(new zl5.a(true, false, 0.0f));
        d17.setClipToOutline(true);
        gl5.d1.a(d1Var);
        java.lang.Object value = ((jz5.n) d1Var.f272939p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageButton) value).setVisibility(0);
    }
}
