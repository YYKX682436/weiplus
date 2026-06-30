package rc5;

/* loaded from: classes5.dex */
public final class j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394165d;

    public j(rc5.m mVar) {
        this.f394165d = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f394165d.f394183v = true;
    }
}
