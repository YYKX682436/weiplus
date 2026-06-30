package m45;

/* loaded from: classes7.dex */
public abstract class b {
    public static int a(android.content.Context context, java.lang.String str) {
        if (context != null && str != null && str.length() != 0) {
            try {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                    if (str.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.pid;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessOperator", e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public static com.tencent.mm.sdk.platformtools.z7 b(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.z7 z7Var = new com.tencent.mm.sdk.platformtools.z7();
        if (context != null) {
            try {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                    z7Var.a(runningAppProcessInfo.processName, runningAppProcessInfo.pid);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessOperator", e17, "", new java.lang.Object[0]);
            }
        }
        return z7Var;
    }

    public static void c(android.content.Context context) {
        int i17;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.uid == myUid && (i17 = runningAppProcessInfo.pid) != myPid) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/process/ProcessOperator", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/process/ProcessOperator", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public static boolean d(android.content.Context context, java.lang.String str) {
        int a17 = a(context, str);
        if (a17 != 0) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(a17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killProcess", "(Landroid/content/Context;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killProcess", "(Landroid/content/Context;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessOperator", "killProcess, process[%s] pid[%d], e=%s", str, java.lang.Integer.valueOf(a17), th6);
            }
        }
        return false;
    }

    public static boolean e(android.content.Context context, java.lang.String... strArr) {
        if (context == null || strArr == null || strArr.length == 0) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.z7 b17 = b(context);
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str = strArr[i17];
            android.util.SparseIntArray sparseIntArray = b17.f193137a;
            int indexOfKey = str == null ? -1 : sparseIntArray.indexOfKey(str.hashCode());
            if (indexOfKey >= 0) {
                int valueAt = sparseIntArray.valueAt(indexOfKey);
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessOperator", "killProcess(pid : %s, process : %s)", java.lang.Integer.valueOf(valueAt), str);
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(valueAt));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killProcess", "(Landroid/content/Context;[Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killProcess", "(Landroid/content/Context;[Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ProcessOperator", "killProcess, process[%s] pid[%d], e=%s", str, java.lang.Integer.valueOf(valueAt), th6);
                }
            }
        }
        return true;
    }
}
