package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i8 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186255e;

    public i8(nw4.k kVar, nw4.y2 y2Var) {
        this.f186254d = kVar;
        this.f186255e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        nw4.k kVar = this.f186254d;
        nw4.y2 y2Var = this.f186255e;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            int optInt = jSONObject.optInt("retCode");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("retCode", java.lang.Integer.valueOf(optInt));
            java.lang.String optString = jSONObject.optString("feed_read_info", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                hashMap.put("feed_read_info", optString);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderView", "IPCInvokeCallback :" + iPCString.f68406d);
            if (optInt == 0) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
                return;
            }
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
        } catch (java.lang.Exception unused) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
        }
    }
}
