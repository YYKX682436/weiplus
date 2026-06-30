package yt3;

/* loaded from: classes3.dex */
public final class r0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.t0 f465618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f465619b;

    public r0(yt3.t0 t0Var, int i17) {
        this.f465618a = t0Var;
        this.f465619b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f465618a.f465671d.setVisibility(this.f465619b);
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
