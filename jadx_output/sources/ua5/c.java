package ua5;

/* loaded from: classes10.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua5.f f425981d;

    public c(ua5.f fVar) {
        this.f425981d = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.m0.a(this.f425981d.f425989d).remove(animation);
    }
}
