package sc1;

/* loaded from: classes7.dex */
public class x0 extends gb1.d {
    private static final int CTRL_INDEX = 360;
    public static final java.lang.String NAME = "insertLivePusher";

    /* renamed from: g, reason: collision with root package name */
    public int f405735g;

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        sc1.m1.a();
        if (lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class) != null && ((com.tencent.mm.plugin.appbrand.wxassistant.q2) lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)).g4()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "wx assistant is enabled, return");
            str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        if (lVar.getContext() instanceof android.app.Activity) {
            this.f405735g = 0;
            P((android.app.Activity) lVar.getContext(), lVar, jSONObject, i17);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertLivePusher", "invokeAfterRequestPermission pageContext not activity");
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, u(str, jSONObject3));
        si1.e1.c(lVar.getAppId());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("livePusherId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(tVar.getContext(), new com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView(tVar.getContext()));
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onInsertView livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.rtmp.TXLiveBase.setAppVersion(java.lang.String.format("weixin_%s", tVar.getAppId()));
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = (com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.class);
        if (appBrandLivePusherView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "pusherView null");
            return;
        }
        sc1.h0 h0Var = new sc1.h0(this, appBrandLivePusherView);
        sc1.i0 i0Var = new sc1.i0(this, appBrandLivePusherView);
        sc1.j0 j0Var = new sc1.j0(this, appBrandLivePusherView, tVar);
        sc1.k0 k0Var = new sc1.k0(this, appBrandLivePusherView, tVar, j0Var);
        tVar.U(h0Var);
        tVar.R(i0Var);
        tVar.w(k0Var);
        appBrandLivePusherView.setOnExitListener(new sc1.l0(this, tVar, h0Var, i0Var));
        com.tencent.mm.plugin.appbrand.x0.a(tVar.getAppId(), j0Var);
        appBrandLivePusherView.setOnPushEventListener(new sc1.m0(this, i17, tVar));
        appBrandLivePusherView.setBGMNotifyListener(new sc1.n0(this, i17, tVar));
        appBrandLivePusherView.setOnErrorListener(new sc1.o0(this, i17, tVar));
        appBrandLivePusherView.setAudioVolumeNotifyListener(new sc1.p0(this, i17, tVar));
        if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            appBrandLivePusherView.f81569h = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, appBrandLivePusherView.f81569h);
            jSONObject.optString("filterImageMd5", null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandLivePusherView.f81569h)) {
                try {
                    jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertLivePusher", "parseFilterImage, ignore exception:%s", e17);
                }
            } else if (appBrandLivePusherView.f81569h.startsWith("http://") || appBrandLivePusherView.f81569h.startsWith("https://")) {
                jSONObject.remove(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            }
        }
        sc1.k1 n17 = ((sc1.q1) appBrandLivePusherView.f81570i).n(appBrandLivePusherView, sc1.n1.b(jSONObject));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onInsert code:%d info:%s", java.lang.Integer.valueOf(n17.f405688a), n17.f405689b);
        java.lang.String optString = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE);
        java.lang.String optString2 = jSONObject.optString("backgroundMD5");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, url is null");
        } else {
            com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, optString, optString2, new sc1.a0(this, appBrandLivePusherView, optString));
        }
        java.lang.String optString3 = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "convertFilterImageToLocalPath, url is null");
        } else {
            com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, optString3, null, new sc1.b0(this, appBrandLivePusherView, optString3));
        }
        java.lang.String optString4 = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE);
        java.lang.String optString5 = jSONObject.optString("watermarkMD5");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "convertWatermarkImageToLocalPath, url is null");
        } else {
            com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, optString4, optString5, new sc1.c0(this, appBrandLivePusherView));
        }
        appBrandLivePusherView.setContentDescription(view.getContext().getString(com.tencent.mm.R.string.f490021ip));
    }

    public final void P(android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18 = this.f405735g;
        this.f405735g = i18 + 1;
        if (i18 > 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, avoid dead loop");
            return;
        }
        si1.e1.a(lVar.getAppId(), new sc1.e0(this, activity, lVar, jSONObject, i17));
        si1.e1.a(lVar.getAppId(), new sc1.g0(this, activity, lVar, jSONObject, i17));
        if (!nf.t.a(activity, lVar, "android.permission.CAMERA", 117, "", "")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retCameraPermission");
        } else if (!nf.t.a(activity, lVar, "android.permission.RECORD_AUDIO", 118, "", "")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retMicrophonePermission");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
            B(lVar, jSONObject, i17, lVar.getJsRuntime());
        }
    }
}
