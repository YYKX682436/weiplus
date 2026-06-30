package jn2;

/* loaded from: classes8.dex */
public final class x1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.s1 f300750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300751e;

    public x1(jn2.s1 s1Var, jn2.z1 z1Var) {
        this.f300750d = s1Var;
        this.f300751e = z1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int adapterPosition = this.f300750d.getAdapterPosition();
        boolean z17 = false;
        jn2.z1 z1Var = this.f300751e;
        if (adapterPosition >= 0 && adapterPosition < z1Var.f300769h.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = z1Var.f300769h.get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            yz5.q qVar = z1Var.f300770i;
            if (qVar != null) {
                kotlin.jvm.internal.o.d(view);
                qVar.invoke(view, java.lang.Integer.valueOf(adapterPosition), z22Var);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
