package ml5;

/* loaded from: classes10.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public float f328439d;

    /* renamed from: e, reason: collision with root package name */
    public float f328440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328441f;

    public p(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout) {
        this.f328441f = cropLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("transX");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("transY");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        this.f328441f.C(this.f328439d - floatValue, this.f328440e - floatValue2, 1);
        this.f328439d = floatValue;
        this.f328440e = floatValue2;
    }
}
