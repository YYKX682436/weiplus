package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class p6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f210636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f210637e;

    public p6(com.tencent.mm.ui.tools.s6 s6Var, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f210637e = s6Var;
        this.f210636d = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/MMListMenuHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.tools.s6 s6Var = this.f210637e;
        s6Var.f210726m.clear();
        this.f210636d.onCreateContextMenu(s6Var.f210726m, view, null);
        s6Var.f210722f = new com.tencent.mm.ui.tools.o6(this);
        s6Var.f210721e.V1 = true;
        s6Var.d();
        yj0.a.i(true, this, "com/tencent/mm/ui/tools/MMListMenuHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
