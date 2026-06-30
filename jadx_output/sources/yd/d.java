package yd;

/* loaded from: classes7.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f460934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd.e f460935e;

    public d(yd.e eVar) {
        this.f460935e = eVar;
        this.f460934d = eVar.a();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        yd.e eVar = this.f460935e;
        eVar.f460939a.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * this.f460934d);
        eVar.f460939a.requestLayout();
    }
}
