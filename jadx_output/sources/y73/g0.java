package y73;

/* loaded from: classes11.dex */
public class g0 implements w11.e1 {
    public g0(y73.d0 d0Var) {
    }

    @Override // w11.e1
    public void a(boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "app is background now, i can kill quietly");
        ak0.n.c();
        try {
            ak0.n.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.SyncResponseProcessor", th6, "Fail to call tinker.cleanPatch.", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.appenderFlushSync();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/hp/model/SyncResponseProcessor$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/hp/model/SyncResponseProcessor$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
