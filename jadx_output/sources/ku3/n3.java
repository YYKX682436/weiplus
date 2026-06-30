package ku3;

/* loaded from: classes3.dex */
public final class n3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f312343d;

    public n3(ku3.y3 y3Var) {
        this.f312343d = y3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        ku3.y3 y3Var = this.f312343d;
        zt3.a.U6(y3Var.f312469d, 15, 4, null, 4, null);
        zt3.a.U6(y3Var.f312469d, 16, 0, null, 4, null);
    }
}
