package nd1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 684;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "hideHomeButton";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        if (a17 == null) {
            kotlin.jvm.internal.o.d(yVar);
            yVar.a(i17, o("fail:page don't exist"));
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new nd1.e(a17, yVar, i17, this));
        }
    }
}
