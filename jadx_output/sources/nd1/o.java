package nd1;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f336352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336355i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.p f336356m;

    public o(nd1.p pVar, com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, boolean z17, int i17, org.json.JSONObject jSONObject2, java.lang.String str) {
        this.f336356m = pVar;
        this.f336350d = yVar;
        this.f336351e = jSONObject;
        this.f336352f = z17;
        this.f336353g = i17;
        this.f336354h = jSONObject2;
        this.f336355i = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336350d;
        com.tencent.mm.plugin.appbrand.page.i3 x07 = yVar.t3().x0();
        int renderPagesCount = x07.getRenderPagesCount();
        int optInt = this.f336351e.optInt("delta", 1);
        int size = yVar.t3().f74797f.size();
        nd1.p pVar = this.f336356m;
        int i17 = this.f336353g;
        if (size >= 2 && optInt >= renderPagesCount) {
            if (this.f336352f) {
                yVar.t3().Y0(optInt);
            } else {
                yVar.t3().S();
            }
            yVar.a(i17, pVar.o("ok"));
            return;
        }
        if (renderPagesCount > 1) {
            x07.c0(new com.tencent.mm.plugin.appbrand.page.k3(x07, optInt >= renderPagesCount ? renderPagesCount - 1 : optInt, "scene_jsapi_navigate_back", this.f336354h, new nd1.o$$a(this, yVar, i17), this.f336355i));
            return;
        }
        pVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:cannot navigate back at first page" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 201001);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, pVar.u(str, jSONObject));
    }
}
