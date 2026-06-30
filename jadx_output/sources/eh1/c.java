package eh1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f252905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f252906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh1.d f252907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f252908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.y yVar, eh1.d dVar, int i17) {
        super(0);
        this.f252905d = jSONObject;
        this.f252906e = yVar;
        this.f252907f = dVar;
        this.f252908g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a T2;
        fh1.i iVar;
        org.json.JSONObject jSONObject = this.f252905d;
        int optInt = jSONObject.optInt("frameId", 0);
        int optInt2 = jSONObject.optInt("biz");
        com.tencent.mm.plugin.appbrand.y yVar = this.f252906e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        com.tencent.mm.plugin.appbrand.o6 o6Var = t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t37 : null;
        int i17 = this.f252908g;
        eh1.d dVar = this.f252907f;
        if (o6Var == null || (T2 = o6Var.T2()) == null || (iVar = (fh1.i) ((com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b) T2).f85736c.get(optInt2)) == null) {
            yVar.a(i17, dVar.o("fail biz instance not found"));
        } else {
            fh1.z zVar = (fh1.z) iVar;
            zVar.e(new fh1.u(zVar, optInt));
            dVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, dVar.u(str, jSONObject2));
        }
        return jz5.f0.f302826a;
    }
}
