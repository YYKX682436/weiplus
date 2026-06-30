package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class h2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186219e;

    public h2(nw4.k kVar, nw4.y2 y2Var) {
        this.f186218d = kVar;
        this.f186219e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        nw4.k kVar = this.f186218d;
        nw4.y2 y2Var = this.f186219e;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            int optInt = jSONObject.optInt("retCode");
            java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("retCode", java.lang.Integer.valueOf(optInt));
            hashMap.put(dm.i4.COL_USERNAME, optString);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNewLifeContact", "IPCInvokeCallback :" + iPCString.f68406d);
            if (optInt == 0) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
            } else {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
            }
        } catch (java.lang.Exception unused) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
        }
    }
}
