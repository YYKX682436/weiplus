package dr0;

/* loaded from: classes12.dex */
public final class d2 extends dr0.j2 {
    public d2() {
        super(2);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f242440b.a()) {
            return false;
        }
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52735q;
        java.lang.String str3 = com.tencent.matrix.lifecycle.owners.f0.f52740v;
        dr0.p1 a17 = dr0.p1.f242489d.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.List<android.app.ActivityManager.RunningTaskInfo> h17 = a17.h(context);
        boolean z17 = false;
        for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : h17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "LastUI: runningTask=" + runningTaskInfo.topActivity);
            android.content.ComponentName componentName = runningTaskInfo.topActivity;
            if (componentName != null) {
                kotlin.jvm.internal.o.d(componentName);
                if (kotlin.jvm.internal.o.b(componentName.getClassName(), "com.tencent.mm.ui.LauncherUI")) {
                    z17 = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "LastUI: getRecentScene=" + str2 + ", getVisibleScene=" + str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "LastUI: taskSize=" + h17.size() + ", launcherUiAtTop=" + z17);
        if (mm.k.j(mm.k.N, null, 1, null)) {
            dr0.t tVar = dr0.t0.f242539j;
            long j17 = dr0.t0.f242540k.f242547g;
            long max = java.lang.Math.max(3600000L, dr0.a3.f242403d.a().e() * 2 * 60000);
            if (j17 > 0 && java.lang.System.currentTimeMillis() - j17 >= max && h17.size() <= 1) {
                return true;
            }
        }
        if ((!h17.isEmpty()) && !z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: launcherUiAtTop=false");
            return false;
        }
        if (kz5.c0.i("com.tencent.mm.ui.LauncherUI#MainUI", "com.tencent.mm.ui.LauncherUI#MvvmAddressUIFragment", "com.tencent.mm.ui.LauncherUI#FindMoreFriendsUI", "com.tencent.mm.ui.LauncherUI#MoreTabUI").contains(str3) || (kotlin.jvm.internal.o.b("com.tencent.mm.ui.LauncherUI", str2) && kotlin.jvm.internal.o.b("?", str3))) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: recentScene=" + str2 + ", visibleScene=" + str3);
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingBg");
        if (a()) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        return null;
    }
}
