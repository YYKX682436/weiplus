package lt0;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final lt0.a f321162c = new lt0.a();

    /* renamed from: a, reason: collision with root package name */
    public int f321163a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f321164b = "default";

    public a() {
        this.f321163a = 10485760;
        int largeMemoryClass = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CacheInvoke", "BitmapPool %dMB", java.lang.Integer.valueOf(largeMemoryClass));
        if (largeMemoryClass >= 512) {
            this.f321163a = 62914560;
        } else if (largeMemoryClass >= 256) {
            this.f321163a = 31457280;
        } else {
            this.f321163a = 15728640;
        }
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof lt0.a ? this.f321164b.equals(((lt0.a) obj).f321164b) : super.equals(obj);
    }
}
