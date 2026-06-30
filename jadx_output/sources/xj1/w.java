package xj1;

/* loaded from: classes7.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj1.x f454819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f454820e;

    public w(xj1.x xVar, int i17) {
        this.f454819d = xVar;
        this.f454820e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xj1.x xVar = this.f454819d;
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = xVar.f454822e;
        if (dragSortListView != null) {
            dragSortListView.F1 = false;
            dragSortListView.u(this.f454820e, 0.0f);
        }
        android.content.Context context = xVar.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ul1.j jVar = new ul1.j(context, true);
        jVar.a((java.lang.String) xVar.f454824g.getValue());
        jVar.b(1500L);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
