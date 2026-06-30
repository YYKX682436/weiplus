package qx4;

/* loaded from: classes8.dex */
public final class j0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367415e;

    public j0(java.lang.String str, int i17) {
        this.f367414d = str;
        this.f367415e = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "idleWebSearchPreload");
        qx4.z0 z0Var = new qx4.z0(this.f367414d, this.f367415e);
        qx4.l0 l0Var = qx4.l0.f367422a;
        int i17 = z0Var.f367477b;
        if (l0Var.b(i17) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "already exist preload obj");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start to preload obj url:");
        java.lang.String url = z0Var.f367476a;
        sb6.append(url);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", sb6.toString());
        z0Var.f367478c = c01.id.c();
        kotlin.jvm.internal.o.g(url, "url");
        qx4.m0 m0Var = new qx4.m0(url, i17);
        qx4.l0.f367423b.put(java.lang.Integer.valueOf(i17), m0Var);
        new qx4.y0(z0Var, m0Var).invoke();
        return false;
    }
}
