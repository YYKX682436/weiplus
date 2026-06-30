package hf2;

/* loaded from: classes10.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f281057a;

    public f1(hf2.x controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f281057a = controller;
    }

    public final void a(int i17, qc0.j2 action) {
        kotlin.jvm.internal.o.g(action, "action");
        if (kotlin.jvm.internal.o.b(action, qc0.t1.f361443c)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 11);
            jSONObject.put("sub_type", i17);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            b(jSONObject2);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.q1.f361437c)) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", 12);
            jSONObject3.put("sub_type", i17);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            b(jSONObject4);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.w1.f361452c)) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("type", 13);
            jSONObject5.put("sub_type", i17);
            java.lang.String jSONObject6 = jSONObject5.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            b(jSONObject6);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.s1.f361442c)) {
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("type", 14);
            jSONObject7.put("sub_type", i17);
            java.lang.String jSONObject8 = jSONObject7.toString();
            kotlin.jvm.internal.o.f(jSONObject8, "toString(...)");
            b(jSONObject8);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.x1.f361453c) ? true : kotlin.jvm.internal.o.b(action, qc0.u1.f361447c)) {
            org.json.JSONObject jSONObject9 = new org.json.JSONObject();
            jSONObject9.put("type", 15);
            jSONObject9.put("sub_type", i17);
            java.lang.String jSONObject10 = jSONObject9.toString();
            kotlin.jvm.internal.o.f(jSONObject10, "toString(...)");
            b(jSONObject10);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.z1.f361457c)) {
            org.json.JSONObject jSONObject11 = new org.json.JSONObject();
            jSONObject11.put("type", 16);
            jSONObject11.put("sub_type", i17);
            java.lang.String jSONObject12 = jSONObject11.toString();
            kotlin.jvm.internal.o.f(jSONObject12, "toString(...)");
            b(jSONObject12);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.v1.f361448c)) {
            org.json.JSONObject jSONObject13 = new org.json.JSONObject();
            jSONObject13.put("type", 17);
            jSONObject13.put("sub_type", i17);
            java.lang.String jSONObject14 = jSONObject13.toString();
            kotlin.jvm.internal.o.f(jSONObject14, "toString(...)");
            b(jSONObject14);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.r1.f361438c)) {
            org.json.JSONObject jSONObject15 = new org.json.JSONObject();
            jSONObject15.put("type", 18);
            jSONObject15.put("sub_type", i17);
            java.lang.String jSONObject16 = jSONObject15.toString();
            kotlin.jvm.internal.o.f(jSONObject16, "toString(...)");
            b(jSONObject16);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.a2.f361357c)) {
            org.json.JSONObject jSONObject17 = new org.json.JSONObject();
            jSONObject17.put("type", 19);
            jSONObject17.put("sub_type", i17);
            java.lang.String jSONObject18 = jSONObject17.toString();
            kotlin.jvm.internal.o.f(jSONObject18, "toString(...)");
            b(jSONObject18);
            return;
        }
        if (kotlin.jvm.internal.o.b(action, qc0.b2.f361358c)) {
            org.json.JSONObject jSONObject19 = new org.json.JSONObject();
            jSONObject19.put("type", 20);
            jSONObject19.put("sub_type", i17);
            java.lang.String jSONObject20 = jSONObject19.toString();
            kotlin.jvm.internal.o.f(jSONObject20, "toString(...)");
            b(jSONObject20);
        }
    }

    public final void b(java.lang.String reportStr) {
        kotlin.jvm.internal.o.g(reportStr, "reportStr");
        if (((mm2.c1) this.f281057a.business(mm2.c1.class)).S) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.G1, reportStr, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 39L, reportStr, null, 4, null);
        }
    }
}
