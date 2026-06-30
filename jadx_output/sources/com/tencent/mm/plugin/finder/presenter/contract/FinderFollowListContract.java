package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract;", "", "<init>", "()V", "FollowListPresent", "FollowListViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowListContract {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract f122599a = new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListPresent;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class FollowListPresent implements fs2.a, com.tencent.mm.modelbase.u0 {

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback f122601e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.protobuf.g f122602f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f122606m;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f122608o;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f122600d = "Finder.FinderFollowListContract.FollowListPresent." + hashCode();

        /* renamed from: g, reason: collision with root package name */
        public final java.util.ArrayList f122603g = new java.util.ArrayList();

        /* renamed from: h, reason: collision with root package name */
        public final bu2.o f122604h = new bu2.o("followList.fp");

        /* renamed from: i, reason: collision with root package name */
        public boolean f122605i = true;

        /* renamed from: n, reason: collision with root package name */
        public long f122607n = android.os.SystemClock.uptimeMillis();

        public FollowListPresent() {
            cq.k1.a();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            this.f122608o = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ff).getValue()).r()).booleanValue();
        }

        public final void c(boolean z17) {
            this.f122607n = android.os.SystemClock.uptimeMillis();
            this.f122606m = z17;
            if (!this.f122608o) {
                gm0.j1.d().g(new db2.o5(this.f122602f));
                return;
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f122601e;
            if (followListViewCallback == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.ui.MMActivity activity = followListViewCallback.f122620d;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            new bq.l0(this.f122602f, V6).l().h(new cq.g0(new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$doGetFollowScene$1(this), new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$doGetFollowScene$2(this)));
        }

        public final void f(boolean z17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, final java.util.LinkedList linkedList, boolean z18) {
            long j17;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            if (z17) {
                final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                if (!kotlin.jvm.internal.o.b(this.f122602f, gVar)) {
                    com.tencent.mars.xlog.Log.i(this.f122600d, "not my buf, ignore!");
                    return;
                }
                if (this.f122602f == null) {
                    c0Var.f310112d = true;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$handleGetFollowListResp$1$1(this, linkedList));
                }
                this.f122605i = z18;
                this.f122602f = gVar2;
                h0Var.f310123d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$handleGetFollowListResp$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        boolean z19;
                        boolean z27 = c0Var.f310112d;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent.this;
                        boolean z28 = followListPresent.f122606m;
                        followListPresent.getClass();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstPage ");
                        sb6.append(z27);
                        sb6.append(", get follow contact ");
                        java.util.LinkedList linkedList2 = linkedList;
                        sb6.append(linkedList2.size());
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String str = followListPresent.f122600d;
                        com.tencent.mars.xlog.Log.i(str, sb7);
                        java.util.ArrayList arrayList = followListPresent.f122603g;
                        int size = arrayList.size();
                        int size2 = linkedList2.size();
                        if (z27) {
                            arrayList.clear();
                            size = -1;
                            size2 = -1;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                        java.util.Iterator it = linkedList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else {
                                arrayList2.add(new so2.v1(ya2.d.h((com.tencent.mm.protocal.protobuf.FinderContact) it.next(), null, false, 3, null)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = followListPresent.f122601e;
                        if (followListViewCallback == null) {
                            kotlin.jvm.internal.o.o("viewCallback");
                            throw null;
                        }
                        followListViewCallback.o(z28, size, size2);
                        boolean z29 = true;
                        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                            z19 = true;
                        } else {
                            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            z19 = false;
                        }
                        if (!z19 && !z65.c.a()) {
                            kb2.b bVar = kb2.b.f306225a;
                            z29 = false;
                        }
                        if (z29) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("firstPage:" + z27 + ';');
                            int size3 = linkedList2.size();
                            for (i17 = 0; i17 < size3; i17++) {
                                sb8.append("[" + i17 + "]:");
                                sb8.append(pm0.b0.g(linkedList2.get(i17)));
                                sb8.append(";");
                            }
                            com.tencent.mars.xlog.Log.i(str, "printFinderContactList :" + ((java.lang.Object) sb8));
                        }
                    }
                };
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f122607n;
            if (!this.f122606m) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (uptimeMillis < ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    j17 = ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis;
                    pm0.v.V(j17, new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$handleGetFollowListResp$3(h0Var));
                }
            }
            j17 = 0;
            pm0.v.V(j17, new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$handleGetFollowListResp$3(h0Var));
        }

        @Override // fs2.a
        public void onDetach() {
            if (!this.f122608o) {
                gm0.j1.d().q(713, this);
            }
            gm0.j1.d().q(3867, this);
            com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f122601e;
            if (followListViewCallback == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = followListViewCallback.f122627n;
            if (recyclerView != null) {
                recyclerView.V0(followListViewCallback.f122631r);
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }

        @Override // com.tencent.mm.modelbase.u0
        public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
            sb6.append(i17);
            sb6.append(", errCode ");
            sb6.append(i18);
            sb6.append(", errMsg ");
            sb6.append(str);
            sb6.append(" scene type ");
            sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str2 = this.f122600d;
            com.tencent.mars.xlog.Log.i(str2, sb7);
            java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
            if (valueOf != null && valueOf.intValue() == 713) {
                boolean z17 = i17 == 0 && i18 == 0;
                kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowList");
                db2.o5 o5Var = (db2.o5) m1Var;
                com.tencent.mm.protobuf.f fVar = o5Var.f228106g.f70710a.f70684a;
                r45.k61 k61Var = fVar instanceof r45.k61 ? (r45.k61) fVar : null;
                com.tencent.mm.protobuf.g byteString = k61Var != null ? k61Var.getByteString(1) : null;
                com.tencent.mm.protobuf.g L = o5Var.L();
                java.util.LinkedList K = o5Var.K();
                com.tencent.mm.protobuf.f fVar2 = o5Var.f228106g.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
                f(z17, byteString, L, K, ((r45.l61) fVar2).getInteger(3) != 0);
                return;
            }
            if (valueOf != null && valueOf.intValue() == 3867 && i17 == 0 && i18 == 0) {
                com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
                com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
                com.tencent.mm.protobuf.f fVar3 = oVar != null ? oVar.f70710a.f70684a : null;
                r45.s31 s31Var = fVar3 instanceof r45.s31 ? (r45.s31) fVar3 : null;
                java.lang.String string = (s31Var == null || s31Var.getInteger(2) != 2) ? "" : s31Var.getString(1);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    return;
                }
                kz5.h0.B(this.f122603g, new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$onSceneEnd$1(string));
                com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f122601e;
                if (followListViewCallback == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                followListViewCallback.o(false, -1, -1);
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
                int r17 = c17.r(u3Var, 0);
                com.tencent.mars.xlog.Log.i(str2, "oldFollowCnt %d", java.lang.Integer.valueOf(r17));
                if (r17 > 0) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 - 1));
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListPresent;", "Lym5/l1;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class FollowListViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122620d;

        /* renamed from: e, reason: collision with root package name */
        public final android.view.View f122621e;

        /* renamed from: f, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent f122622f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f122623g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.TextView f122624h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f122625i;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f122626m;

        /* renamed from: n, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122627n;

        /* renamed from: o, reason: collision with root package name */
        public com.tencent.mm.view.RefreshLoadMoreLayout f122628o;

        /* renamed from: p, reason: collision with root package name */
        public com.tencent.mm.ui.widget.MMProcessBar f122629p;

        /* renamed from: q, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122630q;

        /* renamed from: r, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1 f122631r;

        /* JADX WARN: Type inference failed for: r2v6, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1] */
        public FollowListViewCallback(com.tencent.mm.ui.MMActivity activity, android.view.View contentView, com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent presenter, android.content.Intent intent) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(contentView, "contentView");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122620d = activity;
            this.f122621e = contentView;
            this.f122622f = presenter;
            this.f122623g = "Finder.FinderFollowListContract.FollowListViewCallback." + hashCode();
            this.f122625i = intent != null && intent.getBooleanExtra("from_teen_mode_setting_page", false);
            this.f122626m = intent != null && intent.getBooleanExtra("key_is_aggregation_page", false);
            this.f122631r = new androidx.recyclerview.widget.w2() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1
                @Override // androidx.recyclerview.widget.w2
                public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(recyclerView);
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                }

                @Override // androidx.recyclerview.widget.w2
                public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(recyclerView);
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
                    kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.Kh((zy2.zb) c17, recyclerView, ml2.x1.f328201e, "12", ml2.y.f328239d, 0, 0L, 0, 112, null);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                }
            };
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(this.f122623g, "[onOverStart] dy=" + i18);
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f122629p;
            if (mMProcessBar != null) {
                mMProcessBar.b(i18 / ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479684cj)));
                return false;
            }
            kotlin.jvm.internal.o.o("rlProcessBar");
            throw null;
        }

        public final void b() {
            android.view.View view = this.f122621e;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
            this.f122628o = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setLimitTopRequest(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f122628o;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f122628o;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setDamping(1.85f);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.m6l);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f122629p = (com.tencent.mm.ui.widget.MMProcessBar) findViewById2;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f122628o;
            if (refreshLoadMoreLayout4 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout4.getRecyclerView();
            this.f122627n = recyclerView;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            com.tencent.mm.ui.MMActivity mMActivity = this.f122620d;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (type == so2.v1.class.getName().hashCode()) {
                        return com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.f122626m ? new com.tencent.mm.plugin.finder.convert.al(dv2.i.f243865e) : new com.tencent.mm.plugin.finder.convert.el();
                    }
                    hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.f122623g, type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
            };
            com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent = this.f122622f;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, followListPresent.f122603g, true);
            this.f122630q = wxRecyclerAdapter;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f122627n;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView2.setAdapter(wxRecyclerAdapter);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f122630q;
            kotlin.jvm.internal.o.d(wxRecyclerAdapter2);
            wxRecyclerAdapter2.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$2
                @Override // in5.x
                public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                    in5.s0 holder = (in5.s0) k3Var;
                    kotlin.jvm.internal.o.g(adapter, "adapter");
                    kotlin.jvm.internal.o.g(view2, "view");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this;
                    java.util.ArrayList arrayList = followListViewCallback.f122622f.f122603g;
                    if (i17 < 0 || i17 >= arrayList.size()) {
                        com.tencent.mars.xlog.Log.e(followListViewCallback.f122623g, "[-] position out of bound, position:%s, length:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
                        return;
                    }
                    if (((so2.v1) arrayList.get(i17)).f410645d.field_liveStatus == 1) {
                        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).rj(null, ((so2.v1) arrayList.get(i17)).f410645d.D0(), i17, ml2.x1.f328204h, "12");
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract finderFollowListContract = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.f122599a;
                    ya2.b2 b2Var = ((so2.v1) arrayList.get(i17)).f410645d;
                    boolean z17 = followListViewCallback.f122625i;
                    com.tencent.mm.ui.MMActivity context = followListViewCallback.f122620d;
                    finderFollowListContract.a(context, b2Var, z17);
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    if (nyVar != null) {
                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(6, 0L, nyVar.V6(), 1, ((so2.v1) arrayList.get(i17)).f410645d.D0());
                    }
                }
            };
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f122630q;
            kotlin.jvm.internal.o.d(wxRecyclerAdapter3);
            wxRecyclerAdapter3.f293104n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$3
                @Override // in5.y
                public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view2, int i17, androidx.recyclerview.widget.k3 k3Var) {
                    in5.s0 holder = (in5.s0) k3Var;
                    kotlin.jvm.internal.o.g(adapter, "adapter");
                    kotlin.jvm.internal.o.g(view2, "view");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this;
                    java.util.ArrayList arrayList = followListViewCallback.f122622f.f122603g;
                    if (g92.b.f269769e.v(((so2.v1) arrayList.get(i17)).f410645d.D0())) {
                        return true;
                    }
                    java.lang.Object obj = arrayList.get(i17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    so2.v1 v1Var = (so2.v1) obj;
                    com.tencent.mm.ui.MMActivity mMActivity2 = followListViewCallback.f122620d;
                    java.lang.String string = mMActivity2.getString(com.tencent.mm.R.string.f492116f92);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    qd2.k.a(mMActivity2, view2, string, new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$showPopupMenu$1(v1Var.f410645d, followListViewCallback, v1Var));
                    return true;
                }
            };
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f122628o;
            if (refreshLoadMoreLayout5 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout5.setOverCallback(this);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f122628o;
            if (refreshLoadMoreLayout6 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout6.setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$4
                @Override // ym5.q3
                public void b(int i17) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.f122622f.c(true);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.l();
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent2 = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.f122622f;
                    followListPresent2.f122602f = null;
                    followListPresent2.c(false);
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    android.view.View findViewById3;
                    android.widget.TextView textView;
                    kotlin.jvm.internal.o.g(reason, "reason");
                    boolean z17 = reason.f463521f;
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this;
                    if (z17) {
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout7 = followListViewCallback.f122628o;
                        if (refreshLoadMoreLayout7 == null) {
                            kotlin.jvm.internal.o.o("rlLayout");
                            throw null;
                        }
                        if (!refreshLoadMoreLayout7.isHasBottomMore) {
                            if (refreshLoadMoreLayout7 == null) {
                                kotlin.jvm.internal.o.o("rlLayout");
                                throw null;
                            }
                            refreshLoadMoreLayout7.setHasBottomMore(true);
                            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout8 = followListViewCallback.f122628o;
                            if (refreshLoadMoreLayout8 == null) {
                                kotlin.jvm.internal.o.o("rlLayout");
                                throw null;
                            }
                            android.view.View f213435x = refreshLoadMoreLayout8.getF213435x();
                            if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                                textView.setVisibility(0);
                            }
                            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout9 = followListViewCallback.f122628o;
                            if (refreshLoadMoreLayout9 == null) {
                                kotlin.jvm.internal.o.o("rlLayout");
                                throw null;
                            }
                            android.view.View f213435x2 = refreshLoadMoreLayout9.getF213435x();
                            if (f213435x2 != null && (findViewById3 = f213435x2.findViewById(com.tencent.mm.R.id.ilg)) != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(8);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout10 = followListViewCallback.f122628o;
                    if (refreshLoadMoreLayout10 == null) {
                        kotlin.jvm.internal.o.o("rlLayout");
                        throw null;
                    }
                    com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout10, null, 1, null);
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328201e, "12", ml2.y.f328242g, 0, 0L, 0, 112, null);
                }
            });
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.dft);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            this.f122624h = (android.widget.TextView) findViewById3;
            com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a;
            kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(com.tencent.mm.plugin.finder.viewmodel.component.bh.f133878b, new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5(this, null)), v65.m.b(mMActivity));
            mMActivity.setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$6
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem it) {
                    kotlin.jvm.internal.o.g(it, "it");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.f122620d.finish();
                    return true;
                }
            });
            followListPresent.getClass();
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            pm0.v.T(pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$loadStart$1(followListPresent)), new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$loadStart$2(followListPresent));
            followListPresent.c(false);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_finder_search_watchlist_android, 1) == 1) && !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                mMActivity.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_search, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$7
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem it) {
                        kotlin.jvm.internal.o.g(it, "it");
                        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
                        com.tencent.mm.plugin.finder.search.l4.f125763c = null;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("request_type", 3);
                        intent.putExtra("need_history", false);
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nj(com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback.this.f122620d, null, intent);
                        return true;
                    }
                });
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f122627n;
            if (recyclerView3 != null) {
                recyclerView3.i(this.f122631r);
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.tencent.mars.xlog.Log.i(this.f122623g, "[onOverStop]");
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f122629p;
            if (mMProcessBar != null) {
                mMProcessBar.d();
            } else {
                kotlin.jvm.internal.o.o("rlProcessBar");
                throw null;
            }
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122620d;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(this.f122623g, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final void l() {
            android.widget.TextView textView;
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, 0);
            if (this.f122622f.f122605i) {
                return;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127895q8).getValue()).r()).booleanValue()) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f122628o;
                if (refreshLoadMoreLayout != null) {
                    com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f122628o;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x = refreshLoadMoreLayout2.getF213435x();
            if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.cxk, java.lang.Integer.valueOf(r17)));
                textView.setVisibility(0);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f122628o;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x2 = refreshLoadMoreLayout3.getF213435x();
            android.view.View findViewById = f213435x2 != null ? f213435x2.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public final void o(boolean z17, int i17, int i18) {
            if (i17 < 0 || i18 <= 0) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122630q;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            } else {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f122630q;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemRangeInserted(i17, i18);
                }
            }
            if (!z17) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f122628o;
                if (refreshLoadMoreLayout == null) {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
                refreshLoadMoreLayout.P(0);
                l();
                return;
            }
            ym5.s3 s3Var = new ym5.s3(0);
            s3Var.f463521f = this.f122622f.f122605i;
            s3Var.f463523h = i18;
            if (i18 > 0) {
                s3Var.f463522g = false;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f122628o;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(s3Var);
            } else {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
        }
    }

    private FinderFollowListContract() {
    }

    public final void a(com.tencent.mm.ui.MMActivity activity, ya2.b2 b2Var, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (b2Var == null) {
            return;
        }
        int i17 = b2Var.K2 & 4;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        if (i17 <= 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", b2Var.D0());
            intent.putExtra("from_teen_mode_setting_page", z17);
            intent.putExtra("KEY_FROM_TIMELINE", true);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", ya2.d.b(b2Var, false) == null);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, activity, intent, 0L, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(activity, intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, activity, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        r45.xk b17 = ya2.d.b(b2Var, false);
        if (b17 == null || (str = b17.getString(0)) == null) {
            str = "";
        }
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("Contact_Scene", 213);
        intent2.putExtra("force_get_contact", true);
        intent2.putExtra("key_use_new_contact_profile", true);
        intent2.putExtra("biz_profile_tab_type", 1);
        j45.l.j(activity, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
    }
}
