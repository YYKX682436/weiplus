package rk2;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final rk2.r f396485a = new rk2.r();

    public static /* synthetic */ void b(rk2.r rVar, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            str2 = null;
        }
        rVar.a(i17, str, str2);
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_type", i17);
        if (i17 == 4 || i17 == 5) {
            jSONObject.put("stream_id", str != null ? str : "");
        } else if (i17 != 6) {
            mm2.h7 h7Var = (mm2.h7) dk2.ef.f233372a.i(mm2.h7.class);
            jSONObject.put("stream_id", h7Var != null ? h7Var.N6() : "");
        } else {
            jSONObject.put("stream_id", str == null ? "" : str);
            jSONObject.put("last_stream_id", str2 != null ? str2 : "");
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("LiveMultiStreamUtil", "reportMultiStream json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.B1, t17, 0L, null, null, null, null, null, 252, null);
    }
}
