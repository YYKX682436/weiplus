package nd1;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "initReadyAfterRenderingCache";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (v5Var != null) {
            v5Var.D2(NAME);
        }
        java.lang.String o17 = o("ok");
        kotlin.jvm.internal.o.f(o17, "makeReturnJson(...)");
        return o17;
    }
}
