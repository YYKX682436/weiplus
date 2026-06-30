package id2;

/* loaded from: classes10.dex */
public final class w1 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.feed.vh {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.uh f290863d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.li f290864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f290865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290865f = "FinderLiveMentionNotifyUIC." + hashCode();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eac;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.feed.uh uhVar;
        if (getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI");
            uhVar = ((com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI) activity).f109385v;
        } else {
            uhVar = null;
        }
        this.f290863d = uhVar;
        if (uhVar == null) {
            com.tencent.mars.xlog.Log.w(this.f290865f, "initView presenter is null");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = getRootView();
        com.tencent.mm.plugin.finder.feed.uh uhVar2 = this.f290863d;
        kotlin.jvm.internal.o.d(uhVar2);
        final com.tencent.mm.plugin.finder.feed.li liVar = new com.tencent.mm.plugin.finder.feed.li((com.tencent.mm.ui.MMActivity) activity2, rootView, uhVar2, this);
        com.tencent.mm.plugin.finder.feed.uh uhVar3 = this.f290863d;
        kotlin.jvm.internal.o.d(uhVar3);
        uhVar3.f109188m = liVar;
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", "onAttach " + uhVar3.f109183e);
        android.view.View view = liVar.f107298h;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e);
        liVar.f107301n = refreshLoadMoreLayout;
        if (liVar.f107296f) {
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableRefresh(false);
                refreshLoadMoreLayout.setLimitTopRequest(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.aoh)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
                refreshLoadMoreLayout.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.aoh)));
                refreshLoadMoreLayout.setDamping(1.85f);
                liVar.f107302o = (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.m6l);
                refreshLoadMoreLayout.setActionCallback(new com.tencent.mm.plugin.finder.feed.zh(refreshLoadMoreLayout, liVar));
                refreshLoadMoreLayout.setOverCallback(liVar);
            }
        } else if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setEnableRefresh(false);
        }
        com.tencent.mm.ui.MMActivity mMActivity = liVar.f107297g;
        liVar.f107304q = new rl5.r(mMActivity);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kge);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        liVar.f107300m = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kgf);
        liVar.f107303p = textView;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ai(liVar));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveMentionNotifyContract$NotifyViewCallback$initView$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.feed.uh uhVar4 = com.tencent.mm.plugin.finder.feed.li.this.f107294d;
                int i17 = uhVar4.f109182d;
                if (i17 == 2) {
                    cd2.a[] aVarArr = cd2.a.f40654d;
                    if (type == 2) {
                        return new com.tencent.mm.plugin.finder.convert.am(new com.tencent.mm.plugin.finder.convert.bm(i17, uhVar4.f109183e));
                    }
                    hc2.l.a("FinderLiveMention.NotifyViewCallback", type);
                    return new com.tencent.mm.plugin.finder.convert.zl();
                }
                com.tencent.mars.xlog.Log.w("FinderLiveMention.NotifyViewCallback", "Not support scene " + com.tencent.mm.plugin.finder.feed.li.this.f107294d + ".finderViewScene");
                return new com.tencent.mm.plugin.finder.convert.zl();
            }
        }, liVar.f107294d.f109191p, true);
        liVar.f107299i = wxRecyclerAdapter;
        wxRecyclerAdapter.F = new com.tencent.mm.plugin.finder.feed.bi();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = liVar.f107300m;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = liVar.f107299i;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.feed.ci(liVar);
        }
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f293104n = new com.tencent.mm.plugin.finder.feed.di(liVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = liVar.f107300m;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        ym5.a1.g(recyclerView3, new com.tencent.mm.plugin.finder.feed.ji(liVar));
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", "initRefresh.");
        pm0.v.V(200L, new com.tencent.mm.plugin.finder.feed.xh(liVar));
        androidx.recyclerview.widget.RecyclerView recyclerView4 = liVar.f107300m;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        ym5.a1.g(recyclerView4, new com.tencent.mm.plugin.finder.feed.ji(liVar));
        this.f290864e = liVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        super.onPause();
        com.tencent.mm.plugin.finder.feed.li liVar = this.f290864e;
        if (liVar == null || (wxRecyclerAdapter = liVar.f107299i) == null) {
            return;
        }
        wxRecyclerAdapter.z0();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.finder.feed.li liVar = this.f290864e;
        if (liVar == null || (wxRecyclerAdapter = liVar.f107299i) == null) {
            return;
        }
        wxRecyclerAdapter.A0();
    }
}
