package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ix implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118704d;

    public ix(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        this.f118704d = rxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initMoreBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f118704d.U;
        if (k0Var != null) {
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initMoreBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
