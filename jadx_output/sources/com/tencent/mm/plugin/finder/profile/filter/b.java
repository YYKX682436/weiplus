package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class b implements com.tencent.mm.plugin.finder.profile.filter.q {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f123354a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.filter.p f123355b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f123356c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f123357d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView f123358e;

    public b(android.app.Activity context, com.tencent.mm.plugin.finder.profile.filter.p collectionInfoList, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(collectionInfoList, "collectionInfoList");
        kotlin.jvm.internal.o.g(username, "username");
        this.f123354a = context;
        this.f123355b = collectionInfoList;
        this.f123356c = username;
        this.f123357d = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public android.view.View getView() {
        return this.f123358e;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public boolean hasData() {
        return !this.f123355b.d().isEmpty();
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public void k(boolean z17) {
        com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView = this.f123358e;
        if (finderCollectionFilterView != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterView", "notifyCoverChange: " + z17);
            com.tencent.mm.plugin.finder.profile.filter.b bVar = finderCollectionFilterView.f123341d;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.util.Iterator it = bVar.f123357d.iterator();
            while (it.hasNext()) {
                ((so2.d0) it.next()).getClass();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = finderCollectionFilterView.f123342e;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            int color = z17 ? finderCollectionFilterView.getContext().getResources().getColor(com.tencent.mm.R.color.f479122ql) : finderCollectionFilterView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1);
            android.widget.TextView textView = (android.widget.TextView) finderCollectionFilterView.findViewById(com.tencent.mm.R.id.e4c);
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public void l() {
        com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView = this.f123358e;
        if (finderCollectionFilterView != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterView", "refresh");
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = finderCollectionFilterView.f123342e;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = finderCollectionFilterView.f123342e;
            if (wxRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            wxRecyclerView2.post(new com.tencent.mm.plugin.finder.profile.filter.e(finderCollectionFilterView));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterContract", "refresh, dataList size:" + this.f123357d.size());
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public android.view.View n(int i17) {
        java.util.ArrayList arrayList = this.f123357d;
        arrayList.clear();
        java.util.LinkedList d17 = this.f123355b.d();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.d0((r45.vx0) it.next()));
        }
        arrayList.addAll(arrayList2);
        android.app.Activity context = this.f123354a;
        com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView = new com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView(context);
        finderCollectionFilterView.a(this);
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView2 = this.f123358e;
            if (finderCollectionFilterView2 != null) {
                finderCollectionFilterView2.setVisibility(8);
            }
        } else {
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            if (finderProfileTabUIC != null) {
                finderProfileTabUIC.f123463y = true;
                finderProfileTabUIC.V6();
                com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView3 = this.f123358e;
                if (finderCollectionFilterView3 != null) {
                    finderCollectionFilterView3.setVisibility(0);
                }
            }
        }
        this.f123358e = finderCollectionFilterView;
        return finderCollectionFilterView;
    }
}
