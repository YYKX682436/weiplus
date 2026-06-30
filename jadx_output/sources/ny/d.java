package ny;

/* loaded from: classes3.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f341371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ny.g f341372e;

    public d(ny.a aVar, android.view.ViewGroup viewGroup, ny.g gVar) {
        this.f341371d = viewGroup;
        this.f341372e = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Animation cancelled");
        ny.g gVar = this.f341372e;
        android.view.ViewGroup viewGroup = this.f341371d;
        viewGroup.post(new ny.b(gVar, viewGroup));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Animation ended");
        ny.g gVar = this.f341372e;
        android.view.ViewGroup viewGroup = this.f341371d;
        viewGroup.post(new ny.c(gVar, viewGroup));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Animation started");
    }
}
