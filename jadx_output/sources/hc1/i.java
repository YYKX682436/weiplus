package hc1;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1505;
    public static final java.lang.String NAME = "showSmileyPanel";

    /* renamed from: g, reason: collision with root package name */
    public final hc1.d f280299g = new hc1.d();

    /* renamed from: h, reason: collision with root package name */
    public int f280300h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || e9Var.getContext() == null || jSONObject == null) {
            return;
        }
        pm0.v.X(new hc1.h(this, e9Var, jSONObject, i17));
    }
}
