package te2;

/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.u3 f418468a = new te2.u3();

    public final void a(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        ae2.in inVar = ae2.in.f3688a;
        jSONObject.put("msg_style", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Z5).getValue()).r()).intValue() == 0 ? 2 : 1);
        jSONObject.put("msg_id", str == null ? "" : str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLiveGiftAllNotifyReportHelper", "[report] json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.O1, t17, 0L, null, null, null, null, null, 252, null);
    }
}
