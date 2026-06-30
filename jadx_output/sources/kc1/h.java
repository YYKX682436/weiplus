package kc1;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 861;
    public static final java.lang.String NAME = "faceDetect";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        kc1.f b17 = kc1.f.b();
        b17.f306294b.execute(new kc1.g(this, b17, (com.tencent.mm.plugin.appbrand.e9) lVar, i17, jSONObject));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public java.nio.ByteBuffer y(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.v vVar, int i17) {
        return "frameBuffer".equalsIgnoreCase(str) ? vVar.j0(i17, true) : vVar.j0(i17, false);
    }
}
