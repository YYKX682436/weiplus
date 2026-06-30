package sy;

@j95.b
/* loaded from: classes5.dex */
public class b0 extends i95.w implements vg3.g4, com.tencent.mm.app.t2, xg3.h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f413781f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f413782d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f413783e = true;

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String str;
        if (this.f413782d) {
            if (l0Var == null || (str = l0Var.f454410a) == null) {
                com.tencent.mars.xlog.Log.e("PluginMsgReporter", "[onNotifyChange] notifyInfo is null or notifyInfo.talker is null");
                return;
            }
            sy.c0 c0Var = (sy.c0) f413781f.get(str);
            if (c0Var != null && "insert".equals(l0Var.f454411b)) {
                long j17 = c0Var.f413788c;
                int i17 = l0Var.f454413d;
                c0Var.f413788c = j17 + i17;
                com.tencent.mars.xlog.Log.i("PluginMsgReporter", "[onNotifyChange] plugin %s receive msg %d, count:%d", c0Var.f413786a, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c0Var.f413788c));
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        try {
            super.onAccountInitialized(context);
            if (this.f413782d) {
                com.tencent.mars.xlog.Log.i("PluginMsgReporter", "PluginMsgReporter onAccountInitialized");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f413781f;
                concurrentHashMap.forEach(new sy.b0$$d());
                if (this.f413783e) {
                    this.f413783e = false;
                    concurrentHashMap.forEach(new sy.b0$$a());
                }
                com.tencent.mm.app.w.INSTANCE.a(this);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PluginMsgReporter", "[onAccountInitialized] exception: " + e17);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        try {
            super.onAccountReleased(context);
            if (this.f413782d) {
                com.tencent.mars.xlog.Log.i("PluginMsgReporter", "PluginMsgReporter onAccountReleased");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f413781f;
                concurrentHashMap.forEach(new sy.b0$$b(currentTimeMillis));
                concurrentHashMap.forEach(new sy.b0$$d());
                com.tencent.mm.app.w.INSTANCE.p(this);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PluginMsgReporter", "[onAccountReleased] exception: " + e17);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (this.f413782d) {
            try {
                com.tencent.mars.xlog.Log.i("PluginMsgReporter", "onAppBackground begin to report");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f413781f;
                concurrentHashMap.forEach(new sy.b0$$b(currentTimeMillis));
                concurrentHashMap.forEach(new sy.b0$$d());
                concurrentHashMap.forEach(new sy.b0$$c());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("PluginMsgReporter", "[onAppBackground] exception: " + e17);
            }
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        try {
            super.onCreate(context);
            this.f413782d = j62.e.g().l("clicfg_main_plugin_report_enable", false, true, true);
            com.tencent.mars.xlog.Log.i("PluginMsgReporter", "enableExitReport = " + this.f413782d);
            wi();
        } catch (java.lang.Exception e17) {
            this.f413782d = false;
            com.tencent.mars.xlog.Log.i("PluginMsgReporter", "get config failed:" + e17);
        }
    }

    public void wi() {
        try {
            com.tencent.mars.xlog.Log.i("PluginMsgReporter", "recordConversationInit");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f413781f;
            if (concurrentHashMap.isEmpty()) {
                concurrentHashMap.put("gh_25d9ac85a4bc", new sy.c0("gh_25d9ac85a4bc"));
                concurrentHashMap.put("newsapp", new sy.c0("newsapp"));
                concurrentHashMap.put("gh_3dfda90e39d6", new sy.c0("gh_3dfda90e39d6"));
                concurrentHashMap.put("gh_b4af18eac3d5", new sy.c0("gh_b4af18eac3d5"));
                concurrentHashMap.put("gh_f0a92aa7146c", new sy.c0("gh_f0a92aa7146c"));
                concurrentHashMap.put("gh_e087bb5b95e6", new sy.c0("gh_e087bb5b95e6"));
                concurrentHashMap.put("qqmail", new sy.c0("qqmail"));
                concurrentHashMap.put("gh_579db1f2cf89", new sy.c0("gh_579db1f2cf89"));
                concurrentHashMap.put("gh_43f2581f6fd6", new sy.c0("gh_43f2581f6fd6"));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PluginMsgReporter", "[recordConversationInit] exception: " + e17.toString());
        }
    }
}
