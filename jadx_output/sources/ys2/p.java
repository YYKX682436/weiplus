package ys2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.x f465181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.w94 f465182e;

    public p(ys2.x xVar, r45.w94 w94Var) {
        this.f465181d = xVar;
        this.f465182e = w94Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$WonderfulFragmentListAdapter$WonderfulFragmentHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ys2.x xVar = this.f465181d;
        xVar.Z6();
        at2.u1 u1Var = (at2.u1) xVar.R6(at2.u1.class);
        if (u1Var != null) {
            u1Var.w1(this.f465182e.getInteger(0), false);
        }
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject = ml2.z0.b(ml2.z0.f328330a, null, 1, null).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_wonderful_list_click", jSONObject);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$WonderfulFragmentListAdapter$WonderfulFragmentHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
