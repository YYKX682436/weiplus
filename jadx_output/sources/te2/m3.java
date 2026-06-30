package te2;

/* loaded from: classes3.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.m3 f418224a = new te2.m3();

    public final void a(te2.j3 type, te2.l3 scene, long j17) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(scene, "scene");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f418136d);
        if (type == te2.j3.f418132e && j17 > 0) {
            jSONObject.put("loading_time", j17);
        }
        if (scene == te2.l3.f418201e) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.I2, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 81L, jSONObject.toString(), null, 4, null);
        }
    }
}
