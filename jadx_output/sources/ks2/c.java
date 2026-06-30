package ks2;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks2.e f311600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cq4 f311601e;

    public c(ks2.e eVar, r45.cq4 cq4Var) {
        this.f311600d = eVar;
        this.f311601e = cq4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ks2.e eVar = this.f311600d;
        eVar.f311604d.remove(this.f311601e);
        eVar.f311605e = false;
        eVar.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
