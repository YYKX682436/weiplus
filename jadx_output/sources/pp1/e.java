package pp1;

/* loaded from: classes14.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f357402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f357404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f357405g;

    public e(boolean z17, pp1.z zVar, java.lang.Integer num, boolean z18) {
        this.f357402d = z17;
        this.f357403e = zVar;
        this.f357404f = num;
        this.f357405g = z18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (this.f357402d) {
            pp1.a0.b(this.f357403e, true, (int) floatValue, null, this.f357404f, false, this.f357405g, false, 64, null);
        } else {
            pp1.a0.a(this.f357403e, false, (int) floatValue, null, this.f357404f, false, this.f357405g, false, 64, null);
        }
    }
}
