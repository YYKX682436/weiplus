package ku3;

/* loaded from: classes3.dex */
public final class f4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f312232d;

    public f4(ku3.m4 m4Var) {
        this.f312232d = m4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        ku3.m4 m4Var = this.f312232d;
        zt3.a.U6(m4Var.f312318d, 12, 4, null, 4, null);
        zt3.a.U6(m4Var.f312318d, 16, 0, null, 4, null);
    }
}
