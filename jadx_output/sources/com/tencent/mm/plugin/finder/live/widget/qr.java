package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class qr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119544d;

    public qr(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f119544d = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$PrizeItemViewHolder$descExpiryDateValueIcon$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this.f119544d.f118183e);
        i0Var.d(com.tencent.mm.R.string.nws);
        i0Var.f(com.tencent.mm.R.string.nwr);
        i0Var.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$PrizeItemViewHolder$descExpiryDateValueIcon$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
