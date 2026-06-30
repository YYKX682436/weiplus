package ym5;

/* loaded from: classes3.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f463255d = new android.graphics.Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f463257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f463258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f463259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.f f463260i;

    public e(ym5.f fVar, float f17, float f18, float f19, float f27) {
        this.f463260i = fVar;
        this.f463256e = f17;
        this.f463257f = f18;
        this.f463258g = f19;
        this.f463259h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f463256e;
        float f18 = this.f463258g;
        float f19 = this.f463257f;
        android.graphics.Matrix matrix = this.f463255d;
        ym5.f fVar = this.f463260i;
        if (f17 > 1.0f) {
            matrix.setScale(floatValue + ((f19 / f18) * (1.0f - floatValue)), 1.0f, fVar.f463274i.f213296e.centerX(), fVar.f463274i.f213296e.centerY());
        } else if (this.f463259h > 1.0f) {
            matrix.setScale(1.0f, floatValue + ((f18 / f19) * (1.0f - floatValue)), fVar.f463274i.f213296e.centerX(), fVar.f463274i.f213296e.centerY());
        }
        matrix.mapRect(fVar.f463274i.f213295d, new android.graphics.RectF(fVar.f463274i.f213296e));
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = fVar.f463273h;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
        fVar.f463274i.invalidate();
    }
}
