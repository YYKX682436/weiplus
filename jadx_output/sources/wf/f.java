package wf;

/* loaded from: classes7.dex */
public class f implements com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445466a;

    public f(wf.b bVar) {
        this.f445466a = bVar;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
    public void onSnapshot(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i(this.f445466a.w(), "getSnapshotAsync, onSnapshot");
        tf.m mVar = this.f445466a.Y;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w(this.f445466a.w(), "getSnapshotAsync, getSnapshotCallback is null");
            return;
        }
        synchronized (this.f445466a) {
            if (this.f445466a.Z != null && !this.f445466a.Z.isRecycled()) {
                this.f445466a.Z.recycle();
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setScale(0.5f, 0.5f);
                wf.b bVar = this.f445466a;
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Boolean.FALSE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(bitmap);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/luggage/xweb_ext/extendplugin/component/live/liveplayer/LivePlayerPluginHandler$13", "onSnapshot", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/luggage/xweb_ext/extendplugin/component/live/liveplayer/LivePlayerPluginHandler$13", "onSnapshot", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                bVar.Z = createBitmap;
            }
        }
        mVar.a(bitmap);
        this.f445466a.Y = null;
    }
}
