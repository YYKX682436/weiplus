package me1;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 647;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "openWeAppSearch";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null || jSONObject == null) {
            return;
        }
        android.content.Context context = yVar.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchRequest aPI_openWeAppSearch$OpenSearchRequest = new com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchRequest();
        me1.h hVar = new me1.h(yVar, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, aPI_openWeAppSearch$OpenSearchRequest, hVar, null);
    }
}
