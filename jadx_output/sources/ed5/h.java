package ed5;

/* loaded from: classes5.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed5.c f251361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewOverlay f251362e;

    public h(ed5.c cVar, android.view.ViewOverlay viewOverlay) {
        this.f251361d = cVar;
        this.f251362e = viewOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ed5.c cVar = this.f251361d;
        if (cVar.f251350c) {
            this.f251362e.remove(cVar);
            cVar.f251350c = false;
        }
    }
}
