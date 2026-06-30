package yt3;

/* loaded from: classes3.dex */
public final class s0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.t0 f465660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f465661b;

    public s0(yt3.t0 t0Var, int i17) {
        this.f465660a = t0Var;
        this.f465661b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f465660a.f465671d.setVisibility(this.f465661b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
