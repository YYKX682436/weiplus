package te2;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.a2 f417855a = new te2.a2();

    public final void a(int i17) {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
            z17 = true;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328388x1, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c18, 35L, jSONObject.toString(), null, 4, null);
        }
    }
}
