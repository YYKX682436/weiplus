package pk2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.d0 f356342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f356344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z17, pk2.d0 d0Var, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f356341d = z17;
        this.f356342e = d0Var;
        this.f356343f = o9Var;
        this.f356344g = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            boolean z17 = this.f356341d;
            ml2.t1 t1Var = z17 ? ml2.t1.B : ml2.t1.C;
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            pk2.d0 d0Var = this.f356342e;
            zy2.zb.T8(zbVar, t1Var, j0Var.bj(d0Var.n() ? ml2.s1.f327916f : ml2.s1.f327915e), null, null, null, null, false, 124, null);
            if (this.f356343f.f356076c == 1) {
                if (z17) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.j0.f327583i.T.f327671r++;
                    if (d0Var.n()) {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        zy2.zb zbVar2 = (zy2.zb) c18;
                        ml2.z4 z4Var = ml2.z4.f328354h;
                        ml2.d1[] d1VarArr = ml2.d1.f327350d;
                        zy2.zb.y6(zbVar2, z4Var, java.lang.String.valueOf(2), null, 4, null);
                        java.lang.Integer num = 1;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("element", 13);
                        if (num != null) {
                            num.intValue();
                            jSONObject.put("type", num.intValue());
                        }
                        jSONObject.put("sub_element", 1);
                        jSONObject.put("sub_type", 1);
                        i95.m c19 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        zy2.zb.y6((zy2.zb) c19, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                    } else {
                        java.lang.Integer num2 = 1;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("element", 6);
                        if (num2 != null) {
                            num2.intValue();
                            jSONObject2.put("type", num2.intValue());
                        }
                        jSONObject2.put("sub_element", 1);
                        jSONObject2.put("sub_type", 1);
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        zy2.zb zbVar3 = (zy2.zb) c27;
                        ml2.c1 c1Var = ml2.c1.f327325e;
                        zy2.zb.j5(zbVar3, 37L, jSONObject2.toString(), null, 4, null);
                    }
                } else {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.j0.f327583i.T.f327670q++;
                    if (d0Var.n()) {
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c28, "getService(...)");
                        zy2.zb zbVar4 = (zy2.zb) c28;
                        ml2.z4 z4Var2 = ml2.z4.f328354h;
                        ml2.d1[] d1VarArr2 = ml2.d1.f327350d;
                        zy2.zb.y6(zbVar4, z4Var2, java.lang.String.valueOf(1), null, 4, null);
                        java.lang.Integer num3 = 1;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("element", 13);
                        if (num3 != null) {
                            num3.intValue();
                            jSONObject3.put("type", num3.intValue());
                        }
                        jSONObject3.put("sub_element", 1);
                        jSONObject3.put("sub_type", 2);
                        i95.m c29 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c29, "getService(...)");
                        zy2.zb.y6((zy2.zb) c29, ml2.z4.D1, jSONObject3.toString(), null, 4, null);
                    } else {
                        java.lang.Integer num4 = 1;
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("element", 6);
                        if (num4 != null) {
                            num4.intValue();
                            jSONObject4.put("type", num4.intValue());
                        }
                        jSONObject4.put("sub_element", 1);
                        jSONObject4.put("sub_type", 2);
                        i95.m c37 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c37, "getService(...)");
                        zy2.zb zbVar5 = (zy2.zb) c37;
                        ml2.c1 c1Var2 = ml2.c1.f327325e;
                        zy2.zb.j5(zbVar5, 37L, jSONObject4.toString(), null, 4, null);
                    }
                }
            }
        }
        this.f356344g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
