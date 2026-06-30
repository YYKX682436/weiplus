package ym5;

/* loaded from: classes3.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f463240d = new android.graphics.Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f463241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f463242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f463243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f463244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f463245i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.AnimationLayout f463246m;

    public d(com.tencent.mm.view.AnimationLayout animationLayout, float f17, float f18, float f19, float f27, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f463246m = animationLayout;
        this.f463241e = f17;
        this.f463242f = f18;
        this.f463243g = f19;
        this.f463244h = f27;
        this.f463245i = animatorUpdateListener;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f463241e;
        float f18 = this.f463242f;
        if (f17 > 1.0f || f18 > 1.0f) {
            float f19 = this.f463244h;
            float f27 = this.f463243g;
            android.graphics.Matrix matrix = this.f463240d;
            com.tencent.mm.view.AnimationLayout animationLayout = this.f463246m;
            if (f17 > 1.0f) {
                matrix.setScale(((f27 * floatValue) / f19) + (1.0f - floatValue), 1.0f, animationLayout.f213296e.centerX(), animationLayout.f213296e.centerY());
            } else if (f18 > 1.0f) {
                matrix.setScale(1.0f, ((f19 * floatValue) / f27) + (1.0f - floatValue), animationLayout.f213296e.centerX(), animationLayout.f213296e.centerY());
            }
            matrix.mapRect(animationLayout.f213295d, new android.graphics.RectF(animationLayout.f213296e));
            animationLayout.invalidate();
        }
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f463245i;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
