package gd1;

/* loaded from: classes7.dex */
public final class b0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 789;
    public static final java.lang.String NAME = "startNFCDiscovery";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f270483g = jz5.h.b(gd1.a0.f270481d);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        if (!fd1.d.c()) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13001, "fail:system NFC switch not opened", kz5.c1.i(new jz5.l("errCode", 13001))));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.t1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.t1.class);
        if (t1Var != null && !((com.tencent.mm.plugin.appbrand.utils.k5) t1Var).a()) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f280435c.a(lVar);
        if (jSONObject != null) {
            try {
                jSONObject.getBoolean("requireForegroundDispatch");
                a17.f280439b.getClass();
            } catch (java.lang.Exception unused) {
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("filters");
                kotlin.jvm.internal.o.d(jSONArray);
                c75.c.d(jSONArray, new gd1.x(arrayList));
                if (arrayList.size() > 0) {
                    a17.c(arrayList);
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        gd1.z zVar = new gd1.z(lVar, i17, this, a17);
        ((ku5.t0) ku5.t0.f312615d).B(new hd1.s(a17, zVar));
    }
}
