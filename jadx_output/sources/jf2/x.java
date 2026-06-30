package jf2;

/* loaded from: classes3.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event", 2);
        jSONObject.put("pos", i17);
        jSONObject.put("num", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "[report-click] json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327241k2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void b(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event", 1);
        jSONObject.put("pos", i17);
        jSONObject.put("num", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "[report-exposed] json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327241k2, t17, 0L, null, null, null, null, null, 252, null);
    }
}
