package ym5;

/* loaded from: classes5.dex */
public final class b5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RingProgressView f463223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463224e;

    public b5(com.tencent.mm.view.RingProgressView ringProgressView, int i17) {
        this.f463223d = ringProgressView;
        this.f463224e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.view.RingProgressView ringProgressView = this.f463223d;
        int i17 = this.f463224e;
        ringProgressView.setProgress(i17);
        ringProgressView.f213459o = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
