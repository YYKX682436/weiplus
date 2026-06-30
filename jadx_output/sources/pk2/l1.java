package pk2;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f355934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.n1 f355936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f355937g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(boolean z17, pk2.o9 o9Var, pk2.n1 n1Var, v65.n nVar) {
        super(2);
        this.f355934d = z17;
        this.f355935e = o9Var;
        this.f355936f = n1Var;
        this.f355937g = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.res.Resources resources;
        int i17;
        int i18;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.o9 o9Var = this.f355935e;
        boolean z17 = this.f355934d;
        if (booleanValue) {
            kotlin.jvm.internal.o.d(z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwn) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dww));
            pk2.n1 n1Var = this.f355936f;
            if (n1Var.n()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", z17);
                o9Var.j(qo0.b.f365435x4, bundle);
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.f327933J : ml2.t1.K, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(n1Var.n() ? ml2.s1.f327916f : ml2.s1.f327915e), null, null, null, null, false, 124, null);
            if (o9Var.f356076c == 1) {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.z4 z4Var = ml2.z4.f328343J;
                ml2.p2[] p2VarArr = ml2.p2.f327787d;
                zy2.zb.y6(zbVar, z4Var, z17 ? java.lang.String.valueOf(1) : java.lang.String.valueOf(2), null, 4, null);
                if (n1Var.n()) {
                    java.lang.Integer num = 1;
                    i18 = z17 ? 2 : 3;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("element", 6);
                    if (num != null) {
                        num.intValue();
                        jSONObject.put("type", num.intValue());
                    }
                    jSONObject.put("sub_element", 4);
                    jSONObject.put("sub_type", i18);
                    i95.m c19 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    zy2.zb.y6((zy2.zb) c19, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                } else {
                    java.lang.Integer num2 = 1;
                    i18 = z17 ? 2 : 3;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("element", 6);
                    if (num2 != null) {
                        num2.intValue();
                        jSONObject2.put("type", num2.intValue());
                    }
                    jSONObject2.put("sub_element", 4);
                    jSONObject2.put("sub_type", i18);
                    i95.m c27 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c27, "getService(...)");
                    zy2.zb zbVar2 = (zy2.zb) c27;
                    ml2.c1 c1Var = ml2.c1.f327325e;
                    zy2.zb.j5(zbVar2, 37L, jSONObject2.toString(), null, 4, null);
                }
            }
        } else {
            if (z17) {
                resources = o9Var.f356078d.getResources();
                i17 = com.tencent.mm.R.string.dwm;
            } else {
                resources = o9Var.f356078d.getResources();
                i17 = com.tencent.mm.R.string.dwv;
            }
            java.lang.String string = resources.getString(i17);
            kotlin.jvm.internal.o.d(string);
            db5.t7.b(o9Var.f356078d, string + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cud));
        }
        this.f355937g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
