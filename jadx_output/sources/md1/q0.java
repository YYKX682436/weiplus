package md1;

/* loaded from: classes7.dex */
public abstract class q0 extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f325785g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f325786h = 2;

    public void C(java.util.Map map, int i17) {
        map.put("errCode", java.lang.Integer.valueOf(i17));
    }

    public int D(int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        if (i17 != -10086 && i17 != -10087) {
            return -1000;
        }
        if (i18 == -9) {
            return -3;
        }
        if (i18 == -7) {
            return -2;
        }
        if (i18 != -1) {
            return i18 != 0 ? -1000 : 0;
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (c0Var.Z0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no page context");
            return;
        }
        if (c0Var.t3().N0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "wx assistant is enable");
            java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        si1.e1.a(c0Var.getAppId(), new md1.o0(this, c0Var, jSONObject, i17));
        android.content.Context f147807d = c0Var.getF147807d();
        boolean z18 = false;
        if (f147807d == null || !(f147807d instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "fail, requestAudioPermission pageContext is null");
            c0Var.a(i17, o("fail: context is null"));
            z17 = false;
        } else {
            z17 = nf.t.a((android.app.Activity) f147807d, c0Var, "android.permission.RECORD_AUDIO", 121, "", "");
            if (z17) {
                si1.e1.c(c0Var.getAppId());
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission is fail");
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no record audio permission");
            c0Var.a(i17, o("fail: no record audio permission"));
            return;
        }
        if (jSONObject.optInt("roomType", 2) == 1) {
            si1.e1.a(c0Var.getAppId(), new md1.p0(this, c0Var, jSONObject, i17));
            android.content.Context f147807d2 = c0Var.getF147807d();
            if (f147807d2 == null || !(f147807d2 instanceof android.app.Activity)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "fail, requestCameraPermission pageContext is null");
                c0Var.a(i17, o("fail: context is null"));
            } else {
                z18 = nf.t.a((android.app.Activity) f147807d2, c0Var, "android.permission.CAMERA", 122, "", "");
                if (z18) {
                    si1.e1.c(c0Var.getAppId());
                }
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission is fail");
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no record video permission");
                c0Var.a(i17, o("fail: no record video permission"));
                return;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "no need to request camera permission");
        }
        com.tencent.mm.plugin.appbrand.page.d5 x07 = c0Var.t3().x0();
        if (x07.getCurrentPage() != null || x07.getCurrentPage().getCurrentPageView() != null) {
            this.f325785g = x07.getCurrentPage().getCurrentPageView();
        }
        this.f325786h = jSONObject.optInt("roomType", 2);
        F(c0Var, jSONObject, i17);
    }

    public abstract void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17);

    public fw1.b G(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        fw1.b bVar = new fw1.b();
        fw1.a aVar = bVar.f267057k;
        try {
            bVar.f267048b = c0Var.getAppId();
            bVar.f267050d = jSONObject.optString("signature", "");
            bVar.f267051e = jSONObject.optString("nonceStr", "");
            bVar.f267052f = jSONObject.optString("groupId", "");
            bVar.f267053g = jSONObject.optInt("timeStamp", 0);
            bVar.f267060n = jSONObject.optInt("lifespan", 86400);
            bVar.f267054h = jSONObject.optInt("roomType", 2);
            bVar.f267055i = jSONObject.optInt("maxWidth", 480);
            bVar.f267056j = jSONObject.optInt("maxHeight", 640);
            bVar.f267058l = jSONObject.optString("privateData", "");
            bVar.f267059m = jSONObject.optString("sessionKey", "");
            if (jSONObject.has("roomIdStr")) {
                java.lang.String optString = jSONObject.optString("roomIdStr", "");
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "roomIdStr:%s", optString);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    bVar.f267061o = com.tencent.mm.sdk.platformtools.t8.F1(optString, -1L);
                }
            }
            if (bVar.f267061o == -1) {
                bVar.f267061o = jSONObject.optLong("roomId", -1L);
            }
            bVar.f267062p = jSONObject.optInt("videoRatio", 133);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("muteConfig");
            aVar.f267044a = jSONObject2.optBoolean("muteMicrophone", false);
            aVar.f267045b = jSONObject2.optBoolean("muteEarphone", false);
            aVar.f267046c = jSONObject.optBoolean("handsFree", false);
            bVar.f267047a = (c0Var.t3() == null || !c0Var.t3().q2()) ? 1 : 0;
            bVar.f267065s = jSONObject.optInt("fixedVideoResolution", 640);
            bVar.f267064r = jSONObject.optInt("maxDecodeFPS", 15);
            bVar.f267063q = jSONObject.optInt("videoRotation", 2);
            return bVar;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoice.JsApiOpenVoiceBase", e17, "handle join voice voip data exception", new java.lang.Object[0]);
            return null;
        }
    }
}
