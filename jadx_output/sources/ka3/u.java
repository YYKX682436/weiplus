package ka3;

/* loaded from: classes15.dex */
public final class u {

    /* renamed from: r, reason: collision with root package name */
    public static final ka3.m f306087r;

    /* renamed from: s, reason: collision with root package name */
    public static ka3.u f306088s;

    /* renamed from: e, reason: collision with root package name */
    public ka3.i f306093e;

    /* renamed from: f, reason: collision with root package name */
    public dd1.a f306094f;

    /* renamed from: i, reason: collision with root package name */
    public ka3.f f306097i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f306098j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f306099k;

    /* renamed from: m, reason: collision with root package name */
    public final dd1.b f306101m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f306102n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONObject f306103o;

    /* renamed from: p, reason: collision with root package name */
    public final q80.g0 f306104p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f306105q;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f306089a = "";

    /* renamed from: b, reason: collision with root package name */
    public ka3.w f306090b = ka3.w.f306107f;

    /* renamed from: c, reason: collision with root package name */
    public ka3.w f306091c = ka3.w.f306109h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306092d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306095g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f306096h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f306100l = "";

    static {
        ka3.m mVar = new ka3.m(null);
        f306087r = mVar;
        try {
            mVar.a().h(new org.json.JSONObject(), false, null);
            com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "init in companion invoke registerProxyService");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppNFCServiceMgr", "init failed", e17);
        }
    }

    public u() {
        ka3.c cVar = ka3.d.f306055b;
        ka3.d dVar = ka3.d.f306056c;
        if (dVar == null) {
            synchronized (cVar) {
                dVar = ka3.d.f306056c;
                if (dVar == null) {
                    dVar = new ka3.d(null);
                    ka3.d.f306056c = dVar;
                }
            }
        }
        this.f306101m = dVar.f306057a;
        this.f306103o = new org.json.JSONObject();
        this.f306104p = (q80.g0) i95.n0.c(q80.g0.class);
    }

    public static final void a(ka3.u uVar) {
        uVar.f306097i = null;
        uVar.f306092d = "";
        uVar.f306089a = "";
        uVar.f306095g = "";
        uVar.f306096h = "";
        uVar.f306100l = "";
        uVar.f306098j = false;
        uVar.f306099k = false;
        uVar.f306102n = false;
        uVar.f306103o = new org.json.JSONObject();
        com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "reset cache finish");
    }

    public final boolean b() {
        if (!kotlin.jvm.internal.o.b(this.f306095g, "") && !kotlin.jvm.internal.o.b(this.f306096h, "")) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("LiteAppNFCServiceMgr", "checkAndlaunchLiteApp failed, appId or storeActionName is empty, appId=" + this.f306095g + ", storeActionName=" + this.f306096h);
        return false;
    }

    public final void c(org.json.JSONObject jSONObject) {
        try {
            com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "dispatchStoreCommand");
            ((com.tencent.mm.feature.lite.i) this.f306104p).rj(this.f306095g, this.f306096h, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppNFCServiceMgr", "dispatchStore=%s", e17.toString());
        }
    }

    public final void d() {
        if (kotlin.jvm.internal.o.b(this.f306095g, "") || kotlin.jvm.internal.o.b(this.f306096h, "")) {
            ka3.f fVar = this.f306097i;
            if (fVar == null) {
                com.tencent.mars.xlog.Log.e("LiteAppNFCServiceMgr", "ensureNfcRegistionKvInfo failed registerData is null");
                return;
            }
            kotlin.jvm.internal.o.d(fVar);
            java.lang.String str = fVar.f306063f;
            kotlin.jvm.internal.o.f(str, "<get-appId>(...)");
            this.f306095g = str;
            ka3.f fVar2 = this.f306097i;
            kotlin.jvm.internal.o.d(fVar2);
            java.lang.String str2 = fVar2.f306060c;
            kotlin.jvm.internal.o.f(str2, "<get-storeActionName>(...)");
            this.f306096h = str2;
            ka3.f fVar3 = this.f306097i;
            kotlin.jvm.internal.o.d(fVar3);
            java.lang.String str3 = fVar3.f306064g;
            kotlin.jvm.internal.o.f(str3, "<get-payHomePage>(...)");
            this.f306100l = str3;
            com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "registerData appId=" + this.f306095g + ", storeActionName=" + this.f306096h + ", payHomePage=" + this.f306100l);
        }
    }

    public final android.content.Context e() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 != null) {
            return (android.app.Activity) k17.get();
        }
        return null;
    }

    public final void f(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        this.f306105q = true;
        if (this.f306103o.length() == 0) {
            com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "firstMessageMap is empty, ignored");
            return;
        }
        c(this.f306103o);
        this.f306103o = new org.json.JSONObject();
        com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "onStoreReady finish");
    }

    public final void g(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        dd1.b bVar = this.f306101m;
        android.content.Context e17 = e();
        ka3.q qVar = new ka3.q();
        ((dd1.c) bVar).getClass();
        if (ed1.f.f251242d == null) {
            ed1.f.f251242d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f251242d;
        if (fVar != null) {
            org.json.JSONArray jSONArray = option.getJSONArray("aidList");
            kotlin.jvm.internal.o.d(e17);
            java.util.List a17 = fVar.a(e17, qVar);
            java.util.Set linkedHashSet = new java.util.LinkedHashSet();
            kotlin.jvm.internal.o.d(jSONArray);
            c75.c.d(jSONArray, new ed1.e(linkedHashSet));
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add((java.lang.String) it.next());
            }
            linkedHashSet.removeAll(linkedHashSet2);
            if (linkedHashSet.isEmpty()) {
                qVar.b(fVar.d("need to register is empty"));
                return;
            }
            linkedHashSet.addAll(linkedHashSet2);
            if (linkedHashSet.isEmpty()) {
                qVar.b(fVar.d("mergedAid to register is empty"));
            } else {
                fVar.g(e17, linkedHashSet, qVar);
            }
        }
    }

    public final void h(org.json.JSONObject option, boolean z17, ka3.i iVar) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "registerProxyService nfcModuleCallback=" + this.f306093e + ", proxyServiceCallback=" + this.f306094f);
        if (iVar != null) {
            this.f306093e = iVar;
        }
        if (this.f306094f == null) {
            this.f306094f = new ka3.r(this);
        }
        dd1.b bVar = this.f306101m;
        android.content.Context e17 = e();
        dd1.a aVar = this.f306094f;
        kotlin.jvm.internal.o.d(aVar);
        ((dd1.c) bVar).getClass();
        com.tencent.mars.xlog.Log.i("NFCHceProxyService", "registerHCE data=%s", option.toString());
        ed1.f.f251241c = aVar;
        if (z17) {
            ed1.h hVar = new ed1.h();
            option.put("liteAppId", "liteAppId");
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("HceRegisterService", "context is null, retry with a delay");
                ((ka3.r) aVar).b(hVar.c(13009, "context is null, retry with a delay"));
            } else {
                hVar.f251246c = e17;
                hVar.f251247d = aVar;
                hVar.f251248e = option;
                hVar.f251249a = new ed1.g(hVar);
                new com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.api.ext.HceServiceBase$CheckIsSupportHCETask(hVar, false).d();
            }
        }
    }

    public final void i(org.json.JSONObject option, bd.e moduleCallback) {
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(moduleCallback, "moduleCallback");
        dd1.b bVar = this.f306101m;
        android.content.Context e17 = e();
        kotlin.jvm.internal.o.d(e17);
        ka3.s sVar = new ka3.s(moduleCallback);
        ((dd1.c) bVar).getClass();
        java.lang.String optString = option.optString("permission", "");
        ed1.o oVar = new ed1.o();
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1018707417) {
                if (hashCode != 108971) {
                    if (hashCode == 633465929 && optString.equals("paymentSettings")) {
                        android.content.Intent intent = new android.content.Intent("android.settings.NFC_PAYMENT_SETTINGS");
                        if (intent.resolveActivity(e17.getPackageManager()) != null) {
                            nf.g.a(e17).j(intent, ed1.n.f251251a);
                            sVar.b(ed1.k.e(oVar, null, 1, null));
                            return;
                        } else {
                            com.tencent.mars.xlog.Log.e("HceStateService", "cannot resolveActivity with intent");
                            sVar.b(oVar.c(14000, "cannot resolveActivity with intent"));
                            return;
                        }
                    }
                } else if (optString.equals("nfc")) {
                    android.content.Intent intent2 = new android.content.Intent("android.settings.NFC_SETTINGS");
                    android.content.pm.PackageManager packageManager = e17.getPackageManager();
                    kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
                    java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
                    kotlin.jvm.internal.o.f(queryIntentActivities, "queryIntentActivities(...)");
                    int i17 = 0;
                    if (queryIntentActivities.size() > 0) {
                        com.tencent.mars.xlog.Log.i("HceStateService", "NFC activity not null, activities size: " + queryIntentActivities.size());
                        int size = queryIntentActivities.size();
                        while (i17 < size) {
                            android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(i17);
                            kotlin.jvm.internal.o.e(resolveInfo, "null cannot be cast to non-null type android.content.pm.ResolveInfo");
                            com.tencent.mars.xlog.Log.i("HceStateService", "NFC activity: %s", resolveInfo.activityInfo.name);
                            i17++;
                        }
                        i17 = 1;
                    } else {
                        com.tencent.mars.xlog.Log.e("HceStateService", "Cannot jump to NFC setting");
                    }
                    if (i17 == 0) {
                        sVar.b(oVar.b("cannot jump nfc setting"));
                        return;
                    }
                    nf.g.a(e17).j(new android.content.Intent("android.settings.NFC_SETTINGS"), new ed1.l(oVar));
                    sVar.b(ed1.k.e(oVar, null, 1, null));
                    return;
                }
            } else if (optString.equals("defaultWalletApp")) {
                android.content.Intent intent3 = new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
                intent3.putExtra("category", "payment");
                intent3.putExtra("component", new android.content.ComponentName(e17, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class));
                if (intent3.resolveActivity(e17.getPackageManager()) != null) {
                    nf.g.a(e17).j(intent3, ed1.m.f251250a);
                    sVar.b(ed1.k.e(oVar, null, 1, null));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("HceStateService", "cannot resolveActivity with intent");
                    sVar.b(oVar.c(14000, "cannot resolveActivity with intent"));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("NFCHceProxyService", "unsupport request permission type, action=" + optString);
        sVar.b(oVar.b("unsupport request permission type"));
    }

    public final void j(org.json.JSONObject option, ka3.i moduleCallback) {
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(moduleCallback, "moduleCallback");
        dd1.b bVar = this.f306101m;
        android.content.Context e17 = e();
        kotlin.jvm.internal.o.d(e17);
        ka3.t tVar = new ka3.t(this, moduleCallback);
        ((dd1.c) bVar).getClass();
        if (ed1.f.f251242d == null) {
            ed1.f.f251242d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f251242d;
        if (fVar != null) {
            fVar.f251249a = new ed1.d(option, fVar, e17, tVar);
            new com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.api.ext.HceServiceBase$CheckIsSupportHCETask(fVar, false).d();
        }
    }
}
