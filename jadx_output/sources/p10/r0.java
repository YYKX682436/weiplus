package p10;

/* loaded from: classes9.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI f350986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mm_compose.MMComposeView f350987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f350991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI magicFlutterWebDemoUI, com.tencent.mm.mm_compose.MMComposeView mMComposeView, n0.v2 v2Var, n0.v2 v2Var2, n0.v2 v2Var3, n0.v2 v2Var4) {
        super(0);
        this.f350986d = magicFlutterWebDemoUI;
        this.f350987e = mMComposeView;
        this.f350988f = v2Var;
        this.f350989g = v2Var2;
        this.f350990h = v2Var3;
        this.f350991i = v2Var4;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI magicFlutterWebDemoUI = this.f350986d;
        android.widget.Toast.makeText(magicFlutterWebDemoUI, "预载biz", 0).show();
        java.lang.String T6 = com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI.T6(magicFlutterWebDemoUI, (java.lang.String) this.f350988f.getValue());
        bw5.x7 x7Var = new bw5.x7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("mbapp");
        x7Var.j(linkedList);
        bw5.s7 s7Var = new bw5.s7();
        s7Var.f32825d = (java.lang.String) this.f350989g.getValue();
        boolean[] zArr = s7Var.f32839u;
        zArr[1] = true;
        s7Var.f32830i = true;
        zArr[6] = true;
        org.json.JSONObject a17 = ri.l0.a(kz5.c1.k(new jz5.l("routeName", (java.lang.String) this.f350990h.getValue()), new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, T6), new jz5.l("sessionid", java.util.UUID.randomUUID().toString()), new jz5.l("enterTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        s7Var.e(a17 != null ? a17.toString() : null);
        java.lang.Integer h17 = r26.h0.h((java.lang.String) this.f350991i.getValue());
        s7Var.f32836r = h17 != null ? h17.intValue() : 1;
        zArr[12] = true;
        x7Var.f34982p = s7Var;
        x7Var.f34984r[10] = true;
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f350987e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.q.h6(qVar, new pq.a(context), x7Var, null, null, 12, null);
        return jz5.f0.f302826a;
    }
}
