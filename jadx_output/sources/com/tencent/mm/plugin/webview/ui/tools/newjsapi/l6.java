package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/l6;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenBizPublishImage$IPCBizPublishImageRet;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class l6 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet> {
    public final l81.b1 a(org.json.JSONObject jSONObject) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wx0b2ec076ec39c786";
        b1Var.f317032k = jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) ? com.tencent.mm.sdk.platformtools.t8.D1(jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0) : 1018;
        b1Var.f317034l = jSONObject.optString("sceneNote");
        java.lang.String optString = jSONObject.optString("relativeURL");
        if (optString.length() == 0) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            tk.v vVar = tk.w.f419878e;
            java.lang.String optString2 = jSONObject.optString("mpPublishAction");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            optString = ((ox.g) oVar).ij(vVar.a(optString2));
        }
        b1Var.f317022f = optString;
        b1Var.f317018d = com.tencent.mm.sdk.platformtools.t8.D1(jSONObject.optString("appVersion"), 0);
        b1Var.f317028i = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k6(jSONObject);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 2;
        appBrandLaunchReferrer.f77325g = jSONObject.optString("privateExtraData");
        appBrandLaunchReferrer.f77324f = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        appBrandLaunchReferrer.f77323e = jSONObject.optString("sourceAppId");
        b1Var.f317041s = appBrandLaunchReferrer;
        return b1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.ipcinvoker.type.IPCString data = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(data.f68406d);
            boolean optBoolean = jSONObject.optBoolean("useDraft", false);
            if (jSONObject.has("draftType") && jSONObject.has("draftScene")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImage", "has draftType and draftScene");
                tk.a Bi = ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Bi(a(jSONObject));
                tk.s[] sVarArr = tk.s.f419870d;
                int optInt = jSONObject.optInt("bizType", 1);
                rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
                int optInt2 = jSONObject.optInt("draftType");
                java.lang.String optString = jSONObject.optString("draftScene");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                optBoolean = ((ur1.s) b0Var).Bi(optInt2, optString, optInt, Bi.f419858b);
            }
            boolean z17 = optBoolean;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImage", "invoke in MM process， useDraft: " + z17);
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            java.lang.ref.WeakReference weakReference = com.tencent.mm.feature.performance.r2.f67652d;
            android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            kotlin.jvm.internal.o.d(context);
            ((ox.g) oVar).Zi(context, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.j6(callback, jSONObject, this, z17, context));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBizPublishImage", "parse json error");
            callback.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet(false, "parse json error", new com.tencent.mm.ipcinvoker.type.IPCString("")));
        }
    }
}
