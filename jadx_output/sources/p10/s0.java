package p10;

/* loaded from: classes9.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI f350993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mm_compose.MMComposeView f350994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350996g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350997h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI magicFlutterWebDemoUI, com.tencent.mm.mm_compose.MMComposeView mMComposeView, n0.v2 v2Var, n0.v2 v2Var2, n0.v2 v2Var3) {
        super(0);
        this.f350993d = magicFlutterWebDemoUI;
        this.f350994e = mMComposeView;
        this.f350995f = v2Var;
        this.f350996g = v2Var2;
        this.f350997h = v2Var3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String T6 = com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI.T6(this.f350993d, (java.lang.String) this.f350995f.getValue());
        bw5.x7 x7Var = new bw5.x7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("mbapp");
        x7Var.j(linkedList);
        bw5.s7 s7Var = new bw5.s7();
        s7Var.f32825d = (java.lang.String) this.f350996g.getValue();
        boolean[] zArr = s7Var.f32839u;
        zArr[1] = true;
        s7Var.f32830i = true;
        zArr[6] = true;
        org.json.JSONObject a17 = ri.l0.a(kz5.c1.k(new jz5.l("routeName", (java.lang.String) this.f350997h.getValue()), new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, T6), new jz5.l("sessionid", java.util.UUID.randomUUID().toString()), new jz5.l("enterTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        s7Var.e(a17 != null ? a17.toString() : null);
        x7Var.f34982p = s7Var;
        x7Var.f34984r[10] = true;
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f350994e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
        return jz5.f0.f302826a;
    }
}
