package xr3;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xr3.i f456216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f456217e;

    public d(xr3.i iVar, int i17) {
        this.f456216d = iVar;
        this.f456217e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xr3.i iVar = this.f456216d;
        yz5.q qVar = iVar.f456229e;
        if (qVar != null) {
            java.util.List list = iVar.f456228d;
            int i17 = this.f456217e;
            qVar.invoke(list.get(i17), java.lang.Integer.valueOf(i17), -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
