package kx0;

/* loaded from: classes5.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx0.g f313246d;

    public e(kx0.g gVar) {
        this.f313246d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        kx0.g gVar = this.f313246d;
        kx0.i iVar = gVar.f313254c;
        float f17 = iVar.f313274o;
        float f18 = iVar.f313273n;
        iVar.f313275p = java.lang.Math.max(java.lang.Math.min(((f17 - f18) * iVar.f313276q) + f18 + (iVar.f313277r * floatValue), f17), f18);
        gVar.invalidateSelf();
    }
}
