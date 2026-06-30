package qt2;

/* loaded from: classes2.dex */
public final class i extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.j f366585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f366586e;

    public i(qt2.j jVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f366585d = jVar;
        this.f366586e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f366585d.getClass();
        androidx.recyclerview.widget.k3 k3Var = this.f366586e;
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        if (s0Var != null) {
            sc2.m3.A.d(s0Var, "pullUpOtherViews");
        }
    }
}
