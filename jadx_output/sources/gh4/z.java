package gh4;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f271969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f271971f;

    public z(android.graphics.Bitmap bitmap, java.lang.String str, yz5.a aVar) {
        this.f271969d = bitmap;
        this.f271970e = str;
        this.f271971f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f271969d;
        yz5.a aVar = this.f271971f;
        java.lang.String str = this.f271970e;
        try {
            if (!gh4.l0.f271938a.a(bitmap, "", str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", "saveBitmapToImageProtected convertBmp2Wxam fail, saveBitmapToImage ret:%b", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, false)));
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
