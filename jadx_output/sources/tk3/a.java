package tk3;

/* loaded from: classes8.dex */
public final class a extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.d f419909d;

    public a(tk3.d dVar) {
        this.f419909d = dVar;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f419909d.a();
    }
}
