package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class js implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f118773d;

    public js(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f118773d = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshGiftItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f118773d;
        android.content.Context context = etVar.f118183e;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = com.tencent.mm.plugin.finder.live.widget.et.g0(etVar);
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshGiftItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
