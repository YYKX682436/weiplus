package vm2;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.y f438129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f438130e;

    public x(vm2.y yVar, int i17) {
        this.f438129d = yVar;
        this.f438130e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vm2.y yVar = this.f438129d;
        int i17 = yVar.f438132e;
        int i18 = this.f438130e;
        if (i17 != i18) {
            yVar.f438132e = i18;
            yVar.notifyDataSetChanged();
        }
        yz5.l lVar = yVar.f438131d;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i18));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
