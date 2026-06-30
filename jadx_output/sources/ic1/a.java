package ic1;

/* loaded from: classes7.dex */
public class a implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f290297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic1.b f290298g;

    public a(ic1.b bVar, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290298g = bVar;
        this.f290295d = str;
        this.f290296e = lVar;
        this.f290297f = i17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return ic1.b.NAME;
    }

    @Override // java.lang.Runnable
    public void run() {
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        java.lang.String str = this.f290295d;
        if (b3Var != null) {
            str = ((nd1.l2) b3Var).a(str);
        }
        k91.s1.a(str);
        ic1.b bVar = this.f290298g;
        bVar.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f290296e.a(this.f290297f, bVar.u(str2, jSONObject));
    }
}
