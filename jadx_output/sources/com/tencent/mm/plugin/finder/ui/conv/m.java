package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes10.dex */
public final class m extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.afx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.ui.conv.n item = (com.tencent.mm.plugin.finder.ui.conv.n) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebs);
        if (textView != null) {
            textView.setText(com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(item.f129039d), holder.f293121e));
        }
    }
}
