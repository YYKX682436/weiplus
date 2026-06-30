package ng2;

/* loaded from: classes10.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336969d;

    public i(ng2.s sVar) {
        this.f336969d = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ng2.s sVar = this.f336969d;
        int width = sVar.q().width() - ((int) ((sVar.q().width() - sVar.s().width()) * floatValue));
        int height = sVar.q().height() - ((int) (floatValue * (sVar.q().height() - sVar.s().height())));
        ig2.q qVar = sVar.f336987v;
        if (qVar != null) {
            qVar.a(width, height);
        }
    }
}
