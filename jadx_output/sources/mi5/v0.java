package mi5;

/* loaded from: classes3.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f326929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f326930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi5.y0 f326931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326932g;

    public v0(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, mi5.y0 y0Var, java.lang.String str) {
        this.f326929d = bitmap;
        this.f326930e = weImageView;
        this.f326931f = y0Var;
        this.f326932g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f326932g;
        mi5.y0 y0Var = this.f326931f;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f326930e;
        android.graphics.Bitmap bitmap = this.f326929d;
        if (bitmap == null || bitmap.isRecycled()) {
            weImageView.setImageBitmap(null);
            y0Var.getClass();
            com.tencent.mars.xlog.Log.w("ForwardPocketMoneyView", "[loadImage] bitmap is null or recycled: " + str);
            return;
        }
        weImageView.setImageBitmap(bitmap);
        y0Var.getClass();
        com.tencent.mars.xlog.Log.i("ForwardPocketMoneyView", "[loadImage] image loaded successfully: " + str);
    }
}
