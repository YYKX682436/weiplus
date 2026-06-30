package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.NetWarnBanner$1 f207502d;

    public e0(com.tencent.mm.ui.conversation.banner.NetWarnBanner$1 netWarnBanner$1) {
        this.f207502d = netWarnBanner$1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.banner.NetWarnBanner$1 netWarnBanner$1 = this.f207502d;
        com.tencent.mm.ui.conversation.banner.k0 k0Var = netWarnBanner$1.f207489d;
        java.lang.String str = com.tencent.mm.ui.conversation.banner.k0.G;
        android.content.Context context = (android.content.Context) k0Var.f402842g.get();
        java.lang.String str2 = "";
        if (com.tencent.mm.sdk.platformtools.s1.a(context)) {
            try {
                java.util.List<android.app.ActivityManager.AppTask> appTasks = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getAppTasks();
                if (appTasks != null && appTasks.size() > 0) {
                    java.util.Iterator<android.app.ActivityManager.AppTask> it = appTasks.iterator();
                    if (it.hasNext()) {
                        android.content.ComponentName componentName = it.next().getTaskInfo().topActivity;
                        str2 = componentName == null ? null : componentName.getClassName();
                    }
                }
            } catch (java.lang.Exception e17) {
                java.lang.String message = e17.getMessage();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.GreenManUtil", "getTopActivityName Exception:%s stack:%s", message, com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetWarnView", "curr top activity is: %s", str2);
        if (str2.endsWith("NetworkDiagnoseAllInOneUI")) {
            return;
        }
        com.tencent.mm.ui.conversation.banner.k0 k0Var2 = netWarnBanner$1.f207489d;
        com.tencent.mm.ui.conversation.banner.k0.l(k0Var2, k0Var2.f207539z ? 2 : k0Var2.A ? 4 : k0Var2.B ? 5 : 3);
    }
}
