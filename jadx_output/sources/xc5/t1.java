package xc5;

/* loaded from: classes3.dex */
public final class t1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.x1 f453571d;

    public t1(xc5.x1 x1Var) {
        this.f453571d = x1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        lf3.i iVar = this.f453571d.f453590h;
        if (iVar != null) {
            java.lang.Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((yh5.e) iVar).W6(((java.lang.Float) animatedValue).floatValue());
        }
    }
}
