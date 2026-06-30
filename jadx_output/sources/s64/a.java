package s64;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final s64.a f403416a = new s64.a();

    public static final boolean a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "checkParseCombineShareJson, xml is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("type") && kotlin.jvm.internal.o.b("ad_canvas_page", jSONObject.optString("type"))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                return true;
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("CombineShareHelper", "checkParseCombineShareJson, exp is " + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        return false;
    }

    public static final boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (context == null) {
            com.tencent.mars.xlog.Log.e("CombineShareHelper", "doJumpAdLandingPageNativeUI, context is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "doJumpAdLandingPageNativeUI, adParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        if (!f403416a.e()) {
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "doJumpAdLandingPageNativeUI, not support combine share");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        try {
            if (a(str)) {
                boolean f17 = a84.o0.f(f(str), 5, context, l17, str4, str2, str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                return f17;
            }
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "doJumpAdLandingPageNativeUI, adParams type is not support");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("CombineShareHelper", "doJumpAdLandingPageNativeUI, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final s64.b f(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "parseCombineShareJson, xml is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return null;
        }
        try {
            str3 = new org.json.JSONObject(str);
            java.lang.String optString = str3.optString("pageId");
            java.lang.String str4 = optString == null ? "" : optString;
            java.lang.String optString2 = str3.optString("uxInfo");
            java.lang.String str5 = optString2 == null ? "" : optString2;
            java.lang.String optString3 = str3.optString("canvasDynamicInfo");
            java.lang.String str6 = optString3 == null ? "" : optString3;
            java.lang.String optString4 = str3.optString("canvasDynamicExtInfo");
            java.lang.String str7 = optString4 == null ? "" : optString4;
            java.lang.String optString5 = str3.optString("canvasDynamicLoadExtInfo");
            java.lang.String str8 = optString5 == null ? "" : optString5;
            java.lang.String optString6 = str3.optString("originSnsId");
            java.lang.String str9 = optString6 == null ? "" : optString6;
            java.lang.String optString7 = str3.optString("originUxInfo");
            if (optString7 == null) {
                optString7 = "";
            }
            int optInt = str3.optInt("originAdType");
            java.lang.String optString8 = str3.optString("originAid");
            if (optString8 == null) {
                optString8 = "";
            }
            java.lang.String optString9 = str3.optString("originTraceId");
            if (optString9 == null) {
                optString9 = "";
            }
            try {
                java.lang.String optString10 = str3.optString("originAdCanvasExt");
                if (optString10 == null) {
                    optString10 = "";
                }
                try {
                    int optInt2 = str3.optInt("isInteractiveCanvas");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseCombineShareJson, pageId is ");
                    sb6.append(str4);
                    sb6.append(", uxInfo is ");
                    sb6.append(str5);
                    sb6.append(", canvasDynamicInfo is ");
                    sb6.append(str6);
                    sb6.append(", canvasDynamicExtInfo is ");
                    sb6.append(str7);
                    sb6.append(", canvasDynamicLoadExtInfo is ");
                    sb6.append(str8);
                    sb6.append("originSnsId is ");
                    sb6.append(str9);
                    sb6.append(", originUxInfo is ");
                    sb6.append(optString7);
                    sb6.append(", originAdType is ");
                    sb6.append(optInt);
                    sb6.append(", originAid is ");
                    sb6.append(optString8);
                    sb6.append(", originTraceId is ");
                    sb6.append(optString9);
                    sb6.append(", originAdCanvasExt is ");
                    sb6.append(optString10);
                    str2 = ", isInteractiveCanvas is ";
                    sb6.append(", isInteractiveCanvas is ");
                    sb6.append(optInt2);
                    com.tencent.mars.xlog.Log.i("CombineShareHelper", sb6.toString());
                    org.json.JSONObject optJSONObject = str3.optJSONObject("giveHBCardInfo");
                    try {
                        if (optJSONObject == null) {
                            s64.b bVar = new s64.b(str4, str5, str6, str7, str8, str9, optString7, optInt, optString8, optString9, optString10, optInt2, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                            return bVar;
                        }
                        o44.d dVar = new o44.d();
                        dVar.f342886a = optJSONObject.optString("twistCardId");
                        dVar.f342887b = optJSONObject.optString("giveCardId");
                        dVar.f342888c = optJSONObject.optString("senderUserName");
                        dVar.f342889d = optJSONObject.optString("senderNickName");
                        dVar.f342890e = optJSONObject.optInt("subCardType");
                        dVar.f342891f = optJSONObject.optLong("shareTime");
                        com.tencent.mars.xlog.Log.i("CombineShareHelper", "parseCombineShareJson, twistCardId is " + dVar.f342886a + ", giveCardId is " + dVar.f342887b + ", senderUserName is " + dVar.f342888c + ", senderNickName is " + dVar.f342889d + ", subCardType is " + dVar.f342890e + ", shareTime is " + dVar.f342891f);
                        s64.b bVar2 = new s64.b(str4, str5, str6, str7, str8, str9, optString7, optInt, optString8, optString9, optString10, optInt2, dVar);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                        return bVar2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        com.tencent.mars.xlog.Log.e("CombineShareHelper", "parseCombineShareJson, exp is " + th);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
                        return null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str2 = "parseCombineShareJson";
                    str3 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                str3 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                str2 = "parseCombineShareJson";
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            str2 = "parseCombineShareJson";
            str3 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
        }
    }

    public final java.lang.String c(s64.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateAdCanvasShareXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("CombineShareHelper", "generateAdCanvasShareXml, combineShareParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateAdCanvasShareXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<canvasShareInfo>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageId", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageId", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String format = java.lang.String.format("<canvasId>%s</canvasId>", java.util.Arrays.copyOf(new java.lang.Object[]{bVar.f403417a}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        stringBuffer.append(format);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String format2 = java.lang.String.format("<uxInfo>%s</uxInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{bVar.f403418b}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        stringBuffer.append(format2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasDynamicInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasDynamicInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = bVar.f403419c;
        if (str == null) {
            str = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String format3 = java.lang.String.format("<canvasDynamicInfo>%s</canvasDynamicInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.t8.p(str)}, 1));
            kotlin.jvm.internal.o.f(format3, "format(...)");
            stringBuffer.append(format3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String str2 = bVar.f403420d;
        if (str2 == null) {
            str2 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String format4 = java.lang.String.format("<canvasDynamicExtInfo>%s</canvasDynamicExtInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.t8.p(str2)}, 1));
            kotlin.jvm.internal.o.f(format4, "format(...)");
            stringBuffer.append(format4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String str3 = bVar.f403421e;
        java.lang.String str4 = str3 != null ? str3 : "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            java.lang.String format5 = java.lang.String.format("<canvasDynamicLoadExtInfo>%s</canvasDynamicLoadExtInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.t8.p(str4)}, 1));
            kotlin.jvm.internal.o.f(format5, "format(...)");
            stringBuffer.append(format5);
        }
        stringBuffer.append("</canvasShareInfo>");
        com.tencent.mars.xlog.Log.i("CombineShareHelper", "generateAdCanvasShareXml, replacedXml is " + ((java.lang.Object) stringBuffer));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateAdCanvasShareXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        return stringBuffer2;
    }

    public final java.lang.String d(s64.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateAdCanvasXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("CombineShareHelper", "generateAdCanvasXml, combineShareParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateAdCanvasXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<adCanvasInfo>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        int i17 = bVar.f403428l;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
            java.lang.String format = java.lang.String.format("<isInteractiveCanvas>%s</isInteractiveCanvas>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            stringBuffer.append(format);
        }
        if (bVar.a() != null) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<giveHBCardInfo><twistCardId>");
            stringBuffer2.append(bVar.a().f342886a);
            stringBuffer2.append("</twistCardId><giveCardId>");
            stringBuffer2.append(bVar.a().f342887b);
            stringBuffer2.append("</giveCardId><senderUserName>");
            stringBuffer2.append(bVar.a().f342888c);
            stringBuffer2.append("</senderUserName><senderNickName>");
            stringBuffer2.append(bVar.a().f342889d);
            stringBuffer2.append("</senderNickName><subCardType>");
            stringBuffer2.append(bVar.a().f342890e);
            stringBuffer2.append("</subCardType><shareTime>");
            stringBuffer2.append(bVar.a().f342891f);
            stringBuffer2.append("</shareTime></giveHBCardInfo>");
            stringBuffer.append(stringBuffer2.toString());
        }
        stringBuffer.append("</adCanvasInfo>");
        com.tencent.mars.xlog.Log.i("CombineShareHelper", "generateAdCanvasXml, replacedXml is " + ((java.lang.Object) stringBuffer));
        java.lang.String stringBuffer3 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer3, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateAdCanvasXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        return stringBuffer3;
    }

    public final boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportCombineShare", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        try {
            boolean z17 = true;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_combine_share_landing_page, 1);
            com.tencent.mars.xlog.Log.i("CombineShareHelper", "isSupportCombineShare is " + Ni);
            if (Ni != 1) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportCombineShare", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("CombineShareHelper", "isSupportCombineShare, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportCombineShare", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
    }
}
