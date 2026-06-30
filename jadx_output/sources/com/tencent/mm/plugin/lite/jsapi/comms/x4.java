package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class x4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi wxaLiteAppWidgetFlutterPluginApi;
        java.lang.Object b17 = new com.google.gson.i().b(java.lang.String.valueOf(jSONObject), java.util.Map.class);
        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        java.util.Map map = (java.util.Map) b17;
        com.tencent.mm.plugin.lite.ui.z1 z1Var = (com.tencent.mm.plugin.lite.ui.z1) com.tencent.mm.plugin.lite.w.f144514q.get(java.lang.Long.valueOf(this.f143442e.f299024a));
        if (z1Var != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.ui.y1(z1Var, "tap", map));
        }
        c();
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a);
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = uICallback instanceof com.tencent.liteapp.WxaLiteAppWidgetAdapter ? (com.tencent.liteapp.WxaLiteAppWidgetAdapter) uICallback : null;
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage wxaLiteAppWidgetTapEventMessage = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage(this.f143442e.f299024a, map);
        if (wxaLiteAppWidgetAdapter == null || (wxaLiteAppWidgetFlutterPluginApi = wxaLiteAppWidgetAdapter.f45974p) == null) {
            return;
        }
        wxaLiteAppWidgetFlutterPluginApi.tapEvent(wxaLiteAppWidgetTapEventMessage, new com.tencent.mm.plugin.lite.jsapi.comms.w4(this));
    }
}
