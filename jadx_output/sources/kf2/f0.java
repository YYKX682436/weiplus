package kf2;

/* loaded from: classes.dex */
public final class f0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf2.h0 f307224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f307225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f307227g;

    public f0(kf2.h0 h0Var, long j17, int i17, v65.n nVar) {
        this.f307224d = h0Var;
        this.f307225e = j17;
        this.f307226f = i17;
        this.f307227g = nVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        int i17 = this.f307226f;
        long j17 = this.f307225e;
        kf2.h0 h0Var = this.f307224d;
        if (integer == 0) {
            h0Var.b(j17, i17);
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ret.getInteger(1));
            java.lang.Integer num = 4;
            h0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errType", valueOf != null ? valueOf.intValue() : -999);
            jSONObject.put("errCode", num != null ? num.intValue() : -999);
            jSONObject.put("errMsg", "");
            h0Var.f307312b.c(j17, i17, jSONObject.toString());
        }
        this.f307227g.a(jz5.f0.f302826a);
    }
}
