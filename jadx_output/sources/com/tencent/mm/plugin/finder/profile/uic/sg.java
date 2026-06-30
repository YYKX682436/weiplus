package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class sg extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public sg(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC$initLayout$3 finderProfileTemplateUIC$initLayout$3, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer) {
        super(finderProfileTemplateUIC$initLayout$3, dataBuffer, true);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = holder.getItemViewType() == 10000002 || holder.getItemViewType() == 10000003;
        }
    }
}
