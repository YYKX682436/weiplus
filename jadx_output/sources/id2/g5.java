package id2;

/* loaded from: classes10.dex */
public final class g5 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.yi f290590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290590d = new com.tencent.mm.plugin.finder.feed.yi(new com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader(true));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onCreate");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = getRootView();
        com.tencent.mm.plugin.finder.feed.yi yiVar = this.f290590d;
        com.tencent.mm.plugin.finder.feed.zi ziVar = new com.tencent.mm.plugin.finder.feed.zi((com.tencent.mm.ui.MMActivity) activity, rootView, yiVar);
        com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeListContract", "onAttach");
        yiVar.f111173e = ziVar;
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveReservedNoticeListContract$ReservedNoticeListPresenter$onAttach$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == -12) {
                    return new com.tencent.mm.plugin.finder.convert.wm();
                }
                hc2.l.a("FinderLiveReservedNoticeListContract", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = yiVar.f111172d;
        yiVar.f111174f = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, baseFeedLoader.getDataListJustForAdapter(), true);
        com.tencent.mm.plugin.finder.feed.zi ziVar2 = yiVar.f111173e;
        if (ziVar2 != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeListContract", "=== initView ===");
            android.view.View view = ziVar2.f111270f;
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.lq8);
            com.tencent.mm.plugin.finder.feed.yi yiVar2 = ziVar2.f111268d;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setAdapter(yiVar2.f111174f);
                com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeList.ReservedNoticeListViewCallback", "RecyclerView setup completed");
            }
            yiVar2.f111172d.requestRefresh();
        }
        com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader finderLiveReservedNoticeListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader) baseFeedLoader : null;
        if (finderLiveReservedNoticeListLoader == null) {
            return;
        }
        finderLiveReservedNoticeListLoader.f107493e = new com.tencent.mm.plugin.finder.feed.xi(yiVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onDestroy");
        this.f290590d.onDetach();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f290590d = new com.tencent.mm.plugin.finder.feed.yi(new com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader(true));
    }
}
