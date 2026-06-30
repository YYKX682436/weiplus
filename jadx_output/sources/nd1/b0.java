package nd1;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f336261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f336262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f336265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f336266i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336267m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f336268n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.app.Activity activity, nd1.c0 c0Var, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        super(0);
        this.f336261d = activity;
        this.f336262e = c0Var;
        this.f336263f = jSONObject;
        this.f336264g = str;
        this.f336265h = appBrandInitConfigWC;
        this.f336266i = appBrandStatObject;
        this.f336267m = yVar;
        this.f336268n = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.u3.h(new nd1.a0(this.f336261d, this.f336262e, this.f336263f, this.f336264g, this.f336265h, this.f336266i, this.f336267m, this.f336268n));
        return jz5.f0.f302826a;
    }
}
