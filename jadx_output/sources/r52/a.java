package r52;

/* loaded from: classes15.dex */
public abstract class a {
    public static final boolean a(java.lang.String str) {
        return kotlin.jvm.internal.o.b("FinderHomeAffinityUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str);
    }

    public static final boolean b(java.lang.String str) {
        return kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI", str) || kotlin.jvm.internal.o.b("FinderShareFeedAffinityUI", str);
    }

    public static final boolean c(java.lang.String str) {
        return kotlin.jvm.internal.o.b("FinderShareFeedRelUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI", str);
    }

    public static final boolean d(java.lang.String str) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.String str2;
        java.lang.String className;
        android.content.Context applicationContext;
        if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI", str) || kotlin.jvm.internal.o.b("FinderMultiTaskRouterUI", str)) {
            return false;
        }
        if (a(str)) {
            return true;
        }
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a.k()) {
            ((o63.j) ((q63.e) i95.n0.c(q63.e.class))).getClass();
            return r63.n.f393042a.p();
        }
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.Object systemService = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
                java.util.Iterator<T> it = appTasks.iterator();
                while (it.hasNext()) {
                    android.app.ActivityManager.RecentTaskInfo taskInfo = ((android.app.ActivityManager.AppTask) it.next()).getTaskInfo();
                    if (taskInfo != null) {
                        android.content.ComponentName componentName = taskInfo.topActivity;
                        java.lang.String str3 = "";
                        if (componentName == null || (str2 = componentName.getClassName()) == null) {
                            str2 = "";
                        }
                        android.content.ComponentName componentName2 = taskInfo.baseActivity;
                        if (componentName2 != null && (className = componentName2.getClassName()) != null) {
                            str3 = className;
                        }
                        if (kotlin.jvm.internal.o.b(str2, str) || kotlin.jvm.internal.o.b(b52.b.g(str2), str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderMultiReport", "baseActivity = " + str3 + ", topActivity = " + str2 + ", activityName = " + str);
                            return a(str3);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static final boolean e(java.lang.String str) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.String str2;
        java.lang.String className;
        android.content.Context applicationContext;
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.Object systemService = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) {
                return false;
            }
            java.util.Iterator<T> it = appTasks.iterator();
            while (it.hasNext()) {
                android.app.ActivityManager.RecentTaskInfo taskInfo = ((android.app.ActivityManager.AppTask) it.next()).getTaskInfo();
                if (taskInfo != null) {
                    android.content.ComponentName componentName = taskInfo.topActivity;
                    java.lang.String str3 = "";
                    if (componentName == null || (str2 = componentName.getClassName()) == null) {
                        str2 = "";
                    }
                    android.content.ComponentName componentName2 = taskInfo.baseActivity;
                    if (componentName2 != null && (className = componentName2.getClassName()) != null) {
                        str3 = className;
                    }
                    if (kotlin.jvm.internal.o.b(str2, str) || kotlin.jvm.internal.o.b(b52.b.g(str2), str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FinderMultiReport", "baseActivity = " + str3 + ", topActivity = " + str2 + ", activityName = " + str);
                        return b(str3);
                    }
                }
            }
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
