package s65;

/* loaded from: classes11.dex */
public class x0 implements s65.n0, s65.w {
    public final android.content.Context A;
    public long B;
    public final s65.m0 C;
    public long D;
    public final q65.b E;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sandbox.monitor.l f403527a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f403528b = new java.util.ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f403529c;

    /* renamed from: d, reason: collision with root package name */
    public int f403530d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f403531e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f403532f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f403533g;

    /* renamed from: h, reason: collision with root package name */
    public int f403534h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f403535i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f403536j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f403537k;

    /* renamed from: l, reason: collision with root package name */
    public int f403538l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String[] f403539m;

    /* renamed from: n, reason: collision with root package name */
    public uk.m f403540n;

    /* renamed from: o, reason: collision with root package name */
    public uk.l f403541o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f403542p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f403543q;

    /* renamed from: r, reason: collision with root package name */
    public int f403544r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f403545s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f403546t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f403547u;

    /* renamed from: v, reason: collision with root package name */
    public int f403548v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f403549w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f403550x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.Intent f403551y;

    /* renamed from: z, reason: collision with root package name */
    public android.app.Notification f403552z;

    public x0(s65.u0 u0Var) {
        int i17 = o45.wf.f343023a;
        this.f403542p = false;
        this.f403543q = false;
        this.f403545s = false;
        this.f403547u = false;
        this.f403550x = false;
        this.f403551y = null;
        this.f403552z = null;
        this.A = null;
        this.C = new s65.m0(this);
        this.D = -1L;
        this.E = new s65.v0(this);
        this.A = com.tencent.mm.sdk.platformtools.x2.f193071a;
    }

    public static void j(s65.x0 x0Var, int i17, int i18) {
        android.app.PendingIntent activity;
        android.content.Context context = x0Var.A;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490377ta);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.boa);
        if (i17 < i18) {
            long j17 = (i17 * 100) / i18;
            if (j17 - x0Var.D < 1) {
                return;
            }
            x0Var.D = j17;
            java.lang.String str = context.getString(com.tencent.mm.R.string.f490380td) + java.lang.String.valueOf(x0Var.D) + "%";
            android.content.Intent intent = new android.content.Intent(x0Var.f403551y);
            intent.setClass(context, com.tencent.mm.sandbox.updater.AppUpdaterUI.class);
            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728));
            z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
            k0Var.m(null);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f(string);
            k0Var.e(str);
            k0Var.f469463g = activity2;
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(valueOf);
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            k0Var.j(decodeResource);
            notification.icon = com.tencent.mm.R.drawable.c7v;
            android.app.Notification b17 = k0Var.b();
            x0Var.f403552z = b17;
            b17.icon = com.tencent.mm.R.drawable.boa;
        } else {
            if (x0Var.f403547u) {
                java.lang.String b18 = x0Var.f403527a.b();
                if (!(b18 != null && new java.io.File(b18).exists())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "do noting. wait for merge apk.");
                }
            }
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490376t9);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            com.tencent.mm.sdk.platformtools.i1.f(context, intent2, new com.tencent.mm.vfs.r6(x0Var.f403527a.b()), "application/vnd.android.package-archive", false);
            intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.content.Intent intent3 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.pluginsdk.permission.PermissionActivity.class);
                intent3.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                intent3.setSelector(intent2);
                activity = android.app.PendingIntent.getActivity(context, 0, intent3, fp.g0.a(134217728));
            } else {
                activity = android.app.PendingIntent.getActivity(context, 0, intent2, fp.g0.a(134217728));
            }
            z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
            k0Var2.m(null);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.app.Notification notification2 = k0Var2.D;
            notification2.when = currentTimeMillis2;
            k0Var2.f(string);
            k0Var2.e(string2);
            k0Var2.f469463g = activity;
            android.content.res.Resources resources2 = context.getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(valueOf);
            arrayList2.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj2, decodeResource2, "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            k0Var2.j(decodeResource2);
            notification2.icon = com.tencent.mm.R.drawable.c7v;
            android.app.Notification b19 = k0Var2.b();
            x0Var.f403552z = b19;
            b19.icon = com.tencent.mm.R.drawable.boa;
            b19.flags |= 16;
        }
        if (x0Var.f403543q) {
            return;
        }
        ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, x0Var.f403552z);
    }

    @Override // s65.n0
    public void a(int i17, int i18) {
        java.util.Iterator it = this.f403528b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).a(i17, i18);
        }
    }

    @Override // s65.n0
    public void b() {
        java.util.Iterator it = this.f403528b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).b();
        }
    }

    @Override // s65.n0
    public void c(java.lang.String str) {
        java.util.Iterator it = this.f403528b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).c(str);
        }
    }

    @Override // s65.w
    public boolean d() {
        if (this.f403550x || java.lang.System.currentTimeMillis() - this.B <= com.tencent.mm.sandbox.updater.UpdaterService.f192332q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "dont stop, because of updateManager.isDownloading() %s / updateManager.getIdleTimestamp() %s / System.currentTimeMillis() - updateManager.getIdleTimestamp() %s", java.lang.Boolean.valueOf(this.f403550x), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.B));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "not busy");
        return false;
    }

    @Override // s65.w
    public boolean e(android.content.Intent intent) {
        boolean o17 = o(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "summerupdate handleCommand(Intent intent) ret need download[%b]", java.lang.Boolean.valueOf(o17));
        if (o17) {
            m(false);
        }
        return o17;
    }

    @Override // s65.n0
    public void f() {
        java.util.Iterator it = this.f403528b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).f();
        }
    }

    @Override // s65.w
    public void g(boolean z17) {
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "summerupdate setNetStatChanged isWifi %s", java.lang.Boolean.valueOf(z17));
        s65.m0 m0Var = this.C;
        if (m0Var.f403500g != z17) {
            m0Var.a(true);
            m0Var.f403500g = z17;
        }
        int i17 = this.f403544r;
        if (i17 != 2 || (z18 = this.f403550x)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "downloadMode %s downloading %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f403550x));
            return;
        }
        if (z17) {
            if (o(this.f403551y)) {
                m(true);
            }
        } else if (z18) {
            k();
        }
    }

    @Override // s65.n0
    public void h(com.tencent.mm.sandbox.monitor.l lVar) {
        java.util.Iterator it = this.f403528b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).h(lVar);
        }
    }

    @Override // s65.n0
    public void i() {
        java.util.Iterator it = this.f403528b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).i();
        }
    }

    public void k() {
        com.tencent.mm.sandbox.monitor.l lVar = this.f403527a;
        if (lVar != null) {
            this.f403550x = false;
            lVar.cancel();
            this.f403527a = null;
            this.B = java.lang.System.currentTimeMillis();
            this.C.b();
        }
    }

    public void l(int i17, boolean z17) {
        this.f403543q = z17;
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new s65.u0(this, i17), 300L);
    }

    public void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "download() isWifiRetry %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "summerupdate download() downloadMode %s downloading %s", java.lang.Integer.valueOf(this.f403544r), java.lang.Boolean.valueOf(this.f403550x));
        if (this.f403551y == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "download() haven't handleCommand");
            return;
        }
        if (this.f403550x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "download() downloading, duplicate download request");
            return;
        }
        boolean z18 = true;
        if (!fp.m.c().equals("mounted")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "no sdcard.");
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "system_config_prefs", 0);
            o4Var.getClass();
            o4Var.putLong("recomended_update_ignore", com.tencent.mm.sdk.platformtools.t8.i1() - 86400);
            l(2, true);
            i();
            return;
        }
        int i17 = this.f403544r;
        android.content.Context context = this.A;
        if (i17 == 2 && !z17) {
            s65.o0.g(context, 0, 0);
        }
        java.lang.String c17 = com.tencent.mm.sandbox.monitor.l.c(this.f403536j, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", c17);
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "update package already exist.");
            l(1, true);
            c(c17);
            if (this.f403544r == 2) {
                java.lang.String str = this.f403536j;
                java.lang.String[] b17 = s65.o0.b();
                if (b17 != null) {
                    for (java.lang.String str2 : b17) {
                        if (str2.equals(str)) {
                            break;
                        }
                    }
                }
                z18 = false;
                if (z18) {
                    return;
                }
                s65.o0.d(this.f403536j, this.f403537k, this.f403535i, this.f403538l, this.f403544r, this.f403530d, this.f403546t);
                return;
            }
            return;
        }
        if (this.f403545s) {
            com.tencent.mm.sandbox.monitor.l lVar = this.f403527a;
            if (lVar != null) {
                try {
                    java.io.File file = new java.io.File(lVar.d());
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MM.GetUpdatePack", "error in deleteTempFile");
                }
            }
            s65.o0.h(context, 11);
        }
        if (this.f403545s || !this.f403542p || this.f403540n == null || this.f403541o == null) {
            if (fp.i.c(this.f403538l)) {
                n();
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "SDCard is full");
                p();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "Incresment Update");
        s65.o0.h(context, 5);
        if (!fp.i.c(this.f403538l + this.f403541o.f428505e)) {
            p();
            return;
        }
        k();
        int i18 = this.f403541o.f428505e;
        java.lang.String str3 = this.f403536j;
        int i19 = this.f403530d;
        java.lang.String str4 = this.f403540n.f428506a + this.f403541o.f428504d;
        uk.l lVar2 = this.f403541o;
        this.f403527a = new s65.g0(i18, str3, i19, str4, lVar2.f428503c, lVar2.f428502b, this.f403544r == 2);
        r();
    }

    public final void n() {
        k();
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "downloadFullPack");
        s65.o0.h(this.A, 7);
        java.lang.String[] strArr = this.f403539m;
        if (strArr == null || strArr.length <= 0) {
            this.f403527a = new s65.z(this.f403538l, this.f403536j, this.f403530d, this.f403534h, this.f403531e, this.f403532f, this.f403533g, this.f403529c, this.f403544r == 2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 77L, 1L, true);
        } else {
            this.f403527a = new s65.g0(this.f403538l, this.f403536j, this.f403530d, this.f403539m, this.f403544r == 2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 76L, 1L, true);
        }
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e9, code lost:
    
        if (com.tencent.mm.sandbox.monitor.o.c(com.tencent.mm.sandbox.monitor.l.f192296f + r7 + ".temp") != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.x0.o(android.content.Intent):boolean");
    }

    @Override // s65.w
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "onDestroy");
        if (this.f403550x) {
            return;
        }
        q();
        l(1, true);
    }

    public final void p() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "system_config_prefs", 0);
        o4Var.getClass();
        o4Var.putLong("recomended_update_ignore", com.tencent.mm.sdk.platformtools.t8.i1() - 86400).commit();
        l(2, true);
        f();
    }

    public void q() {
        k();
        this.f403548v = 0;
        this.f403549w = null;
        this.f403529c = null;
        int i17 = o45.wf.f343023a;
        this.f403530d = 0;
        this.f403531e = null;
        this.f403532f = null;
        this.f403533g = null;
        this.f403534h = 0;
        this.f403536j = null;
        this.f403538l = 0;
        this.f403535i = null;
        this.f403539m = null;
        this.f403540n = null;
        this.f403541o = null;
        this.f403542p = false;
        this.f403543q = false;
        this.f403544r = 0;
        this.f403545s = false;
        this.f403551y = null;
        this.f403550x = false;
        this.f403552z = null;
        this.D = 0L;
    }

    public final void r() {
        boolean z17;
        if (this.f403544r == 2 && !com.tencent.mars.comm.NetStatusUtil.isWifi(this.A)) {
            s65.o0.c();
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "we stop download, when silence and not wifi!");
            return;
        }
        int i17 = this.f403544r;
        s65.m0 m0Var = this.C;
        if (i17 == 2) {
            java.lang.String str = this.f403536j;
            long j17 = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_flowstat_prefs", 4)).getLong(str, 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "getPackFlowStat pack %s, flow %s", str, java.lang.Long.valueOf(j17));
            if (j17 > s65.m0.f403493h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TrafficStatistic", "overTrafficAlertLine reach traffic alert line!");
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "the traffice is overload, not download anymore in silence mode!");
                m0Var.b();
                return;
            }
        }
        java.lang.String str2 = this.f403536j;
        int i18 = this.f403538l;
        m0Var.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (!str2.equals(m0Var.f403497d)) {
                m0Var.b();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TrafficStatistic", "pack size: " + i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE before : %s", java.lang.Long.valueOf(s65.m0.f403493h));
            long max = java.lang.Math.max((long) (i18 * 4), s65.m0.f403493h);
            s65.m0.f403493h = max;
            long min = java.lang.Math.min(314572800L, max);
            s65.m0.f403493h = min;
            com.tencent.mars.xlog.Log.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE after : %s", java.lang.Long.valueOf(min));
            if (!m0Var.f403498e) {
                android.content.Context context = m0Var.f403499f.A;
                if (context != null) {
                    m0Var.f403500g = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
                }
                m0Var.f403494a.c(30000L, 30000L);
                m0Var.f403498e = true;
                m0Var.f403497d = str2;
            }
        }
        if (this.f403527a != null) {
            l(1, false);
            this.f403550x = true;
            this.f403527a.a(this.E);
            b();
            if (this.f403544r == 2) {
                s65.o0.c();
            }
        }
    }
}
