package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class t0 extends com.tencent.mm.sdk.event.n {
    public t0() {
        super(0);
    }

    public static void b(com.tencent.mm.plugin.lite.logic.t0 t0Var, com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent) {
        java.lang.Runnable runnable;
        t0Var.getClass();
        if (getA8KeyRedirectEvent == null || (runnable = getA8KeyRedirectEvent.f192364d) == null) {
            return;
        }
        getA8KeyRedirectEvent.f54377h.f6554a = 2;
        runnable.run();
    }

    public com.tencent.liteapp.gen.LiteAppOpenScene c(android.os.Bundle bundle) {
        com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene = com.tencent.liteapp.gen.LiteAppOpenScene.APP;
        if (bundle == null || !bundle.containsKey("qbar_string_scan_source")) {
            return liteAppOpenScene;
        }
        int i17 = bundle.getInt("qbar_string_scan_source", 0);
        return i17 != 0 ? i17 != 1 ? (i17 == 2 || i17 == 4) ? com.tencent.liteapp.gen.LiteAppOpenScene.QR_CODE_FROM_LONG_PRESS : liteAppOpenScene : com.tencent.liteapp.gen.LiteAppOpenScene.QR_CODE_FROM_ALBUM : com.tencent.liteapp.gen.LiteAppOpenScene.QR_CODE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17;
        int i18;
        java.lang.String[] strArr;
        java.lang.String optString;
        am.df dfVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        double d17;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = (com.tencent.mm.autogen.events.GetA8KeyRedirectEvent) iEvent;
        if (gm0.j1.a()) {
            am.df dfVar2 = getA8KeyRedirectEvent.f54376g;
            int i19 = dfVar2.f6446a;
            java.lang.String str7 = "";
            if (i19 == 55) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(dfVar2.f6447b);
                    java.lang.Object opt = jSONObject.opt("extra");
                    if (opt != null) {
                        org.json.JSONObject jSONObject2 = opt instanceof java.lang.String ? new org.json.JSONObject((java.lang.String) opt) : opt instanceof org.json.JSONObject ? (org.json.JSONObject) opt : null;
                        if (jSONObject2 != null && (optString = jSONObject2.optString("appid")) != null) {
                            java.lang.String optString2 = jSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("query");
                            if (optJSONObject == null) {
                                optJSONObject = new org.json.JSONObject();
                            }
                            org.json.JSONObject jSONObject3 = optJSONObject;
                            com.tencent.mm.plugin.lite.p.f144149a.b(7, new com.tencent.liteapp.report.WxaLiteAppStartReport());
                            try {
                                java.lang.String optString3 = jSONObject.optString("url");
                                if (optString3 != null) {
                                    android.net.Uri parse = android.net.Uri.parse(optString3);
                                    for (java.util.Iterator<java.lang.String> it = parse.getQueryParameterNames().iterator(); it.hasNext(); it = it) {
                                        java.lang.String next = it.next();
                                        jSONObject3.put(next, parse.getQueryParameter(next));
                                    }
                                }
                                int optInt = jSONObject.optInt("ret", 0);
                                if (optInt != 0) {
                                    jSONObject3.put("ret", optInt);
                                }
                            } catch (org.json.JSONException unused) {
                            }
                            com.tencent.mm.plugin.lite.LiteAppCenter.releaseKeepAlive(optString);
                            org.json.JSONObject optJSONObject2 = jSONObject2.optJSONObject("option");
                            if (optJSONObject2 != null) {
                                dfVar = dfVar2;
                                boolean optBoolean = optJSONObject2.optBoolean("syncCheckUpdate", true);
                                boolean optBoolean2 = optJSONObject2.optBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, false);
                                z18 = optJSONObject2.optBoolean("isHalfScreen", false);
                                str = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT;
                                double optDouble = optJSONObject2.optDouble("heightPercent", 0.0d);
                                str3 = optJSONObject2.optString("minVersion", "");
                                java.lang.String optString4 = optJSONObject2.optString("animIn", "");
                                z19 = optBoolean;
                                str4 = optJSONObject2.optString("animOut", "");
                                str7 = optString4;
                                d17 = optDouble;
                                str2 = "currentAnimOut";
                                z17 = optBoolean2;
                            } else {
                                dfVar = dfVar2;
                                str = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT;
                                str2 = "currentAnimOut";
                                str3 = "";
                                str4 = str3;
                                z17 = false;
                                d17 = 0.0d;
                                z18 = false;
                                z19 = true;
                            }
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("appId", optString);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, optString2);
                            }
                            bundle.putString("query", jSONObject3.toString());
                            bundle.putBoolean("withDownloadLoading", false);
                            if (z17) {
                                z27 = true;
                                bundle.putBoolean(str, true);
                            } else {
                                z27 = true;
                            }
                            if (z18 && d17 > 0.0d) {
                                bundle.putBoolean("isHalfScreen", z27);
                                bundle.putDouble("heightPercent", d17);
                            }
                            if (u46.l.g(str3)) {
                                bundle.putString("minVersion", str3);
                            }
                            if (u46.l.g(str7)) {
                                try {
                                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                    jSONObject4.put("nextAnimIn", str7);
                                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                                    bundle.putInt("nextAnimIn", ra3.h0.a(jSONObject4));
                                } catch (org.json.JSONException e17) {
                                    str5 = "LiteAppDevQrCodeListener";
                                    com.tencent.mars.xlog.Log.printErrStackTrace(str5, e17, "animIn invalid, animIn: %s", str7);
                                }
                            }
                            str5 = "LiteAppDevQrCodeListener";
                            if (u46.l.g(str4)) {
                                try {
                                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                                    java.lang.String str8 = str2;
                                    str6 = str4;
                                    try {
                                        jSONObject5.put(str8, str6);
                                        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                                        bundle.putInt(str8, ra3.h0.b(jSONObject5));
                                    } catch (org.json.JSONException e18) {
                                        e = e18;
                                        com.tencent.mars.xlog.Log.printErrStackTrace(str5, e, "animOut invalid, animOut: %s", str6);
                                        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
                                        am.df dfVar3 = dfVar;
                                        liteAppReferrerInfo.scene = c(dfVar3.f6449d);
                                        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
                                        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk((android.content.Context) dfVar3.f6448c.get(), bundle, true, z19, new com.tencent.mm.plugin.lite.logic.s0(this, z17, getA8KeyRedirectEvent));
                                        return true;
                                    }
                                } catch (org.json.JSONException e19) {
                                    e = e19;
                                    str6 = str4;
                                }
                            }
                            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo2 = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
                            am.df dfVar32 = dfVar;
                            liteAppReferrerInfo2.scene = c(dfVar32.f6449d);
                            bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo2);
                            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk((android.content.Context) dfVar32.f6448c.get(), bundle, true, z19, new com.tencent.mm.plugin.lite.logic.s0(this, z17, getA8KeyRedirectEvent));
                        }
                    }
                } catch (java.lang.Exception unused2) {
                }
            } else if (i19 == 42) {
                java.lang.String str9 = dfVar2.f6447b;
                if (str9 != null && !str9.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("LiteAppDevQrCodeListener", "liteapp qrcode url:".concat(str9));
                    java.lang.String[] split = str9.split("\\?");
                    if (split != null) {
                        if (split.length < 1) {
                            i17 = 1;
                        } else {
                            java.lang.String[] strArr2 = new java.lang.String[2];
                            if (split.length == 1) {
                                i18 = 1;
                                strArr = strArr2;
                            } else {
                                java.lang.String str10 = split[1];
                                java.lang.String[] strArr3 = strArr2;
                                for (java.lang.String str11 : str10.split("&")) {
                                    java.lang.String[] split2 = str11.split("=");
                                    if ("entry".equals(split2[0].trim())) {
                                        strArr3 = ra3.h0.e(split2[1], true);
                                    }
                                }
                                i18 = 1;
                                str7 = str10;
                                strArr = strArr3;
                            }
                            int lastIndexOf = str9.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                int i27 = lastIndexOf + i18;
                                if (i27 <= str9.length()) {
                                    java.lang.String[] split3 = str9.substring(i27).split("_");
                                    if (split3.length < 2) {
                                        com.tencent.mars.xlog.Log.e("LiteAppDevQrCodeListener", "url is error. %s", str9);
                                    } else {
                                        com.tencent.mm.plugin.lite.p.f144149a.b(7, new com.tencent.liteapp.report.WxaLiteAppStartReport());
                                        java.lang.String str12 = split3[0];
                                        i17 = 1;
                                        java.lang.String str13 = split3[1];
                                        com.tencent.mm.plugin.lite.LiteAppCenter.releaseKeepAlive(str12);
                                        oq1.q qVar = new oq1.q();
                                        qVar.f347346a = str12;
                                        qVar.f347349d = str9;
                                        qVar.f347350e = str13;
                                        qVar.f347352g = "3056301006072a8648ce3d020106052b8104000a03420004d60415d0874b4e66bbbbdb598a2c5269caf1af51b2b23ef23a82f48c74d8bc268ae89b34912dbb5b494b3d44d3bc2f0bfc6619357a6679edb531679544de9987";
                                        com.tencent.liteapp.gen.LiteAppOpenScene c17 = c(dfVar2.f6449d);
                                        if (str12.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
                                            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.d(qVar, "debug", null, null, new com.tencent.mm.plugin.lite.logic.r0(this));
                                        } else {
                                            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "debug", null, null, new com.tencent.mm.plugin.lite.logic.n0(this, str7, strArr, c17, getA8KeyRedirectEvent));
                                        }
                                    }
                                }
                            } else {
                                i17 = i18;
                            }
                        }
                        return i17;
                    }
                }
                i17 = 1;
                return i17;
            }
            return true;
        }
        return false;
    }
}
