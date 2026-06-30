package ok;

/* loaded from: classes10.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f345908d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f345909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ok.c f345910f;

    public a(ok.c cVar) {
        this.f345910f = cVar;
        this.f345908d = new android.graphics.Matrix(cVar.f345913d.h());
        this.f345909e = new android.graphics.Rect(cVar.f345917h);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        float floatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue("scale")).floatValue();
        float floatValue4 = ((java.lang.Float) valueAnimator.getAnimatedValue("background_alpha")).floatValue();
        ok.c cVar = this.f345910f;
        cVar.f345919j.reset();
        android.graphics.Matrix matrix = cVar.f345919j;
        matrix.postTranslate(floatValue2, floatValue);
        android.graphics.Rect rect = this.f345909e;
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        rectF.round(cVar.f345917h);
        matrix.postScale(floatValue3, floatValue3, cVar.f345917h.centerX(), cVar.f345917h.centerY());
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(this.f345908d);
        matrix2.postConcat(matrix);
        dl.t tVar = cVar.f345913d;
        tVar.h().set(matrix2);
        tVar.D.getClass();
        xk0.c.f454927r.setAlpha((int) (((int) floatValue4) * 0.9019608f));
        android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
        matrix.mapRect(rectF2);
        rectF2.round(cVar.f345917h);
        tVar.r();
    }
}
