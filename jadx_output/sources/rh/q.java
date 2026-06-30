package rh;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.w f395495d;

    public q(rh.w wVar) {
        this.f395495d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        rh.w wVar = this.f395495d;
        android.content.Context d17 = wVar.f395294a.d();
        java.lang.String packageName = d17.getPackageName();
        if (packageName.contains(":")) {
            packageName = packageName.substring(0, packageName.indexOf(":"));
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) d17.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.startsWith(packageName)) {
                if (wVar.f395526c > runningAppProcessInfo.importance) {
                    oj.j.c("Matrix.battery.AppStatMonitorFeature", "update global importance: " + wVar.f395526c + " > " + runningAppProcessInfo.importance + ", reason = " + runningAppProcessInfo.importanceReasonComponent, new java.lang.Object[0]);
                    wVar.f395526c = runningAppProcessInfo.importance;
                }
                if (runningAppProcessInfo.processName.equals(d17.getPackageName()) && wVar.f395525b > runningAppProcessInfo.importance) {
                    oj.j.c("Matrix.battery.AppStatMonitorFeature", "update app importance: " + wVar.f395525b + " > " + runningAppProcessInfo.importance + ", reason = " + runningAppProcessInfo.importanceReasonComponent, new java.lang.Object[0]);
                    wVar.f395525b = runningAppProcessInfo.importance;
                }
            }
        }
    }
}
