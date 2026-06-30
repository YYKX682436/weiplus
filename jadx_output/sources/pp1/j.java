package pp1;

/* loaded from: classes14.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f357419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f357421f;

    public j(boolean z17, pp1.z zVar, java.lang.Integer num) {
        this.f357419d = z17;
        this.f357420e = zVar;
        this.f357421f = num;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (this.f357419d) {
            pp1.a0.b(this.f357420e, true, (int) floatValue, null, this.f357421f, false, false, false, 32, null);
        } else {
            pp1.a0.a(this.f357420e, false, (int) floatValue, null, this.f357421f, false, false, false, 32, null);
        }
    }
}
