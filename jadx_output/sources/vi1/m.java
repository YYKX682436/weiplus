package vi1;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f437405a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f437406b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437407c;

    public m(java.lang.String appId, java.lang.String apiName, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(apiName, "apiName");
        this.f437405a = appId;
        this.f437406b = apiName;
        this.f437407c = z17;
    }

    public final void a(yz5.r rVar) {
        java.lang.String str = this.f437406b;
        boolean z17 = this.f437407c;
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.object();
            jSONStringer.key("api_name");
            jSONStringer.value(str);
            jSONStringer.key("with_credentials");
            jSONStringer.value(z17);
            jSONStringer.endObject();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetPhoneNumberNew", e17, "", new java.lang.Object[0]);
        }
        java.lang.String jSONStringer2 = jSONStringer.toString();
        kotlin.jvm.internal.o.f(jSONStringer2, "toString(...)");
        r45.m24 m24Var = new r45.m24();
        java.lang.String str2 = this.f437405a;
        m24Var.f380089d = str2;
        byte[] bytes = jSONStringer2.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        m24Var.f380090e = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/getallphone", str2, m24Var, r45.n24.class).n(new vi1.k(rVar))).s(new vi1.l(rVar));
    }
}
