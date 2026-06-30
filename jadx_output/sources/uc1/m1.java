package uc1;

/* loaded from: classes13.dex */
public class m1 extends uc1.b {
    public static final int CTRL_INDEX = 200;
    public static final java.lang.String NAME = "moveMapMarkerAlong";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        ik1.h0.a().postToWorker(new uc1.j1(this, lVar, jSONObject, i17));
    }

    public final void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, boolean z17) {
        C(lVar, i17, o(str), str.equals("ok"), z17);
    }
}
