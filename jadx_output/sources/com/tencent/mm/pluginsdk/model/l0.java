package com.tencent.mm.pluginsdk.model;

@j95.b
/* loaded from: classes4.dex */
public final class l0 extends i95.w implements o72.t3 {
    public java.lang.String wi(java.lang.String str) {
        java.lang.String str2;
        int D1;
        java.lang.String str3;
        java.lang.String str4 = "convertTransmitXmlToAdParamsJson, pageId is ";
        java.lang.String str5 = "convertTransmitXmlToAdParamsJson";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, xml is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        if (!s64.a.f403416a.e()) {
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, not support combine share");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, dm.n.COL_ADXML, null);
            try {
                if (d17 != null && !d17.isEmpty()) {
                    java.lang.String str6 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasId");
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                        str6 = (java.lang.String) d17.get(".adxml.adCanvasInfo.pageID");
                        if (str6 == null) {
                            str6 = "";
                        }
                        com.tencent.mars.xlog.Log.w("CombineShareHelper", "canvasShareInfo canvasId is null but pageId is not null");
                    }
                    java.lang.String str7 = (java.lang.String) d17.get(".adxml.canvasShareInfo.uxInfo");
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.String str8 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasDynamicInfo");
                    if (str8 == null) {
                        str8 = "";
                    }
                    java.lang.String str9 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasDynamicExtInfo");
                    if (str9 == null) {
                        str9 = "";
                    }
                    java.lang.String str10 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasDynamicLoadExtInfo");
                    if (str10 == null) {
                        str10 = "";
                    }
                    java.lang.String str11 = (java.lang.String) d17.get(".adxml.originSnsId");
                    if (str11 == null) {
                        str11 = "";
                    }
                    java.lang.String str12 = (java.lang.String) d17.get(".adxml.originUxInfo");
                    if (str12 == null) {
                        str12 = "";
                    }
                    str2 = "";
                    try {
                        try {
                            D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".adxml.originAdType"), 0);
                            str3 = (java.lang.String) d17.get(".adxml.originAid");
                            if (str3 == null) {
                                str3 = str2;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                            str4 = "convertTransmitXmlToAdParamsJson";
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str4 = "convertTransmitXmlToAdParamsJson";
                        str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                    }
                    try {
                        java.lang.String str13 = (java.lang.String) d17.get(".adxml.originTraceId");
                        if (str13 == null) {
                            str13 = str2;
                        }
                        java.lang.String str14 = (java.lang.String) d17.get(".adxml.originAdCanvasExt");
                        java.lang.String str15 = str10;
                        if (str14 == null) {
                            str14 = str2;
                        }
                        java.lang.String str16 = str9;
                        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".adxml.adCanvasInfo.isInteractiveCanvas"), 0);
                        o44.d b17 = o44.d.b(d17, ".adxml.adCanvasInfo");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str7) && !com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                            com.tencent.mars.xlog.Log.w("CombineShareHelper", "uxInfo is null but originUxInfo is not null");
                            str7 = str12;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str12) && (com.tencent.mm.sdk.platformtools.t8.K0(str3) || kotlin.jvm.internal.o.b("null", str3))) {
                            str3 = ca4.m0.D(str12);
                            com.tencent.mars.xlog.Log.w("CombineShareHelper", "originAid is null but originUxInfo is not null");
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str12) && (com.tencent.mm.sdk.platformtools.t8.K0(str13) || kotlin.jvm.internal.o.b("null", str13))) {
                            str13 = ca4.m0.P(str12);
                            com.tencent.mars.xlog.Log.w("CombineShareHelper", "originTraceId is null but originUxInfo is not null");
                        }
                        com.tencent.mars.xlog.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, pageId is " + str6 + ", uxInfo is " + str7 + ", snsId is " + str11 + ", originUxInfo is " + str12 + ", originAdType is " + D1 + ", originAid is " + str3 + ", originTraceId is " + str13 + ", originAdCanvasExt is " + str14 + ", isInteractiveCanvas is " + D12 + ", canvasDynamicInfo is " + str8 + ", canvasDynamicExtInfo is " + str16 + ", canvasDynamicLoadExtInfo is " + str15 + ", costTime is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", "ad_canvas_page");
                        jSONObject.put("pageId", str6);
                        jSONObject.put("uxInfo", str7);
                        jSONObject.put("canvasDynamicInfo", str8);
                        jSONObject.put("canvasDynamicExtInfo", str16);
                        jSONObject.put("canvasDynamicLoadExtInfo", str15);
                        jSONObject.put("originSnsId", str11);
                        jSONObject.put("originUxInfo", str12);
                        jSONObject.put("originAdType", D1);
                        jSONObject.put("originAid", str3);
                        jSONObject.put("originTraceId", str13);
                        jSONObject.put("originAdCanvasExt", str14);
                        jSONObject.put("isInteractiveCanvas", D12);
                        if (b17 != null) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("twistCardId", b17.f342886a);
                            jSONObject2.put("giveCardId", b17.f342887b);
                            jSONObject2.put("senderUserName", b17.f342888c);
                            jSONObject2.put("senderNickName", b17.f342889d);
                            jSONObject2.put("subCardType", b17.f342890e);
                            jSONObject2.put("shareTime", b17.f342891f);
                            jSONObject.put("giveHBCardInfo", jSONObject2);
                            com.tencent.mars.xlog.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, twistCardId is " + b17.f342886a + ", giveCardId is " + b17.f342887b + ", senderUserName is " + b17.f342888c + ", senderNickName is " + b17.f342889d + ", subCardType is " + b17.f342890e + ", shareTime is " + b17.f342891f);
                        }
                        java.lang.String jSONObject3 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                        return jSONObject3;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        str4 = "convertTransmitXmlToAdParamsJson";
                        str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                        com.tencent.mars.xlog.Log.e("CombineShareHelper", "convertTransmitXmlToAdParamsJson, exp is " + th);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
                        return str2;
                    }
                }
                str2 = "";
                com.tencent.mars.xlog.Log.e("CombineShareHelper", "convertTransmitXmlToAdParamsJson, values is null or empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            str4 = "convertTransmitXmlToAdParamsJson";
            str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
            str2 = "";
        }
        return str2;
    }
}
