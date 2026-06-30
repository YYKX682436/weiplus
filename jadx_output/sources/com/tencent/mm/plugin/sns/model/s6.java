package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f164679a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f164680b = new java.util.LinkedList();

    public static void a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTranlsateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f164679a;
        if (hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.model.r6 r6Var = (com.tencent.mm.plugin.sns.model.r6) hashMap.get(str);
            r6Var.f164649f = i17 | r6Var.f164649f;
            hashMap.put(str, r6Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTranlsateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void b(android.view.Menu menu, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAddTransChangeMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (z17) {
            menu.add(0, 34, 0, com.tencent.mm.R.string.ly9);
        } else {
            menu.add(0, 35, 0, com.tencent.mm.R.string.ly9);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAddTransChangeMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void c(android.view.Menu menu, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAddTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (g()) {
            if (z17) {
                menu.add(0, 14, 0, com.tencent.mm.R.string.jgl);
            } else {
                menu.add(0, 15, 0, com.tencent.mm.R.string.jgl);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAddTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void d(android.view.Menu menu, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAddUnTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (g()) {
            if (z17) {
                menu.add(0, 16, 0, com.tencent.mm.R.string.jgn);
            } else {
                menu.add(0, 17, 0, com.tencent.mm.R.string.jgn);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAddUnTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCommentTranlsateId", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.lang.String str3 = str + ";" + str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCommentTranlsateId", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return str3;
    }

    public static com.tencent.mm.plugin.sns.model.r6 f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f164679a;
        if (!hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return null;
        }
        com.tencent.mm.plugin.sns.model.r6 r6Var = (com.tencent.mm.plugin.sns.model.r6) hashMap.get(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return r6Var;
    }

    public static boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        j45.l.g("translate");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("TranslateSnsOff");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return true;
    }

    public static boolean h(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f164679a;
        if (!hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return false;
        }
        boolean z17 = (((com.tencent.mm.plugin.sns.model.r6) hashMap.get(str)).f164649f & i17) != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return z17;
    }

    public static void i(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f164679a;
        if (hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.model.r6 r6Var = (com.tencent.mm.plugin.sns.model.r6) hashMap.get(str);
            r6Var.f164646c = str3;
            r6Var.f164645b = str2;
            r6Var.f164647d = true;
            r6Var.f164648e = com.tencent.mm.sdk.platformtools.t8.K0(str2);
            r6Var.f164652i = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            hashMap.put(str, r6Var);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.jgm, 1).show();
        }
        com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent = new com.tencent.mm.autogen.events.SnsTranslateFinishEvent();
        am.dx dxVar = snsTranslateFinishEvent.f54847g;
        dxVar.f6505a = i17;
        dxVar.f6506b = str;
        dxVar.f6507c = str2;
        dxVar.f6508d = str3;
        snsTranslateFinishEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void j(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyTranslateStart", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f164679a;
        if (!hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.model.r6 r6Var = new com.tencent.mm.plugin.sns.model.r6();
            r6Var.f164644a = str;
            r6Var.f164646c = null;
            r6Var.f164645b = null;
            r6Var.f164647d = false;
            r6Var.f164648e = false;
            r6Var.f164651h = true;
            r6Var.f164650g = true;
            hashMap.put(str, r6Var);
        }
        com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent = new com.tencent.mm.autogen.events.SnsTranslateStartEvent();
        am.fx fxVar = snsTranslateStartEvent.f54849g;
        fxVar.f6710a = i17;
        fxVar.f6711b = str;
        snsTranslateStartEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyTranslateStart", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void k(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeTranslateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        java.util.HashMap hashMap = f164679a;
        if (hashMap.containsKey(str)) {
            com.tencent.mm.plugin.sns.model.r6 r6Var = (com.tencent.mm.plugin.sns.model.r6) hashMap.get(str);
            r6Var.f164649f &= ~i17;
            if (i17 != 2 && i17 == 4) {
                r6Var.f164651h = true;
            }
            hashMap.put(str, r6Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTranslateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void l(com.tencent.mm.plugin.sns.ui.u1 u1Var) {
        r45.e86 e86Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (u1Var != null && (e86Var = u1Var.f170557e) != null) {
            java.lang.String str = u1Var.f170555c;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTranslateManager", "commentContent is empty, quit translate");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = e86Var.f373132m;
            sb6.append(i17 != 0 ? i17 : e86Var.f373137r);
            sb6.append("");
            java.lang.String e17 = e(u1Var.f170554b, sb6.toString());
            java.util.HashMap hashMap = f164679a;
            if (hashMap.containsKey(e17)) {
                com.tencent.mm.plugin.sns.model.r6 r6Var = (com.tencent.mm.plugin.sns.model.r6) hashMap.get(e17);
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (r6Var.f164647d && !com.tencent.mm.sdk.platformtools.t8.K0(r6Var.f164645b) && c17.equals(r6Var.f164652i)) {
                    i(r6Var.f164644a, 2, r6Var.f164645b, r6Var.f164646c);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    return;
                }
                hashMap.remove(e17);
            }
            com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent = new com.tencent.mm.autogen.events.TranslateMessageEvent();
            am.hz hzVar = translateMessageEvent.f54902g;
            hzVar.f6880c = e17;
            hzVar.f6878a = str;
            hzVar.f6881d = 3;
            hzVar.f6879b = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            translateMessageEvent.e();
            j(e17, 2);
            com.tencent.mm.plugin.sns.model.q6 q6Var = new com.tencent.mm.plugin.sns.model.q6();
            q6Var.f164616a = e17;
            q6Var.f164619d = 3;
            f164680b.add(q6Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void m(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (snsInfo != null) {
            java.lang.String snsId = snsInfo.getSnsId();
            long j17 = snsInfo.field_snsId;
            java.util.HashMap hashMap = f164679a;
            if (j17 == 0) {
                hashMap.remove(snsId);
                i(snsId, 1, null, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                return;
            }
            if (hashMap.containsKey(snsId)) {
                com.tencent.mm.plugin.sns.model.r6 r6Var = (com.tencent.mm.plugin.sns.model.r6) hashMap.get(snsId);
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (r6Var.f164647d && !r6Var.f164648e && c17.equals(r6Var.f164652i)) {
                    i(r6Var.f164644a, 1, r6Var.f164645b, r6Var.f164646c);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    return;
                }
                hashMap.remove(snsId);
            }
            if (snsInfo.getTimeLine() != null) {
                java.lang.String str = snsInfo.getTimeLine().ContentDesc;
                com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent = new com.tencent.mm.autogen.events.TranslateMessageEvent();
                am.hz hzVar = translateMessageEvent.f54902g;
                hzVar.f6880c = snsId;
                hzVar.f6878a = str;
                hzVar.f6881d = 2;
                hzVar.f6879b = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                translateMessageEvent.e();
                j(snsInfo.getSnsId() + "", 1);
                com.tencent.mm.plugin.sns.model.q6 q6Var = new com.tencent.mm.plugin.sns.model.q6();
                q6Var.f164616a = snsId;
                q6Var.f164619d = 2;
                f164680b.add(q6Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void n(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (snsInfo != null) {
            java.lang.String snsId = snsInfo.getSnsId();
            p(f(snsId));
            com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent = new com.tencent.mm.autogen.events.SnsUnTranslateEvent();
            am.gx gxVar = snsUnTranslateEvent.f54850g;
            gxVar.f6796a = 1;
            gxVar.f6797b = snsId;
            snsUnTranslateEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void o(com.tencent.mm.plugin.sns.model.r6 r6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAnimFlagWhenTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        int i17 = r6Var.f164649f;
        if ((i17 & 2) != 0) {
            r6Var.f164650g = false;
        } else if ((i17 & 4) != 0) {
            r6Var.f164651h = false;
        }
        f164679a.put(r6Var.f164644a, r6Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAnimFlagWhenTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    public static void p(com.tencent.mm.plugin.sns.model.r6 r6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAnimFlagWhenUnTranslateTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        int i17 = r6Var.f164649f;
        if ((i17 & 2) != 0) {
            r6Var.f164650g = true;
        } else if ((i17 & 4) != 0) {
            r6Var.f164651h = true;
        }
        f164679a.put(r6Var.f164644a, r6Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAnimFlagWhenUnTranslateTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }
}
