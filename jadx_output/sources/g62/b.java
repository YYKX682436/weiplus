package g62;

@j95.b
/* loaded from: classes11.dex */
public class b extends i95.w implements e42.a0, android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f269074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f269075e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f269076f = new java.util.HashMap();

    public static g62.b wi() {
        return (g62.b) i95.n0.c(g62.b.class);
    }

    public void Ai(int i17, int i18, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.x2.n() && (!com.tencent.mm.sdk.platformtools.t8.K0(this.f269074d))) {
            g62.i iVar = new g62.i();
            iVar.f269091h = str;
            iVar.f269088e = 10006;
            iVar.f269090g = i18;
            iVar.f269089f = i17;
            gm0.j1.d().g(iVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportService", "[sendDebugInfo] key : %d, content : %s", java.lang.Integer.valueOf(i18), str);
        }
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.expt.ui.KvInfoUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/expt/kvdebug/ExptReportService", "showKvDebugUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/expt/kvdebug/ExptReportService", "showKvDebugUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Di(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith(":exptdebug/")) {
            java.lang.String substring = str.substring(11);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportService", "%d sendStartMonitor [%s]", java.lang.Integer.valueOf(hashCode()), substring);
            this.f269074d = substring;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                g62.i iVar = new g62.i();
                iVar.f269091h = substring;
                iVar.f269088e = 10000;
                iVar.f269090g = 1;
                gm0.j1.d().g(iVar);
            }
            com.tencent.mm.autogen.events.StartMonitorKVEvent startMonitorKVEvent = new com.tencent.mm.autogen.events.StartMonitorKVEvent();
            startMonitorKVEvent.f54860g.f7753a = substring;
            startMonitorKVEvent.e();
            this.f269075e = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportService", "start expt Debug tools cost time [%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportService", "%d sendStopMonitor [%s]", java.lang.Integer.valueOf(hashCode()), this.f269074d);
        if (com.tencent.mm.sdk.platformtools.x2.n() && !com.tencent.mm.sdk.platformtools.t8.K0(this.f269074d)) {
            g62.i iVar = new g62.i();
            iVar.f269091h = this.f269074d;
            iVar.f269088e = 10000;
            iVar.f269090g = 2;
            gm0.j1.d().g(iVar);
        }
        this.f269074d = null;
        com.tencent.mm.autogen.events.StartMonitorKVEvent startMonitorKVEvent = new com.tencent.mm.autogen.events.StartMonitorKVEvent();
        startMonitorKVEvent.f54860g.f7753a = "";
        startMonitorKVEvent.e();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        Ni();
        java.util.HashMap hashMap = this.f269076f;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f269075e = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        java.lang.String className = activity.getComponentName().getClassName();
        if (com.tencent.mm.sdk.platformtools.x2.n() && (!com.tencent.mm.sdk.platformtools.t8.K0(this.f269074d))) {
            g62.i iVar = new g62.i();
            iVar.f269091h = className;
            iVar.f269088e = 10002;
            iVar.f269090g = 2;
            gm0.j1.d().g(iVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.String className = activity.getComponentName().getClassName();
        if (com.tencent.mm.sdk.platformtools.x2.n() && (!com.tencent.mm.sdk.platformtools.t8.K0(this.f269074d))) {
            g62.i iVar = new g62.i();
            iVar.f269091h = className;
            iVar.f269088e = 10002;
            iVar.f269090g = 1;
            gm0.j1.d().g(iVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
