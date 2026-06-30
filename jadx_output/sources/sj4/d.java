package sj4;

/* loaded from: classes9.dex */
public final class d implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj4.x1 f408829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pj4.j0 f408830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f408831d;

    public d(java.lang.String str, pj4.x1 x1Var, pj4.j0 j0Var, yz5.a aVar) {
        this.f408828a = str;
        this.f408829b = x1Var;
        this.f408830c = j0Var;
        this.f408831d = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.ExtJumpInfoHandler", "onGetWeAppInfo() called with: info = " + v5Var);
        if (v5Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.COL_USERNAME, this.f408828a);
            pj4.x1 x1Var = this.f408829b;
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, x1Var.f355331e);
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w07 = v5Var.w0();
            jSONObject.put("version", w07 != null ? w07.f77444d : 0);
            jSONObject.put("versionType", x1Var.f355333g);
            java.lang.String str = v5Var.field_smallHeadURL;
            if (str == null) {
                str = "";
            }
            jSONObject.put("headImageURL", str);
            this.f408830c.f355141f = jSONObject.toString();
        }
        this.f408831d.invoke();
    }
}
