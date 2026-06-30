package pk2;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.i1 f355760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f355761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f355762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(pk2.o9 o9Var, pk2.i1 i1Var, boolean z17, v65.n nVar) {
        super(2);
        this.f355759d = o9Var;
        this.f355760e = i1Var;
        this.f355761f = z17;
        this.f355762g = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f355761f;
        pk2.o9 o9Var = this.f355759d;
        if (!booleanValue) {
            java.lang.String string = z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwl) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwu);
            kotlin.jvm.internal.o.d(string);
            db5.t7.b(o9Var.f356078d, string + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cud));
        } else if (o9Var.f356076c == 1) {
            if (this.f355760e.n()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 6);
                jSONObject.put("type", 1);
                jSONObject.put("sub_element", 6);
                jSONObject.put("sub_type", z17 ? 2 : 3);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("element", 6);
                jSONObject2.put("type", 1);
                jSONObject2.put("sub_element", 5);
                jSONObject2.put("sub_type", z17 ? 6 : 7);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
            }
        }
        this.f355762g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
