package jq4;

/* loaded from: classes3.dex */
public final class r0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f301190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301192f;

    public r0(int i17, android.view.View view, jq4.z0 z0Var) {
        this.f301190d = i17;
        this.f301191e = view;
        this.f301192f = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = this.f301190d;
        if (i17 >= 0 || java.lang.Math.abs(i17) <= android.view.ViewConfiguration.get(this.f301191e.getContext()).getScaledTouchSlop()) {
            return;
        }
        this.f301192f.q();
    }
}
