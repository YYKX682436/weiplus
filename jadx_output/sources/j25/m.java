package j25;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j25.n f297321d;

    public m(j25.n nVar) {
        this.f297321d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.service.CommonProcessService commonProcessService;
        boolean z17 = true;
        int i17 = j62.e.g().i("clicfg_support_auto_release", 1, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessReclaimSwitch", "isSupportProcessReclaimDisabled:" + i17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("PluginSupportProcess", "Support process reclaim disabled");
            return;
        }
        j25.n nVar = this.f297321d;
        java.util.List list = nVar.f297323e;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k25.a aVar = (k25.a) it.next();
                if (aVar != null && aVar.d()) {
                    z17 = false;
                    break;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("PluginSupportProcess", "needKill:" + z17);
        if (z17) {
            boolean isBackground = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground();
            com.tencent.mars.xlog.Log.i("PluginSupportProcess", "isProcessBackground:" + isBackground);
            if (isBackground) {
                nVar.getClass();
                java.lang.ref.WeakReference weakReference = com.tencent.mm.service.CommonProcessService.f193199h;
                if (weakReference != null && (commonProcessService = (com.tencent.mm.service.CommonProcessService) weakReference.get()) != null) {
                    commonProcessService.stopSelf();
                    com.tencent.mars.xlog.Log.i("PluginSupportProcess", "Stop service %s", commonProcessService);
                }
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin_support/PluginSupportProcess", "killSupport", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/plugin_support/PluginSupportProcess", "killSupport", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return;
            }
        }
        nVar.f297322d.postDelayed(nVar.f297324f, 15000L);
    }
}
