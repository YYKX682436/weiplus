package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class p3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186425e;

    public p3(nw4.k kVar, nw4.y2 y2Var) {
        this.f186424d = kVar;
        this.f186425e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        nw4.k kVar = this.f186424d;
        nw4.y2 y2Var = this.f186425e;
        try {
            int optInt = new org.json.JSONObject(iPCString.f68406d).optInt("retCode", -123);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", java.lang.Integer.valueOf(optInt));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleLiveCustomBusiness", "IPCInvokeCallback :" + iPCString.f68406d);
            if (optInt == 0) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
            } else {
                nw4.g gVar = kVar.f340863d;
                java.lang.String str = y2Var.f341013c;
                java.lang.String str2 = y2Var.f341019i + ":fail open fail";
                hashMap.put("err_msg", "liveCustomBusiness doCallback error");
                gVar.e(str, str2, hashMap);
            }
        } catch (java.lang.Exception unused) {
            nw4.g gVar2 = kVar.f340863d;
            java.lang.String str3 = y2Var.f341013c;
            java.lang.String str4 = y2Var.f341019i + ":fail open fail";
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("state", -1);
            hashMap2.put("err_msg", "liveCustomBusiness something crash...");
            gVar2.e(str3, str4, hashMap2);
        }
    }
}
