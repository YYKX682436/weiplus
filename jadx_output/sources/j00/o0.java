package j00;

/* loaded from: classes.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f296846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f296848f;

    public o0(android.graphics.Bitmap bitmap, java.lang.String str, android.widget.ImageView imageView) {
        this.f296846d = bitmap;
        this.f296847e = str;
        this.f296848f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f296847e;
        android.graphics.Bitmap bitmap = this.f296846d;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, final bitmap is null, url:" + str);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, set bitmap, url:" + str);
        this.f296848f.setImageBitmap(bitmap);
    }
}
