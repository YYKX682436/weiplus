package iy2;

/* loaded from: classes13.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy2.b f295860d;

    public a(iy2.b bVar) {
        this.f295860d = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((java.lang.Float) animatedValue).floatValue();
        iy2.b bVar = this.f295860d;
        bVar.getClass();
        bVar.invalidateSelf();
    }
}
