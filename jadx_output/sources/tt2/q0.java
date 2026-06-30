package tt2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f421985f;

    public q0(tt2.e1 e1Var, ut2.s3 s3Var, int i17) {
        this.f421983d = e1Var;
        this.f421984e = s3Var;
        this.f421985f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.y23 y23Var;
        r45.rt3 rt3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.e1 e1Var = this.f421983d;
        e1Var.getClass();
        android.content.Context context = e1Var.f421880h;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.t(false);
        int i17 = this.f421985f;
        so2.j5 P = e1Var.P(i17);
        cm2.m0 m0Var = P instanceof cm2.m0 ? (cm2.m0) P : null;
        k0Var.f211872n = new tt2.s0(e1Var, (m0Var == null || (y23Var = m0Var.f43368v) == null || (rt3Var = (r45.rt3) y23Var.getCustom(69)) == null || !rt3Var.getBoolean(0)) ? false : true, m0Var);
        k0Var.f211881s = new tt2.t0(e1Var, this.f421984e, i17, m0Var);
        k0Var.q(context.getString(com.tencent.mm.R.string.nur), 17);
        k0Var.v();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.t2[] t2VarArr = ml2.t2.f328014d;
        jSONObject.put("type", 35);
        jSONObject.put("productid", m0Var != null ? java.lang.Long.valueOf(m0Var.f43369w) : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
