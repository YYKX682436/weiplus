package nd1;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 10;
    public static final java.lang.String NAME = "hideNavigationBarLoading";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        nd1.i iVar = new nd1.i(this, yVar, i17);
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.t3().Q1()) {
            iVar.run();
        } else {
            yVar.t3().I1(iVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
