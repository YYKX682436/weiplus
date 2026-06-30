package qt2;

/* loaded from: classes2.dex */
public final class h extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.j f366583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f366584e;

    public h(qt2.j jVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f366583d = jVar;
        this.f366584e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f366583d.getClass();
        androidx.recyclerview.widget.k3 k3Var = this.f366584e;
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        if (s0Var != null) {
            sc2.m3.A.d(s0Var, "pullDownOtherViews");
        }
    }
}
