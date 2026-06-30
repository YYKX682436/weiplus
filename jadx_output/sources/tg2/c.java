package tg2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f419159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f419160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f419161f;

    public c(android.widget.ImageView imageView, android.graphics.PointF pointF, yz5.a aVar) {
        this.f419159d = imageView;
        this.f419160e = pointF;
        this.f419161f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.PointF pointF = this.f419160e;
        float f17 = pointF.x;
        android.widget.ImageView imageView = this.f419159d;
        imageView.setX(f17 - (imageView.getWidth() / 2));
        imageView.setY(pointF.y - (imageView.getHeight() / 2));
        imageView.setVisibility(0);
        this.f419161f.invoke();
    }
}
