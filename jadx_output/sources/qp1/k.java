package qp1;

/* loaded from: classes14.dex */
public final class k implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp1.l f365732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365733e;

    public k(qp1.l lVar, java.lang.String str) {
        this.f365732d = lVar;
        this.f365733e = str;
    }

    @Override // l01.u
    public void b() {
        int o17;
        qp1.l lVar = this.f365732d;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = lVar.f365735e;
        if (ballInfo == null || (o17 = qp1.w.o(ballInfo)) == -1) {
            return;
        }
        android.widget.ImageView imageView = lVar.f365734d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = lVar.f365734d;
        if (imageView2 != null) {
            imageView2.setImageResource(o17);
        }
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f365733e;
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            b();
            return;
        }
        qp1.l lVar = this.f365732d;
        android.widget.ImageView imageView = lVar.f365734d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = lVar.f365734d;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
    }
}
