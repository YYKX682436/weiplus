package l44;

/* loaded from: classes4.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f316436a = new java.util.HashSet();

    public static void a(n64.a aVar, java.lang.Object obj, java.util.List list, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.pointers.PBool pBool2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDetectClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        java.util.List b17 = aVar.b(obj);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDetectClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickInfoWeApp, clickInfo.size=");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("AdWeAppPreloader", sb6.toString());
        try {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n64.f fVar = (n64.f) it.next();
                java.util.Objects.toString(fVar);
                if (fVar instanceof n64.c) {
                    n64.c cVar = (n64.c) fVar;
                    l44.y3 c17 = c(cVar.c(), list, pBool, pBool2);
                    if (c17 != null) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 9);
                        com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "find weAppName=" + c17.f316425a + ", weAppType=" + c17.f316427c + ", logInfo=" + cVar.a());
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineAdPreloader handleClickInfoWeApp", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDetectClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        java.lang.String str3 = str + "_" + str2;
        java.util.HashSet hashSet = f316436a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str3)) {
                    com.tencent.mars.xlog.Log.w("AdWeAppPreloader", "doPreloadWeAppPkg, already preloaded, key=" + str3);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                    return;
                }
                hashSet.add(str3);
                com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "doPreloadWeAppPkg, key=" + str3);
                ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4(str, null, str2, 5);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 45);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                throw th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l44.y3 c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r16, java.util.List r17, com.tencent.mm.pointers.PBool r18, com.tencent.mm.pointers.PBool r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.z3.c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, java.util.List, com.tencent.mm.pointers.PBool, com.tencent.mm.pointers.PBool):l44.y3");
    }

    public static l44.y3 d(ab4.d0 d0Var) {
        f54.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (d0Var instanceof ab4.o) {
            ab4.o oVar = (ab4.o) d0Var;
            if (oVar != null && !android.text.TextUtils.isEmpty(oVar.f2884z1)) {
                l44.y3 y3Var = new l44.y3(oVar.f2884z1, oVar.A1, oVar.B1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                return y3Var;
            }
        } else if ((d0Var instanceof f54.c) && (cVar = (f54.c) d0Var) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
            java.lang.String str = cVar.D1;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeAppPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeAppType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                l44.y3 y3Var2 = new l44.y3(str, cVar.E1, cVar.F1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                return y3Var2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        return null;
    }

    public static void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.util.List list, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.pointers.PBool pBool2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        n64.a aVar = new n64.a();
        aVar.e(new l44.w3());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        a(aVar, snsInfo.getAdXml(), list, pBool, pBool2);
        a(aVar, snsInfo.getAdInfo(), list, pBool, pBool2);
        com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "handleClickInfoWeApp, totalCost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    public static void f(ab4.d0 d0Var, java.util.ArrayList arrayList) {
        l44.y3 d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseComponentWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        try {
            if (za4.z0.s(d0Var.f2827q)) {
                java.util.List a17 = d0Var.a();
                if (a17 != null) {
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        f((ab4.d0) it.next(), arrayList);
                    }
                }
                d17 = null;
            } else {
                d17 = d0Var instanceof ab4.j0 ? d(((ab4.j0) d0Var).P) : d0Var instanceof f54.m ? d(((f54.m) d0Var).I) : d(d0Var);
            }
            if (d17 != null && !arrayList.contains(d17)) {
                arrayList.add(d17);
            }
            arrayList.size();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdWeAppPreloader", "parseComponentWeAppInfo exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseComponentWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    public static void g(java.util.List list, boolean z17, boolean z18, boolean z19) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("AdWeAppPreloader", "startPreloadWeApp, list is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            l44.y3 y3Var = (l44.y3) it.next();
            if (!android.text.TextUtils.isEmpty(y3Var.f316425a)) {
                java.lang.String str2 = y3Var.f316425a;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadWeApp, preloadWeAppPkg=");
        sb6.append(z17);
        sb6.append(", hasWeGame=");
        sb6.append(z18);
        sb6.append(", hasWeApp=");
        sb6.append(z19);
        sb6.append(", weAppUserName=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (arrayList.size() > 0) {
            str = u46.l.h(arrayList, ",");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            str = "";
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("AdWeAppPreloader", sb6.toString());
        if (z19) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.f88831v);
                com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniProgram, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniProgram, exp=" + th6.toString());
            }
        }
        if (z18) {
            try {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.f88831v);
                com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniGame, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniGame, exp=" + th7.toString());
            }
        }
        try {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).K5(arrayList, com.tencent.mm.plugin.appbrand.service.x6.f88831v);
            com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "startPreloadWeApp->batchSyncWxaAttr, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis3));
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("AdWeAppPreloader", "startPreloadWeApp->batchSyncWxaAttr, exp=" + th8.toString());
        }
        if (z17) {
            try {
                long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    l44.y3 y3Var2 = (l44.y3) it6.next();
                    b(y3Var2.f316425a, y3Var2.f316426b);
                }
                com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "startPreloadWeApp->preloadWeAppPkg, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis4));
            } catch (java.lang.Throwable th9) {
                com.tencent.mars.xlog.Log.e("AdWeAppPreloader", "startPreloadWeApp->preloadWeAppPkg, exp=" + th9.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }
}
