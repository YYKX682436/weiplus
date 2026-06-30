package ez1;

/* loaded from: classes13.dex */
public final class g extends dz1.a {

    /* renamed from: m, reason: collision with root package name */
    public static int f257841m;

    /* renamed from: n, reason: collision with root package name */
    public static java.util.List f257842n;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f257845q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f257846r;

    /* renamed from: s, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f257847s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f257848t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f257849u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f257850v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f257851w;

    /* renamed from: x, reason: collision with root package name */
    public static long f257852x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.mm.plugin.datareport.monitor.adapter.app.AppEventMonitor$mScreenReceiver$1 f257853y;

    /* renamed from: z, reason: collision with root package name */
    public static final ez1.e f257854z;

    /* renamed from: i, reason: collision with root package name */
    public static final ez1.g f257840i = new ez1.g();

    /* renamed from: o, reason: collision with root package name */
    public static final uz1.a f257843o = new uz1.a();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.List f257844p = new java.util.ArrayList();

    /* JADX WARN: Type inference failed for: r0v7, types: [com.tencent.mm.plugin.datareport.monitor.adapter.app.AppEventMonitor$mScreenReceiver$1] */
    static {
        nm5.j.c(0L, 0);
        nm5.j.c(0L, 0);
        f257850v = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        f257852x = 300L;
        f257853y = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.app.AppEventMonitor$mScreenReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (intent == null) {
                    return;
                }
                if (kotlin.jvm.internal.o.b("android.intent.action.SCREEN_ON", intent.getAction())) {
                    com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onReceive] ACTION_SCREEN_ON");
                    ez1.g.f257848t = true;
                } else if (kotlin.jvm.internal.o.b("android.intent.action.SCREEN_OFF", intent.getAction())) {
                    com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onReceive] ACTION_SCREEN_OFF");
                    ez1.g.f257849u = true;
                }
            }
        };
        f257854z = new ez1.e();
    }

    public final void P(ez1.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.List list = f257844p;
        synchronized (list) {
            if (!((java.util.ArrayList) list).contains(aVar)) {
                ((java.util.ArrayList) list).add(aVar);
            }
        }
        if (f257845q) {
            aVar.Na(java.lang.System.currentTimeMillis(), false, null);
        }
    }

    public final void Q(long j17, android.app.Activity activity) {
        if (f257845q || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[appIn] time : " + f257850v.format(new java.util.Date(j17)) + ", processName: " + bm5.f1.a());
        java.util.List list = f257844p;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((ez1.a) it.next()).Na(j17, f257848t, null);
            }
        }
        f257845q = true;
        f257848t = false;
        f257849u = false;
    }

    public final void R(long j17, android.app.Activity activity) {
        if (f257845q && cy1.a.Ui().oj()) {
            com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[appOut] time : " + f257850v.format(new java.util.Date(j17)) + ", processName: " + bm5.f1.a());
            java.util.List list = f257844p;
            synchronized (list) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((ez1.a) it.next()).b7(j17, f257849u, null);
                }
            }
            f257845q = false;
            f257848t = false;
            f257849u = false;
        }
    }

    public final void S() {
        if (com.tencent.mm.sdk.platformtools.x2.n() && f257851w && u46.l.c(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_data_report_check_op_appinout", "0"), "1")) {
            long j17 = f257852x;
            if (j17 < 3000) {
                f257852x = j17 + 300;
            }
            if (V().getBoolean("mmkv_key_is_op_sa", false)) {
                W();
                f257852x = 300L;
            }
            sz1.i.d(ez1.d.f257838d, f257852x);
            sz1.i.e(null).sendEmptyMessage(1004);
        }
    }

    public final boolean T(long j17, boolean z17) {
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        uz1.a aVar = f257843o;
        if (n17) {
            if (aVar.size() > 0 && ((!V().getBoolean("mmkv_key_is_op_sa", false) || !z17) && f257841m == 0)) {
                Q(j17, null);
                return true;
            }
        } else if (aVar.size() > 0 && !V().getBoolean("mmkv_key_is_mp_sa", false)) {
            if (!com.tencent.mm.sdk.platformtools.x2.n() && cy1.a.Ui().oj()) {
                java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
                java.lang.String str = string != null ? string : "";
                V().putString("mmkv_key_op_app_inout_time", str + ',' + j17);
                f257845q = true;
            }
            return true;
        }
        return false;
    }

    public final boolean U(long j17) {
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        uz1.a aVar = f257843o;
        if (n17) {
            if (aVar.size() == 0 && !V().getBoolean("mmkv_key_is_op_sa", false) && j17 > V().getLong("mmkv_key_op_last_stop_time", 0L) && f257841m == 0) {
                R(j17, null);
                return true;
            }
        } else if (aVar.size() == 0 && !V().getBoolean("mmkv_key_is_mp_sa", false) && j17 > V().getLong("mmkv_key_mp_last_stop_time", 0L)) {
            if (!com.tencent.mm.sdk.platformtools.x2.n() && cy1.a.Ui().oj()) {
                java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
                java.lang.String str = string != null ? string : "";
                V().putString("mmkv_key_op_app_inout_time", str + ';' + j17);
                f257845q = false;
            }
            return true;
        }
        return false;
    }

    public final com.tencent.mm.sdk.platformtools.o4 V() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f257847s;
        if (o4Var != null) {
            return o4Var;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_key_app_event_monitor");
        f257847s = M;
        kotlin.jvm.internal.o.f(M, "apply(...)");
        return M;
    }

    public final void W() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
            java.lang.String str = string == null ? "" : string;
            V().putString("mmkv_key_op_app_inout_time", "");
            if (u46.l.e(str)) {
                return;
            }
            try {
                int i17 = 0;
                for (java.lang.String str2 : (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                    if (i17 > 100) {
                        return;
                    }
                    i17++;
                    if (!u46.l.e(str2)) {
                        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
                        if (strArr.length > 0 && !u46.l.e(strArr[0])) {
                            long parseLong = java.lang.Long.parseLong(strArr[0]);
                            if (f257841m == 0) {
                                R(parseLong, null);
                            }
                        }
                        if (strArr.length > 1 && !u46.l.e(strArr[1])) {
                            long parseLong2 = java.lang.Long.parseLong(strArr[1]);
                            if (f257841m == 0) {
                                Q(parseLong2, null);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final boolean X(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        if (f257842n == null) {
            f257842n = new java.util.ArrayList();
            java.lang.String Zi = h62.d.vj().Zi(e42.c0.clicfg_data_report_app_event_filter_activity, "WeChatSplashActivity|FinderMultiTaskRouterUI", true);
            if (!u46.l.e(Zi)) {
                kotlin.jvm.internal.o.d(Zi);
                for (java.lang.String str : (java.lang.String[]) r26.n0.f0(Zi, new java.lang.String[]{"|"}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                    java.util.List list = f257842n;
                    kotlin.jvm.internal.o.d(list);
                    list.add(str);
                }
            }
        }
        java.util.List list2 = f257842n;
        kotlin.jvm.internal.o.d(list2);
        return list2.contains(activity.getClass().getSimpleName());
    }

    public final void Y(ez1.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.List list = f257844p;
        synchronized (list) {
            ((java.util.ArrayList) list).remove(aVar);
        }
    }

    public final void Z() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.o4 V = V();
            uz1.a aVar = f257843o;
            V.putBoolean("mmkv_key_is_mp_sa", aVar.size() > 0);
            if (aVar.size() > 0) {
                f257851w = false;
            } else {
                f257851w = true;
                S();
            }
        }
    }

    @Override // dz1.a, mz1.c
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // dz1.a, mz1.c
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onActivityResumed] activity : ".concat(activity.getClass().getSimpleName()));
        if (!X(activity) && com.tencent.mm.sdk.platformtools.x2.n() && !f257845q) {
            uz1.a aVar = f257843o;
            if (!aVar.contains(activity)) {
                com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[activityResumed] activity : " + activity.getClass().getSimpleName() + ", mStartedActivities : " + aVar.size());
                onActivityStarted(activity);
            }
        }
        new java.lang.ref.WeakReference(activity);
    }

    @Override // dz1.a, mz1.c
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        nm5.j.c(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(activity.hashCode()));
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onActivityStarted] activity : ".concat(activity.getClass().getSimpleName()));
        if (X(activity)) {
            return;
        }
        f257846r = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[activityStarted] activity : ");
        sb6.append(activity.getClass().getSimpleName());
        sb6.append(", mStartedActivities : ");
        uz1.a aVar = f257843o;
        sb6.append(aVar.size());
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", sb6.toString());
        aVar.add(activity);
        java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
        java.lang.String str = string == null ? "" : string;
        boolean D = str.length() == 0 ? true : r26.n0.D((java.lang.CharSequence) kz5.z.f0(r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0])), ",", false, 2, null);
        W();
        if (!T(currentTimeMillis, D)) {
            sz1.i.d(new ez1.b(currentTimeMillis), 300L);
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            V().putBoolean("mmkv_key_is_op_sa", false);
        } else {
            V().putBoolean("mmkv_key_is_op_sa", aVar.size() > 0);
        }
        Z();
    }

    @Override // dz1.a, mz1.c
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        nm5.j.c(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(activity.hashCode()));
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[onActivityStopped] activity : ".concat(activity.getClass().getSimpleName()));
        if (X(activity)) {
            return;
        }
        f257846r = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[activityStopped] activity : ");
        sb6.append(activity.getClass().getSimpleName());
        sb6.append(", mStartedActivities : ");
        uz1.a aVar = f257843o;
        sb6.append(aVar.size());
        com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", sb6.toString());
        aVar.e(activity);
        if (!U(currentTimeMillis)) {
            sz1.i.d(new ez1.c(currentTimeMillis), 300L);
        }
        Z();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            V().putLong("mmkv_key_mp_last_stop_time", currentTimeMillis);
        } else {
            V().putLong("mmkv_key_op_last_stop_time", currentTimeMillis);
        }
    }
}
