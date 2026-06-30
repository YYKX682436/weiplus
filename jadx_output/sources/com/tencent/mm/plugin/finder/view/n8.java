package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class n8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.h8 f132697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f132698e;

    public n8(com.tencent.mm.plugin.finder.view.h8 h8Var, gx2.q qVar) {
        this.f132697d = h8Var;
        this.f132698e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderEntranceDialog$show$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!((java.lang.Boolean) this.f132697d.f132221g.invoke()).booleanValue()) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f132698e, false, null, false, null, 15, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderEntranceDialog$show$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
