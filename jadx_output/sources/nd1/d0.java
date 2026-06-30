package nd1;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.e0 f336285g;

    public d0(nd1.e0 e0Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, org.json.JSONObject jSONObject) {
        this.f336285g = e0Var;
        this.f336282d = yVar;
        this.f336283e = i17;
        this.f336284f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336282d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        int i17 = this.f336283e;
        nd1.e0 e0Var = this.f336285g;
        if (a17 == null) {
            yVar.a(i17, e0Var.o("fail:page don't exist"));
            return;
        }
        java.lang.Object B1 = a17.B1(e0Var.f336294g);
        if (B1 != null) {
            e0Var.C(yVar, this.f336284f, i17, B1);
        } else if (!a17.isRunning()) {
            yVar.a(i17, e0Var.o("fail:interrupted"));
        } else {
            if (a17.a0()) {
                throw new java.lang.IllegalAccessError(java.lang.String.format("%s Not Found", e0Var.f336294g.getName()));
            }
            yVar.a(i17, e0Var.o("fail:not supported"));
        }
    }
}
