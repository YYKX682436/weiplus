package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetTaskResult f137156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.l0 f137157e;

    public k0(com.tencent.mm.plugin.flash.action.l0 l0Var, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult) {
        this.f137157e = l0Var;
        this.f137156d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response!");
        com.tencent.mm.plugin.flash.action.l0 l0Var = this.f137157e;
        wu5.b bVar = l0Var.f137159a.X;
        if (bVar != null) {
            bVar.b();
        }
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = this.f137156d;
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(cronetTaskResult.errorCode));
        vz2.c.c().f56206h = cronetTaskResult.errorCode;
        com.tencent.mm.plugin.flash.action.s0 s0Var = l0Var.f137159a;
        s0Var.N++;
        s0Var.P = java.lang.System.currentTimeMillis();
        if (cronetTaskResult.statusCode != 200 || cronetTaskResult.errorCode != 0) {
            com.tencent.mm.plugin.flash.action.s0 s0Var2 = l0Var.f137159a;
            s0Var2.r(90036, i65.a.r(s0Var2.f423271p, com.tencent.mm.R.string.net_fetch_failed), "cgi failed");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(cronetTaskResult.getDataString());
            int optInt = jSONObject.optInt("errcode");
            java.lang.String optString = jSONObject.optString("msg");
            if (optInt == 0) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                java.lang.String optString2 = optJSONObject.optString("action_data");
                java.lang.String optString3 = optJSONObject.optString("color_data");
                java.lang.String optString4 = optJSONObject.optString("select_data");
                int i17 = optJSONObject.getInt("bio_id");
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response. errCode: %s, errMsg: %s, action_data: %s, color_data: %s, select_data: %s, bio_id: %s", java.lang.Integer.valueOf(optInt), optString, optString2, optString3, optString4, java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.flash.action.s0 s0Var3 = l0Var.f137159a;
                s0Var3.f137180J = optString2;
                s0Var3.f423265g = i17;
                s0Var3.p(new java.lang.String(optString4.getBytes()), optString2, optString3);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response. errCode: %s, errMsg: %s", java.lang.Integer.valueOf(optInt), optString);
                l0Var.f137159a.r(optInt, optString, "response.ret_code != 0");
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response. parse resposne JSON error");
            com.tencent.mm.plugin.flash.action.s0 s0Var4 = l0Var.f137159a;
            s0Var4.r(90036, i65.a.r(s0Var4.f423271p, com.tencent.mm.R.string.net_fetch_failed), "cgi failed");
        }
    }
}
