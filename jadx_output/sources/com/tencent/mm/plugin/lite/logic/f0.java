package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class f0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static long f143932d;

    /* renamed from: e, reason: collision with root package name */
    public static long f143933e;

    static {
        e70.z zVar = (e70.z) i95.n0.c(e70.z.class);
        int i17 = e70.z.G0;
        com.tencent.mm.plugin.lite.logic.c0 c0Var = new com.tencent.mm.plugin.lite.logic.c0();
        d83.u uVar = (d83.u) zVar;
        uVar.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            uVar.Di();
            uVar.Ni();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = uVar.f227037o;
            if (concurrentHashMap.containsKey("BIZ_TYPE_LITEAPP")) {
                return;
            }
            concurrentHashMap.put("BIZ_TYPE_LITEAPP", c0Var);
        }
    }

    public f0() {
        super(0);
    }

    public static boolean b(com.tencent.mm.plugin.lite.logic.f0 f0Var) {
        java.lang.String str;
        java.lang.String str2;
        f0Var.getClass();
        com.tencent.mm.plugin.lite.p.f144149a.b(7, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        if (j62.e.g().j("clicfg_liteapp_disable_update", "0", false, true).equalsIgnoreCase("1")) {
            return false;
        }
        boolean equalsIgnoreCase = j62.e.g().j("clicfg_liteapp_use_batch_update", "1", false, true).equalsIgnoreCase("1");
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter("no");
        boolean l17 = j62.e.g().l("clicfg_liteapp_update_use_ilink", true, true, true);
        java.util.List asList = java.util.Arrays.asList(j62.e.g().j("clicfg_liteapp_use_raven_list", "", true, true).split(","));
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        hashSet4.add("wxalite2ceddca8b296458a527661862c5664b2");
        hashSet4.add("wxalite7b438b4916cd2a37426d5538ac2d3807");
        hashSet4.add("wxalitecd3434f9a28b4db218f4730961d39d55");
        hashSet4.add("wxalite1af500fa066e5b60505c414cd42cacbc");
        hashSet4.add("wxalite0c45e912005759856ea55eb382e8c509");
        hashSet4.addAll(com.tencent.mm.plugin.lite.logic.g1.s().f143950d);
        if (!equalsIgnoreCase) {
            com.tencent.mm.plugin.lite.logic.g1.s().h(liteAppReporter);
        } else if (asList.contains(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
            hashSet2.add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        } else {
            hashSet.add(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        }
        java.util.Iterator it = hashSet4.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            if (!hashSet.contains(str3) && com.tencent.mm.plugin.lite.logic.g1.s().F(str3, false)) {
                if (!equalsIgnoreCase) {
                    com.tencent.mm.plugin.lite.logic.g1.s().l(str3, false, 3, 60000L, null, null);
                } else if (asList.contains(str3)) {
                    hashSet2.add(str3);
                } else if (com.tencent.mm.plugin.lite.logic.g1.s().I(str3)) {
                    hashSet3.add(str3);
                } else {
                    hashSet.add(str3);
                }
            }
        }
        java.util.List<com.tencent.liteapp.storage.WxaLiteAppInfo> A = com.tencent.mm.plugin.lite.logic.g1.s().A();
        if (A != null && !A.isEmpty()) {
            for (com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo : A) {
                if (!"game".equals(wxaLiteAppInfo.groupId)) {
                    if (!((java.util.HashMap) q80.g0.f360682d1).containsKey(wxaLiteAppInfo.appId)) {
                        if (!equalsIgnoreCase) {
                            com.tencent.mm.plugin.lite.logic.g1.s().l(wxaLiteAppInfo.appId, false, 3, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, null, null);
                        } else if (asList.contains(wxaLiteAppInfo.appId)) {
                            hashSet2.add(wxaLiteAppInfo.appId);
                        } else if (com.tencent.mm.plugin.lite.logic.g1.s().I(wxaLiteAppInfo.appId)) {
                            hashSet3.add(wxaLiteAppInfo.appId);
                        } else {
                            hashSet.add(wxaLiteAppInfo.appId);
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashSet);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(hashSet2);
        if (!arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "payAppIdList not empty, do batch");
            com.tencent.mm.plugin.lite.logic.g1.s().f(arrayList, 60000L, liteAppReporter);
        } else if (j62.e.g().j("clicfg_enable_pay_lite_app_force_batch_android", "1", false, true).equals("1")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "payAppIdList empty, do force batch");
            com.tencent.mm.plugin.lite.logic.g1.s().f(arrayList, 60000L, liteAppReporter);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "payAppIdList empty, do nothing");
        }
        int i17 = 50;
        if (equalsIgnoreCase && !arrayList2.isEmpty()) {
            if (l17) {
                arrayList3.addAll(arrayList2);
            } else {
                int i18 = 0;
                for (int i19 = 1; i18 <= arrayList2.size() - i19; i19 = 1) {
                    int size = arrayList2.size() - i18;
                    if (size > i17) {
                        size = i17;
                    }
                    int i27 = i18 + size;
                    java.util.List<java.lang.String> subList = arrayList2.subList(i18, i27);
                    com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
                    s17.p();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2 = null;
                    com.tencent.mm.plugin.lite.logic.y1 y1Var = null;
                    for (java.lang.String str4 : subList) {
                        if (str4.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
                            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = s17.u(liteAppReporter2);
                            if (s17.G(u17)) {
                                com.tencent.mm.plugin.lite.logic.y1 y1Var2 = new com.tencent.mm.plugin.lite.logic.y1(s17);
                                java.lang.String str5 = (u17 == null || (str2 = u17.patchId) == null || str2.isEmpty()) ? "" : u17.patchId;
                                oq1.r rVar = new oq1.r();
                                rVar.f347368a = com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB;
                                rVar.f347369b = com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB;
                                rVar.f347370c = str5;
                                arrayList4.add(rVar);
                                y1Var = y1Var2;
                            }
                        } else {
                            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = s17.y(str4, liteAppReporter2);
                            if (s17.H(y17)) {
                                if (s17.m(str4, y17, false, 3, 60000L, null, null)) {
                                    java.lang.String str6 = (y17 == null || (str = y17.patchId) == null || str.isEmpty()) ? "" : y17.patchId;
                                    oq1.r rVar2 = new oq1.r();
                                    rVar2.f347368a = str4;
                                    rVar2.f347369b = str4;
                                    rVar2.f347370c = str6;
                                    arrayList4.add(rVar2);
                                }
                                liteAppReporter2 = null;
                            }
                        }
                        liteAppReporter2 = null;
                    }
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(s17.f143951e);
                    if (arrayList4.isEmpty()) {
                        i18 = i27;
                    } else {
                        s17.M(subList, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_DIRECTORY_NAME, true);
                        if (liteAppReporter != null) {
                            liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.BATCH_CHECK_PACKAGE_UPDATE, "Tinker");
                        }
                        oq1.l lVar = (oq1.l) i95.n0.c(oq1.l.class);
                        i18 = i27;
                        com.tencent.mm.plugin.lite.logic.i1 i1Var = new com.tencent.mm.plugin.lite.logic.i1(s17, concurrentHashMap, y1Var, subList, liteAppReporter);
                        ((nq1.d) lVar).getClass();
                        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
                        sVar.requireAccountInitialized();
                        sVar.f338971d.getClass();
                        gm0.j1.d().g(new z73.d(arrayList4, i1Var));
                    }
                    i17 = 50;
                }
            }
        }
        if (!equalsIgnoreCase || arrayList3.isEmpty()) {
            return false;
        }
        int i28 = 0;
        while (i28 <= arrayList3.size() - 1) {
            int size2 = arrayList3.size() - i28;
            if (size2 > 50) {
                size2 = 50;
            }
            int i29 = size2 + i28;
            arrayList3.subList(i28, i29);
            i28 = i29;
        }
        return false;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ActivateEvent activateEvent = (com.tencent.mm.autogen.events.ActivateEvent) iEvent;
        if (gm0.j1.a()) {
            try {
                ka3.u.f306087r.a().h(new org.json.JSONObject(), false, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "init in checkerListenr registerProxyService");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppLite.LiteAppCheckerListener", e17, "", new java.lang.Object[0]);
            }
            if (!activateEvent.f53964g.f6412a) {
                if (gm0.j1.a()) {
                    ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                    if (f143932d == 0) {
                        f143932d = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LITE_APP_UPDATE_LAST_TIME_LONG, 0L)).longValue();
                    }
                    if (f143933e == 0) {
                        f143933e = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LITE_APP_CLEAN_LAST_TIME_LONG, 0L)).longValue();
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - f143932d;
                    if (j17 >= 86400000 || j17 < 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's time to update lite app, duration:%d", java.lang.Long.valueOf(j17));
                        f143932d = currentTimeMillis;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LITE_APP_UPDATE_LAST_TIME_LONG, java.lang.Long.valueOf(currentTimeMillis));
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.lite.logic.d0(this));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's not time to update lite app. please wait %d second", java.lang.Long.valueOf((86400000 - j17) / 1000));
                    }
                    if (currentTimeMillis - f143933e >= 259200000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's time to clean lite app.");
                        f143933e = currentTimeMillis;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LITE_APP_CLEAN_LAST_TIME_LONG, java.lang.Long.valueOf(currentTimeMillis));
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.lite.logic.e0(this));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's not time to clean lite app. please wait %d second", java.lang.Long.valueOf((86400000 - j17) / 100));
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppLite.LiteAppCheckerListener", "callback fail. account not ready.");
                }
            }
        }
        return false;
    }
}
