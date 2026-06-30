package ys2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.d f465146d;

    public c(ys2.d dVar) {
        this.f465146d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject = ml2.z0.b(ml2.z0.f328330a, null, 1, null).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_wonderful_button_click", jSONObject);
        ys2.x xVar = (ys2.x) this.f465146d.controller(ys2.x.class);
        if (xVar != null) {
            xVar.a7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
