package sj0;

/* loaded from: classes13.dex */
public class c implements sj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f408339a;

    /* renamed from: d, reason: collision with root package name */
    public double f408342d;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f408340b = new java.util.ArrayList(100);

    /* renamed from: c, reason: collision with root package name */
    public int f408341c = 0;

    /* renamed from: e, reason: collision with root package name */
    public double f408343e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f408344f = 2.147483647E9d;

    /* renamed from: g, reason: collision with root package name */
    public double f408345g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public double f408346h = 0.0d;

    public c(android.content.Context context) {
        this.f408342d = 0.0d;
        this.f408339a = context;
        ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        this.f408342d = ((r0.totalMem - r0.availMem) / 1024.0d) / 1024.0d;
    }

    public void a() {
        java.util.List list = this.f408340b;
        int size = ((java.util.ArrayList) list).size();
        this.f408341c = size;
        if (size == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MemoryRecord", "hy: check frames 0!");
            return;
        }
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.Double d17 = (java.lang.Double) it.next();
            valueOf = java.lang.Double.valueOf(valueOf.doubleValue() + d17.doubleValue());
            this.f408343e = java.lang.Math.max(this.f408343e, d17.doubleValue());
            this.f408344f = java.lang.Math.min(this.f408344f, d17.doubleValue());
        }
        java.lang.Double valueOf2 = java.lang.Double.valueOf(valueOf.doubleValue() / this.f408341c);
        double doubleValue = valueOf2.doubleValue();
        double d18 = this.f408342d;
        this.f408346h = doubleValue - d18;
        this.f408343e -= d18;
        this.f408344f -= d18;
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            j17 = (long) (j17 + java.lang.Math.pow(((java.lang.Double) it6.next()).doubleValue() - valueOf2.doubleValue(), 2.0d));
        }
        this.f408345g = java.lang.Math.sqrt(j17 / this.f408341c);
    }
}
