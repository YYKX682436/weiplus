package nl5;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Magnifier f338317a;

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.ValueAnimator f338318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f338319c;

    /* renamed from: d, reason: collision with root package name */
    public float f338320d;

    /* renamed from: e, reason: collision with root package name */
    public float f338321e;

    /* renamed from: f, reason: collision with root package name */
    public float f338322f;

    /* renamed from: g, reason: collision with root package name */
    public float f338323g;

    /* renamed from: h, reason: collision with root package name */
    public float f338324h;

    /* renamed from: i, reason: collision with root package name */
    public float f338325i;

    public l(android.widget.Magnifier mMagnifier) {
        kotlin.jvm.internal.o.g(mMagnifier, "mMagnifier");
        this.f338317a = mMagnifier;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
        this.f338318b = ofFloat;
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new nl5.k(this));
    }

    public final void a(float f17, float f18) {
        boolean z17 = false;
        if (this.f338319c) {
            if (!(f18 == this.f338325i)) {
                z17 = true;
            }
        }
        android.animation.ValueAnimator valueAnimator = this.f338318b;
        if (z17) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
                this.f338320d = this.f338322f;
                this.f338321e = this.f338323g;
            } else {
                this.f338320d = this.f338324h;
                this.f338321e = this.f338325i;
            }
            valueAnimator.start();
        } else if (!valueAnimator.isRunning()) {
            this.f338317a.show(f17, f18);
        }
        this.f338324h = f17;
        this.f338325i = f18;
        this.f338319c = true;
    }
}
