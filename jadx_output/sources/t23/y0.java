package t23;

/* loaded from: classes10.dex */
public final class y0 {

    /* renamed from: k, reason: collision with root package name */
    public static int f415299k;

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f415300a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f415301b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f415302c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f415303d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f415304e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f415305f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f415306g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f415307h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f415308i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f415309j;

    public y0() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("smartGalleryQueryHandlerThread", 10);
        this.f415300a = handlerThread;
        this.f415302c = null;
        handlerThread.start();
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("galleryAssistHandlerThread", 10);
        this.f415301b = handlerThread2;
        this.f415303d = null;
        handlerThread2.start();
        this.f415304e = null;
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors() / 2;
        if (availableProcessors < 2) {
            availableProcessors = 2;
        } else if (availableProcessors > 4) {
            availableProcessors = 4;
        }
        f415299k = availableProcessors;
        ku5.u0 u0Var = ku5.t0.f312615d;
        int i17 = f415299k;
        this.f415305f = ((ku5.t0) u0Var).o("gly-tp_q", i17, i17, new java.util.concurrent.LinkedBlockingQueue());
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        int i18 = f415299k;
        this.f415306g = ((ku5.t0) u0Var2).o("gly-tp", i18, i18, new java.util.concurrent.LinkedBlockingQueue());
        ku5.u0 u0Var3 = ku5.t0.f312615d;
        int i19 = f415299k / 2;
        this.f415307h = ((ku5.t0) u0Var3).o("gly-tp-p", i19, i19, new java.util.concurrent.LinkedBlockingQueue());
        android.os.HandlerThread handlerThread3 = new android.os.HandlerThread("galleryQuerySubHandlerThread", 10);
        this.f415308i = handlerThread3;
        this.f415309j = null;
        handlerThread3.start();
    }

    public final com.tencent.mm.sdk.platformtools.n3 a() {
        if (this.f415304e == null) {
            this.f415304e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        return this.f415304e;
    }

    public void b(java.lang.Runnable runnable) {
        if (runnable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryHandlerThread", "postToAssistWorker runnable is null");
            return;
        }
        if (this.f415303d == null && this.f415301b != null) {
            this.f415303d = new com.tencent.mm.sdk.platformtools.n3(this.f415301b.getLooper());
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f415303d;
        if (n3Var != null) {
            n3Var.post(runnable);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GalleryHandlerThread", "assistHandler is null.");
        }
    }

    public void c(java.lang.Runnable runnable) {
        if (runnable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryHandlerThread", "postToMainThread, runnable is null");
        } else {
            a().post(runnable);
        }
    }

    public void d(java.lang.Runnable runnable) {
        if (runnable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryHandlerThread", "postToQuerySubWorker runnable is null");
            return;
        }
        if (this.f415309j == null && this.f415308i != null) {
            this.f415309j = new com.tencent.mm.sdk.platformtools.n3(this.f415308i.getLooper());
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f415309j;
        if (n3Var != null) {
            n3Var.post(runnable);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
        }
    }
}
