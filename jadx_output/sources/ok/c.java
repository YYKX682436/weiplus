package ok;

/* loaded from: classes10.dex */
public class c extends ok.f {

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ValueAnimator f345912c;

    /* renamed from: d, reason: collision with root package name */
    public final dl.t f345913d;

    /* renamed from: e, reason: collision with root package name */
    public float f345914e;

    /* renamed from: f, reason: collision with root package name */
    public float f345915f;

    /* renamed from: g, reason: collision with root package name */
    public float f345916g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f345917h;

    /* renamed from: l, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f345921l;

    /* renamed from: k, reason: collision with root package name */
    public long f345920k = 0;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Matrix f345919j = new android.graphics.Matrix();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f345918i = new android.graphics.RectF();

    public c(dl.t tVar) {
        this.f345913d = tVar;
    }

    public void a() {
        this.f345928b = false;
        this.f345927a = true;
        android.animation.ValueAnimator valueAnimator = this.f345912c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CropActionUpAnim", "[play]");
        if (this.f345927a) {
            this.f345928b = false;
            this.f345927a = false;
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("scale", 1.0f, this.f345914e), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, this.f345915f), android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, this.f345916g), android.animation.PropertyValuesHolder.ofFloat("background_alpha", 0.0f, 255.0f));
            this.f345912c = ofPropertyValuesHolder;
            ofPropertyValuesHolder.addUpdateListener(new ok.a(this));
            this.f345912c.addListener(new ok.b(this));
            this.f345912c.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f345912c.setDuration(200);
            this.f345912c.setStartDelay(this.f345920k);
            this.f345912c.start();
        }
    }
}
