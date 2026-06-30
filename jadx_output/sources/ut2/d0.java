package ut2;

/* loaded from: classes3.dex */
public final class d0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.a56 f430854a;

    public d0(r45.a56 a56Var) {
        this.f430854a = a56Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327264s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", 1075);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "live");
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c18;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("commerceAction", 1034);
            r45.c33 c33Var = (r45.c33) this.f430854a.getCustom(3);
            if (c33Var == null || (str = c33Var.getString(1)) == null) {
                str = "";
            }
            jSONObject2.put("url", str);
            ml2.r0.hj(r0Var2, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }
}
