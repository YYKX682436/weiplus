package ok;

/* loaded from: classes10.dex */
public class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public float f345948d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f345949e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f345950f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final float f345951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ok.p f345952h;

    public n(ok.p pVar, float f17) {
        this.f345952h = pVar;
        this.f345951g = (float) java.lang.Math.pow(pVar.f345956e / f17, 0.25d);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f17;
        float f18;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        int i17 = this.f345950f;
        ok.p pVar = this.f345952h;
        if (i17 < 4 && pVar.f345959h) {
            android.graphics.Matrix mainMatrix = pVar.f345954c.getMainMatrix();
            float f19 = this.f345951g;
            mainMatrix.postScale(f19, f19);
            this.f345950f++;
        }
        android.graphics.RectF curValidImageRect = pVar.f345954c.getCurValidImageRect();
        android.graphics.Rect boardRect = pVar.f345954c.getBoardRect();
        if (pVar.f345960i) {
            float f27 = curValidImageRect.top;
            int i18 = boardRect.top;
            float f28 = f27 > ((float) i18) ? i18 - f27 : 0.0f;
            float f29 = curValidImageRect.right;
            int i19 = boardRect.right;
            float f37 = f29 < ((float) i19) ? i19 - f29 : 0.0f;
            float f38 = curValidImageRect.bottom;
            int i27 = boardRect.bottom;
            if (f38 < i27) {
                f28 = i27 - f38;
            }
            f17 = f28;
            float f39 = curValidImageRect.left;
            int i28 = boardRect.left;
            f18 = f39 > ((float) i28) ? i28 - f39 : f37;
        } else {
            float f47 = pVar.f345957f + (floatValue2 - this.f345949e);
            pVar.f345957f = f47;
            pVar.f345958g += floatValue - this.f345948d;
            f18 = f47 - curValidImageRect.centerX();
            f17 = pVar.f345958g - curValidImageRect.centerY();
        }
        pVar.f345954c.getMainMatrix().postTranslate(f18, f17);
        pVar.f345954c.postInvalidate();
        this.f345948d = floatValue;
        this.f345949e = floatValue2;
    }
}
