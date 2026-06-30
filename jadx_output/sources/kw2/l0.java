package kw2;

/* loaded from: classes12.dex */
public final class l0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kw2.m0 f313051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f313052b;

    public l0(kw2.m0 m0Var, org.json.JSONObject jSONObject) {
        this.f313051a = m0Var;
        this.f313052b = jSONObject;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        double d17 = ((uh.g) o2Var.f395486c).d();
        kw2.m0 m0Var = this.f313051a;
        float e17 = kw2.m0.e(m0Var, d17);
        uh.g gVar = (uh.g) o2Var.f395486c;
        java.lang.Number number = gVar.f427683g.f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        float e18 = kw2.m0.e(m0Var, number.doubleValue());
        java.lang.Number number2 = gVar.f427687i.f395552a;
        kotlin.jvm.internal.o.f(number2, "get(...)");
        float e19 = kw2.m0.e(m0Var, number2.doubleValue());
        java.lang.Number number3 = gVar.f427689j.f395552a;
        kotlin.jvm.internal.o.f(number3, "get(...)");
        float e27 = kw2.m0.e(m0Var, number3.doubleValue());
        java.lang.Number number4 = gVar.f427701p.f395552a;
        kotlin.jvm.internal.o.f(number4, "get(...)");
        float e28 = kw2.m0.e(m0Var, number4.doubleValue());
        java.lang.Number number5 = gVar.f427703q.f395552a;
        kotlin.jvm.internal.o.f(number5, "get(...)");
        float e29 = kw2.m0.e(m0Var, number5.doubleValue());
        java.lang.Float valueOf = java.lang.Float.valueOf(e17);
        org.json.JSONObject jSONObject = this.f313052b;
        jSONObject.put("totalMah", valueOf);
        jSONObject.put("cpuMah", java.lang.Float.valueOf(e18));
        jSONObject.put("mobileMah", java.lang.Float.valueOf(e19));
        jSONObject.put("wifiMah", java.lang.Float.valueOf(e27));
        jSONObject.put("audioMah", java.lang.Float.valueOf(e28));
        jSONObject.put("videoMah", java.lang.Float.valueOf(e29));
    }
}
