package pk2;

/* loaded from: classes3.dex */
public final class m4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355994d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355995e;

    /* renamed from: f, reason: collision with root package name */
    public int f355996f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355997g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355998h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.n4 f355999i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f356001n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(pk2.o9 o9Var, pk2.n4 n4Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355998h = o9Var;
        this.f355999i = n4Var;
        this.f356000m = view;
        this.f356001n = loadingSwitchBtn;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.m4 m4Var = new pk2.m4(this.f355998h, this.f355999i, this.f356000m, this.f356001n, continuation);
        m4Var.f355997g = ((java.lang.Boolean) obj).booleanValue();
        return m4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.m4) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355996f;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f355997g;
        pk2.o9 o9Var = this.f355998h;
        if (z17) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                ya2.o1.F2((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class), o9Var.f356078d, false, 2, null);
                return java.lang.Boolean.FALSE;
            }
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227164o, pk2.k4.f355908a)) {
                return java.lang.Boolean.FALSE;
            }
        }
        android.view.View view = this.f356000m;
        java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rvw)).getText().toString();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rtc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        pk2.n4 n4Var = this.f355999i;
        n4Var.v(obj2, findViewById, this.f356001n);
        ((mm2.o4) o9Var.c(mm2.o4.class)).G = z17;
        this.f355994d = o9Var;
        this.f355995e = n4Var;
        this.f355997g = z17;
        this.f355996f = 1;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        boolean z18 = pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q, 134217728);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "enable/disable show location isOpenShowLocation: " + z18);
        int i18 = z18 ? 11 : 10;
        if (n4Var.n()) {
            java.lang.Integer num = new java.lang.Integer(2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            num.intValue();
            jSONObject.put("type", num.intValue());
            jSONObject.put("sub_element", 10);
            jSONObject.put("sub_type", i18);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num2 = new java.lang.Integer(2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            num2.intValue();
            jSONObject2.put("type", num2.intValue());
            jSONObject2.put("sub_element", 10);
            jSONObject2.put("sub_type", i18);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        o9Var.i(134217728, z17, n4Var.n(), new pk2.l4(o9Var, z17, n4Var, nVar));
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
