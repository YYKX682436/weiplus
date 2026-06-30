package uw2;

/* loaded from: classes2.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PathMeasure f431649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f431650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.RoundLinearLayout f431651f;

    public d(android.graphics.PathMeasure pathMeasure, float[] fArr, com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout) {
        this.f431649d = pathMeasure;
        this.f431650e = fArr;
        this.f431651f = roundLinearLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.PathMeasure pathMeasure = this.f431649d;
        float[] fArr = this.f431650e;
        pathMeasure.getPosTan(floatValue, fArr, null);
        float length = floatValue / (pathMeasure.getLength() * 0.5f);
        if (length < 0.0f) {
            length = 0.0f;
        }
        if (length > 1.0f) {
            length = 1.0f;
        }
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout = this.f431651f;
        roundLinearLayout.setScaleX(length);
        roundLinearLayout.setScaleY(length);
        roundLinearLayout.setX(fArr[0]);
        roundLinearLayout.setY(fArr[1]);
    }
}
