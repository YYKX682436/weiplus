package kw2;

/* loaded from: classes12.dex */
public final class h0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kw2.m0 f313023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f313024b;

    public h0(kw2.m0 m0Var, org.json.JSONObject jSONObject) {
        this.f313023a = m0Var;
        this.f313024b = jSONObject;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.b3 b3Var = (rh.b3) obj;
        double d17 = b3Var.f395316h;
        kw2.m0 m0Var = this.f313023a;
        float e17 = kw2.m0.e(m0Var, d17);
        float e18 = kw2.m0.e(m0Var, b3Var.f395314f);
        float e19 = kw2.m0.e(m0Var, b3Var.f395315g);
        boolean z17 = false;
        java.util.List i17 = kz5.c0.i(java.lang.Float.valueOf(e17), java.lang.Float.valueOf(e18), java.lang.Float.valueOf(e19));
        if (!i17.isEmpty()) {
            java.util.Iterator it = i17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                float floatValue = ((java.lang.Number) it.next()).floatValue();
                if (floatValue <= 0.0f || ((int) floatValue) == Integer.MAX_VALUE) {
                    z17 = true;
                    break;
                }
            }
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            return;
        }
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17);
        org.json.JSONObject jSONObject = this.f313024b;
        jSONObject.put("batteryTempAvg", valueOf2);
        jSONObject.put("batteryTempMax", java.lang.Float.valueOf(e18));
        jSONObject.put("batteryTempMin", java.lang.Float.valueOf(e19));
    }
}
