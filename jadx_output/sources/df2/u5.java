package df2;

/* loaded from: classes.dex */
public final class u5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f231501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f231502e;

    public u5(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f231501d = c0Var;
        this.f231502e = qVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.c0 c0Var = this.f231501d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f231502e.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
