package yt3;

/* loaded from: classes3.dex */
public final class d2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.f2 f465403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f465404b;

    public d2(yt3.f2 f2Var, int i17) {
        this.f465403a = f2Var;
        this.f465404b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f465403a.f465441d.setVisibility(this.f465404b);
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
