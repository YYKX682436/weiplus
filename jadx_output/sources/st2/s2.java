package st2;

/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.s2 f412456a = new st2.s2();

    public final void a(gk2.e buContext, boolean z17) {
        int i17;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z17) {
            ml2.t2[] t2VarArr = ml2.t2.f328014d;
            i17 = 11;
        } else {
            ml2.t2[] t2VarArr2 = ml2.t2.f328014d;
            i17 = 12;
        }
        jSONObject.put("type", i17);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        jSONObject.put("sessionid", ml2.j0.f327583i.f328306n);
        jSONObject.put("appid", ((mm2.f6) buContext.a(mm2.f6.class)).A);
        long j17 = ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0);
        if (j17 < 0) {
            jSONObject.put("liveid", "");
        } else {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            jSONObject.put("liveid", b52.b.q(j17));
        }
        p52.c cVar = p52.h.f352016a;
        jSONObject.put("clickid", p52.h.f352029n);
        p52.h.f352029n = "";
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
    }
}
