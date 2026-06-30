package uc1;

/* loaded from: classes13.dex */
public class o0 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f426340f;

    public o0(uc1.i1 i1Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f426338d = tVar;
        this.f426339e = str;
        this.f426340f = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "onDestroy");
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f426338d;
        tVar.K(this);
        vc1.h3.a(this.f426339e, vc1.e3.b(tVar, this.f426340f));
    }
}
