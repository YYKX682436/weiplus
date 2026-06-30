package ht2;

/* loaded from: classes.dex */
public final class q0 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f284895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f284896e;

    public q0(android.view.ViewGroup viewGroup, android.widget.LinearLayout linearLayout) {
        this.f284895d = viewGroup;
        this.f284896e = linearLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f284895d.removeView(this.f284896e);
    }
}
