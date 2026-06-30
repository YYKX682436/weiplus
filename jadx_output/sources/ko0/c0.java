package ko0;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f309829e;

    /* renamed from: f, reason: collision with root package name */
    public static lo0.g0 f309830f;

    /* renamed from: g, reason: collision with root package name */
    public static lo0.g0 f309831g;

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.c0 f309825a = new ko0.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f309826b = lp0.b.h() + "live/filters";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f309827c = lp0.b.h() + "live/filters_v000";

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.d f309828d = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f309832h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f309833i = "";

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f309834j = jz5.h.b(ko0.b0.f309820d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:23:0x00ad, B:26:0x00b2), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ko0.u] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v32, types: [lo0.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ko0.u r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko0.c0.a(ko0.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final lo0.g0 b() {
        lo0.g0 g0Var = f309831g;
        if (g0Var != null) {
            return g0Var;
        }
        lo0.g0 g0Var2 = lo0.g0.f319990f;
        return lo0.g0.f319990f;
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f309834j).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    public final void d(boolean z17) {
        lo0.g0 g0Var;
        java.lang.Object obj;
        lo0.b0 b0Var;
        if (z17) {
            g0Var = f309830f;
            if (g0Var == null) {
                g0Var = lo0.g0.f319990f;
            }
        } else {
            g0Var = lo0.g0.f319990f;
        }
        g0Var.getClass();
        lo0.g0 g0Var2 = new lo0.g0(g0Var);
        if (g0Var2.f319992a) {
            java.lang.String string = c().getString(gm0.j1.b().h() + "_select_which", null);
            java.util.List<lo0.b0> list = g0Var2.f319993b;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (r26.i0.p(((lo0.b0) obj).f319967a, string, false)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lo0.b0 b0Var2 = (lo0.b0) obj;
            if (b0Var2 == null) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        b0Var = it6.next();
                        if (!((lo0.b0) b0Var).f319968b) {
                            break;
                        }
                    } else {
                        b0Var = 0;
                        break;
                    }
                }
                b0Var2 = b0Var;
                if (b0Var2 == null) {
                    b0Var2 = (lo0.b0) kz5.n0.X(list);
                }
            }
            kotlin.jvm.internal.o.g(b0Var2, "<set-?>");
            g0Var2.f319996e = b0Var2;
            for (lo0.b0 b0Var3 : list) {
                ko0.c0 c0Var = f309825a;
                java.lang.String str = b0Var3.f319967a;
                int i17 = c0Var.c().getInt(gm0.j1.b().h() + "_filter_value_" + str, Integer.MIN_VALUE);
                b0Var3.f319974h = i17 != Integer.MIN_VALUE ? i17 / 100.0d : b0Var3.f319971e;
                lo0.b bVar = b0Var3.f319973g;
                if (bVar != null && bVar.f319964e == null) {
                    com.tencent.mm.sdk.platformtools.o4 c17 = c0Var.c();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_FILTER_");
                    sb6.append(gm0.j1.b().h());
                    sb6.append('_');
                    java.lang.String str2 = bVar.f319960a;
                    sb6.append(str2);
                    int i18 = c17.getInt(sb6.toString(), -1);
                    if (i18 < 0) {
                        bVar.f319964e = java.lang.Integer.valueOf(bVar.f319962c);
                        java.lang.String str3 = bVar.f319963d;
                        kotlin.jvm.internal.o.g(str3, "<set-?>");
                        bVar.f319965f = str3;
                        c0Var.e(bVar);
                    } else {
                        bVar.f319964e = java.lang.Integer.valueOf(i18);
                        java.lang.String string2 = c0Var.c().getString("MMKV_LIVE_BEAUTY_BADGE_GROUP_FILTER_" + gm0.j1.b().h() + '_' + str2, null);
                        if (string2 == null) {
                            string2 = "";
                        }
                        bVar.f319965f = string2;
                    }
                }
            }
            g0Var2.f319995d.b();
        }
        f309831g = g0Var2;
    }

    public final void e(lo0.b badge) {
        kotlin.jvm.internal.o.g(badge, "badge");
        java.lang.Integer num = badge.f319964e;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mm.sdk.platformtools.o4 c17 = c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_FILTER_");
            sb6.append(gm0.j1.b().h());
            sb6.append('_');
            java.lang.String str = badge.f319960a;
            sb6.append(str);
            c17.putInt(sb6.toString(), intValue);
            c().putString("MMKV_LIVE_BEAUTY_BADGE_GROUP_FILTER_" + gm0.j1.b().h() + '_' + str, badge.f319965f);
        }
    }

    public final void f(java.lang.String str) {
        c().putString(gm0.j1.b().h() + "_select_which", str);
    }

    public final void g(java.lang.String str, double d17) {
        c().putInt(gm0.j1.b().h() + "_filter_value_" + str, a06.d.a(d17 * 100.0d));
    }

    public final void h(lo0.g0 filterPackage) {
        kotlin.jvm.internal.o.g(filterPackage, "filterPackage");
        if (filterPackage.f319992a) {
            f(filterPackage.f319996e.f319967a);
            for (lo0.b0 b0Var : filterPackage.f319993b) {
                f309825a.g(b0Var.f319967a, b0Var.f319974h);
            }
        }
    }

    public final void i(java.lang.String resUrl, java.lang.String resMd5) {
        kotlin.jvm.internal.o.g(resUrl, "resUrl");
        kotlin.jvm.internal.o.g(resMd5, "resMd5");
        f309832h = resUrl;
        f309833i = resMd5;
        com.tencent.mars.xlog.Log.i("LiveCore.LiveFilterUtil", "#updateResUrl resUrl=" + resUrl + " resMd5=" + resMd5);
    }
}
