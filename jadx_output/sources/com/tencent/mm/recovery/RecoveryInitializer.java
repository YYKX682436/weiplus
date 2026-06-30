package com.tencent.mm.recovery;

/* loaded from: classes12.dex */
public class RecoveryInitializer {
    private static final int RECOVERY_SETTING_DEBUG = 30000;
    private static final java.lang.String TAG = "MicroMsg.recovery.initializer";

    public static boolean init(android.content.Context context) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("getRemoteService", "(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("com/google/android/gms/common/internal/BaseGmsClient", arrayList);
        xj0.a.h().k(hashMap, new y45.k(context));
        if (d55.n0.c(context, ":recovery")) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new y45.g(context));
            try {
                com.tencent.mm.sdk.platformtools.x2.u(context);
                km0.c cVar = new km0.c(":recovery", com.tencent.mm.sdk.platformtools.i.a());
                ku5.u.a(cVar.f308989c, new com.tencent.mm.booter.p3());
                cVar.f308992f = com.tencent.mm.booter.s.b(cVar.f308989c);
                gm0.j1.g(cVar);
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                com.tencent.mm.vfs.b3.E = applicationContext;
                c01.je.h();
                com.tencent.mars.comm.PlatformComm.C2Java.setCallback(new com.tencent.mars.comm.PlatformCommC2JavaCallBack());
                com.tencent.mars.comm.MarsPlatformComm.setContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mars.comm.NetworkSignalUtil.setMyNetworkSignalUtil(new com.tencent.mars.comm.NetworkSignalUtilImpl());
                com.tencent.mars.comm.PlatformComm.init(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.os.Handler(android.os.Looper.getMainLooper()));
                y45.m$$a m__a = new y45.m$$a(context);
                ak0.a aVar = ak0.o.f5542a;
                ak0.j.f5539b.add(new nq1.b0(m__a));
                d55.r0.a().e("diagnostic_mmkv_reset", new y45.d("diagnostic_storage"));
                d55.r0.a().e("jectl_mmkv_reset", new y45.e("jectl_config"));
                com.tencent.mm.app.v5 a17 = com.tencent.mm.app.v5.a(cVar.f308989c);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f53868e)) {
                    cVar.f308992f.e(a17.f53868e);
                }
            } catch (java.lang.Throwable th6) {
                d55.u.c(TAG, "recovery process init error", th6, new java.lang.Object[0]);
                d55.u.a(context);
            }
            return false;
        }
        if (!d55.n0.c(context, "")) {
            return true;
        }
        d55.a0 a0Var = new d55.a0(context);
        a0Var.f226559e = 0L;
        a0Var.a();
        d55.r0 a18 = d55.r0.a();
        if (context != null) {
            a18.f226614a = context;
        } else {
            a18.getClass();
        }
        y45.j jVar = new y45.j();
        if (a18.f226615b == null) {
            a18.f226615b = new d55.d0(a18.b());
        }
        d55.b0 b0Var = (d55.b0) a18.f226615b;
        jVar.f226553a = b0Var.f226574q;
        b0Var.f226566f.set(jVar);
        y45.i iVar = new y45.i();
        if (a18.f226615b == null) {
            a18.f226615b = new d55.d0(a18.b());
        }
        java.util.List list = (java.util.List) ((d55.b0) a18.f226615b).f226567g.get(1);
        if (list != null) {
            list.add(iVar);
        }
        y45.h hVar = new y45.h();
        if (a18.f226615b == null) {
            a18.f226615b = new d55.d0(a18.b());
        }
        java.util.List list2 = (java.util.List) ((d55.b0) a18.f226615b).f226567g.get(2);
        if (list2 != null) {
            list2.add(hVar);
        }
        if (d55.r0.d(context)) {
            return true;
        }
        try {
            z17 = isStartWithActivity(context);
        } catch (java.lang.Throwable th7) {
            d55.u.c(TAG, "check isStartWithActivity error", th7, new java.lang.Object[0]);
            z17 = false;
        }
        if (!z17) {
            d55.u.b(TAG, "isStartWithActivity = false, skip recovery detect", new java.lang.Object[0]);
            return true;
        }
        d55.r0 a19 = d55.r0.a();
        if (d55.n0.c(a19.b(), "")) {
            android.content.Context b17 = a19.b();
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.SharedPreferences sharedPreferences = b17.getSharedPreferences("recovery_enable", 4);
            if (sharedPreferences == null) {
                throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
            }
            if (bundle.containsKey("enable") ? bundle.getBoolean("enable") : sharedPreferences.getBoolean("enable", true)) {
                if (a19.f226615b == null) {
                    a19.f226615b = new d55.d0(a19.b());
                }
                ((d55.d0) a19.f226615b).j();
            } else {
                d55.o0.a(4, "MicroMsg.recovery", "Recovery is disabled, skip");
            }
        } else {
            d55.o0.a(4, "MicroMsg.recovery", "not main proc, skip");
        }
        return true;
    }

    private static boolean isStartWithActivity(android.content.Context context) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE)) != null) {
            for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                if (runningTaskInfo.numActivities > 0) {
                    java.lang.String packageName = context.getPackageName();
                    android.content.ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName != null && packageName.equals(componentName.getPackageName())) {
                        z17 = true;
                        break;
                    }
                }
            }
        }
        z17 = false;
        android.app.ActivityManager activityManager2 = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager2 != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager2.getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                    d55.o0.a(5, "MicroMsg.recovery.utils", "app importance = " + runningAppProcessInfo.importance);
                    if (runningAppProcessInfo.importance <= 100) {
                        z18 = true;
                        break;
                    }
                }
            }
        }
        z18 = false;
        if (!z18) {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/self/cgroup")));
            } catch (java.lang.Throwable unused) {
            }
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine != null && !readLine.contains("top-app") && !readLine.contains("foreground")) {
                        if (readLine.contains("background")) {
                            break;
                        }
                    }
                    bufferedReader.close();
                    z19 = true;
                    break;
                } finally {
                }
            } while (!readLine.contains("restricted"));
            bufferedReader.close();
        }
        z19 = false;
        d55.o0.a(5, "MicroMsg.recovery", "isTopActivity = " + z17 + ", appImportanceForeground = " + z18 + ", cgroupForeground = " + z19);
        return z17 && (z18 || z19);
    }
}
