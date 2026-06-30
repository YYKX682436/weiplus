package vu1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f440177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440178b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.ImageReader f440179c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f440180d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f440181e;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f440183g;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f440182f = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f440184h = new android.graphics.Paint();

    public b(int i17, int i18) {
        this.f440177a = i17;
        this.f440178b = i18;
    }

    public final void a() {
        android.graphics.Bitmap bitmap;
        synchronized (this.f440182f) {
            android.view.Surface surface = this.f440181e;
            if (surface != null && (bitmap = this.f440183g) != null) {
                try {
                    if (surface.isValid() && this.f440179c != null) {
                        android.graphics.Canvas lockCanvas = surface.lockCanvas(null);
                        kotlin.jvm.internal.o.f(lockCanvas, "lockCanvas(...)");
                        lockCanvas.drawColor(-16777216);
                        lockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f440184h);
                        surface.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastImageReader", "error happened " + e17.fillInStackTrace());
                }
            }
        }
    }
}
