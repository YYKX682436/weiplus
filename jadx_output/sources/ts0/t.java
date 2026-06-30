package ts0;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.u f421565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f421566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f421567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f421568g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f421569h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.Looper f421570i;

    public t(ts0.u uVar, long j17, long j18, android.content.Context context, int i17, android.os.Looper looper) {
        this.f421565d = uVar;
        this.f421566e = j17;
        this.f421567f = j18;
        this.f421568g = context;
        this.f421569h = i17;
        this.f421570i = looper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f421565d.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f421566e);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Start Open Camera thread[parent:%d this:%d] time:%d", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f421567f));
        ts0.u uVar = this.f421565d;
        java.lang.Object obj = uVar.f421571a;
        android.content.Context context = this.f421568g;
        int i17 = this.f421569h;
        android.os.Looper looper = this.f421570i;
        long j17 = this.f421567f;
        synchronized (obj) {
            try {
                uVar.f421573c = wo.i.d(context, i17, looper);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "openCamera failed e:%s", e17.getMessage());
                uVar.f421573c = null;
            }
            if (uVar.f421572b && uVar.f421573c != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "thread time out now, release camera :%d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                try {
                    wo.h hVar = uVar.f421573c;
                    kotlin.jvm.internal.o.d(hVar);
                    wo.d1 d1Var = hVar.f447713a;
                    d1Var.g(null);
                    d1Var.l();
                    d1Var.d();
                    uVar.f421573c = null;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "realease Camera failed e:%s", e18.getMessage());
                }
            }
            uVar.f421571a.notify();
        }
    }
}
