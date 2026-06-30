package zd;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 401;
    public static final java.lang.String NAME = "canvasToTempFilePathSync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.v5 V0 = ((com.tencent.mm.plugin.appbrand.e9) lVar).V0();
        if (((ce.g) V0.B1(ce.g.class)) == null) {
            return o("fail");
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 D = zd.g.D(V0, jSONObject, true);
        return p(D.f81320b, D.f81319a);
    }
}
