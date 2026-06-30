package va5;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f434450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f434451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f434452f;

    public t(android.widget.ImageView imageView, long j17, android.graphics.drawable.Drawable drawable) {
        this.f434450d = imageView;
        this.f434451e = j17;
        this.f434452f = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f434450d;
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        imageView.setPivotX(imageView.getWidth() / 2.0f);
        imageView.setPivotY(imageView.getHeight() / 2.0f);
        oa5.b.b(imageView).e(0.1f).f(0.1f).g(this.f434451e / 2).o(new va5.s(this.f434450d, this.f434452f, this.f434451e, pivotX, pivotY)).l();
    }
}
