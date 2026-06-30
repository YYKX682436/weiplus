package ne1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 359;
    public static final java.lang.String NAME = "updateApp";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a17 = k91.h0.a(c0Var.t3().u0());
        a17.d();
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(c0Var.getF147807d(), a17, new ne1.e(this, c0Var, i17)).G(true).I();
    }
}
