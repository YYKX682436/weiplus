package nr2;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339331d;

    public z(nr2.j0 j0Var) {
        this.f339331d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$initViews$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f339331d.Q6().u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$initViews$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
