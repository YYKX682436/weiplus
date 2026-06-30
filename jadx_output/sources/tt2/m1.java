package tt2;

/* loaded from: classes3.dex */
public final class m1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xv2 f421961a;

    public m1(r45.xv2 xv2Var) {
        this.f421961a = xv2Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327264s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX);
            r45.xv2 xv2Var = this.f421961a;
            jSONObject.put("cate_id", xv2Var.getLong(2));
            jSONObject.put("tab_name", xv2Var.getString(0));
            if (kotlin.jvm.internal.o.b(xv2Var.getString(0), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ewi))) {
                jSONObject.put("tab_type", 3);
            } else {
                jSONObject.put("tab_type", xv2Var.getLong(2) != 0 ? 1 : 2);
            }
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }
}
