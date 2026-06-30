package yc1;

/* loaded from: classes.dex */
public class d0 implements h45.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f460777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc1.f0 f460779c;

    public d0(yc1.f0 f0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f460779c = f0Var;
        this.f460777a = e9Var;
        this.f460778b = i17;
    }

    @Override // h45.r
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_desc", str);
        this.f460777a.a(this.f460778b, this.f460779c.p("fail", hashMap));
    }

    @Override // h45.r
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback success: %s", str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("respbuf", str);
        this.f460777a.a(this.f460778b, this.f460779c.p("ok", hashMap));
    }
}
