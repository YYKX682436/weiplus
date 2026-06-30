package el2;

/* loaded from: classes3.dex */
public final class g1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253800d;

    public g1(el2.i1 i1Var) {
        this.f253800d = i1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        el2.i1 i1Var = this.f253800d;
        i1Var.n().setAlpha(0.0f);
        i1Var.n().setVisibility(0);
        kotlinx.coroutines.r2 r2Var = i1Var.f253827v;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (i1Var.n().f()) {
            return;
        }
        i1Var.f253827v = com.tencent.mm.plugin.finder.live.util.y.m(i1Var.f253814f, null, null, new el2.f1(i1Var.n(), null), 3, null);
    }
}
