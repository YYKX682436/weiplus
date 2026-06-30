package zx5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {
    public j(zx5.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if ("true".equalsIgnoreCase(com.tencent.xweb.b.m().g("dis_refresh_plugin_cmd", "tools"))) {
            by5.c4.f("XWebBroadcastListener", "onPluginCfgUpdated, dis_refresh_plugin_cmd false");
            return;
        }
        synchronized (com.tencent.xweb.c.class) {
            by5.c4.f("CommandCfgPlugin", "resetCommandCfg, module: " + org.xwalk.core.XWalkEnvironment.m(""));
            com.tencent.xweb.c.f220217d = null;
            com.tencent.xweb.c.z();
        }
    }
}
