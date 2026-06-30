package ta4;

/* loaded from: classes4.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.y0 f416863a = new ta4.y0();

    /* renamed from: b, reason: collision with root package name */
    public static int f416864b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f416865c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f416866d;

    public static void e(ta4.y0 y0Var, int i17, java.lang.String snsLocalId, int i18, java.lang.String str, java.util.Map map, int i19, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportActionWithUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if ((i19 & 8) != 0) {
            str = "";
        }
        java.lang.String commentator = str;
        y0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportActionWithUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        kotlin.jvm.internal.o.g(snsLocalId, "snsLocalId");
        kotlin.jvm.internal.o.g(commentator, "commentator");
        y0Var.c(i17, snsLocalId, i18, commentator, map);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportActionWithUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportActionWithUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
    }

    public final java.util.Map a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSnsTextUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (i17 > 0) {
            linkedHashMap.put("bubpulltype", java.lang.Integer.valueOf(i17));
        }
        linkedHashMap.put("txtselecttype", java.lang.Integer.valueOf(i18));
        linkedHashMap.put("txttype", java.lang.Integer.valueOf(f416865c ? 2 : 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSnsTextUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        return linkedHashMap;
    }

    public final java.lang.String b(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildUdfKvString", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        cl0.g gVar = new cl0.g();
        for (java.util.Map.Entry entry : map.entrySet()) {
            gVar.h((java.lang.String) entry.getKey(), entry.getValue());
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildUdfKvString", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        return t17;
    }

    public final void c(int i17, java.lang.String str, int i18, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
            return;
        }
        f416866d = false;
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(b17.field_snsId);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMenuActionReporter", "reportAction " + t07 + ", " + i17 + ' ' + i18);
        if (i18 == 1 && i17 == 10) {
            i17 = f416865c ? 11 : 10;
        }
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("contenttype", i18);
            gVar.o("sendtype", b17.field_type);
            gVar.h("feedid", t07);
            gVar.h("feedUsername", b17.getUserName());
            gVar.h("commentator", str2);
            com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct wCMomentsMenuActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct();
            wCMomentsMenuActionReportStruct.f62078f = i17;
            wCMomentsMenuActionReportStruct.f62076d = f416864b;
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            wCMomentsMenuActionReportStruct.f62077e = wCMomentsMenuActionReportStruct.b("snsinfo_", r26.i0.t(gVar2, ",", ";", false), true);
            if (!(map == null || map.isEmpty())) {
                wCMomentsMenuActionReportStruct.f62080h = wCMomentsMenuActionReportStruct.b("udf_kv", f416863a.b(map), true);
            }
            wCMomentsMenuActionReportStruct.k();
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMenuActionReporter", "reportAction error " + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
    }

    public final void d(int i17, java.lang.String snsLocalId, int i18, java.lang.String commentator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAction", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        kotlin.jvm.internal.o.g(snsLocalId, "snsLocalId");
        kotlin.jvm.internal.o.g(commentator, "commentator");
        c(i17, snsLocalId, i18, commentator, a(1, 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAction", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
    }
}
