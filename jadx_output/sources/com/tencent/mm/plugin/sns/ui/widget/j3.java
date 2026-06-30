package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.j3 f171174a = new com.tencent.mm.plugin.sns.ui.widget.j3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f171175b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f171176c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static int f171177d;

    public final void a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.sns.ui.widget.g1 g1Var, java.util.HashMap hashMap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIdInMap", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        if (hashMap.containsKey(str)) {
            java.lang.Object obj = hashMap.get(str);
            kotlin.jvm.internal.o.d(obj);
            ((java.util.Map) obj).put(str2, g1Var);
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(str2, g1Var);
            hashMap.put(str, hashMap2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIdInMap", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }

    public final com.tencent.mm.plugin.sns.ui.widget.g1 b(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.widget.g1 g1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        if (f171177d == 1) {
            java.util.HashMap hashMap = f171176c;
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
            g1Var = hashMap2 != null ? (com.tencent.mm.plugin.sns.ui.widget.g1) hashMap2.get(str2) : null;
            if (g1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
                return g1Var;
            }
            com.tencent.mm.plugin.sns.ui.widget.g1 g1Var2 = new com.tencent.mm.plugin.sns.ui.widget.g1(str2, str3 != null ? str3.length() : 0, 0, 0, i17, 0, 0, 108, null);
            a(str, str2, g1Var2, hashMap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
            return g1Var2;
        }
        java.util.HashMap hashMap3 = f171175b;
        java.util.HashMap hashMap4 = (java.util.HashMap) hashMap3.get(str);
        g1Var = hashMap4 != null ? (com.tencent.mm.plugin.sns.ui.widget.g1) hashMap4.get(str2) : null;
        if (g1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
            return g1Var;
        }
        com.tencent.mm.plugin.sns.ui.widget.g1 g1Var3 = new com.tencent.mm.plugin.sns.ui.widget.g1(str2, str3 != null ? str3.length() : 0, 0, 0, i17, 0, 0, 108, null);
        a(str, str2, g1Var3, hashMap3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        return g1Var3;
    }

    public final void c(java.lang.String feedId, r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markCommentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        if (e86Var != null) {
            ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "markCommentClk: " + feedId + ", " + e86Var.f373132m);
            com.tencent.mm.plugin.sns.ui.widget.g1 b17 = f171174a.b(feedId, java.lang.String.valueOf(e86Var.f373132m), e86Var.f373144y, e86Var.f373130h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            int i17 = b17.f171137d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            b17.f171137d = i17 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markCommentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r17, java.lang.String r18, java.util.HashMap r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.j3.d(int, java.lang.String, java.util.HashMap):void");
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSessionCustomEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_session_cmt_exp", kz5.c1.k(new jz5.l("sns_scene", java.lang.Integer.valueOf(i17)), new jz5.l("sessionid_sns", str), new jz5.l("cmtlist", str2)), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSessionCustomEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }

    public final void f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentScene", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "currentScene: " + i17);
        f171177d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentScene", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }
}
