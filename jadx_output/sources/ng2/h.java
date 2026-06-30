package ng2;

/* loaded from: classes10.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f336967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f336968f;

    public h(ng2.s sVar, float f17, float f18) {
        this.f336966d = sVar;
        this.f336967e = f17;
        this.f336968f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ng2.s sVar = this.f336966d;
        ig2.q qVar = sVar.f336987v;
        if (qVar != null) {
            if (qg2.d.f362793a.i(sVar.d())) {
                qVar.setScaleX(1.0f - (floatValue * (1.0f - this.f336967e)));
            } else {
                qVar.setScaleY(1.0f - (floatValue * (1.0f - this.f336968f)));
            }
            com.tencent.mars.xlog.Log.i(sVar.f318557e, "addTransition maskView scaleX = " + qVar.getScaleX() + " scaleY = " + qVar.getScaleY());
        }
    }
}
