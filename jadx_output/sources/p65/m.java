package p65;

/* loaded from: classes7.dex */
public class m implements j65.h {
    public m(p65.o oVar) {
    }

    public void a() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessOperator", "Fail to get ActivityManager.");
        } else {
            int myPid = android.os.Process.myPid();
            int myUid = android.os.Process.myUid();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid && !runningAppProcessInfo.processName.endsWith(":push")) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ProcessOperator", "Kill process: %s(%s) by killAllProcessExceptPushAndSelf()", runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid));
                    int i17 = runningAppProcessInfo.pid;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killAllProcessExceptPushAndSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killAllProcessExceptPushAndSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
            com.tencent.mars.xlog.Log.appenderFlush();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/routine/DefaultStartupRoutine$2", "onDensityChange", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/routine/DefaultStartupRoutine$2", "onDensityChange", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
