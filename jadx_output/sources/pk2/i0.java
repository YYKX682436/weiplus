package pk2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.k0 f355830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f355831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f355832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pk2.o9 o9Var, pk2.k0 k0Var, boolean z17, v65.n nVar) {
        super(2);
        this.f355829d = o9Var;
        this.f355830e = k0Var;
        this.f355831f = z17;
        this.f355832g = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = this.f355829d.f356072a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyAnchorStatusFlag: succ=");
        sb6.append(booleanValue);
        sb6.append(", isAnchorLiving=");
        pk2.k0 k0Var = this.f355830e;
        sb6.append(k0Var.n());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (booleanValue) {
            boolean n17 = k0Var.n();
            boolean z17 = this.f355831f;
            if (n17) {
                df2.jc jcVar = (df2.jc) k0Var.f364427a.e(df2.jc.class);
                if (jcVar != null) {
                    jcVar.b7();
                }
                java.lang.Integer num = 1;
                int i17 = z17 ? 2 : 3;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 6);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("type", num.intValue());
                }
                jSONObject.put("sub_element", 8);
                jSONObject.put("sub_type", i17);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
            } else {
                java.lang.Integer num2 = 2;
                int i18 = z17 ? 10 : 11;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("element", 6);
                if (num2 != null) {
                    num2.intValue();
                    jSONObject2.put("type", num2.intValue());
                }
                jSONObject2.put("sub_element", 7);
                jSONObject2.put("sub_type", i18);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
            }
        }
        this.f355832g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
