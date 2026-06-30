package nd1;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 578;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "hideNavigationBar";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        nd1.g gVar = new nd1.g(yVar, i17, this);
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.getRuntime().Q1()) {
            gVar.run();
        } else {
            yVar.getRuntime().I1(gVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
