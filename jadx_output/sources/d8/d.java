package d8;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f226893d;

    /* renamed from: e, reason: collision with root package name */
    public final com.github.henryye.nativeiv.ImageDecodeConfig f226894e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f226895f;

    /* renamed from: g, reason: collision with root package name */
    public final d8.c f226896g = new d8.c();

    public d(com.github.henryye.nativeiv.BaseImageDecodeService baseImageDecodeService, java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        this.f226893d = obj;
        this.f226894e = imageDecodeConfig;
        this.f226895f = new java.lang.ref.WeakReference(baseImageDecodeService);
    }

    @Override // java.lang.Runnable
    public void run() {
        e8.d dVar;
        java.lang.ref.WeakReference weakReference = this.f226895f;
        if (weakReference.get() == null) {
            return;
        }
        com.github.henryye.nativeiv.BaseImageDecodeService baseImageDecodeService = (com.github.henryye.nativeiv.BaseImageDecodeService) weakReference.get();
        java.lang.Object obj = this.f226893d;
        com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig = this.f226894e;
        com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync = baseImageDecodeService.loadBitmapSync(obj, imageDecodeConfig);
        dVar = ((com.github.henryye.nativeiv.BaseImageDecodeService) weakReference.get()).mCompactDecodeEventListener;
        dVar.b(obj.toString(), loadBitmapSync, this.f226896g, imageDecodeConfig);
    }
}
