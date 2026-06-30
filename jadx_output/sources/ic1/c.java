package ic1;

/* loaded from: classes7.dex */
public class c implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f290302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic1.d f290303h;

    public c(ic1.d dVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290303h = dVar;
        this.f290299d = str;
        this.f290300e = str2;
        this.f290301f = lVar;
        this.f290302g = i17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "JsApiSetEntryPath";
    }

    @Override // java.lang.Runnable
    public void run() {
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        java.lang.String str = this.f290300e;
        if (b3Var != null) {
            str = ((nd1.l2) b3Var).a(str);
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(str + "_entryPagePath");
        if (M != null) {
            M.D("keyEntryPagePath", this.f290299d);
        }
        ic1.d dVar = this.f290303h;
        dVar.getClass();
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
        this.f290301f.a(this.f290302g, dVar.u(str2, jSONObject));
    }
}
