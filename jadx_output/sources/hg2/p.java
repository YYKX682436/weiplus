package hg2;

/* loaded from: classes.dex */
public final class p implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f281385d;

    public p(gk2.e eVar) {
        this.f281385d = eVar;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        gk2.e eVar = this.f281385d;
        jSONObject.put("finderUsername", ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        jSONObject.put("liveID", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
        jSONObject.put("objectID", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
        return jSONObject.toString();
    }
}
