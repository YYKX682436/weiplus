package yd;

/* loaded from: classes7.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f460929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd.e f460930e;

    public c(yd.e eVar) {
        this.f460930e = eVar;
        this.f460929d = eVar.a();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        yd.e eVar = this.f460930e;
        if (floatValue == 1.0f) {
            eVar.f460939a.setVisibility(8);
        } else {
            eVar.f460939a.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * this.f460929d);
            eVar.f460939a.requestLayout();
        }
    }
}
