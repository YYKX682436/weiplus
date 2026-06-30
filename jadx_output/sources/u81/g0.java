package u81;

/* loaded from: classes7.dex */
public class g0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u81.h0 f425429a;

    public g0(u81.h0 h0Var) {
        this.f425429a = h0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2;
        if (intent == null || !"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandUIHomePressReceiver", "[home_pressed] action: %s, reason: %s", intent.getAction(), stringExtra);
        boolean equals = stringExtra.equals("homekey");
        com.tencent.mm.plugin.appbrand.task.e1 e1Var = com.tencent.mm.plugin.appbrand.task.e1.f89016a;
        if (!equals) {
            if (stringExtra.equals("recentapps") || stringExtra.equals("assist")) {
                com.tencent.mm.plugin.appbrand.ui.h8 h8Var = (com.tencent.mm.plugin.appbrand.ui.h8) this.f425429a;
                if (h8Var.f89754b.f89779d.isPaused()) {
                    return;
                }
                e1Var.a(h8Var.f89754b.f89779d, "onRecentAppsPressed");
                appBrandRuntimeContainerWC = h8Var.f89754b.f89779d.mRuntimeContainer;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = appBrandRuntimeContainerWC.getActiveRuntime();
                if (activeRuntime == null) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.x0.g(activeRuntime.f74803n, com.tencent.mm.plugin.appbrand.w0.RECENT_APPS_PRESSED);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.h8 h8Var2 = (com.tencent.mm.plugin.appbrand.ui.h8) this.f425429a;
        if (h8Var2.f89754b.f89779d.isPaused()) {
            return;
        }
        e1Var.a(h8Var2.f89754b.f89779d, "onHomePressed");
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = h8Var2.f89754b.f89779d;
        appBrandUI.C = true;
        appBrandRuntimeContainerWC2 = appBrandUI.mRuntimeContainer;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime2 = appBrandRuntimeContainerWC2.getActiveRuntime();
        if (activeRuntime2 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.hc hcVar = activeRuntime2.f74796e;
        if (hcVar != null && hcVar.getActiveRuntime() == activeRuntime2) {
            activeRuntime2.h0();
        }
        com.tencent.mm.plugin.appbrand.x0.g(activeRuntime2.f74803n, com.tencent.mm.plugin.appbrand.w0.HOME_PRESSED);
    }
}
