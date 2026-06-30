package pe2;

/* loaded from: classes3.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe2.h f353614d;

    public b(pe2.h hVar) {
        this.f353614d = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        pe2.h hVar = this.f353614d;
        hVar.f353630p.n();
        hVar.f353630p.setVisibility(8);
    }
}
