package xo4;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xo4.b f455768a = new xo4.b();

    public static void a(xo4.b bVar, int i17, int i18, long j17, int i19, org.json.JSONObject jSONObject, java.lang.String str, r45.qt2 qt2Var, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            j17 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = -1;
        }
        if ((i27 & 16) != 0) {
            jSONObject = null;
        }
        if ((i27 & 32) != 0) {
            str = null;
        }
        if ((i27 & 64) != 0) {
            qt2Var = null;
        }
        bVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct finderPageExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct();
        finderPageExposeStruct.w(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        finderPageExposeStruct.q(java.lang.String.valueOf(i17));
        finderPageExposeStruct.f57465g = i18;
        finderPageExposeStruct.r(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        finderPageExposeStruct.t(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj());
        finderPageExposeStruct.f57471m = j17;
        finderPageExposeStruct.u(str != null ? r26.i0.t(str, ",", ";", false) : "");
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (i19 != -1 && i18 == 1) {
            jSONObject.put("nextstep", i19);
        }
        if (qt2Var != null) {
            finderPageExposeStruct.s(qt2Var.getString(1));
            finderPageExposeStruct.p(qt2Var.getString(2));
            finderPageExposeStruct.v(java.lang.String.valueOf(qt2Var.getInteger(7)));
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderPageExposeStruct.x(r26.i0.t(jSONObject2, ",", ";", false));
        finderPageExposeStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderReport21874", "FinderReport21874 report scene:" + i17 + " eventCode:" + i18);
    }
}
