package lj2;

/* loaded from: classes10.dex */
public final class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f318954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318955e;

    public v(yz5.a aVar, lj2.c0 c0Var) {
        this.f318954d = aVar;
        this.f318955e = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f318954d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f318955e.b().a(8);
    }
}
