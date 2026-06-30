package di3;

/* loaded from: classes10.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f232691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f232692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f232694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ di3.e0 f232695h;

    public d0(di3.e0 e0Var, long j17, long j18, android.content.Context context, int i17) {
        this.f232695h = e0Var;
        this.f232691d = j17;
        this.f232692e = j18;
        this.f232693f = context;
        this.f232694g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f232691d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Start Open Camera thread[parent:%d this:%d] time:%d", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f232692e));
        synchronized (this.f232695h.f232696a) {
            try {
                this.f232695h.f232698c = wo.i.d(this.f232693f, this.f232694g, android.os.Looper.getMainLooper());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "openCamera failed e:%s", e17.getMessage());
                this.f232695h.f232698c = null;
            }
            di3.e0 e0Var = this.f232695h;
            if (e0Var.f232697b && e0Var.f232698c != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "thread time out now, release camera :%d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f232692e));
                try {
                    wo.d1 d1Var = this.f232695h.f232698c.f447713a;
                    d1Var.g(null);
                    d1Var.l();
                    d1Var.d();
                    this.f232695h.f232698c = null;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "realease Camera failed e:%s", e18.getMessage());
                }
            }
            this.f232695h.f232696a.notify();
        }
    }
}
