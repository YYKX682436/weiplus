package ys2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.d f465145d;

    public b(ys2.d dVar) {
        this.f465145d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if2.d0 d0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ys2.d dVar = this.f465145d;
        ((mm2.c1) dVar.business(mm2.c1.class)).N1 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
        dVar.X6(qo0.b.Z2, bundle);
        at2.y0 y0Var = (at2.y0) dVar.controller(at2.y0.class);
        if (y0Var != null && (d0Var = y0Var.f13779n) != null) {
            d0Var.d(0);
        }
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject = ml2.z0.b(ml2.z0.f328330a, null, 1, null).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_speed_click", jSONObject);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
