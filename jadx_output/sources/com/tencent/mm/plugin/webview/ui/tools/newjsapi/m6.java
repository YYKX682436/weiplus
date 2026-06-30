package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class m6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186359e;

    public m6(nw4.k kVar, nw4.y2 y2Var) {
        this.f186358d = kVar;
        this.f186359e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.Map map;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet jsApiOpenBizPublishImage$IPCBizPublishImageRet = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsApiOpenBizPublishImage$IPCBizPublishImageRet.f185894f.f68406d);
            map = new java.util.LinkedHashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj2 = jSONObject.get(next);
                kotlin.jvm.internal.o.d(next);
                kotlin.jvm.internal.o.d(obj2);
                map.put(next, obj2);
            }
        } catch (java.lang.Exception unused) {
            map = kz5.q0.f314001d;
        }
        boolean z17 = jsApiOpenBizPublishImage$IPCBizPublishImageRet.f185892d;
        nw4.k kVar = this.f186358d;
        nw4.y2 y2Var = this.f186359e;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", map);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail " + jsApiOpenBizPublishImage$IPCBizPublishImageRet.f185893e, map);
    }
}
