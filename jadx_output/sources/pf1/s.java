package pf1;

/* loaded from: classes7.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f353792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pf1.v f353793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f353794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f353795g;

    public s(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, pf1.v vVar, org.json.JSONObject jSONObject, int i17) {
        this.f353792d = k0Var;
        this.f353793e = vVar;
        this.f353794f = jSONObject;
        this.f353795g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f353792d;
        kotlin.jvm.internal.o.e(k0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
        ((com.tencent.mm.plugin.appbrand.jsapi.f) k0Var).A(this.f353793e, this.f353794f, this.f353795g);
    }
}
