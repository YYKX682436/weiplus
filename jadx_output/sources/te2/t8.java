package te2;

/* loaded from: classes3.dex */
public final class t8 {

    /* renamed from: a */
    public static final te2.t8 f418440a = new te2.t8();

    /* renamed from: b */
    public static int f418441b;

    public static /* synthetic */ void b(te2.t8 t8Var, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            i19 = 0;
        }
        if ((i27 & 8) != 0) {
            z17 = false;
        }
        t8Var.a(i17, i18, i19, z17);
    }

    public final void a(int i17, int i18, int i19, boolean z17) {
        boolean w17 = zl2.r4.f473950a.w1();
        com.tencent.mars.xlog.Log.i("FinderLivePauseReportHelper", "report curType:" + f418441b + " type:" + i17 + ",time:" + i18 + ", uiState:" + i19 + ", miniWindow:" + z17 + ", isAnchor:" + w17);
        if (w17 || i17 == f418441b) {
            return;
        }
        if (i17 != 3 || pm0.v.z(i19, 524288) || pm0.v.z(i19, 32) || pm0.v.z(i19, 64) || pm0.v.z(i19, 262144)) {
            f418441b = i17;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("times", i18);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.H, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
