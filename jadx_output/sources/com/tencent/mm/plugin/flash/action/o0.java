package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetTaskResult f137166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.p0 f137167e;

    public o0(com.tencent.mm.plugin.flash.action.p0 p0Var, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult) {
        this.f137167e = p0Var;
        this.f137166d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response");
        com.tencent.mm.plugin.flash.action.p0 p0Var = this.f137167e;
        wu5.b bVar = p0Var.f137171a.W;
        if (bVar != null) {
            bVar.b();
        }
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = this.f137166d;
        java.lang.String dataString = cronetTaskResult.getDataString();
        if (cronetTaskResult.statusCode != 200 || cronetTaskResult.errorCode != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response, cgi failed!");
            com.tencent.mm.plugin.flash.action.s0 s0Var = p0Var.f137171a;
            s0Var.r(90036, i65.a.r(s0Var.f423271p, com.tencent.mm.R.string.rst_failed), "GetFaceCheckResult use http cgi failed");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(dataString);
            int optInt = jSONObject.optInt("errcode");
            java.lang.String optString = jSONObject.optString("msg");
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            java.lang.String optString2 = jSONObject2.optString("auth_token");
            int optInt2 = jSONObject2.optInt("retry");
            java.lang.String optString3 = jSONObject2.optString("serial_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response, errCode: %s, erMsg: %s, auth_token: %s, retry: %s, serial_id: %s", java.lang.Integer.valueOf(optInt), optString, optString2, java.lang.Integer.valueOf(optInt2), optString3);
            p0Var.f137171a.q(cronetTaskResult.errorCode, 0, optInt, optString, optString2, optString3, optInt2);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response, parse response JSON error!");
        }
    }
}
