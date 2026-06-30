package ml2;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.z0 f328330a = new ml2.z0();

    public static org.json.JSONObject b(ml2.z0 z0Var, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = null;
        }
        z0Var.getClass();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        ws2.u0 u0Var = ws2.k1.f449066r;
        gk2.e eVar = u0Var.a().f449071c;
        java.lang.String u17 = pm0.v.u(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f328983m : 0L);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        gk2.e eVar2 = u0Var.a().f449071c;
        boolean gk6 = ((com.tencent.mm.feature.finder.live.v4) w0Var).gk(eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f328988r : null);
        gk2.e eVar3 = u0Var.a().f449071c;
        java.lang.String str = eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).f328852o : null;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean b17 = kotlin.jvm.internal.o.b(str, xy2.c.e(context));
        jSONObject.put("object_id", u17);
        jSONObject.put("user_type", b17 ? 1 : 2);
        jSONObject.put("object_type", gk6 ? 1 : 2);
        f328330a.a(jSONObject);
        return jSONObject;
    }

    public final void a(org.json.JSONObject jObj) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(jObj, "jObj");
        ws2.u0 u0Var = ws2.k1.f449066r;
        zs2.c cVar = u0Var.a().f449070b;
        java.lang.String str = cVar != null ? cVar.f475250e : null;
        zs2.c cVar2 = u0Var.a().f449070b;
        java.lang.Integer valueOf = cVar2 != null ? java.lang.Integer.valueOf(cVar2.f475251f) : null;
        if (!(str == null || str.length() == 0)) {
            jObj.put("page_type", str);
        }
        if (valueOf == null || valueOf.intValue() != 0) {
            jObj.put("page_sub_type", valueOf);
        }
        if (kotlin.jvm.internal.o.b(str, "program_real")) {
            ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
            java.lang.Object obj3 = "";
            if (jVar == null || (obj = jVar.f222281y) == null) {
                obj = "";
            }
            jObj.put("song_id", obj);
            ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar2 != null && (obj2 = jVar2.f222282z) != null) {
                obj3 = obj2;
            }
            jObj.put("song_name", obj3);
        }
    }

    public final void c(boolean z17, boolean z18, long j17) {
        java.lang.String str;
        if (!z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f327280y1, z17 ? 1 : 3, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q);
            return;
        }
        if (z17) {
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            str = "watch_live_pay_click";
        } else {
            ml2.o3[] o3VarArr2 = ml2.o3.f327773d;
            str = "watch_live_pay_two_click";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(j17));
        f328330a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj(str, jSONObject2);
    }
}
