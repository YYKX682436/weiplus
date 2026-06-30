package yt3;

/* loaded from: classes3.dex */
public final class e2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.f2 f465419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f465420b;

    public e2(yt3.f2 f2Var, int i17) {
        this.f465419a = f2Var;
        this.f465420b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f465419a.f465441d.setVisibility(this.f465420b);
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
