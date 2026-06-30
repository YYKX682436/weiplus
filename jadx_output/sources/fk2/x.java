package fk2;

/* loaded from: classes3.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final void a(boolean z17, java.lang.String str, java.lang.String str2, int i17, boolean z18) {
        if (!z17) {
            te2.a9.g(te2.a9.f417883a, 5, str, str2, java.lang.Integer.valueOf(i17), null, z18, 16, null);
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328370p1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.e1[] e1VarArr = ml2.e1.f327373d;
        jSONObject.put("type", "6");
        jSONObject.put("music_name", str == null ? "" : str);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }

    public final void b(boolean z17, java.lang.String str, java.lang.String str2, int i17, boolean z18) {
        if (!z17) {
            te2.a9.g(te2.a9.f417883a, 4, str, str2, java.lang.Integer.valueOf(i17), null, z18, 16, null);
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328370p1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.e1[] e1VarArr = ml2.e1.f327373d;
        jSONObject.put("type", "5");
        jSONObject.put("music_name", str == null ? "" : str);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }
}
