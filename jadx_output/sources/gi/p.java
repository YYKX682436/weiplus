package gi;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static android.os.Handler f272075a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f272076b = "unknown";

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f272077c = java.util.Collections.emptyList();

    public static void a(boolean z17, java.lang.String str) {
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            e17.a(z17);
        }
        if (!z17) {
            b("background");
            return;
        }
        b(str);
        ((ku5.t0) ku5.t0.f312615d).h(new gi.p$$c(), "Matrix.battery.LifeCycle");
        gi.i0.b(false);
    }

    public static void b(java.lang.String str) {
        ph.u uVar;
        if (ih.d.c() && (uVar = (ph.u) ih.d.d().a(ph.u.class)) != null) {
            if (uVar.f363455g == 4) {
                return;
            }
            java.lang.String b17 = ri.t.b(str);
            rh.w wVar = (rh.w) uVar.f354296h.i(rh.w.class);
            if (wVar != null) {
                if (((com.tencent.matrix.batterycanary.stats.k) wVar.f395294a.i(com.tencent.matrix.batterycanary.stats.k.class)) != null) {
                    new com.tencent.matrix.batterycanary.stats.BatteryRecord.SceneStatRecord().f52620f = b17;
                }
                synchronized ("Matrix.battery.AppStatMonitorFeature") {
                    try {
                        java.util.List list = wVar.f395529f;
                        if (list != java.util.Collections.EMPTY_LIST) {
                            list.add(0, new wh.f2(b17));
                            android.os.Handler handler = wVar.f395294a.f363337f;
                            java.lang.Runnable runnable = wVar.f395530g;
                            handler.removeCallbacks(runnable);
                            wVar.f395294a.f363337f.postDelayed(runnable, 1000L);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                oj.j.c("Matrix.battery.AppStatMonitorFeature", "updateAppImportance when launch: " + b17, new java.lang.Object[0]);
                wVar.n();
            }
            if ("background".equals(str)) {
                return;
            }
            f272076b = b17;
        }
    }
}
