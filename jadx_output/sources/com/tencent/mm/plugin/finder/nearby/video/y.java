package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public y(java.util.ArrayList arrayList, in5.s sVar) {
        super(sVar, arrayList, false);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = holder.getItemViewType() == -1;
    }
}
