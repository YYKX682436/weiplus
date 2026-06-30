package yv1;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f466016d;

    public e0(int i17) {
        this.f466016d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Start CleanCacheFileSystems task");
        yv1.h1.g(1, null, 2, null);
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent = new com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent();
        am.p0 p0Var = beforeAggressiveCleanCacheEvent.f53999g;
        p0Var.f7589a = this.f466016d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "triggering BeforeAggressiveCleanCacheEvent with groupFlags " + p0Var.f7589a);
        beforeAggressiveCleanCacheEvent.e();
    }
}
