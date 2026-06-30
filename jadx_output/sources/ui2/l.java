package ui2;

/* loaded from: classes8.dex */
public final class l extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f428102e;

    public l(si2.a aVar) {
        this.f428102e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eai;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.b item = (vi2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f11941i = true;
        }
        com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.tkd);
        if (roundCornerLinearLayout != null) {
            float dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            roundCornerLinearLayout.c(0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize);
        }
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.jjb);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ui2.j(this));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.jjd);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new ui2.k(this));
        }
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.tkb);
        int i19 = item.f437538h;
        boolean z18 = item.f437537g;
        if (findViewById2 != null) {
            int i27 = (i19 <= 0 || z18) ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/FinderLiveMicAnchorWidgetConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/FinderLiveMicAnchorWidgetConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.tkc);
        if (findViewById3 != null) {
            int i28 = i19 <= 0 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i28));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/FinderLiveMicAnchorWidgetConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/FinderLiveMicAnchorWidgetConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.jj_);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(z18 ? 0 : 8);
        }
        android.view.View findViewById4 = holder.itemView.findViewById(com.tencent.mm.R.id.jir);
        if (findViewById4 != null) {
            int i29 = z18 ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/FinderLiveMicAnchorWidgetConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/FinderLiveMicAnchorWidgetConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
