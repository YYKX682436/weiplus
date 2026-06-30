package qb0;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361149d;

    public j(qb0.k kVar, int i17) {
        this.f361149d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.PluginPerformance", "onTrimMemory level:%d -> dump memory", java.lang.Integer.valueOf(this.f361149d));
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "[onTrimMemory] %s", com.tencent.mm.plugin.performance.watchdogs.b0.B.g());
    }
}
