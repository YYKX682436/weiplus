package nd1;

/* loaded from: classes7.dex */
public class j1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 8;
    public static final java.lang.String NAME = "setNavigationBarTitle";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (!jSONObject.has(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        nd1.i1 i1Var = new nd1.i1(this, yVar, i17, jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.t3().Q1()) {
            i1Var.run();
        } else {
            yVar.t3().I1(i1Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
