package pk2;

/* loaded from: classes3.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.y0 f356347f;

    public x0(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 e3Var, pk2.y0 y0Var) {
        this.f356345d = o9Var;
        this.f356346e = e3Var;
        this.f356347f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption$addItem$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356345d.j(qo0.b.K4, null);
        this.f356346e.h();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.T;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.e1[] e1VarArr = ml2.e1.f327373d;
        ml2.f1[] f1VarArr = ml2.f1.f327422d;
        jSONObject.put("type", 2);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.L, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        pk2.y0 y0Var = this.f356347f;
        qk2.f.f(y0Var, false, 1, null);
        if (y0Var.n()) {
            java.lang.Integer num = 1;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            if (num != null) {
                num.intValue();
                jSONObject2.put("type", num.intValue());
            }
            jSONObject2.put("sub_element", 2);
            jSONObject2.put("sub_type", 4);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.y6((zy2.zb) c19, ml2.z4.D1, jSONObject2.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption$addItem$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
