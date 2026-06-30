package j25;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j25.j f297314d;

    public i(j25.j jVar) {
        this.f297314d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.service.CommonProcessService commonProcessService;
        if (ob0.r3.b()) {
            return;
        }
        j25.j jVar = this.f297314d;
        jVar.getClass();
        if (g32.c.f268147a) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginExDeviceProcess", "ExDeviceProcessBusyMonitor.isBusy(): false");
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginExDeviceProcess", "needKill: %s, workingFlag: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(g32.c.f268148b));
        if (!z17) {
            jVar.f297315d.postDelayed(jVar.f297316e, 20000L);
            return;
        }
        jVar.getClass();
        java.lang.ref.WeakReference weakReference = com.tencent.mm.service.CommonProcessService.f193199h;
        if (weakReference != null && (commonProcessService = (com.tencent.mm.service.CommonProcessService) weakReference.get()) != null) {
            commonProcessService.stopSelf();
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginExDeviceProcess", "Stop service %s", commonProcessService);
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin_support/PluginExDeviceProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin_support/PluginExDeviceProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
