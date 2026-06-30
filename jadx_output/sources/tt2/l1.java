package tt2;

/* loaded from: classes3.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.n1 f421956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv2 f421957e;

    public l1(tt2.n1 n1Var, r45.xv2 xv2Var) {
        this.f421956d = n1Var;
        this.f421957e = xv2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderProductLabelAdapter$ProductLabelViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.n1 n1Var = this.f421956d;
        n1Var.getClass();
        r45.xv2 labelItem = this.f421957e;
        kotlin.jvm.internal.o.g(labelItem, "labelItem");
        n1Var.f421970e.f421976d.a(labelItem, n1Var.getPosition(), true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderProductLabelAdapter$ProductLabelViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
