package nd1;

/* loaded from: classes7.dex */
public abstract class e0 extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f336294g;

    public e0(java.lang.Class cls) {
        this.f336294g = cls;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        nd1.d0 d0Var = new nd1.d0(this, yVar, i17, jSONObject);
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.t3().Q1()) {
            d0Var.run();
        } else {
            yVar.t3().I1(d0Var);
        }
    }

    public abstract void C(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
