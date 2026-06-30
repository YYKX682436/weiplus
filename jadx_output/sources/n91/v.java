package n91;

/* loaded from: classes7.dex */
public final class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.c0 f335898d;

    public v(n91.c0 c0Var) {
        this.f335898d = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onAnimationEnd");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f335898d.f335862f;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(4);
    }
}
