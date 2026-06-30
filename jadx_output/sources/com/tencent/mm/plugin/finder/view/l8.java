package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class l8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.h8 f132546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f132547e;

    public l8(com.tencent.mm.plugin.finder.view.h8 h8Var, gx2.q qVar) {
        this.f132546d = h8Var;
        this.f132547e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderEntranceDialog$show$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.h8 h8Var = this.f132546d;
        if (!((java.lang.Boolean) h8Var.f132220f.invoke(h8Var)).booleanValue()) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f132547e, false, null, false, null, 15, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderEntranceDialog$show$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
