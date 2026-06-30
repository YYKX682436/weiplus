package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class c0 implements com.tencent.mm.pluginsdk.ui.chat.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198772a;

    public c0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198772a = aVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.e5
    public boolean a(boolean z17) {
        qk.n D0;
        qk.h c17;
        java.util.List list;
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198772a;
        qk.o oVar = aVar.f198746h;
        if (oVar != null && (D0 = oVar.D0(false)) != null && (c17 = D0.c()) != null && (list = c17.f364140b) != null && !list.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((r01.g0) c17.f364140b.get(0)).f368077e);
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                appBrandStatObject.f87790f = com.tencent.mm.plugin.appbrand.jsapi.p6.CTRL_INDEX;
                appBrandStatObject.f87791g = aVar.f198746h.field_username;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optString("userName"), null, 0, 0, jSONObject.optString("pagePath"), appBrandStatObject, aVar.f198746h.field_appId);
                return true;
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }
}
