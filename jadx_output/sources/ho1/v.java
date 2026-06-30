package ho1;

/* loaded from: classes15.dex */
public final class v implements com.tencent.wechat.aff.affroam.u0 {

    /* renamed from: c, reason: collision with root package name */
    public ro1.g f282831c;

    /* renamed from: d, reason: collision with root package name */
    public po1.d f282832d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f282833e;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.t0 f282836h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f282837i;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f282829a = "MicroMsg.CustomRoamDiskImpl";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282830b = "Roam-Custom-Pool";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f282834f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f282835g = new java.util.concurrent.ConcurrentHashMap();

    public final boolean a(java.lang.Runnable runnable) {
        try {
            java.util.concurrent.ExecutorService executorService = this.f282833e;
            if (executorService == null) {
                return true;
            }
            executorService.execute(runnable);
            return true;
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f282829a, e17, java.lang.String.valueOf(runnable), new java.lang.Object[0]);
            return false;
        }
    }
}
