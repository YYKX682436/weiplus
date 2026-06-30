package wn4;

/* loaded from: classes11.dex */
public final class o implements w11.e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wn4.o f447559a = new wn4.o();

    @Override // w11.e1
    public final void a(boolean z17) {
        if (z17) {
            return;
        }
        wn4.x xVar = wn4.x.f447571a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "app is background now, i can kill quietly");
        ak0.n.c();
        try {
            ak0.n.a();
        } catch (java.lang.Throwable th6) {
            wn4.x xVar2 = wn4.x.f447571a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Updater.ManualUpdaterProcessor", th6, "Fail to call tinker.cleanPatch.", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.appenderFlushSync();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/updater/model/ManualUpdaterProcessor$patchRollBack$1", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/updater/model/ManualUpdaterProcessor$patchRollBack$1", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
