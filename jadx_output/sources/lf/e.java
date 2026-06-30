package lf;

/* loaded from: classes13.dex */
public abstract class e implements lk1.c {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.map.geolocation.sapp.TencentLocationManager f318178d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.map.geolocation.sapp.TencentLocation f318179e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f318180f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.map.geolocation.sapp.TencentLocation f318181g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f318182h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f318183i = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f318184m = "";

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f318185n = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f318186o = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f318187p = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f318188q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.map.geolocation.sapp.TencentLocationListener f318189r = new lf.c(this);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f318190s = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f318191t = new lf.d(this);

    public e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultTencentLocationManager", "DefaultTencentLocationManager() construct in process %s", bm5.f1.a());
    }

    public static void a(lf.e eVar, java.util.List list, int i17, java.lang.String str, lk1.a aVar) {
        eVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            lk1.b bVar = (lk1.b) it.next();
            if (bVar != null) {
                bVar.j(i17, str, aVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    @Override // lk1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Pg(java.lang.String r20, lk1.b r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e.Pg(java.lang.String, lk1.b, android.os.Bundle):void");
    }

    public lk1.a b(java.lang.String str, int i17) {
        boolean equals = "wgs84".equals(str);
        if (this.f318179e == null || java.lang.System.currentTimeMillis() - this.f318180f >= i17) {
            return null;
        }
        return d(this.f318179e, equals);
    }

    public com.tencent.map.geolocation.sapp.TencentLocationManager c() {
        if (this.f318178d == null) {
            synchronized (this) {
                if (this.f318178d == null) {
                    if (com.tencent.mm.plugin.appbrand.jsapi.lbs.l1.f81457u != null) {
                        com.tencent.mm.plugin.appbrand.jsapi.lbs.l1.f81457u.booleanValue();
                    } else {
                        com.tencent.mm.plugin.appbrand.jsapi.lbs.l1.f81457u = java.lang.Boolean.FALSE;
                        com.tencent.mm.plugin.appbrand.jsapi.lbs.l1.f81457u.booleanValue();
                    }
                    if (com.tencent.mm.plugin.appbrand.jsapi.lbs.l1.f81457u.booleanValue()) {
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(com.tencent.mm.vfs.w6.i(lp0.b.D() + "/lbs" + bm5.f1.a().substring(com.tencent.mm.sdk.platformtools.x2.f193072b.length() + 1), true));
                        java.lang.String str = a17.f213279f;
                        if (str != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                            if (!a17.f213279f.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        try {
                            com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.setTencentLog(com.tencent.mm.sdk.platformtools.x2.f193071a, new java.io.File(com.tencent.mm.vfs.w6.i(a17.toString(), true)));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.DefaultTencentLocationManager", "", e17);
                        }
                    }
                    com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.setContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    try {
                        com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.setTencentLogCallback(new lf.a(this));
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.DefaultTencentLocationManager", "", e18);
                    }
                    if (android.text.TextUtils.isEmpty("")) {
                        this.f318178d = com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    } else {
                        this.f318178d = com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.util.Pair(com.tencent.map.geolocation.sapp.TencentLocationManager.TYPE_OAID, ""));
                    }
                    this.f318178d.setCoordinateType(0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.DefaultTencentLocationManager", "%s Location Sdk Version %s", "", this.f318178d.getVersion());
                }
            }
        }
        return this.f318178d;
    }

    public final lk1.a d(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, boolean z17) {
        lk1.a aVar = new lk1.a();
        if (z17) {
            aVar.f318996a = tencentLocation.getLatitude();
            aVar.f318997b = tencentLocation.getLongitude();
            aVar.f319007l = "wgs84";
        } else {
            double[] dArr = new double[2];
            com.tencent.map.geolocation.sapp.TencentLocationUtils.wgs84ToGcj02(new double[]{tencentLocation.getLatitude(), tencentLocation.getLongitude()}, dArr);
            aVar.f318996a = dArr[0];
            aVar.f318997b = dArr[1];
            aVar.f319007l = "gcj02";
        }
        aVar.f318998c = "gps".equals(tencentLocation.getProvider()) ? "gps" : "network";
        aVar.f318999d = tencentLocation.getSpeed();
        aVar.f319000e = tencentLocation.getAccuracy();
        aVar.f319001f = tencentLocation.getAltitude();
        aVar.f319004i = tencentLocation.getIndoorLocationType();
        aVar.f319005j = tencentLocation.getBearing();
        if (tencentLocation.getExtra() != null) {
            aVar.f319006k = tencentLocation.getExtra().getDouble("steps");
        }
        tencentLocation.getIndoorBuildingId();
        tencentLocation.getIndoorBuildingFloor();
        if (com.tencent.mm.sdk.platformtools.t8.K0(tencentLocation.getIndoorBuildingId())) {
            aVar.f319002g = "";
            aVar.f319003h = "";
        } else {
            aVar.f319002g = tencentLocation.getIndoorBuildingId();
            aVar.f319003h = tencentLocation.getIndoorBuildingFloor();
        }
        return aVar;
    }

    public final void e() {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f318186o).size() > 0 || ((java.util.concurrent.CopyOnWriteArrayList) this.f318185n).size() > 0 || ((java.util.concurrent.CopyOnWriteArrayList) this.f318187p).size() > 0 || ((java.util.concurrent.CopyOnWriteArrayList) this.f318188q).size() > 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultTencentLocationManager", "releaseLocationManager");
        c().removeUpdates(null);
    }

    @Override // lk1.c
    public synchronized boolean ia(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultTencentLocationManager", "[unregisterLocation]type:%s", str);
        if ("wgs84".equals(str)) {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f318187p).remove(bVar);
        } else {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f318188q).remove(bVar);
        }
        if (bundle != null) {
            ((java.util.HashSet) this.f318190s).remove(bundle.getString("smallAppKey"));
        }
        e();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[Catch: all -> 0x0133, LOOP:1: B:51:0x00e8->B:53:0x00ee, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:6:0x001d, B:8:0x0023, B:11:0x002b, B:14:0x0031, B:22:0x003a, B:24:0x0070, B:27:0x007d, B:30:0x0087, B:33:0x0092, B:36:0x00a8, B:38:0x00b4, B:47:0x00ca, B:50:0x00d8, B:51:0x00e8, B:53:0x00ee, B:55:0x00f8, B:57:0x0108, B:58:0x0111, B:64:0x0042, B:65:0x004a, B:67:0x0050, B:70:0x0058, B:73:0x005e, B:80:0x0067), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108 A[Catch: all -> 0x0133, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:6:0x001d, B:8:0x0023, B:11:0x002b, B:14:0x0031, B:22:0x003a, B:24:0x0070, B:27:0x007d, B:30:0x0087, B:33:0x0092, B:36:0x00a8, B:38:0x00b4, B:47:0x00ca, B:50:0x00d8, B:51:0x00e8, B:53:0x00ee, B:55:0x00f8, B:57:0x0108, B:58:0x0111, B:64:0x0042, B:65:0x004a, B:67:0x0050, B:70:0x0058, B:73:0x005e, B:80:0x0067), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    @Override // lk1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean w9(java.lang.String r5, lk1.b r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e.w9(java.lang.String, lk1.b, android.os.Bundle):boolean");
    }
}
