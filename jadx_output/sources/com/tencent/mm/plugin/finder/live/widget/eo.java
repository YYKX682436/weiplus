package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class eo extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView f118272d;

    public eo(com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView) {
        this.f118272d = finderLiveLoopBannerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList dataList = this.f118272d.getDataList();
        if (dataList != null) {
            return dataList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f118272d.d(holder, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return this.f118272d.e(parent, i17);
    }
}
