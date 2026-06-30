package ml2;

/* loaded from: classes3.dex */
public final class y0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f328246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f328247b;

    public y0(boolean z17, long j17) {
        this.f328246a = z17;
        this.f328247b = j17;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f328247b + view.hashCode();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (!this.f328246a) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f327280y1, 0, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(this.f328247b));
        ml2.z0.f328330a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_pay_expose", jSONObject2);
    }
}
