package gl5;

/* loaded from: classes15.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Magnifier f273110a;

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.ValueAnimator f273111b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f273112c;

    /* renamed from: d, reason: collision with root package name */
    public float f273113d;

    /* renamed from: e, reason: collision with root package name */
    public float f273114e;

    /* renamed from: f, reason: collision with root package name */
    public float f273115f;

    /* renamed from: g, reason: collision with root package name */
    public float f273116g;

    /* renamed from: h, reason: collision with root package name */
    public float f273117h;

    /* renamed from: i, reason: collision with root package name */
    public float f273118i;

    public y(android.widget.Magnifier magnifier, gl5.k kVar) {
        this.f273110a = magnifier;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f273111b = ofFloat;
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new gl5.x(this));
    }
}
