package lj2;

/* loaded from: classes10.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f318963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318964e;

    public x(yz5.a aVar, lj2.c0 c0Var) {
        this.f318963d = aVar;
        this.f318964e = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f318963d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f318964e.c().b(8);
    }
}
