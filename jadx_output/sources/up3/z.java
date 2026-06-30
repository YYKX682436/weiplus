package up3;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {
    public z(up3.d0 d0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = up3.d0.f429823d;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir(), tp3.b.a("¢´½¾\u0098¤¨£¤"));
            if (r6Var.m()) {
                java.util.HashSet hashSet = new java.util.HashSet(16);
                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
                int myUid = android.os.Process.myUid();
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.uid == myUid) {
                        hashSet.add(java.lang.Integer.valueOf(runningAppProcessInfo.pid));
                    }
                }
                com.tencent.mm.vfs.r6[] H = r6Var.H(new up3.y());
                if (H == null) {
                    return;
                }
                for (com.tencent.mm.vfs.r6 r6Var2 : H) {
                    try {
                        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(r6Var2.getName().split("\\.")[1], 0);
                        if (D1 != 0 && !hashSet.contains(java.lang.Integer.valueOf(D1))) {
                            r6Var2.l();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "Explained by code.", new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th7, "Explained by code.", new java.lang.Object[0]);
        }
    }
}
