package kn4;

/* loaded from: classes7.dex */
public final /* synthetic */ class x$$b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            com.tencent.mars.xlog.Log.e("MatrixTrafficCollector", "Kill self, because current process cost too much mobile traffic at background.");
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/trafficmonitor/MatrixTrafficCollector", "lambda$safeCheck$2", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/plugin/trafficmonitor/MatrixTrafficCollector", "lambda$safeCheck$2", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
