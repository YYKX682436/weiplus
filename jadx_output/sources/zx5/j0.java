package zx5;

/* loaded from: classes13.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f477246a;

    /* renamed from: b, reason: collision with root package name */
    public static long f477247b;

    public static synchronized void a() {
        synchronized (zx5.j0.class) {
            if (!f477246a) {
                by5.c4.a("XWebUpdateLocker", "updating progress not started");
                return;
            }
            f477246a = false;
            f477247b = java.lang.System.currentTimeMillis();
            android.content.SharedPreferences.Editor edit = by5.d4.a("XWEB_UPDATING_TAG", false).edit();
            edit.remove("UpdatingProcessId");
            edit.commit();
            by5.c4.a("XWebUpdateLocker", "finish updating progress");
        }
    }

    public static synchronized boolean b() {
        synchronized (zx5.j0.class) {
            if (f477246a) {
                by5.c4.a("XWebUpdateLocker", "already in updating progress");
                return true;
            }
            android.content.SharedPreferences a17 = by5.d4.a("XWEB_UPDATING_TAG", false);
            int i17 = a17.getInt("UpdatingProcessId", -1);
            if (i17 == android.os.Process.myPid()) {
                by5.c4.a("XWebUpdateLocker", "current process(" + i17 + ") is in updating progress");
                return true;
            }
            if (i17 < 0) {
                return false;
            }
            android.app.ActivityManager activityManager = (android.app.ActivityManager) org.xwalk.core.XWalkEnvironment.f347970c.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null && activityManager.getRunningAppProcesses() != null) {
                int myUid = android.os.Process.myUid();
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == i17) {
                        if (next.uid == myUid) {
                            by5.c4.a("XWebUpdateLocker", "other process(" + i17 + ") is in updating progress");
                            return true;
                        }
                    }
                }
                android.content.SharedPreferences.Editor edit = a17.edit();
                edit.remove("UpdatingProcessId");
                edit.commit();
                return false;
            }
            return false;
        }
    }

    public static synchronized boolean c() {
        synchronized (zx5.j0.class) {
            if (b()) {
                by5.c4.a("XWebUpdateLocker", "already in updating progress");
                return false;
            }
            f477246a = true;
            int myPid = android.os.Process.myPid();
            android.content.SharedPreferences.Editor edit = by5.d4.a("XWEB_UPDATING_TAG", false).edit();
            edit.putInt("UpdatingProcessId", myPid);
            edit.putLong("Start_Time", java.lang.System.currentTimeMillis());
            edit.commit();
            by5.c4.a("XWebUpdateLocker", "start updating progress");
            return true;
        }
    }
}
