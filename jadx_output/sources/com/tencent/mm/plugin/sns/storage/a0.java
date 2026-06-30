package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.sns.storage.b0 a(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Float f17;
        java.lang.Float f18;
        java.lang.Integer h19;
        java.lang.Integer h27;
        java.lang.Integer h28;
        java.lang.Integer h29;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
            return null;
        }
        if (!map.containsKey(str)) {
            com.tencent.mars.xlog.Log.e("AdBreakFrameClickInfo.adClickArea", "parseClickInfo, xml values no prefKey=".concat(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".areaLeft"));
        int i17 = 0;
        int intValue = (str2 == null || (h29 = r26.h0.h(str2)) == null) ? 0 : h29.intValue();
        java.lang.String str3 = (java.lang.String) map.get(str.concat(".areaTop"));
        int intValue2 = (str3 == null || (h28 = r26.h0.h(str3)) == null) ? 0 : h28.intValue();
        java.lang.String str4 = (java.lang.String) map.get(str.concat(".areaWidth"));
        int intValue3 = (str4 == null || (h27 = r26.h0.h(str4)) == null) ? 0 : h27.intValue();
        java.lang.String str5 = (java.lang.String) map.get(str.concat(".areaHeight"));
        int intValue4 = (str5 == null || (h19 = r26.h0.h(str5)) == null) ? 0 : h19.intValue();
        java.lang.String str6 = (java.lang.String) map.get(str.concat(".clickStartTime"));
        float floatValue = (str6 == null || (f18 = r26.g0.f(str6)) == null) ? 0.0f : f18.floatValue();
        java.lang.String str7 = (java.lang.String) map.get(str.concat(".clickEndTime"));
        float floatValue2 = (str7 == null || (f17 = r26.g0.f(str7)) == null) ? 0.0f : f17.floatValue();
        java.lang.String str8 = (java.lang.String) map.get(str.concat(".forbidClick"));
        boolean z17 = ((str8 == null || (h18 = r26.h0.h(str8)) == null) ? 0 : h18.intValue()) == 1;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f19 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".clickActionInfo"));
        java.lang.String str9 = (java.lang.String) map.get(str.concat(".clickReportIndex"));
        if (str9 != null && (h17 = r26.h0.h(str9)) != null) {
            i17 = h17.intValue();
        }
        com.tencent.mm.plugin.sns.storage.b0 b0Var = new com.tencent.mm.plugin.sns.storage.b0(intValue, intValue2, intValue3, intValue4, floatValue, floatValue2, z17, f19, i17);
        com.tencent.mars.xlog.Log.i("AdBreakFrameClickInfo.adClickArea", "parseClickInfo=" + b0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
        return b0Var;
    }
}
