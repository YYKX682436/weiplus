package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public class p implements com.tencent.mm.modelbase.u0, va0.n {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f152383f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f152384g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f152385d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.newtips.model.n f152386e = null;

    public static void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_dynamicPath)) {
                rn3.i.Di().n(kVar.field_path);
            } else {
                rn3.i.Di().o(kVar.field_dynamicPath);
            }
        }
    }

    public static void g(vn3.c cVar) {
        if (cVar == null) {
            return;
        }
        if (cVar.f438433c) {
            rn3.i.Di().o(cVar.f438431a);
        } else {
            rn3.i.Di().n(cVar.f438432b);
        }
    }

    public static void l(com.tencent.mm.plugin.newtips.model.k kVar) {
        try {
            if (kVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsManager", "reportDismissNewTips, newTipsInfo is null !!");
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(kVar.field_tipId);
            objArr[1] = kVar.field_uniqueId;
            objArr[2] = com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_dynamicPath) ? com.tencent.mm.plugin.newtips.model.i.d(kVar.field_path) : kVar.field_dynamicPath;
            java.lang.String format = java.lang.String.format("newtips_dismiss_%d-%s-%s", objArr);
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getBoolean(format, false)) {
                return;
            }
            int i17 = kVar.field_tipId;
            int i18 = kVar.field_tipType;
            long j17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
            long j18 = kVar.field_beginShowTime;
            long j19 = kVar.field_overdueTime;
            long j27 = kVar.field_disappearTime;
            long j28 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_realshow_time", 0L);
            long j29 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_makeread_time", 0L);
            long j37 = j29 - j28;
            int i19 = kVar.field_showType;
            java.lang.String str = kVar.field_title;
            java.lang.String str2 = kVar.field_icon_url;
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_dynamicPath) ? com.tencent.mm.plugin.newtips.model.i.d(kVar.field_path) : kVar.field_dynamicPath;
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "newtipsreport:%d, id:%s_%s_%s", 2, java.lang.Integer.valueOf(i17), kVar.field_uniqueId, d17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), 4, java.lang.Integer.valueOf(i19), str, str2, d17, "", 2, 0L, kVar.field_uniqueId);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).edit().putBoolean(format, true).commit();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewTips.NewTipsManager", e17, null, new java.lang.Object[0]);
        }
    }

    public void a(int i17) {
        b(new vn3.c(i17));
    }

    public final void b(vn3.c cVar) {
        java.util.LinkedList linkedList;
        java.util.List b17 = com.tencent.mm.plugin.newtips.model.e.b(rn3.i.Bi().J0(cVar));
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) it.next();
            kVar.field_state = 1;
            l(kVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "clickNewTip(%s) clickNewTip tipsInfos state to NEW_TIPS_STATE_DISAPPEAR. ret: %s", cVar, java.lang.Integer.valueOf(rn3.i.Bi().P0(b17)));
        g(cVar);
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.sm6 sm6Var = ((com.tencent.mm.plugin.newtips.model.k) it6.next()).field_parents;
            if (sm6Var != null && (linkedList = sm6Var.f385849d) != null) {
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    java.lang.String str = (java.lang.String) it7.next();
                    int c17 = com.tencent.mm.plugin.newtips.model.i.c(str);
                    vn3.c cVar2 = c17 == 0 ? new vn3.c(str) : new vn3.c(c17);
                    java.util.List J0 = rn3.i.Bi().J0(cVar2);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) J0;
                    java.util.Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        com.tencent.mm.plugin.newtips.model.k kVar2 = (com.tencent.mm.plugin.newtips.model.k) it8.next();
                        kVar2.field_state = 1;
                        l(kVar2);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "clickNewTip() clickNewTip parentTipsInfos(%s) state to NEW_TIPS_STATE_DISAPPEAR. ret: %s", str, java.lang.Integer.valueOf(rn3.i.Bi().P0(J0)));
                    g(cVar2);
                    java.util.Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        com.tencent.mm.plugin.newtips.model.k kVar3 = (com.tencent.mm.plugin.newtips.model.k) it9.next();
                        d(rn3.i.Bi().D0(kVar3.field_uniqueId), kVar3, 1);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair c(vn3.c r15) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.newtips.model.p.c(vn3.c):android.util.Pair");
    }

    public final void d(java.util.List list, com.tencent.mm.plugin.newtips.model.k kVar, int i17) {
        java.util.LinkedList linkedList;
        if (i17 >= 10) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsManager", "logicDisappearParent() disappear fail!!!!!");
            return;
        }
        r45.sm6 sm6Var = kVar.field_parents;
        if (sm6Var == null || (linkedList = sm6Var.f385849d) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int c17 = com.tencent.mm.plugin.newtips.model.i.c(str);
            vn3.c cVar = c17 == 0 ? new vn3.c(str) : new vn3.c(c17);
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.newtips.model.k kVar2 = (com.tencent.mm.plugin.newtips.model.k) it6.next();
                if (cVar.f438433c) {
                    if (com.tencent.mm.sdk.platformtools.t8.D0(kVar2.field_dynamicPath, cVar.f438431a)) {
                        kVar2.field_state = 1;
                        arrayList.add(kVar2);
                        d(list, kVar2, i17 + 1);
                        l(kVar2);
                    }
                } else if (kVar2.field_path == cVar.f438432b) {
                    kVar2.field_state = 1;
                    arrayList.add(kVar2);
                    d(list, kVar2, i17 + 1);
                    l(kVar2);
                }
            }
            rn3.i.Bi().P0(arrayList);
            g(cVar);
        }
    }

    public void e(int i17, boolean z17) {
        com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsManager", "newTipsInfo is null , makeRead failed!!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "dancy new tips tipsId:%s, make read: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (y07.field_tipType == 0) {
            y07.field_hadRead = z17;
            rn3.i.wi().update(y07, new java.lang.String[0]);
        }
        if (y07.field_tipType == 1) {
            y07.field_hadRead = z17;
            rn3.i.wi().update(y07, new java.lang.String[0]);
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", java.lang.System.currentTimeMillis()).commit();
    }

    public final void h(int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.tencent.mm.plugin.newtips.model.d dVar = new com.tencent.mm.plugin.newtips.model.d();
            dVar.field_tipId = i17;
            dVar.field_tipVersion = i18;
            dVar.field_tipkey = str;
            dVar.field_tipType = i19;
            if (dVar.field_tipsShowInfo == null) {
                dVar.field_tipsShowInfo = new r45.rm6();
            }
            dVar.field_tipsShowInfo.f385020g = str2;
            rn3.i.wi().insert(dVar);
            if (i19 == 0) {
                if (dVar.field_isExit && i18 == dVar.field_tipVersion) {
                    return;
                }
                gm0.j1.d().g(new com.tencent.mm.plugin.newtips.model.b(i17, i18, str));
                return;
            }
            return;
        }
        if (i19 == 0 && (!y07.field_isExit || i18 != y07.field_tipVersion)) {
            gm0.j1.d().g(new com.tencent.mm.plugin.newtips.model.b(i17, i18, str));
        }
        if ((i19 != 0 || i18 == y07.field_tipVersion) && (i19 != 1 || i18 <= y07.field_tipVersion)) {
            return;
        }
        y07.field_tipId = i17;
        y07.field_tipVersion = i18;
        y07.field_tipkey = str;
        y07.field_tipType = i19;
        y07.field_isExit = false;
        if (y07.field_tipsShowInfo == null) {
            y07.field_tipsShowInfo = new r45.rm6();
        }
        y07.field_tipsShowInfo.f385020g = str2;
        rn3.i.wi().update(y07, new java.lang.String[0]);
    }

    public void i(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            j(str, null);
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.newtips.model.o.class, null);
        }
    }

    public void j(java.lang.String str, rn3.l lVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = com.tencent.mm.sdk.platformtools.o4.M("new_tips_" + gm0.m.i()).getBoolean(str == null ? "null" : str, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerLocalNewTips() uniqueId(%s) isReject(%s)", str, java.lang.Boolean.valueOf(z18));
        if (z18) {
            return;
        }
        if (lVar != null) {
            rn3.m.f397960a.put(str, lVar);
        }
        gm0.j1.d().g(new com.tencent.mm.plugin.newtips.model.c(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerLocalNewTips() uniqueId:%s", str);
    }

    public void k(com.tencent.mm.plugin.newtips.model.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() iNewTipsView is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.getPath())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() iNewTipsView.getPath() is null");
            return;
        }
        if (aVar.W5()) {
            java.lang.String path = aVar.getPath();
            java.util.HashMap hashMap = f152384g;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(path);
            if (weakReference != null && aVar.equals((com.tencent.mm.plugin.newtips.model.a) weakReference.get())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips(%s) iNewTipsView had registed!", path);
                o(path);
                return;
            } else {
                hashMap.put(path, new java.lang.ref.WeakReference(aVar));
                o(path);
            }
        } else {
            int c17 = com.tencent.mm.plugin.newtips.model.i.c(aVar.getPath());
            java.util.HashMap hashMap2 = f152383f;
            java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(c17));
            if (weakReference2 != null && aVar.equals((com.tencent.mm.plugin.newtips.model.a) weakReference2.get())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips(%s) iNewTipsView had registed!", aVar.getPath());
                n(c17);
                return;
            } else {
                hashMap2.put(java.lang.Integer.valueOf(c17), new java.lang.ref.WeakReference(aVar));
                n(c17);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() register %s (%s) [%s] (%s)", aVar.getPath(), java.lang.Boolean.valueOf(aVar.W5()), aVar.toString(), aVar.getClass().getName() + "@" + java.lang.Integer.toHexString(aVar.hashCode()));
    }

    public void m(int i17, long j17) {
        com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsManager", "setPageStayTime fail! newTipsInfo is null!!");
        } else {
            y07.field_pagestaytime = j17;
            rn3.i.wi().update(y07, new java.lang.String[0]);
        }
    }

    public void n(int i17) {
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() path == 0");
        } else {
            p((java.lang.ref.WeakReference) f152383f.get(java.lang.Integer.valueOf(i17)), new vn3.c(i17));
        }
    }

    public void o(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() dynamicPath is null");
        } else {
            p((java.lang.ref.WeakReference) f152384g.get(str), new vn3.c(str));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() == 597 && i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.newtips.model.b bVar = (com.tencent.mm.plugin.newtips.model.b) m1Var;
            boolean z17 = bVar.f152367f;
            com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(bVar.f152368g);
            if (y07 != null) {
                y07.field_isReject = z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "Newtips push is reject: %s", java.lang.Boolean.valueOf(z17));
                rn3.i.wi().update(y07, new java.lang.String[0]);
            }
        }
    }

    public final void p(java.lang.ref.WeakReference weakReference, vn3.c cVar) {
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() weakReference(%s) is null", cVar);
            return;
        }
        com.tencent.mm.plugin.newtips.model.a aVar = (com.tencent.mm.plugin.newtips.model.a) weakReference.get();
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() curNewTip(%s) is null", cVar);
        } else {
            if (com.tencent.mm.plugin.newtips.model.i.h(aVar)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() curNewTip(%s) is show old new tip", cVar);
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.newtips.model.l(this, cVar, aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public void q(java.lang.String str) {
        java.util.Iterator it;
        if (str != null) {
            java.util.Map map = this.f152385d;
            if (((java.util.HashMap) map).containsKey(str)) {
                java.util.List list = (java.util.List) ((java.util.HashMap) map).remove(str);
                java.lang.String str2 = "_newtips_report";
                ?? r47 = 0;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            java.util.Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) it6.next();
                                java.lang.Object[] objArr = new java.lang.Object[3];
                                objArr[r47] = java.lang.Integer.valueOf(kVar.field_tipId);
                                objArr[1] = kVar.field_uniqueId;
                                objArr[2] = com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_dynamicPath) ? com.tencent.mm.plugin.newtips.model.i.d(kVar.field_path) : kVar.field_dynamicPath;
                                java.lang.String format = java.lang.String.format("newtips_show_%d-%s-%s", objArr);
                                if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + str2, r47).getBoolean(format, r47)) {
                                    it = it6;
                                } else {
                                    int i17 = kVar.field_tipId;
                                    int i18 = kVar.field_tipType;
                                    long j17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + str2, r47).getLong("newtips_gettipstime", 0L);
                                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                                    com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + str2, 0).edit().putLong("newtips_realshow_time", currentTimeMillis).commit();
                                    int i19 = kVar.field_showType;
                                    java.lang.String str3 = kVar.field_title;
                                    java.lang.String str4 = kVar.field_icon_url;
                                    it = it6;
                                    java.lang.String d17 = com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_dynamicPath) ? com.tencent.mm.plugin.newtips.model.i.d(kVar.field_path) : kVar.field_dynamicPath;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "newtipsreport:%d, id:%s_%s_%s", 1, java.lang.Integer.valueOf(i17), kVar.field_uniqueId, d17);
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), "", "", "", java.lang.Long.valueOf(currentTimeMillis), "", "", "", java.lang.Integer.valueOf(i19), str3, str4, d17, "", 1, 0, kVar.field_uniqueId);
                                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(com.tencent.mm.sdk.platformtools.x2.e());
                                    str2 = str2;
                                    sb6.append(str2);
                                    context.getSharedPreferences(sb6.toString(), 0).edit().putBoolean(format, true).commit();
                                }
                                it6 = it;
                                r47 = 0;
                            }
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewTips.NewTipsManager", e17, null, new java.lang.Object[0]);
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsManager", "reportShowNewTips, newTipsInfo is null !!");
            }
        }
    }

    public void r(com.tencent.mm.plugin.newtips.model.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips() iNewTipsView is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.getPath())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips() iNewTipsView.getPath() is null");
            return;
        }
        if (aVar.W5()) {
            java.lang.String path = aVar.getPath();
            java.util.HashMap hashMap = f152384g;
            if (((java.lang.ref.WeakReference) hashMap.get(path)) != null) {
                hashMap.remove(path);
            }
        } else {
            int c17 = com.tencent.mm.plugin.newtips.model.i.c(aVar.getPath());
            java.util.HashMap hashMap2 = f152383f;
            if (((java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(c17))) != null) {
                hashMap2.remove(java.lang.Integer.valueOf(c17));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips %s %s", aVar.getPath(), java.lang.Boolean.valueOf(aVar.W5()));
    }
}
