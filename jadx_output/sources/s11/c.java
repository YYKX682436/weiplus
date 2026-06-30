package s11;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402121d;

    /* renamed from: e, reason: collision with root package name */
    public final n11.c f402122e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f402123f;

    /* renamed from: g, reason: collision with root package name */
    public final n11.b f402124g;

    public c(java.lang.String str, n11.c cVar, android.graphics.Bitmap bitmap, n11.b bVar, java.lang.String str2) {
        this.f402121d = str;
        this.f402122e = cVar;
        this.f402123f = bitmap;
        this.f402124g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        n11.c cVar;
        android.graphics.Bitmap bitmap;
        n11.b bVar;
        java.lang.ref.WeakReference weakReference;
        android.widget.ImageView imageView;
        java.lang.String str = this.f402121d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (cVar = this.f402122e) == null || (bitmap = this.f402123f) == null || bitmap.isRecycled() || (bVar = this.f402124g) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.ImageShowTask", "[cpan] run something is null.");
            return;
        }
        bVar.getClass();
        if (!str.equals((java.lang.String) bVar.f334054d.get(java.lang.Integer.valueOf(cVar.f334057b)))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.ImageShowTask", "[cpan] url is not equals view url.");
            return;
        }
        cVar.getClass();
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper() && (weakReference = cVar.f334056a) != null && (imageView = (android.widget.ImageView) weakReference.get()) != null) {
            imageView.setImageBitmap(bitmap);
        }
        bVar.b(cVar);
    }
}
