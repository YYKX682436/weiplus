package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class h3 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.lite.jsapi.comms.g3 f143592g = new com.tencent.mm.plugin.lite.jsapi.comms.g3();

    public com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig A(org.json.JSONObject jSONObject) {
        return com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f77389f;
    }

    public l81.e1 B(boolean z17) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.f3(this, z17);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        k91.s2 s2Var;
        org.json.JSONObject jSONObject2;
        java.lang.Object obj;
        org.json.JSONObject jSONObject3;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.lite.jsapi.comms.h3 h3Var;
        java.lang.String optString = jSONObject.optString("targetAppId");
        java.lang.String optString2 = jSONObject.optString("weAppUserName");
        java.lang.String format = java.lang.String.format("liteapp://%s", str);
        java.lang.String optString3 = jSONObject.optString("referrerAppId");
        java.lang.String optString4 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String optString5 = jSONObject.optString("privateExtraData");
        java.lang.String optString6 = jSONObject.optString("mode");
        boolean optBoolean = jSONObject.optBoolean("isRedirect", false);
        boolean optBoolean2 = jSONObject.optBoolean("isTransparent", false);
        k91.s2 s2Var2 = k91.s2.f305761e;
        java.lang.String optString7 = jSONObject.optString("enterType", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH);
        if (!optString7.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH) && optString7.equals("modal")) {
            s2Var2 = k91.s2.f305760d;
        }
        k91.b1 b1Var = k91.b1.f305540d;
        java.lang.String optString8 = jSONObject.optString("loadingDarkModeStyle");
        if (optString8 != null) {
            if (optString8.equals("dark")) {
                b1Var = k91.b1.f305542f;
            } else if (optString8.equals("light")) {
                b1Var = k91.b1.f305541e;
            }
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1317);
        java.lang.String optString9 = jSONObject.optString("sceneNote");
        java.lang.String optString10 = jSONObject.optString("liteGameInfo");
        k91.b1 b1Var2 = b1Var;
        if (jSONObject.has("halfPage")) {
            jSONObject2 = jSONObject.optJSONObject("halfPage");
            s2Var = s2Var2;
        } else {
            s2Var = s2Var2;
            jSONObject2 = null;
        }
        if (jSONObject.has("singlePage")) {
            jSONObject3 = jSONObject.optJSONObject("singlePage");
            obj = "singlePage";
        } else {
            obj = "singlePage";
            jSONObject3 = null;
        }
        org.json.JSONObject optJSONObject = jSONObject.has("uiParam") ? jSONObject.optJSONObject("uiParam") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            this.f143443f.a("invalid_targetAppId and weAppUserName");
            return;
        }
        l81.b1 b1Var3 = new l81.b1();
        java.lang.String optString11 = jSONObject.optString("envVersion");
        if (optString11 == null) {
            optString11 = "";
            str2 = optString11;
        } else {
            str2 = "";
        }
        int i17 = !optString11.equals("trial") ? !optString11.equals("develop") ? 0 : 1 : 2;
        if (!jSONObject.optBoolean("openDataChannel") || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            str3 = "liteGameInfo";
        } else {
            com.tencent.mm.plugin.lite.jsapi.comms.g3 g3Var = f143592g;
            g3Var.f143585c.dead();
            g3Var.f143585c.alive();
            g3Var.f143583a = optString;
            g3Var.f143584b = new com.tencent.mm.plugin.lite.jsapi.comms.d3(this);
            str3 = "liteGameInfo";
            com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchMiniProgram", "add app data callback. appId: %s", optString);
            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(optString, g3Var.f143584b);
        }
        java.lang.String optString12 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            b1Var3.f317012a = optString2;
        } else {
            b1Var3.f317014b = optString;
        }
        b1Var3.f317016c = i17;
        b1Var3.f317022f = optString12;
        b1Var3.f317032k = optInt;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString9)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(fp.s0.a(format == null ? str2 : format));
            sb6.append(":");
            sb6.append(optString3);
            sb6.append(":0");
            optString9 = sb6.toString();
        }
        b1Var3.f317034l = optString9;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var3.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77324f = optString4;
        appBrandLaunchReferrer.f77325g = optString5;
        appBrandLaunchReferrer.f77323e = optString3;
        appBrandLaunchReferrer.f77327i = format;
        appBrandLaunchReferrer.f77322d = 2;
        if (optBoolean2) {
            b1Var3.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var3.S = y3Var;
            b1Var3.T = y3Var;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString(str3))) {
            com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig appBrandCustomLoadingConfig = new com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig();
            b1Var3.Y = appBrandCustomLoadingConfig;
            appBrandCustomLoadingConfig.f77204e = optString10;
        }
        if (!optString6.equals("halfPage")) {
            h3Var = this;
            k91.s2 s2Var3 = s2Var;
            if (optString6.equals(obj)) {
                org.json.JSONObject jSONObject4 = jSONObject3;
                if (jSONObject4 != null) {
                    boolean optBoolean3 = jSONObject4.optBoolean("needShowTemplateNav");
                    boolean optBoolean4 = jSONObject4.optBoolean("hideCapsuleMenu");
                    java.lang.String optString13 = jSONObject4.optString("capsuleMenuType");
                    boolean optBoolean5 = jSONObject4.optBoolean("showShareButton");
                    boolean optBoolean6 = jSONObject4.optBoolean("forceLightMode", false);
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f77389f;
                    if (optBoolean5) {
                        shareActionConfig = h3Var.A(jSONObject);
                    }
                    k91.t2 t2Var = k91.t2.f305766d;
                    if (optBoolean4) {
                        t2Var = k91.t2.f305768f;
                    } else if ("singleClose".equals(optString13)) {
                        t2Var = k91.t2.f305767e;
                    }
                    com.tencent.mm.plugin.appbrand.config.l lVar = new com.tencent.mm.plugin.appbrand.config.l();
                    lVar.f77521a = true;
                    lVar.f77531k = t2Var;
                    lVar.f77534n = optBoolean3;
                    lVar.f77526f = s2Var3;
                    lVar.f77530j = optBoolean6;
                    lVar.f77538r = b1Var2;
                    kotlin.jvm.internal.o.g(shareActionConfig, "shareActionConfig");
                    lVar.f77541u = shareActionConfig;
                    b1Var3.G = lVar.a();
                }
            } else if (optJSONObject != null) {
                boolean optBoolean7 = optJSONObject.optBoolean("needShowTemplateNav");
                boolean optBoolean8 = optJSONObject.optBoolean("hideCapsuleMenu");
                java.lang.String optString14 = optJSONObject.optString("capsuleMenuType");
                boolean optBoolean9 = optJSONObject.optBoolean("showShareButton");
                boolean optBoolean10 = optJSONObject.optBoolean("forceLightMode", false);
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig2 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f77389f;
                if (optBoolean9) {
                    shareActionConfig2 = h3Var.A(jSONObject);
                }
                k91.t2 t2Var2 = k91.t2.f305766d;
                if (optBoolean8) {
                    t2Var2 = k91.t2.f305768f;
                } else if ("singleClose".equals(optString14)) {
                    t2Var2 = k91.t2.f305767e;
                }
                com.tencent.mm.plugin.appbrand.config.l lVar2 = new com.tencent.mm.plugin.appbrand.config.l();
                lVar2.f77521a = true;
                lVar2.f77531k = t2Var2;
                lVar2.f77534n = optBoolean7;
                lVar2.f77530j = optBoolean10;
                lVar2.f77526f = s2Var3;
                lVar2.f77538r = b1Var2;
                kotlin.jvm.internal.o.g(shareActionConfig2, "shareActionConfig");
                lVar2.f77541u = shareActionConfig2;
                b1Var3.G = lVar2.a();
            }
        } else if (jSONObject2 != null) {
            b1Var3.f317048z = 2;
            org.json.JSONObject jSONObject5 = jSONObject2;
            int optInt2 = jSONObject5.optInt("height", -2);
            boolean optBoolean11 = jSONObject5.optBoolean("enableFullScreenGesture");
            boolean optBoolean12 = jSONObject5.optBoolean("needShowTemplateNav");
            boolean optBoolean13 = jSONObject5.optBoolean("hideCapsuleMenu");
            java.lang.String optString15 = jSONObject5.optString("capsuleMenuType");
            boolean optBoolean14 = jSONObject5.optBoolean("showShareButton");
            boolean optBoolean15 = jSONObject5.optBoolean("forbidFullScreenDragUpGesture", false);
            boolean optBoolean16 = jSONObject5.optBoolean("forceLightMode", false);
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig3 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f77389f;
            h3Var = this;
            if (optBoolean14) {
                shareActionConfig3 = h3Var.A(jSONObject);
            }
            k91.t2 t2Var3 = k91.t2.f305766d;
            if (optBoolean13) {
                t2Var3 = k91.t2.f305768f;
            } else if ("singleClose".equals(optString15)) {
                t2Var3 = k91.t2.f305767e;
            }
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), true, true, false, false);
            com.tencent.mm.plugin.appbrand.config.l lVar3 = new com.tencent.mm.plugin.appbrand.config.l();
            lVar3.f77521a = true;
            lVar3.f77522b = optInt2;
            lVar3.f77523c = -2;
            lVar3.f77524d = -2;
            lVar3.f77525e = -2;
            lVar3.f77526f = s2Var;
            lVar3.f77531k = t2Var3;
            lVar3.f77527g = true;
            lVar3.f77529i = backgroundShapeConfig;
            lVar3.f77539s = true;
            lVar3.f77530j = optBoolean16;
            lVar3.f77533m = optBoolean15;
            lVar3.f77538r = b1Var2;
            lVar3.f77532l = optBoolean11;
            lVar3.f77534n = optBoolean12;
            kotlin.jvm.internal.o.g(shareActionConfig3, "shareActionConfig");
            lVar3.f77541u = shareActionConfig3;
            b1Var3.G = lVar3.a();
        } else {
            h3Var = this;
        }
        b1Var3.L = h3Var.B(optBoolean);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("shareProductItem");
        if (optJSONObject2 != null) {
            java.lang.String str4 = str2;
            java.lang.String finderUsername = optJSONObject2.optString("finderUsername", str4);
            ((com.tencent.mm.feature.finder.live.t6) ((s40.b1) i95.n0.c(s40.b1.class))).getClass();
            kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
            zl2.b0.f473663a.a(finderUsername, str4, b1Var3);
            long optLong = optJSONObject2.optLong("productId", 0L);
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Dj(optJSONObject2.optString("entranceGMsgID", str4), b1Var3);
            ((com.tencent.mm.feature.finder.live.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Vi(c(), b1Var3, finderUsername, optLong);
        } else {
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(c(), b1Var3);
        }
        h3Var.f143443f.d(false);
    }
}
