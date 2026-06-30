package ze5;

/* loaded from: classes9.dex */
public final class t0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f472196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472197b;

    public t0(ze5.b1 b1Var, com.tencent.mm.storage.f9 f9Var) {
        this.f472196a = b1Var;
        this.f472197b = f9Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f472197b.getMsgId() + view.hashCode();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            vd2.d3 d3Var = vd2.d3.f435703a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            w05.a aVar = this.f472196a.f471833t;
            if (aVar == null || (str = aVar.getFinderUsername()) == null) {
                str = "";
            }
            jSONObject.put("finderusername", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            d3Var.a("expose_shopwindow_shard_card", jSONObject2);
        }
    }
}
