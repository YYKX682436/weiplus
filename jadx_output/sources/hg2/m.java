package hg2;

/* loaded from: classes.dex */
public final class m implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f281373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281374g;

    public m(java.lang.String str, java.lang.String str2, gk2.e eVar, java.lang.String str3) {
        this.f281371d = str;
        this.f281372e = str2;
        this.f281373f = eVar;
        this.f281374g = str3;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("identityID", this.f281371d);
        jSONObject.put("targetName", this.f281372e);
        gk2.e eVar = this.f281373f;
        jSONObject.put("finderUsername", ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        jSONObject.put("liveID", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
        jSONObject.put("objectID", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
        java.lang.String str = this.f281374g;
        if (str != null) {
            jSONObject.put("productImageBase64", str);
        }
        return jSONObject.toString();
    }
}
