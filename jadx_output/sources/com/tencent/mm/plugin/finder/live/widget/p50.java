package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class p50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f119362d;

    public p50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f119362d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$showVisionGroup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f119362d;
        q50Var.getClass();
        android.content.Context context = q50Var.f118183e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.i50(q50Var);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.j50(q50Var);
        k0Var.v();
        android.app.Dialog dialog = k0Var.f211864i;
        kotlin.jvm.internal.o.f(dialog, "getDialog(...)");
        com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$showVisionGroup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
