package mi1;

/* loaded from: classes7.dex */
public final class e0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar f326541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.i0 f326542e;

    public e0(com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar, mi1.i0 i0Var) {
        this.f326541d = baseAppBrandSingleCloseCapsuleBar;
        this.f326542e = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue() / 255;
        this.f326541d.e(intValue);
        mi1.i0 i0Var = this.f326542e;
        if (i0Var != null) {
            i0Var.a(intValue);
        }
    }
}
