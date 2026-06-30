package pk2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f355792d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f355793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.j f355794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pk2.j jVar, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355794f = jVar;
        this.f355795g = view;
        this.f355796h = loadingSwitchBtn;
        this.f355797i = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.h hVar = new pk2.h(this.f355794f, this.f355795g, this.f355796h, this.f355797i, continuation);
        hVar.f355793e = ((java.lang.Boolean) obj).booleanValue();
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.h) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355792d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f355793e;
        pk2.j jVar = this.f355794f;
        int i18 = jVar.n() ? com.tencent.mm.R.id.okv : com.tencent.mm.R.id.qqx;
        android.view.View view = this.f355795g;
        java.lang.String obj2 = ((android.widget.TextView) view.findViewById(i18)).getText().toString();
        android.view.View findViewById = view.findViewById(jVar.n() ? com.tencent.mm.R.id.hvi : com.tencent.mm.R.id.qlg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        jVar.v(obj2, findViewById, this.f355796h);
        qk2.f.f(jVar, false, 1, null);
        boolean z18 = !z17;
        boolean n17 = jVar.n();
        this.f355792d = 1;
        jVar.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        pk2.o9 o9Var = this.f355797i;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "switchVisitorAnonymous isEnable:" + z18 + ", isLiving:" + n17);
        if (z18) {
            ((mm2.g1) o9Var.c(mm2.g1.class)).W6(1);
            mm2.c1 c1Var = (mm2.c1) o9Var.c(mm2.c1.class);
            int i19 = (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i19 | 8192);
        } else {
            ((mm2.g1) o9Var.c(mm2.g1.class)).W6(0);
            mm2.c1 c1Var2 = (mm2.c1) o9Var.c(mm2.c1.class);
            int i27 = (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            c1Var2.p8(i27 & (-8193));
        }
        if (n17) {
            java.lang.Integer num = new java.lang.Integer(1);
            int i28 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            num.intValue();
            jSONObject.put("type", num.intValue());
            jSONObject.put("sub_element", 5);
            jSONObject.put("sub_type", i28);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num2 = new java.lang.Integer(1);
            int i29 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            num2.intValue();
            jSONObject2.put("type", num2.intValue());
            jSONObject2.put("sub_element", 5);
            jSONObject2.put("sub_type", i29);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var3 = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        if (n17) {
            pk2.i iVar = new pk2.i(o9Var, nVar);
            com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("VisitorAnonymous", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q);
            dk2.xf f17 = o9Var.f();
            if (f17 != null) {
                dk2.xf.h(f17, ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) o9Var.c(mm2.e1.class)).f328983m, ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q, 8192L, 0, iVar, 16, null);
            }
        } else {
            nVar.a(java.lang.Boolean.TRUE);
        }
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
