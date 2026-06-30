package ok;

/* loaded from: classes10.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.i f345929d;

    public g(ok.i iVar) {
        this.f345929d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("deltaY");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = animation.getAnimatedValue("deltaX");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = animation.getAnimatedValue("scaleX");
        kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue3).floatValue();
        java.lang.Object animatedValue4 = animation.getAnimatedValue("scaleY");
        kotlin.jvm.internal.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        ((java.lang.Float) animatedValue4).floatValue();
        java.lang.Object animatedValue5 = animation.getAnimatedValue("rotation");
        kotlin.jvm.internal.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((java.lang.Float) animatedValue5).floatValue();
        ok.i iVar = this.f345929d;
        float f17 = iVar.f345935g;
        dl.f0 f0Var = iVar.f345931c;
        float f18 = floatValue2 - iVar.f345936h;
        float f19 = floatValue - f17;
        int i17 = (int) floatValue4;
        xk0.f M = f0Var.M(iVar.f345933e);
        if (M != null) {
            M.y(f18, f19, floatValue3, i17);
            f0Var.r();
        }
        iVar.f345935g = floatValue;
        iVar.f345936h = floatValue2;
    }
}
