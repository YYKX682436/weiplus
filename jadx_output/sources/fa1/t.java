package fa1;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.service.c0 {
    public t() {
        super(fa1.a.class);
    }

    public com.tencent.magicbrush.MBRuntime f2() {
        return g2();
    }

    public com.tencent.magicbrush.MagicBrush g2() {
        com.tencent.luggage.sdk.jsapi.component.service.a0 A1 = A1();
        if (A1 instanceof fa1.a) {
            return ((fa1.a) A1).w();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.e0
    public void y0(org.json.JSONObject jSONObject) {
        super.y0(jSONObject);
        if (A1() instanceof fa1.a) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = ((fa1.a) A1()).P;
            K0(jSONObject, "isSnapshoting", java.lang.Boolean.FALSE);
            if (wxaPkgV8SnapshotInfo != null) {
                K0(jSONObject, "snapshotMetaInfo", wxaPkgV8SnapshotInfo.f90673p);
            }
        }
    }
}
