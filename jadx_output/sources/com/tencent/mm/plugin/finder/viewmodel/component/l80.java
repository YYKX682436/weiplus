package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l80 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xv f135030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l80(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_d;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        getActivity().finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).setMMTitle(com.tencent.mm.R.string.ckm);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity2).setBackBtn(new com.tencent.mm.plugin.finder.viewmodel.component.k80(this));
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f135030d = new com.tencent.mm.plugin.finder.feed.xv((com.tencent.mm.ui.MMActivity) activity3);
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity4;
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f135030d;
        if (xvVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.cw cwVar = new com.tencent.mm.plugin.finder.feed.cw(mMActivity, xvVar, getRootView(), getFragment());
        final com.tencent.mm.plugin.finder.feed.xv xvVar2 = this.f135030d;
        if (xvVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        xvVar2.f111109h = cwVar;
        com.tencent.mm.plugin.finder.feed.jv c17 = xvVar2.c();
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = xvVar2.f111114p;
        java.util.ArrayList data = finderTimelineFeedLoader.getDataListJustForAdapter();
        com.tencent.mm.plugin.finder.feed.cw cwVar2 = (com.tencent.mm.plugin.finder.feed.cw) c17;
        kotlin.jvm.internal.o.g(data, "data");
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        cwVar2.j().setLimitTopRequest(((int) resources.getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) resources.getDimension(com.tencent.mm.R.dimen.f479657bu)));
        cwVar2.j().setRefreshTargetY(((int) resources.getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) resources.getDimension(com.tencent.mm.R.dimen.f480496zi)));
        cwVar2.j().setDamping(1.85f);
        androidx.recyclerview.widget.RecyclerView recyclerView = cwVar2.j().getRecyclerView();
        com.tencent.mm.plugin.finder.storage.vj0 vj0Var = cwVar2.f106510i;
        com.tencent.mm.ui.MMActivity activity5 = cwVar2.f106505d;
        recyclerView.setRecycledViewPool(vj0Var.e(activity5));
        cwVar2.f106511m = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1((com.tencent.mm.plugin.finder.storage.jj0) vj0Var, new com.tencent.mm.plugin.finder.feed.yv(cwVar2)), data, false);
        android.content.Context context = cwVar2.f106507f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.setLayoutManager(vj0Var.d(context));
        recyclerView.N(new com.tencent.mm.plugin.finder.storage.ij0());
        com.tencent.mm.plugin.finder.feed.xv xvVar3 = (com.tencent.mm.plugin.finder.feed.xv) cwVar2.f106506e;
        xvVar3.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int r19 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int r27 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        int r28 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        so2.t tVar = xvVar3.f111118t;
        tVar.f410598d = r17 + r18 + r19 + r27 + r28;
        tVar.f410600f = r17;
        tVar.f410601g = r28;
        tVar.f410599e = r18 + r19 + r27;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        tVar.f410602h = (java.lang.String) m17;
        linkedList.add(tVar);
        linkedList.add(xvVar3.f111111m);
        linkedList.add(xvVar3.f111116r);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            in5.n0.S(cwVar2.g(), (in5.w) it.next(), false, 2, null);
        }
        cwVar2.g().f293105o = new com.tencent.mm.plugin.finder.feed.zv(data, cwVar2);
        recyclerView.setAdapter(cwVar2.g());
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        cwVar2.j().setActionCallback(new com.tencent.mm.plugin.finder.feed.aw(cwVar2));
        kotlin.jvm.internal.o.g(activity5, "activity");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Z6(4);
        if (Z6 != null) {
            Z6.d(cwVar2.j().getRecyclerView());
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderTimelineFeedLoader, cwVar.j(), false, 2, null);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(xvVar2.f111105d, xvVar2.f111115q, false, 2, null);
        xvVar2.f111106e.N6(4).f257443c.size();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderTimelineFeedLoader, false, 1, null);
        finderTimelineFeedLoader.A = new com.tencent.mm.plugin.finder.feed.nv(xvVar2);
        ((com.tencent.mm.plugin.finder.feed.cw) xvVar2.c()).getRecyclerView().i(new com.tencent.mm.plugin.finder.feed.ov(xvVar2));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTagClickEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTagClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTimelineMachinePresenter$onAttach$3
            {
                this.__eventId = 1775861366;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent) {
                com.tencent.mm.autogen.events.FinderTagClickEvent event = finderTagClickEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.rv(event, com.tencent.mm.plugin.finder.feed.xv.this));
                return true;
            }
        };
        xvVar2.f111117s = iListener;
        iListener.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f135030d;
        if (xvVar != null) {
            xvVar.onDetach();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f135030d;
        if (xvVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ey2.t0.V6(xvVar.f111106e, "Finder.TimelineMachinePresenter_finish", 4, 0, xvVar.f111110i, xvVar.f111114p.getDataListJustForAdapter(), null, null, false, false, 480, null);
        r45.lw0 lw0Var = xvVar.f111112n;
        if (lw0Var != null) {
            ey2.k2 k2Var = xvVar.f111107f;
            k2Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderTagCacheVm", "tabType=4 lastExitPosition=-1  lastDataList size=" + lw0Var.getList(0).size() + ' ');
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = k2Var.f257420d;
            ey2.j2 j2Var = new ey2.j2(4);
            j2Var.f257409b = lw0Var;
            concurrentHashMap.put(4, j2Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f135030d;
        if (xvVar != null) {
            pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.uv(xvVar));
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }
}
