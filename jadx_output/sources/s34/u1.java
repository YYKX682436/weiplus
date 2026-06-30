package s34;

/* loaded from: classes4.dex */
public final class u1 {
    public u1(kotlin.jvm.internal.i iVar) {
    }

    public final s34.v1 a(org.json.JSONObject json) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem$Companion");
        kotlin.jvm.internal.o.g(json, "json");
        s34.v1 v1Var = new s34.v1();
        java.lang.String optString = json.optString("aid");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAid", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402788a = optString;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAid", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString2 = json.optString("traceId");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTraceId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402789b = optString2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTraceId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString3 = json.optString("groupId");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402790c = optString3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString4 = json.optString("clickReportUrl");
        kotlin.jvm.internal.o.f(optString4, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402791d = optString4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString5 = json.optString("exposureReportUrl");
        kotlin.jvm.internal.o.f(optString5, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposureReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402792e = optString5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposureReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        kotlin.jvm.internal.o.f(json.optString("uxinfo"), "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUxinfo", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUxinfo", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString6 = json.optString("adPosId");
        kotlin.jvm.internal.o.f(optString6, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdPosId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402793f = optString6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdPosId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString7 = json.optString("tid");
        kotlin.jvm.internal.o.f(optString7, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTid", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402794g = optString7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTid", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString8 = json.optString("reportExtraData");
        kotlin.jvm.internal.o.f(optString8, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReportExtraData", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402795h = optString8;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReportExtraData", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString9 = json.optString("priceStr");
        kotlin.jvm.internal.o.f(optString9, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPriceStr", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402796i = optString9;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPriceStr", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        s34.h1 h1Var = s34.i1.f402669c;
        s34.i1 a17 = h1Var.a(json.optJSONObject("bgColor"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402797j = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        s34.i1 a18 = h1Var.a(json.optJSONObject("nameTextColor"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNameTextColor", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402798k = a18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNameTextColor", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        java.lang.String optString10 = json.optString("nameText");
        kotlin.jvm.internal.o.f(optString10, "optString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNameText", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        v1Var.f402799l = optString10;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNameText", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem$Companion");
        return v1Var;
    }
}
