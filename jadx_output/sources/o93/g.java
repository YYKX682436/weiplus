package o93;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo93/g;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "appBrandJsApi", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/k0;)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f343727g;

    public g(com.tencent.mm.plugin.appbrand.jsapi.k0 appBrandJsApi) {
        kotlin.jvm.internal.o.g(appBrandJsApi, "appBrandJsApi");
        this.f343727g = appBrandJsApi;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        o93.i b17 = o93.i.b();
        b17.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f343727g;
        boolean z18 = k0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.f;
        java.util.HashMap hashMap = b17.f343731b;
        o93.a aVar = b17.f343730a;
        if (!z18) {
            java.lang.String z19 = ((com.tencent.mm.plugin.appbrand.jsapi.a1) k0Var).z(aVar, jSONObject);
            int i17 = (int) this.f143442e.f299028e;
            hashMap.put(java.lang.Integer.valueOf(i17), this.f143442e);
            b17.a(i17, z19);
            return;
        }
        int i18 = (int) this.f143442e.f299028e;
        hashMap.put(java.lang.Integer.valueOf(i18), this.f143442e);
        aVar.b0(c());
        aVar.L(this.f143442e.f299025b);
        aVar.a0(this.f143442e.f299024a);
        ((com.tencent.mm.plugin.appbrand.jsapi.f) k0Var).A(aVar, jSONObject, i18);
    }
}
