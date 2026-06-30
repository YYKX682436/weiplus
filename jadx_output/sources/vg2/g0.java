package vg2;

/* loaded from: classes3.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.j0 f436511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f436512e;

    public g0(vg2.j0 j0Var, km2.q qVar) {
        this.f436511d = j0Var;
        this.f436512e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelAnchorListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.j0 j0Var = this.f436511d;
        yz5.l lVar = j0Var.f436524i;
        if (lVar != null) {
            lVar.invoke(this.f436512e);
        }
        j0Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelAnchorListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
