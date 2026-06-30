package dl;

/* loaded from: classes10.dex */
public class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: e, reason: collision with root package name */
    public float f235096e;

    /* renamed from: g, reason: collision with root package name */
    public float f235098g;

    /* renamed from: i, reason: collision with root package name */
    public float f235100i;

    /* renamed from: m, reason: collision with root package name */
    public float f235101m;

    /* renamed from: n, reason: collision with root package name */
    public final float f235102n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f235104p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f235105q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ dl.t f235106r;

    /* renamed from: d, reason: collision with root package name */
    public int f235095d = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f235097f = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f235099h = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f235103o = 0;

    public i(dl.t tVar, float f17, float f18, float f19) {
        this.f235106r = tVar;
        this.f235104p = f17;
        this.f235105q = f18;
        this.f235100i = f17;
        this.f235101m = f18;
        this.f235102n = (float) java.lang.Math.pow(f19, 0.0833333358168602d);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i17 = this.f235103o;
        dl.t tVar = this.f235106r;
        if (i17 < 12) {
            android.graphics.Matrix h17 = tVar.h();
            float centerX = tVar.f235130x.centerX() + this.f235097f;
            float centerY = tVar.f235130x.centerY() + this.f235099h;
            float f17 = this.f235102n;
            h17.postScale(f17, f17, centerX, centerY);
            tVar.f235129w.postScale(f17, f17, tVar.f235130x.centerX() + this.f235097f, tVar.f235130x.centerY() + this.f235099h);
            this.f235103o++;
        }
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue("rotation")).intValue();
        int intValue2 = ((java.lang.Integer) valueAnimator.getAnimatedValue("deltaX")).intValue();
        int intValue3 = ((java.lang.Integer) valueAnimator.getAnimatedValue("deltaY")).intValue();
        android.graphics.Matrix h18 = tVar.h();
        float f18 = intValue - this.f235095d;
        float f19 = this.f235097f;
        float f27 = this.f235104p;
        float f28 = this.f235099h;
        float f29 = this.f235105q;
        h18.postRotate(f18, f19 + f27, f28 + f29);
        tVar.f235129w.postRotate(intValue - this.f235095d, f27 + this.f235097f, f29 + this.f235099h);
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.set(tVar.f235130x);
        tVar.f235129w.mapRect(rectF);
        float f37 = intValue2;
        float f38 = this.f235100i + (f37 - this.f235096e);
        this.f235100i = f38;
        float f39 = intValue3;
        this.f235101m += f39 - this.f235098g;
        this.f235097f = f38 - rectF.centerX();
        this.f235099h = this.f235101m - rectF.centerY();
        tVar.h().postTranslate(this.f235097f, this.f235099h);
        tVar.f235129w.postTranslate(this.f235097f, this.f235099h);
        tVar.r();
        this.f235095d = intValue;
        this.f235096e = f37;
        this.f235098g = f39;
    }
}
