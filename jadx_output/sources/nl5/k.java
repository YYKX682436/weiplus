package nl5;

/* loaded from: classes15.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.l f338315d;

    public k(nl5.l lVar) {
        this.f338315d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        nl5.l lVar = this.f338315d;
        float f17 = lVar.f338320d;
        lVar.f338322f = f17 + ((lVar.f338324h - f17) * animation.getAnimatedFraction());
        float f18 = lVar.f338321e;
        lVar.f338323g = f18 + ((lVar.f338325i - f18) * animation.getAnimatedFraction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            lVar.f338317a.show(lVar.f338322f, lVar.f338323g);
        }
    }
}
