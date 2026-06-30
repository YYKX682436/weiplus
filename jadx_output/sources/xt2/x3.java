package xt2;

/* loaded from: classes3.dex */
public final class x3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f457098d;

    public x3(xt2.z3 z3Var) {
        this.f457098d = z3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f457098d.f457140d.setTranslationY(0.0f);
    }
}
