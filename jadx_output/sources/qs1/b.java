package qs1;

/* loaded from: classes8.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.c f366209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f366210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366211f;

    public b(qs1.c cVar, db5.h4 h4Var, int i17) {
        this.f366209d = cVar;
        this.f366210e = h4Var;
        this.f366211f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.t4 t4Var = this.f366209d.f366213e;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(this.f366210e, this.f366211f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
