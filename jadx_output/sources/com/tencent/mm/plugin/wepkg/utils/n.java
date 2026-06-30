package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.sdk.platformtools.n3 f188502b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f188501a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f188503c = new java.util.HashSet();

    public static void a(java.lang.String str, com.tencent.mm.plugin.wepkg.model.a aVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 1001;
        wepkgCrossProcessTask.f188349q = str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            d().postToWorker(new com.tencent.mm.plugin.wepkg.utils.l(wepkgCrossProcessTask, aVar));
        } else {
            wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.utils.m(currentTimeMillis, aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.d();
        }
    }

    public static boolean b(java.lang.String str) {
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m() && r6Var.y()) {
                return true;
            }
            r6Var.J();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        return kk.k.g((str + "_" + str2).getBytes());
    }

    public static com.tencent.mm.sdk.platformtools.n3 d() {
        if (f188502b == null) {
            synchronized (f188501a) {
                if (f188502b == null) {
                    f188502b = new com.tencent.mm.sdk.platformtools.n3("WebviewCache#WorkerThread");
                }
            }
        }
        return f188502b;
    }

    public static boolean e(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                if (runningAppProcessInfo.processName.equals(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                    return true;
                }
                if (runningAppProcessInfo.processName.equals(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(kh0.i.a(str))) {
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences != null && sharedPreferences.getBoolean("disable_we_pkg", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUtil", "disable wepkg");
            com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, kh0.i.a(str), null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(11));
            return false;
        }
        if (!com.tencent.mm.plugin.game.commlib.i.a()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUtil", "config wepkg disable");
        com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", str, kh0.i.a(str), null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(12));
        return false;
    }
}
