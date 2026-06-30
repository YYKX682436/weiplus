package w14;

/* loaded from: classes11.dex */
public final class d implements xg3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final w14.d f442234d;

    /* renamed from: e, reason: collision with root package name */
    public static w14.c f442235e;

    /* renamed from: f, reason: collision with root package name */
    public static long f442236f;

    /* renamed from: g, reason: collision with root package name */
    public static long f442237g;

    /* renamed from: h, reason: collision with root package name */
    public static w14.c f442238h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f442239i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f442240m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f442241n;

    static {
        w14.d dVar = new w14.d();
        f442234d = dVar;
        w14.c cVar = w14.c.f442228g;
        f442235e = cVar;
        f442238h = cVar;
        f442241n = kz5.c1.k(new jz5.l(w14.c.f442231m, new ip.k(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ohf))), new jz5.l(w14.c.f442230i, new ip.k(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ohg))), new jz5.l(w14.c.f442229h, new ip.k(1, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ohe))));
        dVar.c();
    }

    public final void a() {
        r45.f8 f8Var;
        c();
        if (f442238h == f442235e && f442236f == f442237g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not change. mBannerContentType = ");
            sb6.append(f442235e);
            sb6.append(", extStatus2 = ");
            long j17 = f442236f;
            r26.a.a(2);
            java.lang.String l17 = java.lang.Long.toString(j17, 2);
            kotlin.jvm.internal.o.f(l17, "toString(...)");
            sb6.append(l17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", sb6.toString());
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsNotificationHelper", "finish not main process");
            return;
        }
        r45.p53 p53Var = null;
        if (f442238h != f442235e) {
            f8Var = new r45.f8();
            f8Var.f374083d = f442235e.f442233d;
        } else {
            f8Var = null;
        }
        if (!f442240m) {
            ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(235, this, true);
            ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(23, this, true);
            f442240m = true;
        }
        long j18 = f442236f;
        if (j18 != f442237g) {
            boolean z17 = (j18 & 9007199254740992L) == 0;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("extStatus2 changed. showAvatar: ");
            sb7.append(z17);
            sb7.append(", extStatus2: ");
            long j19 = f442236f;
            r26.a.a(2);
            java.lang.String l18 = java.lang.Long.toString(j19, 2);
            kotlin.jvm.internal.o.f(l18, "toString(...)");
            sb7.append(l18);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", sb7.toString());
            p53Var = new r45.p53();
            p53Var.f382761d = 106;
            p53Var.f382762e = z17 ? 2 : 1;
        } else {
            r26.a.a(2);
            java.lang.String l19 = java.lang.Long.toString(j18, 2);
            kotlin.jvm.internal.o.f(l19, "toString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "extStatus2 not changed: ".concat(l19));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f8Var != null) {
            arrayList.add(new xg3.p0(235, f8Var));
        }
        if (p53Var != null) {
            arrayList.add(new xg3.p0(23, p53Var));
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "opList is empty");
        } else {
            ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).c(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "doOplog mBannerContentType = " + f442235e.f442233d);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("finish mBannerContentType = ");
        sb8.append(f442235e);
        sb8.append(", extStatus2 = ");
        long j27 = f442236f;
        r26.a.a(2);
        java.lang.String l27 = java.lang.Long.toString(j27, 2);
        kotlin.jvm.internal.o.f(l27, "toString(...)");
        sb8.append(l27);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", sb8.toString());
    }

    public final java.lang.String b() {
        c();
        if (f442235e == w14.c.f442228g) {
            f442235e = ip.b.a() ? w14.c.f442229h : w14.c.f442231m;
        }
        if (d(null)) {
            int ordinal = f442235e.ordinal();
            if (ordinal == 1) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p__);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                return string;
            }
            if (ordinal == 2) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p_e);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                return string2;
            }
        }
        ip.k kVar = (ip.k) f442241n.get(f442235e);
        java.lang.String str = kVar != null ? kVar.f293572b : null;
        return str == null ? "" : str;
    }

    public final void c() {
        if (f442239i) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsNotificationHelper", "initBannerContentSettings not main process");
            return;
        }
        f442239i = true;
        w14.b bVar = w14.c.f442226e;
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC, null);
        f442235e = bVar.a(num == null ? 0 : num.intValue());
        f442236f = c01.z1.i();
        if (f442235e == w14.c.f442228g) {
            f442235e = ip.b.a() ? w14.c.f442229h : w14.c.f442231m;
        }
        f442238h = f442235e;
        f442237g = f442236f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init mBannerContentType = ");
        sb6.append(f442235e);
        sb6.append(", extStatus2 = ");
        long j17 = f442237g;
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", sb6.toString());
    }

    public final boolean d(java.lang.String str) {
        c();
        if (!(f442235e.f442233d != 0)) {
            return ip.b.a();
        }
        if (!e() && !f()) {
            return false;
        }
        long j17 = f442236f;
        boolean z17 = (9007199254740992L & j17) == 0;
        if ((j17 & 4503599627370496L) != 0) {
            return str == null ? z17 : kotlin.jvm.internal.o.b(str, "1");
        }
        return true;
    }

    public final boolean e() {
        c();
        return f442235e.f442233d == 1;
    }

    public final boolean f() {
        c();
        return f442235e.f442233d == 2;
    }

    public final void g(boolean z17) {
        long j17 = f442236f;
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "extStatus2 before: ".concat(l17));
        long j18 = f442236f | 4503599627370496L;
        f442236f = j18;
        long j19 = z17 ? j18 & (-9007199254740993L) : j18 | 9007199254740992L;
        f442236f = j19;
        r26.a.a(2);
        java.lang.String l18 = java.lang.Long.toString(j19, 2);
        kotlin.jvm.internal.o.f(l18, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "extStatus2 after:  ".concat(l18));
    }

    public final void h(int i17) {
        f442235e = w14.c.f442226e.a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "updateApnsBannerDisplayContentSetting mBannerContentType = " + f442235e);
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOplog ret = ");
        sb6.append(i17);
        sb6.append(", oplogErrMsg = ");
        sb6.append(g25Var != null ? g25Var.f374842e : null);
        sb6.append(", ");
        sb6.append(g25Var != null ? g25Var.f374841d : null);
        sb6.append(", option = ");
        sb6.append(q0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", sb6.toString());
        l14.e.f315008a.b(l14.d.f315005g);
        if (i17 == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC, java.lang.Integer.valueOf(f442235e.f442233d));
            bn0.g.f22779a.g("USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC", f442235e.f442233d);
            c01.z1.P(f442236f);
            f442238h = f442235e;
            f442237g = f442236f;
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doOplog error ret = ");
        sb7.append(i17);
        sb7.append(", oplogErrMsg = ");
        sb7.append(g25Var != null ? g25Var.f374842e : null);
        sb7.append(", ");
        sb7.append(g25Var != null ? g25Var.f374841d : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsNotificationHelper", sb7.toString());
    }
}
