package l44;

/* loaded from: classes4.dex */
public class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f316365a = new java.util.LinkedList();

    public static l44.t5 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        l44.t5 t5Var = new l44.t5();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        return t5Var;
    }

    public l44.t5 a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendDelLogItem", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        try {
            r45.j3 j3Var = new r45.j3();
            j3Var.f377526d = 13298;
            j3Var.f377528f = java.lang.System.currentTimeMillis() / 1000;
            java.lang.String str3 = (android.text.TextUtils.isEmpty(str) ? "" : java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c)) + "," + i17 + "," + i18 + "," + str2;
            j3Var.f377527e = new com.tencent.mm.protobuf.g(str3.getBytes());
            this.f316365a.add(j3Var);
            com.tencent.mars.xlog.Log.i("SnsAdLogItemReportHelper", "add logItem:".concat(str3));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdLogItemReportHelper", "appendDelLogItem, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendDelLogItem", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        return this;
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        l44.u5.a(this.f316365a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
    }
}
