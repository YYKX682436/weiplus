package st2;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f412462e;

    public u0(st2.h1 h1Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f412461d = h1Var;
        this.f412462e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showAddPreviousFailDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        st2.h1 h1Var = this.f412461d;
        h1Var.L();
        h1Var.M(true);
        this.f412462e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showAddPreviousFailDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
