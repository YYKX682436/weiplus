package ml5;

/* loaded from: classes10.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public int f328458d;

    /* renamed from: e, reason: collision with root package name */
    public int f328459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328460f;

    public y(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout) {
        this.f328460f = cropLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("transX");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transY");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((java.lang.Integer) animatedValue2).intValue();
        this.f328460f.M(intValue - this.f328458d, intValue2 - this.f328459e);
        this.f328458d = intValue;
        this.f328459e = intValue2;
    }
}
