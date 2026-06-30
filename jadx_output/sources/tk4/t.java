package tk4;

/* loaded from: classes2.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420011e;

    public t(int i17, android.view.View view) {
        this.f420010d = i17;
        this.f420011e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = this.f420010d;
        if (i17 < 0) {
            java.lang.Math.abs(i17);
            android.view.ViewConfiguration.get(this.f420011e.getContext()).getScaledTouchSlop();
        }
    }
}
