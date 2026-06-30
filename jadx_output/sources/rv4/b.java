package rv4;

/* loaded from: classes12.dex */
public final class b implements mv4.b {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.a f400432a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.w f400433b;

    /* renamed from: c, reason: collision with root package name */
    public int f400434c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400435d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400436e;

    /* renamed from: f, reason: collision with root package name */
    public final int f400437f;

    public b(mv4.a boxData, rv4.g0 config, rv4.w session) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(boxData, "boxData");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(session, "session");
        this.f400432a = boxData;
        this.f400433b = session;
        this.f400435d = config.f400466b;
        this.f400436e = config.f400470f;
        this.f400437f = config.f400469e;
        try {
            new org.json.JSONObject(config.f400467c);
        } catch (org.json.JSONException unused) {
            new org.json.JSONObject();
        }
        try {
            jSONObject = new org.json.JSONObject(config.f400468d);
        } catch (org.json.JSONException unused2) {
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.optBoolean("hideSearchBar", true);
        jSONObject.optBoolean("hideNavBar", false);
    }

    public final ov4.c a(ov4.d dVar) {
        org.json.JSONObject jSONObject;
        java.lang.String str;
        rv4.w wVar = this.f400433b;
        jv4.i iVar = wVar.f400557c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String str2 = wVar.f331674a;
        rv4.a aVar = (rv4.a) this.f400432a;
        java.lang.String str3 = aVar.f400425b;
        int i17 = aVar.f400426c;
        mv4.b bVar = (mv4.b) kz5.n0.Z(aVar.f400424a);
        if (bVar == null || (str = ((rv4.b) bVar).f400435d) == null) {
            str = "";
        }
        java.lang.String str4 = i17 + "|63|" + fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f400434c);
        sb6.append('|');
        sb6.append(this.f400434c);
        sb6.append('|');
        java.lang.String str5 = this.f400435d;
        sb6.append(fp.s0.b(str5, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append("|||");
        sb6.append(fp.s0.b(str5, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append("||||");
        java.lang.String sb7 = sb6.toString();
        int intValue = java.lang.Integer.valueOf(this.f400437f).intValue();
        int intValue2 = java.lang.Integer.valueOf(this.f400436e).intValue();
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str2, null, str3, 0L, dVar, str4, sb7, 0, 0, null, 0, intValue, 0, intValue2, jSONObject2, 6026, null);
    }

    @Override // nv4.g
    public void w() {
        ov4.c a17 = a(ov4.d.f349207f);
        this.f400433b.f331675b.d("ai-search-" + ((rv4.a) this.f400432a).f400425b + '-' + this.f400435d, a17);
    }
}
