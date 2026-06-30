package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView f123360d;

    public e(com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView) {
        this.f123360d = finderCollectionFilterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView = this.f123360d;
        com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager flowLayoutManager = finderCollectionFilterView.f123343f;
        if (flowLayoutManager == null) {
            kotlin.jvm.internal.o.o("layoutManager");
            throw null;
        }
        int i17 = flowLayoutManager.f106763p;
        com.tencent.mm.plugin.finder.profile.filter.b bVar = finderCollectionFilterView.f123341d;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        int b17 = bVar.f123355b.b();
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterView", "refreshArrow: " + i17 + ", " + b17);
        android.widget.TextView textView = finderCollectionFilterView.f123344g;
        if (textView != null) {
            textView.setVisibility(i17 >= b17 ? 8 : 0);
        } else {
            kotlin.jvm.internal.o.o("moreArrow");
            throw null;
        }
    }
}
