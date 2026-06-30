package st2;

/* loaded from: classes3.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f412480e;

    public v0(st2.h1 h1Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f412479d = h1Var;
        this.f412480e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showAddPreviousFailDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f412479d.c();
        this.f412480e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showAddPreviousFailDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
