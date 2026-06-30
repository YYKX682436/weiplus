package vb4;

/* loaded from: classes4.dex */
public class f extends vb4.b {

    /* renamed from: n, reason: collision with root package name */
    public int f434811n;

    /* renamed from: o, reason: collision with root package name */
    public long f434812o;

    /* renamed from: p, reason: collision with root package name */
    public long f434813p;

    public f(android.app.Activity activity, android.view.View view, boolean z17) {
        super(activity, view, z17);
        this.f434811n = 0;
        this.f434812o = 0L;
        this.f434813p = 0L;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f434795b = ofFloat;
        ofFloat.addUpdateListener(new vb4.d(this, z17));
        this.f434795b.addListener(new vb4.e(this, z17));
        this.f434795b.setDuration(400L);
    }
}
