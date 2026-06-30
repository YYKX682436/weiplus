package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class g1 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f143945q = {"wxalite7b438b4916cd2a37426d5538ac2d3807", "wxalite4868fef42257e6693a564693bd119376", "wxalited4df4810a40b1d9ddc0cbea44d263fd9"};

    /* renamed from: r, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.lite.logic.g1 f143946r;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.api.h f143949c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f143947a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f143948b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f143950d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f143951e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f143952f = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f143953g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f143954h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f143955i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f143956j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f143957k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f143958l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f143959m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f143960n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f143961o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f143962p = new java.util.HashMap();

    public static r45.kk0 D(java.util.LinkedList linkedList, oq1.q qVar, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        java.util.Iterator it = linkedList.iterator();
        r45.hs5 hs5Var = null;
        while (it.hasNext()) {
            r45.hs5 hs5Var2 = (r45.hs5) it.next();
            if (hs5Var2.f376429d != 0 && (hs5Var == null || hs5Var2.f376430e < hs5Var.f376430e)) {
                hs5Var = hs5Var2;
            }
        }
        if (hs5Var == null) {
            return null;
        }
        qVar.f347349d = hs5Var.f376433h;
        qVar.f347350e = hs5Var.f376432g;
        qVar.f347353h = hs5Var.f376431f;
        int i17 = hs5Var.f376429d;
        qVar.f347363r = i17;
        if (liteAppReporter != null) {
            liteAppReporter.logDownload(com.tencent.liteapp.gen.DownloadAction.LITE_APP_PACKAGE_USE_COMPRESS_ALGORITHM, i17);
        }
        return hs5Var.f376435m;
    }

    public static void a(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.plugin.lite.logic.k2 k2Var;
        com.tencent.mm.plugin.lite.logic.h2 h2Var;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo2 = wxaLiteAppInfo;
        g1Var.getClass();
        if (i17 != 0 || wxaLiteAppInfo2 == null) {
            com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent = new com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent();
            am.ti tiVar = liteAppPackageUpdateEvent.f54470g;
            tiVar.f8013a = false;
            tiVar.f8014b = str;
            liteAppPackageUpdateEvent.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onUpdateFinishCallback, notifyLiteAppPkgUpdate appId: %s, pkgPath: %s", str, wxaLiteAppInfo2.path);
            com.tencent.mm.plugin.lite.LiteAppCenter.notifyLiteAppPkgUpdate(str, wxaLiteAppInfo2.path);
            com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent2 = new com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent();
            am.ti tiVar2 = liteAppPackageUpdateEvent2.f54470g;
            tiVar2.f8013a = true;
            tiVar2.f8014b = str;
            tiVar2.f8015c = wxaLiteAppInfo2.path;
            tiVar2.f8016d = wxaLiteAppInfo2.version;
            liteAppPackageUpdateEvent2.e();
        }
        if (i17 == 0 || i17 == 1) {
            wxaLiteAppInfo2.updateTime = java.lang.System.currentTimeMillis() / 1000;
            s().V(wxaLiteAppInfo2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) g1Var.f143961o;
        for (java.util.ArrayList arrayList2 : concurrentHashMap.keySet()) {
            if (arrayList2.contains(str) && (h2Var = (com.tencent.mm.plugin.lite.logic.h2) concurrentHashMap.get(arrayList2)) != null) {
                h2Var.f143975a.remove(str);
                if (h2Var.f143975a.isEmpty()) {
                    ((com.tencent.mm.plugin.lite.k0) h2Var.f143976b).a(arrayList2);
                    arrayList.add(arrayList2);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((java.util.ArrayList) it.next());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) g1Var.f143951e;
        com.tencent.mm.plugin.lite.logic.k2 k2Var2 = (com.tencent.mm.plugin.lite.logic.k2) concurrentHashMap2.get(str);
        concurrentHashMap2.remove(str);
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f143953g).remove(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onUpdateFinishCallback, appId: %s, checkItem: %s", str, k2Var2);
        if (k2Var2 == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - k2Var2.f143997b;
        if (j17 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT || j17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception fail errCode=%d start=%d now=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k2Var2.f143997b), java.lang.Long.valueOf(currentTimeMillis));
        }
        long j18 = k2Var2.f143997b;
        long j19 = currentTimeMillis - j18;
        long j27 = k2Var2.f144000e;
        long j28 = j27 - j18;
        long j29 = k2Var2.f144001f;
        g1Var.O(i17, str, j19, j28, j29 - j27, currentTimeMillis - j29, k2Var2.f143999d);
        if (k2Var2.f143998c == null || currentTimeMillis - k2Var2.f143996a > k2Var2.f144003h) {
            return;
        }
        if (k2Var2.f144002g && wxaLiteAppInfo2 == null) {
            wxaLiteAppInfo2 = g1Var.y(str, null);
        }
        if (wxaLiteAppInfo2 == null) {
            k2Var = k2Var2;
            k2Var2.f143998c.fail(str, i17);
        } else {
            k2Var = k2Var2;
            k2Var.f143998c.success(wxaLiteAppInfo2, i17);
        }
        k2Var.f143998c = null;
    }

    public static void b(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        g1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onBatchCheckReport start, appIds: %s, updateAppIds: %s, noUpdateAppIds: %s, errorAppIds: %s", list.toString(), list2.toString(), list3.toString(), list4.toString());
        if (liteAppReporter == null) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb6.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("appIds", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it6 = list2.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb7.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                } else {
                    sb7.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("updateAppIds", sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it7 = list3.iterator();
        if (it7.hasNext()) {
            while (true) {
                sb8.append((java.lang.CharSequence) it7.next());
                if (!it7.hasNext()) {
                    break;
                } else {
                    sb8.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("noUpdateAppIds", sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        java.util.Iterator it8 = list4.iterator();
        if (it8.hasNext()) {
            while (true) {
                sb9.append((java.lang.CharSequence) it8.next());
                if (!it8.hasNext()) {
                    break;
                } else {
                    sb9.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("errorAppIds", sb9.toString());
        if (list4.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp batch checkUpdate success but not all appids got updates, errorAppIds: %s", list4.toString());
            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE_FAILED, str, hashMap);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp batch checkUpdate success and got updates, updateAppIds: %s, noUpdateAppIds: %s", list2.toString(), list3.toString());
            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE_SUCCESS, str, hashMap);
        }
    }

    public static void c(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, r45.xr5 xr5Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        java.util.LinkedList linkedList;
        g1Var.getClass();
        if (xr5Var == null || (linkedList = xr5Var.f390361d) == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success but got no update, appId: %s", str);
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_NO_NEED, "PayDevops");
            }
            com.tencent.mm.plugin.lite.api.h hVar = g1Var.f143949c;
            if (hVar == null || wxaLiteAppInfo == null) {
                return;
            }
            ((com.tencent.mm.plugin.lite.logic.d2) hVar).success(wxaLiteAppInfo, 1);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success and got update, appId: %s, resourceList size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_SUCCESS, "PayDevops");
        }
        com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).get(str);
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vy4 vy4Var = (r45.vy4) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success, got update, appId: %s, resourceName: %s, version: %d, size: %d, md5: %s, url: %s, createTime: %d", str, vy4Var.f388664e, java.lang.Integer.valueOf(vy4Var.f388665f), java.lang.Integer.valueOf(vy4Var.f388666g), vy4Var.f388667h, vy4Var.f388668i, java.lang.Integer.valueOf(vy4Var.f388669m));
            oq1.q qVar = new oq1.q();
            qVar.f347346a = str;
            qVar.f347359n = vy4Var.f388664e;
            qVar.f347360o = vy4Var.f388665f;
            qVar.f347353h = vy4Var.f388666g;
            qVar.f347350e = vy4Var.f388667h;
            qVar.f347349d = vy4Var.f388668i;
            qVar.f347351f = "";
            qVar.f347352g = "";
            qVar.f347365t = 2;
            qVar.f347366u = false;
            qVar.f347367v = false;
            if (k2Var != null) {
                qVar.f347361p = k2Var.f143999d;
            }
            if (j62.e.g().l("clicfg_enable_pay_lite_app_backup_download_android", false, true, true)) {
                java.util.LinkedList linkedList2 = vy4Var.f388673q;
                if (!nf.c.a(linkedList2)) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    r45.hs5 hs5Var = null;
                    while (it6.hasNext()) {
                        r45.hs5 hs5Var2 = (r45.hs5) it6.next();
                        if (hs5Var2.f376429d != 0 && (hs5Var == null || hs5Var2.f376430e < hs5Var.f376430e)) {
                            hs5Var = hs5Var2;
                        }
                    }
                    if (hs5Var != null) {
                        r45.kk0 kk0Var = hs5Var.f376435m;
                        oq1.o oVar = new oq1.o(hs5Var.f376429d, hs5Var.f376430e, hs5Var.f376432g, hs5Var.f376433h, hs5Var.f376431f, new oq1.c(kk0Var.f378773d, android.util.Base64.decode(kk0Var.f378776g, 0), android.util.Base64.decode(kk0Var.f378775f, 0), android.util.Base64.decode(kk0Var.f378774e, 0), q(vy4Var).getBytes(java.nio.charset.StandardCharsets.UTF_8)));
                        if (liteAppReporter != null) {
                            liteAppReporter.logDownload(com.tencent.liteapp.gen.DownloadAction.LITE_APP_PACKAGE_HAS_BACKUP_ROUTE_INFO);
                        }
                        qVar.f347364s = oVar;
                        qVar.f347367v = true;
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) g1Var.f143958l).put(str, qVar);
            }
            qVar.f347363r = 0;
            r45.kk0 kk0Var2 = vy4Var.f388670n;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_pay_lite_app_open_pkg_compress_android, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp pkg abtest is enable compress, appId: %s", str);
                java.util.LinkedList linkedList3 = vy4Var.f388672p;
                if (!nf.c.a(linkedList3)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onPayCheckSuccess has version meta data");
                    r45.kk0 D = D(linkedList3, qVar, liteAppReporter);
                    if (D != null) {
                        if (liteAppReporter != null) {
                            liteAppReporter.logDownload(com.tencent.liteapp.gen.DownloadAction.LITE_APP_PACKAGE_COMPRESS_INFO, vy4Var.f388666g - qVar.f347353h);
                        }
                        kk0Var2 = D;
                    }
                }
            }
            if (kk0Var2 != null) {
                qVar.f347362q = new oq1.c(kk0Var2.f378773d, android.util.Base64.decode(kk0Var2.f378776g, 0), android.util.Base64.decode(kk0Var2.f378775f, 0), android.util.Base64.decode(kk0Var2.f378774e, 0), q(vy4Var).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", k2Var, liteAppReporter, g1Var.f143949c);
        }
    }

    public static void d(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, int i17, int i18, java.lang.String str2, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        if (liteAppReporter != null) {
            g1Var.getClass();
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_FAILED, "PayDevops", i18);
        }
        com.tencent.mm.plugin.lite.api.h hVar = g1Var.f143949c;
        if (hVar != null) {
            ((com.tencent.mm.plugin.lite.logic.d2) hVar).fail(str, 2);
        }
    }

    public static void e(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.util.ArrayList arrayList, com.tencent.mm.plugin.lite.api.e eVar, java.lang.String str) {
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = g1Var.y(str, null);
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(str, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
        java.util.Map map = g1Var.f143961o;
        if (Ui == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "batchCheck udr resource is null, appId: %s", str);
            if (eVar != null) {
                ((com.tencent.mm.plugin.lite.k0) eVar).a(arrayList);
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(arrayList);
            return;
        }
        if (y17 != null && y17.iLinkVersion == Ui.f217590e) {
            if (eVar != null) {
                ((com.tencent.mm.plugin.lite.k0) eVar).a(arrayList);
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(arrayList);
        } else {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Long.valueOf(Ui.f217590e);
            objArr[2] = java.lang.Integer.valueOf(y17 != null ? y17.iLinkVersion : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp: %s udr resource exists, but liteapp resource not exists, need update. resource version: %d, item version: %d", objArr);
            g1Var.J(Ui);
        }
    }

    public static java.lang.String q(r45.vy4 vy4Var) {
        return "project_id=" + vy4Var.f388663d + "&resource_name=" + vy4Var.f388664e + "&encrypt_algorithm=" + vy4Var.f388670n.f378773d;
    }

    public static com.tencent.mm.plugin.lite.logic.g1 s() {
        if (f143946r == null) {
            synchronized (com.tencent.mm.plugin.lite.logic.g1.class) {
                if (f143946r == null) {
                    com.tencent.mm.plugin.lite.logic.g1 g1Var = new com.tencent.mm.plugin.lite.logic.g1();
                    g1Var.E();
                    com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.plugin.lite.logic.u1(g1Var));
                    f143946r = g1Var;
                }
            }
        }
        return f143946r;
    }

    public java.util.List A() {
        android.os.Bundle bundle;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppList", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppList bundle is null.");
            return null;
        }
        bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppInfo.class.getClassLoader());
        if (bundle.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_LIST)) {
            return bundle.getParcelableArrayList(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_LIST);
        }
        return null;
    }

    public void B(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        android.os.Bundle bundle = null;
        boolean z17 = false;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLatestLiteAppBaselibInfo", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            z17 = true;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == local baselib bundle");
            if (liteAppReporter != null && !z17) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.NO_LOCAL_BASE_LIBRARY_INFO);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local baselib bundle");
            bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class.getClassLoader());
            K((com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) bundle.getParcelable(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB));
        }
        com.tencent.mm.plugin.lite.p.f144149a.f(liteAppReporter);
    }

    public void C(java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        android.os.Bundle bundle = null;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "handleCheckSumFail null == bundle, appId:" + str);
        } else {
            bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppInfo.class.getClassLoader());
            L((com.tencent.liteapp.storage.WxaLiteAppInfo) bundle.getParcelable(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP));
        }
        java.lang.String r17 = r(str);
        if (r17 != null && !r17.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "bundle liteapp recopy appId: %s, version: %s", str, r17);
            n(str, liteAppReporter);
        }
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE);
        }
        l(str, false, 2, 0L, liteAppReporter, new com.tencent.mm.plugin.lite.logic.q1(this, liteAppReporter));
    }

    public final void E() {
        java.util.HashMap<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppConfigModel> allConfigModel;
        java.util.Set set = this.f143952f;
        ((java.util.concurrent.CopyOnWriteArraySet) set).add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        ((java.util.concurrent.CopyOnWriteArraySet) set).add(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LITE_APP_GLOBAL_CONFIG);
        ((java.util.concurrent.CopyOnWriteArraySet) set).add("wxalite");
        java.lang.String[] strArr = {"wxalite2ceddca8b296458a527661862c5664b2", "wxalite7b438b4916cd2a37426d5538ac2d3807", "wxalitecd3434f9a28b4db218f4730961d39d55", "wxalite1af500fa066e5b60505c414cd42cacbc", "wxalitee3496ed66c0cfe06db0edfa2dbd8f4a2", "wxaliteb6acd493f7e02b17d6b805ccf970be5b", "wxalite70a1e8c60370e23abcc1bde4e2c32f6f", "wxalite0c45e912005759856ea55eb382e8c509", "wxalite2fd372f050eecd471a4392786dfae78c", "wxalite7f2b757eb3c356d7b3d4291ded2f7743"};
        for (int i17 = 0; i17 < 10; i17++) {
            java.lang.String str = strArr[i17];
            if (!I(str)) {
                ((java.util.concurrent.CopyOnWriteArraySet) set).add(str);
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() && (allConfigModel = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getAllConfigModel()) != null) {
            for (java.lang.String str2 : allConfigModel.keySet()) {
                com.tencent.mm.plugin.lite.config.LiteAppConfigModel liteAppConfigModel = allConfigModel.get(str2);
                if (liteAppConfigModel != null && liteAppConfigModel.globalUpdate) {
                    ((java.util.concurrent.CopyOnWriteArraySet) set).add(str2);
                }
            }
        }
        java.util.List<com.tencent.liteapp.storage.WxaLiteAppInfo> A = A();
        if (A == null || A.isEmpty()) {
            return;
        }
        for (com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo : A) {
            java.lang.String str3 = wxaLiteAppInfo.appId;
            if (str3 != null && !"null".equals(str3) && !wxaLiteAppInfo.appId.isEmpty() && !"game".equals(wxaLiteAppInfo.groupId)) {
                if (!((java.util.HashMap) q80.g0.f360682d1).containsKey(wxaLiteAppInfo.appId) && !I(wxaLiteAppInfo.appId)) {
                    ((java.util.concurrent.CopyOnWriteArraySet) set).add(wxaLiteAppInfo.appId);
                }
            }
        }
    }

    public boolean F(java.lang.String str, boolean z17) {
        java.lang.String format = java.lang.String.format("clicfg_liteapp_%s_enable", str);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "can no get 'isLiteAppOpen' value when is no mm process.");
            return false;
        }
        boolean equalsIgnoreCase = j62.e.g().j(format, yo.a.b(f143945q, str) ? "0" : "1", false, true).equalsIgnoreCase("1");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "isLiteAppOpen appId%s enable:%b", str, java.lang.Boolean.valueOf(equalsIgnoreCase));
        return equalsIgnoreCase;
    }

    public final boolean G(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        if (wxaLiteAppBaselibInfo == null) {
            return true;
        }
        int n17 = com.tencent.mm.sdk.platformtools.o4.M("liteapp_expire_time").n(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        if (n17 == 0) {
            n17 = 259200;
        }
        return !wxaLiteAppBaselibInfo.isDebug() || (java.lang.System.currentTimeMillis() / 1000) - wxaLiteAppBaselibInfo.updateTime >= ((long) n17);
    }

    public final boolean H(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        if (wxaLiteAppInfo == null) {
            return true;
        }
        int n17 = com.tencent.mm.sdk.platformtools.o4.M("liteapp_expire_time").n(wxaLiteAppInfo.appId);
        if (n17 == 0) {
            n17 = 86400;
        }
        return !wxaLiteAppInfo.isDebug() || (java.lang.System.currentTimeMillis() / 1000) - wxaLiteAppInfo.updateTime >= ((long) n17);
    }

    public boolean I(java.lang.String str) {
        return str != null && str.endsWith("@pay");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x049b A[Catch: all -> 0x0596, TRY_LEAVE, TryCatch #0 {, blocks: (B:98:0x02c6, B:100:0x02fd, B:101:0x0300, B:103:0x0305, B:104:0x030a, B:106:0x031c, B:108:0x0347, B:109:0x034c, B:111:0x0350, B:112:0x035a, B:115:0x035e, B:116:0x0363, B:118:0x038c, B:119:0x0395, B:121:0x039b, B:122:0x03a7, B:124:0x03cf, B:125:0x03de, B:127:0x03fa, B:129:0x0403, B:130:0x041d, B:132:0x0455, B:135:0x046a, B:136:0x047f, B:138:0x049b, B:140:0x04a8, B:142:0x04bb, B:144:0x04d5, B:145:0x04da, B:147:0x04ea, B:148:0x04ef, B:150:0x0506, B:151:0x052f, B:154:0x053d, B:155:0x0546, B:158:0x0476, B:160:0x047a, B:163:0x054a, B:165:0x056a, B:166:0x0573, B:168:0x058a, B:169:0x0594, B:171:0x03d4, B:173:0x03da), top: B:97:0x02c6, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(com.tencent.wechat.aff.udr.x r25) {
        /*
            Method dump skipped, instructions count: 2545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.g1.J(com.tencent.wechat.aff.udr.x):void");
    }

    public void K(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        java.lang.String b17 = com.tencent.mm.plugin.lite.logic.y2.b(wxaLiteAppBaselibInfo.majorVersion, wxaLiteAppBaselibInfo.patchId, wxaLiteAppBaselibInfo.f46017md5);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b17);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            md.k.a(com.tencent.mm.vfs.w6.i(b17, false));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteApp.LiteAppLogic", "baselib file don't exist.");
        }
        try {
            com.tencent.mm.plugin.lite.storage.q.a("removeLiteAppBaselibInfo", wxaLiteAppBaselibInfo.majorVersion, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public void L(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        java.lang.String e17 = com.tencent.mm.plugin.lite.logic.y2.e(wxaLiteAppInfo.appId, wxaLiteAppInfo.patchId, wxaLiteAppInfo.f46019md5);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(e17);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            md.k.a(com.tencent.mm.vfs.w6.i(e17, false));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteApp.LiteAppLogic", "app file don't exist.");
        }
        try {
            com.tencent.mm.plugin.lite.storage.q.a("removeLiteAppInfo", wxaLiteAppInfo.appId, null);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e18, "", new java.lang.Object[0]);
        }
    }

    public final void M(java.util.List list, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "reportCheckLiteApp: " + list + ", type: " + str + ", isBatch: " + z17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appIds", list);
            jSONObject.put("type", str);
            jSONObject.put("isBatch", z17);
            jSONObject.toString().replaceAll(",", ";");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public void N(java.lang.String str, boolean z17, boolean z18, int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "reportOpenLiteApp %s switchClose=%b withPkg=%b type=%d", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17));
    }

    public void O(int i17, java.lang.String str, long j17, long j18, long j19, long j27, int i18) {
        if (i17 == 1 || i17 == 8 || i17 == 2) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("errCode", i17);
            jSONObject.put("time", j17);
            jSONObject.put("checkTime", j18);
            jSONObject.put("downloadTime", j19);
            jSONObject.put("postDownloadTime", j27);
            jSONObject.put("from", i18);
            java.lang.String str2 = str.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB) ? "downloadBaseLib" : "downloadLiteApp";
            java.lang.String replaceAll = jSONObject.toString().replaceAll(",", ";");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, str2 + "," + replaceAll + "," + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "reportUpdateTime %s errCode=%d costTime=%d checkTime=%d downloadTime=%d postDownloadTime=%d from=%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(i18));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public final void P(java.lang.String str, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData) {
        if (!com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.isForeground()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "runSchedule is not in foreground.");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("liteapp_schedule_data");
        com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((java.util.concurrent.ConcurrentHashMap) this.f143959m).get(str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("interval", mMLiteAppScheduleData.f143881d);
            jSONObject.put("repeat", mMLiteAppScheduleData.f143882e);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, mMLiteAppScheduleData.f143883f);
            jSONObject2.put("payload", mMLiteAppScheduleData.f143884g);
            jSONObject.put("action", jSONObject2);
            jSONObject.put("forceDispatch", mMLiteAppScheduleData.f143885h);
            jSONObject.put("aliveDurationSeconds", mMLiteAppScheduleData.f143886i);
            jSONObject.put("lastTriggerTime", mMLiteAppScheduleData.f143887m);
            java.lang.String replaceAll = jSONObject.toString().replaceAll(",", ";");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, "liteAppRunSchedule," + replaceAll + "," + str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "runSchedule appId: %s, lastTriggerTime: %d， repeat: %d", str, java.lang.Long.valueOf(mMLiteAppScheduleData.f143887m), java.lang.Integer.valueOf(mMLiteAppScheduleData.f143882e));
        mMLiteAppScheduleData.f143887m = java.lang.System.currentTimeMillis() / 1000;
        if (!com.tencent.mm.plugin.lite.LiteAppCenter.getInProcessAppIds().contains(str) || mMLiteAppScheduleData.f143885h) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(str, mMLiteAppScheduleData.f143886i, true, 0L, new com.tencent.mm.plugin.lite.logic.x1(this, str, mMLiteAppScheduleData));
        }
        int i17 = mMLiteAppScheduleData.f143882e;
        if (i17 != 0) {
            if (i17 > 0) {
                mMLiteAppScheduleData.f143882e = i17 - 1;
            }
            M.C(str, mMLiteAppScheduleData);
        } else {
            synchronized (this.f143960n) {
                if (b4Var != null) {
                    b4Var.d();
                }
                M.remove(str);
                ((java.util.concurrent.ConcurrentHashMap) this.f143959m).remove(str);
            }
        }
    }

    public void Q(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        synchronized (this.f143960n) {
            if (!com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getConfigModel(str).store.scheduleWakeUp.booleanValue()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "setScheduleWakeUp has no permission! appId: %s", str);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "setScheduleWakeUp appId: %s, interval: %d, repeat: %d, actionName: %s, actionPayload: %s, forceDispatch: %b, aliveDuration: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str3, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("liteapp_schedule_data");
            com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData = new com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData();
            mMLiteAppScheduleData.f143881d = i17;
            mMLiteAppScheduleData.f143882e = i18;
            mMLiteAppScheduleData.f143883f = str2;
            mMLiteAppScheduleData.f143884g = str3;
            mMLiteAppScheduleData.f143885h = z17;
            mMLiteAppScheduleData.f143886i = i19;
            mMLiteAppScheduleData.f143888n = java.lang.System.currentTimeMillis() / 1000;
            M.C(str, mMLiteAppScheduleData);
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.lite.logic.w1(this, str, mMLiteAppScheduleData), true);
            long j17 = i17 * 60 * 60 * 1000;
            b4Var.c(j17, j17);
            if (((java.util.concurrent.ConcurrentHashMap) this.f143959m).containsKey(str)) {
                ((com.tencent.mm.sdk.platformtools.b4) ((java.util.concurrent.ConcurrentHashMap) this.f143959m).get(str)).d();
            }
            ((java.util.concurrent.ConcurrentHashMap) this.f143959m).put(str, b4Var);
        }
    }

    public void R() {
        java.lang.String[] strArr;
        int i17;
        boolean z17;
        long j17;
        long j18;
        synchronized (this.f143960n) {
            long j19 = 1000;
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("liteapp_schedule_data");
            java.lang.String[] b17 = M.b();
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "startSchedule appIds is null!");
                return;
            }
            boolean z18 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "startSchedule timenow: %d, appIds:%s", java.lang.Long.valueOf(currentTimeMillis), java.util.Arrays.toString(b17));
            int length = b17.length;
            int i18 = 0;
            while (i18 < length) {
                java.lang.String str = b17[i18];
                com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData = (com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData) M.r(str, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData.class);
                if (mMLiteAppScheduleData != null && !((java.util.concurrent.ConcurrentHashMap) this.f143959m).containsKey(str)) {
                    long j27 = mMLiteAppScheduleData.f143887m;
                    if ((j27 == 0 || (currentTimeMillis - j27) / 3600 < mMLiteAppScheduleData.f143881d) && (j27 != 0 || (currentTimeMillis - mMLiteAppScheduleData.f143888n) / 3600 < mMLiteAppScheduleData.f143881d)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "not exceed interval, wait for run schedule");
                        long j28 = mMLiteAppScheduleData.f143887m;
                        if (j28 != 0) {
                            strArr = b17;
                            i17 = length;
                            j18 = (((mMLiteAppScheduleData.f143881d * 60) * 60) - (currentTimeMillis - j28)) * 1000;
                            j17 = 1000;
                        } else {
                            strArr = b17;
                            i17 = length;
                            j17 = 1000;
                            j18 = (((mMLiteAppScheduleData.f143881d * 60) * 60) - (currentTimeMillis - mMLiteAppScheduleData.f143888n)) * 1000;
                        }
                        com.tencent.mm.plugin.lite.logic.t1 t1Var = new com.tencent.mm.plugin.lite.logic.t1(this, str, mMLiteAppScheduleData);
                        z17 = false;
                        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(t1Var, false);
                        b4Var.c(j18, j18);
                        ((java.util.concurrent.ConcurrentHashMap) this.f143959m).put(str, b4Var);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "exceed interval, run schedule");
                        P(str, mMLiteAppScheduleData);
                        if (mMLiteAppScheduleData.f143882e >= 0) {
                            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.lite.logic.r1(this, str, mMLiteAppScheduleData), true);
                            long j29 = mMLiteAppScheduleData.f143881d * 60 * 60 * 1000;
                            b4Var2.c(j29, j29);
                            ((java.util.concurrent.ConcurrentHashMap) this.f143959m).put(str, b4Var2);
                        }
                        strArr = b17;
                        i17 = length;
                        j17 = 1000;
                        z17 = false;
                    }
                    i18++;
                    j19 = j17;
                    z18 = z17;
                    b17 = strArr;
                    length = i17;
                }
                strArr = b17;
                i17 = length;
                z17 = z18;
                j17 = j19;
                i18++;
                j19 = j17;
                z18 = z17;
                b17 = strArr;
                length = i17;
            }
        }
    }

    public final com.tencent.liteapp.storage.WxaLiteAppInfo S(java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String r17 = r(str);
        if (r17 == null || r17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "null == bundle, appId:" + str);
            wxaLiteAppInfo = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "recopy, null == bundle, appId:" + str);
            wxaLiteAppInfo = n(str, liteAppReporter);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "tryCopyAndGetWxaLiteAppInfo Execution time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return wxaLiteAppInfo;
    }

    public void T(com.tencent.mm.plugin.lite.storage.f fVar) {
        if (fVar == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("host", fVar.field_host);
        bundle.putString("param", fVar.field_param);
        bundle.putString("paramMap", fVar.field_paramMap);
        bundle.putString("headerMap", fVar.field_headerMap);
        bundle.putLong(dm.i4.COL_UPDATETIME, fVar.field_updateTime);
        try {
            com.tencent.mm.plugin.lite.storage.q.a("insertLiteAppAuthInfo", fVar.field_host, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public void U(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        if (wxaLiteAppBaselibInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "baselib is empty.");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wxaLiteAppBaselibInfo.path)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "baselib path is empty.");
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(wxaLiteAppBaselibInfo.path);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "baselib file isn't exist.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class.getClassLoader());
        bundle.putParcelable(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB, wxaLiteAppBaselibInfo);
        try {
            com.tencent.mm.plugin.lite.storage.q.a("insertLiteAppBaselibInfo", wxaLiteAppBaselibInfo.majorVersion, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            throw e17;
        }
    }

    public void V(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        if (wxaLiteAppInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "app is empty.");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wxaLiteAppInfo.path)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "app path is empty.");
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(wxaLiteAppInfo.path);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "app file isn't exist.");
            return;
        }
        java.lang.String e17 = com.tencent.mm.plugin.lite.logic.y2.e(wxaLiteAppInfo.appId, wxaLiteAppInfo.patchId, wxaLiteAppInfo.f46019md5);
        if (!e17.equalsIgnoreCase(wxaLiteAppInfo.path)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "rename app folder from %s to %s", wxaLiteAppInfo.path, e17);
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(e17);
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if (!m18.a() ? false : m18.f213266a.F(m18.f213267b)) {
                com.tencent.mm.vfs.w6.f(e17);
            }
            com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a18, m18);
            if (m19.a()) {
                m19.f213266a.r(m19.f213267b);
            }
            com.tencent.mm.vfs.w6.v(wxaLiteAppInfo.path, e17);
            wxaLiteAppInfo.path = e17;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppInfo.class.getClassLoader());
        bundle.putParcelable(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, wxaLiteAppInfo);
        try {
            com.tencent.mm.plugin.lite.storage.q.a("insertLiteAppInfo", wxaLiteAppInfo.appId, bundle);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e18, "", new java.lang.Object[0]);
            throw e18;
        }
    }

    public void W(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        if (wxaLiteAppInfo == null || !wxaLiteAppInfo.appId.equalsIgnoreCase("wxalitecce81f5fba338df4dd5f74df8229c600")) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.L().putString("wxa_lite_app_game_center_version", wxaLiteAppInfo.patchId);
    }

    public void f(java.util.List list, long j17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        p();
        long j18 = j17 <= 0 ? 20000L : j17;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = y(str, null);
            if (H(y17)) {
                hashMap.put(str, y17);
                long j19 = j18;
                m(str, y17, false, 3, j18, liteAppReporter, null);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (y17 != null) {
                    r45.vc4 vc4Var = new r45.vc4();
                    vc4Var.f388097d = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
                    vc4Var.f388098e = y17.iLinkVersion;
                    linkedList.add(vc4Var);
                    arrayList.add(new t80.g(str, "", linkedList));
                }
                j18 = j19;
            }
        }
        M(list, "paydevops", true);
        if (liteAppReporter != null) {
            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE, "PayDevops");
        }
        ((s80.e) ((t80.h) i95.n0.c(t80.h.class))).wi(arrayList, new com.tencent.mm.plugin.lite.logic.n1(this, hashMap, list, "PayDevops", liteAppReporter));
    }

    public void g(java.util.ArrayList arrayList, com.tencent.mm.plugin.lite.api.e eVar) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList) || arrayList.isEmpty()) {
            if (eVar != null) {
                ((com.tencent.mm.plugin.lite.k0) eVar).a(arrayList);
                return;
            }
            return;
        }
        java.util.ArrayList<com.tencent.wechat.aff.udr.v> configCheckParameters = com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.configCheckParameters();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            java.lang.String str = (java.lang.String) arrayList.get(i17);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.f143952f;
            if (!copyOnWriteArraySet.contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "udr register appId: %s", str);
                ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).aj(str, com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.class.getName());
                copyOnWriteArraySet.add(str);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "batchCheckLiteApp appIds:" + arrayList);
        if (eVar != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            com.tencent.mm.plugin.lite.logic.h2 h2Var = new com.tencent.mm.plugin.lite.logic.h2(this);
            h2Var.f143975a = arrayList2;
            h2Var.f143976b = eVar;
            ((java.util.concurrent.ConcurrentHashMap) this.f143961o).put(arrayList, h2Var);
        }
        com.tencent.wechat.aff.udr.p pVar = new com.tencent.wechat.aff.udr.p();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c(str2);
            qVar.f217549f.addAll(configCheckParameters);
            qVar.f217550g[3] = true;
            pVar.f217545d.add(qVar);
            pVar.f217546e[1] = true;
        }
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ai(pVar, new com.tencent.mm.plugin.lite.logic.p1(this, arrayList, eVar));
        M(arrayList, "ilink", true);
    }

    public void h(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.lite.logic.y1 y1Var = new com.tencent.mm.plugin.lite.logic.y1(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib");
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = u(liteAppReporter);
        if (!G(u17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "no need download, local pkg is debug");
            y1Var.b(u17, 1);
            return;
        }
        java.lang.String str3 = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkBaseLibNeedUpdate, patchId:%s ilinkVersion:%d", (u17 == null || (str2 = u17.patchId) == null || str2.isEmpty()) ? "" : u17.patchId, java.lang.Integer.valueOf(u17 != null ? u17.iLinkVersion : 0));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f143951e;
        if (concurrentHashMap.containsKey(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
            z17 = false;
        } else {
            com.tencent.mm.plugin.lite.logic.k2 k2Var = new com.tencent.mm.plugin.lite.logic.k2(this);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f143996a = currentTimeMillis;
            k2Var.f143997b = currentTimeMillis;
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
            concurrentHashMap.put(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, k2Var);
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "baselib is checking. ignore.");
            return;
        }
        com.tencent.mm.plugin.lite.logic.k2 k2Var2 = (com.tencent.mm.plugin.lite.logic.k2) concurrentHashMap.get(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "begin to check wxalitebaselibrary");
        boolean l17 = j62.e.g().l("clicfg_liteapp_update_use_ilink", true, true, true);
        java.util.List asList = java.util.Arrays.asList(j62.e.g().a("clicfg_liteapp_use_raven_list", "", true, true).split(","));
        if (l17) {
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.f143952f;
            if (!copyOnWriteArraySet.contains(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "udr register appId: %s", com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
                ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).aj(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.class.getName());
                copyOnWriteArraySet.add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
            }
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
            qVar.f217549f = new java.util.LinkedList(com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.configCheckParameters());
            qVar.f217550g[3] = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
            M(arrayList, "ilink", false);
            if (liteAppReporter != null) {
                liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE, "Ilink");
            }
            if (liteAppReporter != null) {
                ((java.util.concurrent.ConcurrentHashMap) this.f143953g).put(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, liteAppReporter);
            }
            ((java.util.concurrent.ConcurrentHashMap) this.f143955i).put(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, y1Var);
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
            return;
        }
        if (asList.contains(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB) || l17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (u17 != null) {
                arrayList2.add(new e70.v(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, u17.iLinkVersion));
            }
            e70.w wVar = new e70.w(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, null, arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
            M(arrayList3, "ilink", false);
            if (liteAppReporter != null) {
                liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE, "Ilink");
            }
            ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Bi(wVar, new com.tencent.mm.plugin.lite.logic.z1(this, k2Var2, liteAppReporter, y1Var, u17));
            return;
        }
        if (u17 != null && (str = u17.patchId) != null && !str.isEmpty()) {
            str3 = u17.patchId;
        }
        oq1.r rVar = new oq1.r();
        rVar.f347368a = com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB;
        rVar.f347369b = com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB;
        rVar.f347370c = str3;
        if (u17 == null) {
            rVar.f347371d = 1;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        M(arrayList4, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_DIRECTORY_NAME, false);
        if (liteAppReporter != null) {
            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE, "Tinker");
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).wi(rVar, new com.tencent.mm.plugin.lite.logic.a2(this, k2Var2, liteAppReporter, y1Var, u17));
    }

    public final void i(java.lang.String str, boolean z17, com.tencent.mm.plugin.lite.logic.k2 k2Var, long j17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.h hVar) {
        if (hVar == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.lite.logic.e2(this, k2Var, hVar, z17, str, liteAppReporter, j17), j17);
    }

    public final java.lang.String j(java.lang.String str, java.util.LinkedList linkedList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            com.tencent.wechat.aff.udr.u uVar = (com.tencent.wechat.aff.udr.u) it.next();
            if (uVar != null) {
                java.lang.String key = uVar.getKey();
                java.lang.String value = uVar.getValue();
                if ("dependencies".equals(key)) {
                    if (value != null) {
                        java.lang.String trim = value.trim();
                        if (trim.length() > 1) {
                            try {
                                if (trim.charAt(0) == '[') {
                                    org.json.JSONArray jSONArray = new org.json.JSONArray(trim);
                                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                                        if (optJSONObject != null && optJSONObject.has("appId")) {
                                            arrayList.add(optJSONObject.optString("appId"));
                                        }
                                    }
                                } else {
                                    org.json.JSONObject jSONObject = new org.json.JSONObject(trim);
                                    if (jSONObject.has("appId")) {
                                        arrayList.add(jSONObject.getString("appId"));
                                    }
                                }
                            } catch (org.json.JSONException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
                            }
                        }
                    }
                } else if ("liteappVersion".equals(key)) {
                    if (value == null) {
                        value = "";
                    }
                    str2 = value;
                }
            }
        }
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) this.f143957k).put(str, arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "batchCheckGlobalPkgs, appId: %s", arrayList.toString());
            g(arrayList, null);
        }
        return str2;
    }

    public final void k(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkIsGlobalPkg, appId: %s", str);
        java.util.Map map = this.f143957k;
        for (java.lang.String str2 : ((java.util.concurrent.ConcurrentHashMap) map).keySet()) {
            java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) map).get(str2);
            if (!list.isEmpty() && list.contains(str)) {
                list.remove(str);
                if (list.isEmpty()) {
                    com.tencent.mm.plugin.lite.api.h hVar = this.f143949c;
                    java.util.Map map2 = this.f143956j;
                    if (hVar != null && ((java.util.concurrent.ConcurrentHashMap) map2).containsKey(str2)) {
                        ((com.tencent.mm.plugin.lite.logic.d2) this.f143949c).success((com.tencent.liteapp.storage.WxaLiteAppInfo) ((java.util.concurrent.ConcurrentHashMap) map2).get(str2), 0);
                    }
                    ((java.util.concurrent.ConcurrentHashMap) map2).remove(str2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.String r28, boolean r29, int r30, long r31, com.tencent.liteapp.gen.LiteAppReporter r33, com.tencent.mm.plugin.lite.api.h r34) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.g1.l(java.lang.String, boolean, int, long, com.tencent.liteapp.gen.LiteAppReporter, com.tencent.mm.plugin.lite.api.h):void");
    }

    public final boolean m(java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, boolean z17, int i17, long j17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.h hVar) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkNeedUpdate, begin to checkLiteApp:%s patchId:%s ilinkVersion:%d", str, (wxaLiteAppInfo == null || (str2 = wxaLiteAppInfo.patchId) == null || str2.isEmpty()) ? "" : wxaLiteAppInfo.patchId, java.lang.Integer.valueOf(wxaLiteAppInfo != null ? wxaLiteAppInfo.iLinkVersion : 0));
        java.util.Map map = this.f143951e;
        if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            com.tencent.mm.plugin.lite.logic.k2 k2Var = new com.tencent.mm.plugin.lite.logic.k2(this);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f143996a = currentTimeMillis;
            k2Var.f143997b = currentTimeMillis;
            k2Var.f144000e = currentTimeMillis;
            k2Var.f144001f = currentTimeMillis;
            k2Var.f143998c = hVar;
            k2Var.f143999d = i17;
            k2Var.f144002g = z17;
            k2Var.f144003h = j17;
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, k2Var);
            i(str, z17, k2Var, j17, liteAppReporter, hVar);
            return true;
        }
        if (hVar == null) {
            return false;
        }
        com.tencent.mm.plugin.lite.logic.k2 k2Var2 = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis2 - k2Var2.f143996a > j17) {
            com.tencent.mm.plugin.lite.api.h hVar2 = k2Var2.f143998c;
            if (hVar2 != null) {
                hVar2.fail(str, 9);
            }
            k2Var2.f143998c = null;
            if (wxaLiteAppInfo == null) {
                hVar.fail(str, 8);
            } else {
                hVar.success(wxaLiteAppInfo, 8);
            }
        } else {
            com.tencent.mm.plugin.lite.api.h hVar3 = k2Var2.f143998c;
            if (hVar3 != null) {
                hVar3.fail(str, 9);
            }
            k2Var2.f143998c = hVar;
            k2Var2.f143996a = currentTimeMillis2;
            k2Var2.f144002g = z17;
            k2Var2.f144003h = j17;
            i(str, z17, k2Var2, j17, liteAppReporter, hVar);
        }
        return false;
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo n(java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        java.lang.String str2;
        int extract;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_PACKAGE);
        }
        try {
            java.lang.String[] list = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().list("LiteappPackage");
            int i17 = 0;
            while (true) {
                if (i17 >= list.length) {
                    str2 = null;
                    break;
                }
                java.lang.String str3 = list[i17];
                if (str3.substring(0, str3.indexOf(95)).equals(str)) {
                    str2 = list[i17];
                    break;
                }
                i17++;
            }
            if (str2 == null) {
                return null;
            }
            java.lang.String e17 = com.tencent.mm.plugin.lite.logic.y2.e(str, "bundle", null);
            if (com.tencent.mm.vfs.w6.j(e17)) {
                com.tencent.mm.vfs.w6.g(e17, true);
            }
            com.tencent.mm.vfs.w6.u(e17);
            byte[] N = com.tencent.mm.vfs.w6.N("assets:///LiteappPackage/" + str2, 0, -1);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "liteapp");
            com.tencent.mm.vfs.w6.u(r6Var.o());
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, str2);
            if (r6Var2.m()) {
                r6Var2.l();
            }
            com.tencent.mm.vfs.w6.R(r6Var2.o(), N);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "copyBundlePackage path: %s", r6Var2.o());
            java.lang.String substring = str2.substring(str2.lastIndexOf(".") + 1);
            if ("zip".equals(substring)) {
                extract = com.tencent.mm.vfs.w6.Q(r6Var2.o(), e17);
            } else {
                if (!"7z".equals(substring)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "unzip bundle liteapp, file extension is wrong.");
                    if (liteAppReporter != null) {
                        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_PACKAGE_FAILED);
                    }
                    return null;
                }
                extract = com.tencent.mm.mm7zip.SevenZipUtil.extract(com.tencent.mm.vfs.w6.i(r6Var2.o(), false), com.tencent.mm.vfs.w6.i(e17, true));
            }
            if (extract == -1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "unzip bundle liteApp %s error", str);
                if (liteAppReporter != null) {
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_PACKAGE_FAILED);
                }
                return null;
            }
            r6Var2.l();
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = new com.tencent.liteapp.storage.WxaLiteAppInfo();
            wxaLiteAppInfo.appId = str;
            wxaLiteAppInfo.patchId = "bundle";
            wxaLiteAppInfo.f46019md5 = "";
            wxaLiteAppInfo.version = com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersion(e17, str, "");
            wxaLiteAppInfo.signatureKey = "";
            wxaLiteAppInfo.path = e17;
            wxaLiteAppInfo.type = "bundle";
            wxaLiteAppInfo.updateTime = java.lang.System.currentTimeMillis() / 1000;
            s().V(wxaLiteAppInfo);
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_PACKAGE_SUCCESS);
            }
            return wxaLiteAppInfo;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", e18.toString());
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_PACKAGE_FAILED);
            }
            return null;
        }
    }

    public final com.tencent.mm.plugin.lite.api.f o() {
        return new com.tencent.mm.plugin.lite.logic.y1(this);
    }

    public final void p() {
        if (this.f143949c == null) {
            this.f143949c = new com.tencent.mm.plugin.lite.logic.d2(this);
        }
    }

    public final java.lang.String r(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        return (java.lang.String) ((java.util.LinkedHashMap) com.tencent.mm.plugin.lite.p.f144154f).get(str);
    }

    public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo t(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_BASE_LIBRARY_INFO);
        }
        boolean z17 = false;
        android.os.Bundle bundle = null;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLatestLiteAppBaselibInfo", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_BASE_LIBRARY_INFO_FAILED);
            }
            z17 = true;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == local baselib bundle");
            if (liteAppReporter != null && !z17) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.NO_LOCAL_BASE_LIBRARY_INFO);
            }
            wxaLiteAppBaselibInfo = com.tencent.mm.plugin.lite.p.f144149a.f(liteAppReporter);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local baselib bundle");
            bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class.getClassLoader());
            wxaLiteAppBaselibInfo = (com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) bundle.getParcelable(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB);
            ra3.o a17 = ra3.p.f393525a.a(wxaLiteAppBaselibInfo.path);
            if (a17.f393523a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLatestLiteAppBaselibInfo all file exists.");
            } else {
                if (liteAppReporter != null) {
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.BASE_LIB_FILE_MISSING, a17.f393524b);
                }
                K(wxaLiteAppBaselibInfo);
                wxaLiteAppBaselibInfo = com.tencent.mm.plugin.lite.p.f144149a.f(liteAppReporter);
            }
        }
        if (wxaLiteAppBaselibInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "final baselib result == null");
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_BASE_LIBRARY_INFO_FINAL_FAILED);
            }
        } else if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_BASE_LIBRARY_INFO_SUCCESS, wxaLiteAppBaselibInfo.iLinkVersion);
        }
        return wxaLiteAppBaselibInfo;
    }

    public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        android.os.Bundle bundle;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_BASE_LIBRARY_INFO);
        }
        boolean z17 = false;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLatestLiteAppBaselibInfo", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_BASE_LIBRARY_INFO_FAILED);
            }
            z17 = true;
            bundle = null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == local baselib bundle");
            if (liteAppReporter != null && !z17) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.NO_LOCAL_BASE_LIBRARY_INFO);
            }
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local baselib bundle");
        bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class.getClassLoader());
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = (com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) bundle.getParcelable(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB);
        ra3.o a17 = ra3.p.f393525a.a(wxaLiteAppBaselibInfo.path);
        if (a17.f393523a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLatestLiteAppBaselibInfoWithoutCopyBundle all file exists.");
            return wxaLiteAppBaselibInfo;
        }
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.BASE_LIB_FILE_MISSING, a17.f393524b);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "getLatestLiteAppBaselibInfoWithoutCopyBundle not all file exists.");
        K(wxaLiteAppBaselibInfo);
        return null;
    }

    public com.tencent.mm.plugin.lite.storage.f v(java.lang.String str) {
        android.os.Bundle bundle;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppAuthInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        com.tencent.mm.plugin.lite.storage.f fVar = new com.tencent.mm.plugin.lite.storage.f();
        fVar.field_host = bundle.getString("host");
        fVar.field_param = bundle.getString("param");
        fVar.field_paramMap = bundle.getString("paramMap");
        fVar.field_headerMap = bundle.getString("headerMap");
        fVar.field_updateTime = bundle.getLong(dm.i4.COL_UPDATETIME);
        return fVar;
    }

    public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo w(java.lang.String str) {
        android.os.Bundle bundle;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppBaselibInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle != null) {
            bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class.getClassLoader());
            return (com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) bundle.getParcelable(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle, majorVersion:" + str);
        return null;
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo x(java.lang.String str) {
        return y(str, null);
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo y(java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo;
        int indexOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppInfo");
        int indexOf2 = str.indexOf(64);
        boolean z17 = false;
        java.lang.String substring = (indexOf2 < 0 || (indexOf = str.indexOf(63, indexOf2)) < 0 || !str.substring(indexOf2 + 1, indexOf).equals("game")) ? str : str.substring(0, indexOf2);
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_PACKAGE_INFO);
        }
        android.os.Bundle bundle = null;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppInfo", substring, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_PACKAGE_INFO_FAILED);
            }
            z17 = true;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle");
            if (liteAppReporter != null && !z17) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.NO_LOCAL_PACKAGE_INFO);
            }
            wxaLiteAppInfo = S(substring, liteAppReporter);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local bundle");
            bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppInfo.class.getClassLoader());
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo2 = (com.tencent.liteapp.storage.WxaLiteAppInfo) bundle.getParcelable(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP);
            java.lang.String r17 = r(substring);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "appId: %s, bundle version: %s, info version: %s", substring, r17, wxaLiteAppInfo2.version);
            if (r17 == null || r17.isEmpty() || !com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(r17, wxaLiteAppInfo2.version)) {
                ra3.o b17 = ra3.p.f393525a.b(wxaLiteAppInfo2.path);
                if (b17.f393523a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppInfo appId: " + str + ", all file exists.");
                    wxaLiteAppInfo = wxaLiteAppInfo2;
                } else {
                    if (liteAppReporter != null) {
                        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.PACKAGE_FILE_MISSING, b17.f393524b);
                    }
                    L(wxaLiteAppInfo2);
                    wxaLiteAppInfo = S(substring, liteAppReporter);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "need to use bundle.");
                L(wxaLiteAppInfo2);
                wxaLiteAppInfo = S(substring, liteAppReporter);
            }
        }
        if (wxaLiteAppInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "final result == null");
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_PACKAGE_INFO_FINAL_FAILED);
            }
        } else if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_LOCAL_PACKAGE_INFO_SUCCESS, wxaLiteAppInfo.iLinkVersion);
        }
        return wxaLiteAppInfo;
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo z(java.lang.String str) {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppInfo", str, null);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle");
                return null;
            }
            a17.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppInfo.class.getClassLoader());
            return (com.tencent.liteapp.storage.WxaLiteAppInfo) a17.getParcelable(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
