package va5;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f434445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f434446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f434447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f434448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f434449h;

    public s(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, long j17, float f17, float f18) {
        this.f434445d = imageView;
        this.f434446e = drawable;
        this.f434447f = j17;
        this.f434448g = f17;
        this.f434449h = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable drawable = this.f434446e;
        android.widget.ImageView imageView = this.f434445d;
        imageView.setImageDrawable(drawable);
        oa5.b.b(imageView).e(1.0f).f(1.0f).g(this.f434447f / 2).o(new va5.r(imageView, this.f434448g, this.f434449h)).l();
    }
}
