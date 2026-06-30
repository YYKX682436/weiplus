package pk2;

/* loaded from: classes3.dex */
public final class e1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.i1 f355699a;

    public e1(pk2.i1 i1Var) {
        this.f355699a = i1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17 && this.f355699a.n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            jSONObject.put("type", 1);
            jSONObject.put("sub_element", 6);
            jSONObject.put("sub_type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        }
    }
}
