package ym5;

/* loaded from: classes3.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f463183d = new android.graphics.Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f463185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f463186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f463187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.b f463188i;

    public a(ym5.b bVar, float f17, float f18, float f19, float f27) {
        this.f463188i = bVar;
        this.f463184e = f17;
        this.f463185f = f18;
        this.f463186g = f19;
        this.f463187h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f463184e;
        float f18 = this.f463186g;
        float f19 = this.f463185f;
        android.graphics.Matrix matrix = this.f463183d;
        ym5.b bVar = this.f463188i;
        if (f17 > 1.0f) {
            float f27 = 1.0f - floatValue;
            if (f19 + f27 != 0.0f) {
                matrix.setScale(((floatValue * f18) / f19) + f27, 1.0f, bVar.f463208i.f213296e.centerX(), bVar.f463208i.f213296e.centerY());
            }
        } else if (this.f463187h > 1.0f) {
            float f28 = 1.0f - floatValue;
            if (f18 + f28 != 0.0f) {
                matrix.setScale(1.0f, ((floatValue * f19) / f18) + f28, bVar.f463208i.f213296e.centerX(), bVar.f463208i.f213296e.centerY());
            }
        }
        matrix.mapRect(bVar.f463208i.f213295d, new android.graphics.RectF(bVar.f463208i.f213296e));
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = bVar.f463207h;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
        bVar.f463208i.invalidate();
    }
}
