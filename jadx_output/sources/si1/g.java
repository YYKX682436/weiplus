package si1;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f408241n;

    /* renamed from: o, reason: collision with root package name */
    public static si1.m f408242o;

    /* renamed from: p, reason: collision with root package name */
    public static final android.util.SparseIntArray f408243p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f408244q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Map f408245r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f408246s;

    /* renamed from: a, reason: collision with root package name */
    public final si1.c1 f408247a;

    /* renamed from: b, reason: collision with root package name */
    public final int f408248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f408249c;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle f408252f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashMap f408254h;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashMap f408256j;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f408258l;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f408250d = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f408257k = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final bm5.x0 f408259m = new bm5.x0(new si1.g$$a());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f408251e = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f408253g = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f408255i = new byte[0];

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f408243p = sparseIntArray;
        sparseIntArray.put(817, 567);
        sparseIntArray.put(819, 539);
        f408244q = new java.util.concurrent.ConcurrentHashMap();
        f408245r = new java.util.concurrent.ConcurrentHashMap();
        f408246s = new java.lang.String[]{yc1.q.NAME, "createDownloadTask", ad1.e.NAME, bd1.d.NAME, bd1.e.NAME, ad1.f.NAME, bd1.e.NAME};
    }

    public g(si1.c1 c1Var, int i17, boolean z17) {
        this.f408256j = new java.util.HashMap();
        this.f408247a = c1Var;
        this.f408248b = i17;
        this.f408249c = z17;
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle e17 = c1Var.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "<init> get NULL permission from runtime");
        }
        m(e17);
        si1.n f17 = c1Var.f();
        java.util.HashMap hashMap = f17 == null ? null : f17.f408276d;
        this.f408254h = hashMap;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "<init> mPluginPermission size:%d", objArr);
        java.util.HashMap hashMap2 = this.f408254h;
        if (hashMap2 == null || hashMap2.size() <= 0) {
            this.f408258l = false;
        } else {
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b17 = c1Var.b();
            java.util.Objects.requireNonNull(b17);
            this.f408258l = java.lang.Boolean.parseBoolean(b17.qe("supportInvokeWithAppId"));
        }
        ti1.b a17 = c1Var.a();
        if (a17 != null) {
            java.util.HashMap hashMap3 = a17.f419539d;
            this.f408256j = hashMap3;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "mAppidPermission size:%d", objArr2);
        }
    }

    public static java.lang.String e(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.h) {
            return ((com.tencent.mm.plugin.appbrand.jsapi.h) obj).k();
        }
        if (obj instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) obj;
            if (com.tencent.mm.plugin.appbrand.jsapi.h.class.isAssignableFrom(cls)) {
                java.util.Map map = f408245r;
                java.lang.String str = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    return str;
                }
                try {
                    java.lang.String str2 = (java.lang.String) new d56.b(cls, cls).f("NAME");
                    ((java.util.concurrent.ConcurrentHashMap) map).put(cls, str2);
                    return str2;
                } catch (d56.c e17) {
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getApiNameByClass class:%s, reflect failed %s", cls.getName(), e17);
                    return cls.getSimpleName();
                }
            }
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "Unrecognized api type:".concat(obj.getClass().getName()));
        return obj.toString();
    }

    public static int h(java.lang.Object obj) {
        java.lang.String e17 = e(obj);
        if (android.text.TextUtils.isEmpty(e17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlIndex invalid apiNAme, api:%s", obj.toString());
            return 6;
        }
        java.util.Map map = f408244q;
        java.lang.Integer num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) map).get(e17);
        if (num != null) {
            return num.intValue();
        }
        int i17 = -1;
        try {
            if (obj instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) obj;
                i17 = ((java.lang.Integer) new d56.b(cls, cls).f("CTRL_INDEX")).intValue();
            } else {
                i17 = ((java.lang.Integer) d56.b.h(obj).f("CTRL_INDEX")).intValue();
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(e17, java.lang.Integer.valueOf(i17));
        } catch (d56.c e18) {
            java.lang.String name = obj instanceof java.lang.Class ? ((java.lang.Class) obj).getName() : obj.toString();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlIndex class:%s, reflect failed %s", name, e18);
        }
        return i17;
    }

    public boolean a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.Class cls) {
        int d17 = d(lVar, cls, null, null, h(cls), false);
        if (d17 == 1) {
            return true;
        }
        if (d17 != 6) {
            return d17 != 7 ? d17 == 8 : this.f408247a.g();
        }
        ((si1.p0) this.f408259m.b()).F6(lVar, e(cls));
        return false;
    }

    public si1.j b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.h hVar, java.lang.String str, java.lang.String str2, int i17, si1.k kVar) {
        boolean z17;
        if (hVar == null || lVar == null) {
            return si1.j.f408268f;
        }
        u81.b c17 = this.f408247a.c();
        int d17 = d(lVar, hVar, str, str2, h(hVar), true);
        java.lang.String appId = lVar.getAppId();
        if (kVar != null) {
            kVar.b(d17);
        }
        if (d17 == 6) {
            ((si1.p0) this.f408259m.b()).F6(lVar, hVar.k());
            return si1.j.f408268f;
        }
        if (d17 == 1) {
            return ((lVar instanceof com.tencent.mm.plugin.appbrand.e9) && c17 == u81.b.SUSPEND && yo.a.b(f408246s, hVar.k())) ? new si1.j(-1, java.lang.String.format(java.util.Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", hVar.k(), c17.name().toLowerCase(), "permission ok", "network api interrupted in suspend state"), jc1.f.f298923l) : si1.j.f408269g;
        }
        if (d17 != 4) {
            if (d17 == 7) {
                return this.f408247a.g() ? si1.j.f408269g : new si1.j(-1, java.lang.String.format(java.util.Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", hVar.k(), c17.name().toLowerCase(), "permission ok", "jsapi permission required playing audio but current not playing audio in background state"), jc1.f.f298923l);
            }
            if (d17 != 8) {
                return si1.j.f408268f;
            }
            if (kVar != null) {
                synchronized (this.f408250d) {
                    this.f408250d.addLast(kVar);
                }
            }
            return si1.j.f408267e;
        }
        java.lang.String k17 = hVar.k();
        boolean z18 = false;
        java.util.Set c18 = ui1.t.f428082d.c(appId, false);
        if (c18 != null) {
            synchronized (c18) {
                z17 = c18.contains(k17);
            }
        } else {
            z17 = false;
        }
        if (z17) {
            return si1.j.f408269g;
        }
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (hVar.k().equals(qf1.j.NAME)) {
            k91.z0 E0 = d0Var.t3().E0();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "getWifiList jump userauth:%b", java.lang.Boolean.valueOf(!E0.f305849o));
            z18 = !E0.f305849o;
        }
        if (z18) {
            return si1.j.f408269g;
        }
        ui1.t.c(new ui1.a0((com.tencent.mm.plugin.appbrand.y) lVar, hVar.k(), str, str2, i17), new si1.i(this, kVar));
        return si1.j.f408267e;
    }

    public int c(byte[] bArr, int i17) {
        int i18 = this.f408248b;
        if (i18 == -1) {
            return 1;
        }
        if (i18 == -2) {
            return 0;
        }
        if (i17 == -2) {
            return 1;
        }
        if (i17 == -1) {
            return this.f408249c ? 1 : 0;
        }
        if (i17 >= bArr.length || i17 < 0) {
            return 0;
        }
        return bArr[i17];
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
    
        r0 = r18.getAppId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.tencent.mm.plugin.appbrand.jsapi.l r18, java.lang.Object r19, java.lang.String r20, java.lang.String r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si1.g.d(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.Object, java.lang.String, java.lang.String, int, boolean):int");
    }

    public final com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle f(java.lang.String str, int i17, int i18) {
        synchronized (this.f408255i) {
            java.util.HashMap hashMap = this.f408256j;
            if (hashMap == null) {
                return null;
            }
            return (com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle) hashMap.get(str + (i17 == 1 ? "_weApp" : i17 == 2 ? "_plugin" : "") + i18);
        }
    }

    public final byte[] g(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, u81.b[] bVarArr) {
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        int i17 = this.f408248b;
        if (i17 == -1) {
            return new byte[]{1};
        }
        if (i17 == -2) {
            return new byte[]{0};
        }
        if (android.text.TextUtils.isEmpty(str) || u46.l.c(lVar.getAppId(), str)) {
            synchronized (this.f408251e) {
                appRuntimeApiPermissionBundle = this.f408252f;
            }
        } else {
            synchronized (this.f408253g) {
                appRuntimeApiPermissionBundle = (com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle) this.f408254h.get(str);
            }
        }
        if (appRuntimeApiPermissionBundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlBytes(appId:%s, invokeAppId:%s) get NULL bundle", lVar.getAppId(), str);
            return new byte[]{0};
        }
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.e9)) {
            return appRuntimeApiPermissionBundle.f87393d;
        }
        u81.b c17 = this.f408247a.c();
        int ordinal = c17.ordinal();
        byte[] bArr = (ordinal == 1 || ordinal == 2 || ordinal == 3) ? appRuntimeApiPermissionBundle.f87394e : appRuntimeApiPermissionBundle.f87393d;
        if (bVarArr == null || bVarArr.length < 1) {
            return bArr;
        }
        bVarArr[0] = c17;
        return bArr;
    }

    public final void i() {
        if (this.f408254h == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "notifyNodeOnPluginUpdate");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f408257k;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            si1.l lVar = (si1.l) ((java.util.ArrayList) list).get(i17);
            java.util.HashMap hashMap = this.f408254h;
            com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = ((com.tencent.luggage.sdk.jsapi.component.service.m2) lVar).f47481a;
            com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var.f47502a;
            if (jsBridge == null) {
                kotlin.jvm.internal.o.o("jsBridge");
                throw null;
            }
            jsBridge.onPluginPermissionUpdate(n2Var.b(hashMap));
            i17++;
        }
    }

    public final void j(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle) {
        byte[] foreground = appRuntimeApiPermissionBundle.f87393d;
        int i17 = 0;
        while (true) {
            java.util.List list = this.f408257k;
            if (i17 >= list.size()) {
                return;
            }
            com.tencent.luggage.sdk.jsapi.component.service.m2 m2Var = (com.tencent.luggage.sdk.jsapi.component.service.m2) ((si1.l) list.get(i17));
            m2Var.getClass();
            kotlin.jvm.internal.o.g(foreground, "foreground");
            byte[] background = appRuntimeApiPermissionBundle.f87394e;
            kotlin.jvm.internal.o.g(background, "background");
            byte[] suspend = appRuntimeApiPermissionBundle.f87395f;
            kotlin.jvm.internal.o.g(suspend, "suspend");
            com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = m2Var.f47481a;
            vp5.f fVar = new vp5.f(n2Var.a(foreground), n2Var.a(background), n2Var.a(suspend));
            com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var.f47502a;
            if (jsBridge == null) {
                kotlin.jvm.internal.o.o("jsBridge");
                throw null;
            }
            jsBridge.onPermissionUpdate(fVar);
            i17++;
        }
    }

    public final void k() {
        if (this.f408254h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib mPluginPermission null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f408254h.keySet()) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle = (com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle) this.f408254h.get(str);
            if (appRuntimeApiPermissionBundle != null) {
                hashMap2.put("fg", appRuntimeApiPermissionBundle.f87393d);
                hashMap2.put("bg", appRuntimeApiPermissionBundle.f87394e);
                hashMap2.put("sp", appRuntimeApiPermissionBundle.f87395f);
                hashMap.put(str, hashMap2);
            }
        }
        nf.f.c(hashMap);
        this.f408247a.d("onPluginPermissionUpdate", new org.json.JSONObject(hashMap));
    }

    public void l(java.util.HashMap hashMap) {
        synchronized (this.f408255i) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updateAppidABTestPermission size:%d", objArr);
            this.f408256j = hashMap;
        }
    }

    public void m(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle) {
        if (appRuntimeApiPermissionBundle == null) {
            return;
        }
        synchronized (this.f408251e) {
            com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle2 = this.f408252f;
            if (appRuntimeApiPermissionBundle2 != null && appRuntimeApiPermissionBundle2.f87393d.length > appRuntimeApiPermissionBundle.f87393d.length) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission, old %s, new %s, ignore", appRuntimeApiPermissionBundle2, appRuntimeApiPermissionBundle);
                return;
            }
            this.f408252f = appRuntimeApiPermissionBundle;
            j(appRuntimeApiPermissionBundle);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission old %s, updated %s", appRuntimeApiPermissionBundle2, appRuntimeApiPermissionBundle);
        }
    }

    public void n(java.util.HashMap hashMap) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(hashMap == null ? -1 : hashMap.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePluginPermission size:%d", objArr);
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        synchronized (this.f408253g) {
            if (this.f408254h == null) {
                this.f408254h = new java.util.HashMap();
            }
            this.f408254h.putAll(hashMap);
            k();
            i();
        }
    }
}
