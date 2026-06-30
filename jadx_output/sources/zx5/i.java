package zx5;

/* loaded from: classes13.dex */
public class i implements java.lang.Runnable {
    public i(zx5.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        by5.a4.d();
        if ("true".equalsIgnoreCase(com.tencent.xweb.b.m().g("dis_refresh_main_cmd", "tools"))) {
            by5.c4.f("XWebBroadcastListener", "onMainCfgUpdated, dis_refresh_main_cmd false");
            return;
        }
        synchronized (com.tencent.xweb.b.class) {
            by5.c4.f("CommandCfg", "resetCommandCfg, module: " + org.xwalk.core.XWalkEnvironment.m(""));
            com.tencent.xweb.b.f220209c = null;
            com.tencent.xweb.b.m();
        }
        java.util.List list = com.tencent.xweb.n0.f220344a;
        synchronized (com.tencent.xweb.n0.class) {
            com.tencent.xweb.n0.f220347d = false;
            com.tencent.xweb.n0.f220344a = new java.util.ArrayList();
            com.tencent.xweb.n0.f220345b = new java.util.ArrayList();
            com.tencent.xweb.n0.f220346c = new java.util.ArrayList();
            com.tencent.xweb.n0.b();
        }
        synchronized (zx5.h.class) {
            by5.c4.f("XWebAutoUpdater", "resetAutoCheckUpdatePeriod, sEnableAutoCheckUpdate:" + zx5.h.f477245c + ", sAutoCheckUpdateWorkerStarted:" + zx5.h.f477244b);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = zx5.h.f477245c;
            if ((atomicBoolean != null && atomicBoolean.get()) && zx5.h.f477244b) {
                zx5.h.b();
            }
        }
        tx5.h b17 = tx5.j.b(com.tencent.xweb.WebView.getCurrentModuleWebCoreType());
        if (b17 != null) {
            b17.invokeRuntimeChannel(80036, new java.lang.Object[0]);
        }
    }
}
