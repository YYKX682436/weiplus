package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract;", "", "<init>", "()V", "BlockListPresenter", "BlockListViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderBlockListContract {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f122563a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f122564b;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class BlockListPresenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.storage.uj0 f122565d;

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback f122566e;

        /* renamed from: f, reason: collision with root package name */
        public final java.util.ArrayList f122567f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.protobuf.g f122568g;

        public BlockListPresenter(com.tencent.mm.plugin.finder.storage.uj0 config) {
            kotlin.jvm.internal.o.g(config, "config");
            this.f122565d = config;
            this.f122567f = new java.util.ArrayList();
        }

        public final void c() {
            com.tencent.mm.plugin.finder.storage.uj0 uj0Var = this.f122565d;
            if ((uj0Var instanceof com.tencent.mm.plugin.finder.storage.q ? (com.tencent.mm.plugin.finder.storage.q) uj0Var : null) != null) {
                com.tencent.mm.protobuf.g gVar = this.f122568g;
                com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter$doScene$1 finderBlockListContract$BlockListPresenter$doScene$1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter$doScene$1(this);
                com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter$doScene$2 finderBlockListContract$BlockListPresenter$doScene$2 = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter$doScene$2.f122570d;
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                new bq.h(gVar, null).l().q(new cq.s(finderBlockListContract$BlockListPresenter$doScene$1, finderBlockListContract$BlockListPresenter$doScene$2));
            }
        }

        public final void f() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList g17 = this.f122565d.g();
            if (g17 != null) {
                java.util.Iterator it = g17.iterator();
                while (it.hasNext()) {
                    arrayList.add(new so2.i0((com.tencent.mm.protocal.protobuf.FinderContact) it.next()));
                }
            }
            if (!arrayList.isEmpty()) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = this.f122566e;
                if (blockListViewCallback != null) {
                    blockListViewCallback.l(arrayList, true);
                }
            } else {
                com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback2 = this.f122566e;
                if (blockListViewCallback2 != null) {
                    blockListViewCallback2.o();
                }
            }
            pm0.v.V(300L, new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter$initData$1(this));
        }

        @Override // fs2.a
        public void onDetach() {
            this.f122566e = null;
            com.tencent.mm.plugin.finder.storage.uj0 uj0Var = this.f122565d;
            x51.h h17 = uj0Var.h();
            if (h17 != null) {
                h17.a();
            }
            java.util.ArrayList arrayList = this.f122567f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((so2.i0) it.next()).f410415d);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
            x51.h h18 = uj0Var.h();
            if (h18 != null) {
                h18.c(linkedList);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListPresenter;", "Lym5/l1;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class BlockListViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter f122572d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122573e;

        /* renamed from: f, reason: collision with root package name */
        public final android.view.View f122574f;

        /* renamed from: g, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122575g;

        /* renamed from: h, reason: collision with root package name */
        public com.tencent.mm.view.RefreshLoadMoreLayout f122576h;

        /* renamed from: i, reason: collision with root package name */
        public so2.u f122577i;

        /* renamed from: m, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122578m;

        public BlockListViewCallback(com.tencent.mm.ui.MMActivity activity, android.view.View rootView, com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter presenter) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(rootView, "rootView");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122572d = presenter;
            this.f122573e = activity;
            this.f122574f = rootView;
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.f122563a, "[onOverStart] dy=" + i18);
            return false;
        }

        public final void b() {
            android.view.View findViewById = this.f122574f.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
            this.f122576h = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setLimitTopRequest(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f122576h;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f122576h;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout3.setDamping(1.85f);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f122576h;
            if (refreshLoadMoreLayout4 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout4.getRecyclerView();
            this.f122575g = recyclerView;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            com.tencent.mm.ui.MMActivity mMActivity = this.f122573e;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f122576h;
            if (refreshLoadMoreLayout5 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f122572d;
            refreshLoadMoreLayout5.setEnableLoadMore(blockListPresenter.f122565d.c());
            boolean z17 = true;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (type == -3) {
                        return new com.tencent.mm.plugin.finder.convert.q();
                    }
                    if (type == -8) {
                        return new com.tencent.mm.plugin.finder.convert.r();
                    }
                    if (type == so2.i0.class.getName().hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.p();
                    }
                    kotlin.jvm.internal.o.d(null);
                    throw new jz5.d();
                }
            }, blockListPresenter.f122567f, true);
            this.f122578m = wxRecyclerAdapter;
            if (this.f122577i == null) {
                this.f122577i = new so2.u();
            }
            so2.u uVar = this.f122577i;
            kotlin.jvm.internal.o.d(uVar);
            in5.n0.S(wxRecyclerAdapter, uVar, false, 2, null);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f122575g;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$2
                /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r15 = this;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback r1 = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r1.f122578m
                        r2 = 1
                        r3 = 0
                        if (r0 == 0) goto L15
                        so2.u r4 = r1.f122577i
                        kotlin.jvm.internal.o.d(r4)
                        boolean r0 = r0.W(r4)
                        if (r0 != 0) goto L15
                        r0 = r2
                        goto L16
                    L15:
                        r0 = r3
                    L16:
                        if (r0 == 0) goto L1a
                        goto L95
                    L1a:
                        androidx.recyclerview.widget.RecyclerView r0 = r1.f122575g
                        r4 = 0
                        java.lang.String r5 = "recyclerView"
                        if (r0 == 0) goto L9a
                        androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                        boolean r6 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
                        if (r6 == 0) goto L2d
                        androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                        r14 = r0
                        goto L2e
                    L2d:
                        r14 = r4
                    L2e:
                        if (r14 == 0) goto L82
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.lang.ThreadLocal r6 = zj0.c.f473285a
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                        r0.add(r6)
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        r0.add(r6)
                        java.util.Collections.reverse(r0)
                        java.lang.Object[] r7 = r0.toArray()
                        java.lang.String r8 = "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback"
                        java.lang.String r9 = "hideSearchBar"
                        java.lang.String r10 = "(JZ)V"
                        java.lang.String r11 = "Undefined"
                        java.lang.String r12 = "scrollToPositionWithOffset"
                        java.lang.String r13 = "(II)V"
                        r6 = r14
                        yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
                        java.lang.Object r3 = r0.get(r3)
                        java.lang.Integer r3 = (java.lang.Integer) r3
                        int r3 = r3.intValue()
                        java.lang.Object r0 = r0.get(r2)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r14.P(r3, r0)
                        java.lang.String r7 = "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback"
                        java.lang.String r8 = "hideSearchBar"
                        java.lang.String r9 = "(JZ)V"
                        java.lang.String r10 = "Undefined"
                        java.lang.String r11 = "scrollToPositionWithOffset"
                        java.lang.String r12 = "(II)V"
                        yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
                    L82:
                        androidx.recyclerview.widget.RecyclerView r6 = r1.f122575g
                        if (r6 == 0) goto L96
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$hideSearchBar$1 r7 = new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$hideSearchBar$1
                        r2 = 0
                        r4 = 200(0xc8, double:9.9E-322)
                        r0 = r7
                        r3 = r14
                        r0.<init>()
                        r0 = 200(0xc8, double:9.9E-322)
                        r6.postDelayed(r7, r0)
                    L95:
                        return
                    L96:
                        kotlin.jvm.internal.o.o(r5)
                        throw r4
                    L9a:
                        kotlin.jvm.internal.o.o(r5)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$2.run():void");
                }
            });
            java.lang.CharSequence f17 = blockListPresenter.f122565d.f(mMActivity);
            if (f17 != null && f17.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f122578m;
                kotlin.jvm.internal.o.d(wxRecyclerAdapter2);
                in5.n0.S(wxRecyclerAdapter2, new so2.z(blockListPresenter.f122565d), false, 2, null);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f122578m;
            if (wxRecyclerAdapter3 != null) {
                wxRecyclerAdapter3.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$3
                    @Override // in5.x
                    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this;
                        if (i17 == 0) {
                            blockListViewCallback.f122572d.f122565d.l(blockListViewCallback.f122573e);
                            return;
                        }
                        int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 < 0 || a07 >= blockListViewCallback.f122572d.f122567f.size()) {
                            return;
                        }
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact = ((so2.i0) blockListViewCallback.f122572d.f122567f.get(a07)).f410415d;
                        if (!com.tencent.mm.storage.z3.S3(finderContact.getUsername())) {
                            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Bk(finderContact.getUsername(), blockListViewCallback.f122573e);
                            return;
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("finder_username", finderContact.getUsername());
                        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                        android.content.Context context = holder.f293121e;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        i0Var.mk(context, intent);
                    }
                };
            }
            if (wxRecyclerAdapter3 != null) {
                wxRecyclerAdapter3.f293104n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4
                    @Override // in5.y
                    public boolean c(final androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        kotlin.jvm.internal.o.g(adapter, "adapter");
                        kotlin.jvm.internal.o.g(view, "view");
                        kotlin.jvm.internal.o.g(holder, "holder");
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this;
                        rl5.r rVar = new rl5.r(blockListViewCallback.f122573e);
                        final int a07 = i17 - ((in5.n0) adapter).a0();
                        rVar.g(view, a07, 0L, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$1
                            @Override // android.view.View.OnCreateContextMenuListener
                            public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view2, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                if (contextMenu != null) {
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this.getClass();
                                    contextMenu.add(0, 0, 0, com.tencent.mm.R.string.eoj);
                                }
                            }
                        }, new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2
                            @Override // db5.t4
                            public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                                final int i19 = a07;
                                if (i19 >= 0) {
                                    final com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback2 = blockListViewCallback;
                                    if (i19 < blockListViewCallback2.f122572d.f122567f.size()) {
                                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter2 = blockListViewCallback2.f122572d;
                                        com.tencent.mm.plugin.finder.storage.uj0 uj0Var = blockListPresenter2.f122565d;
                                        com.tencent.mm.protocal.protobuf.FinderContact finderContact = ((so2.i0) blockListPresenter2.f122567f.get(i19)).f410415d;
                                        final androidx.recyclerview.widget.f2 f2Var = adapter;
                                        uj0Var.d(finderContact, new com.tencent.mm.plugin.finder.storage.tj0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2$onMMMenuItemSelected$1
                                            @Override // com.tencent.mm.plugin.finder.storage.tj0
                                            public void a(boolean z18) {
                                                com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback3 = blockListViewCallback2;
                                                if (z18) {
                                                    int size = blockListViewCallback3.f122572d.f122567f.size();
                                                    int i27 = i19;
                                                    if (i27 < size && i27 >= 0) {
                                                        blockListViewCallback3.f122572d.f122567f.remove(i27);
                                                    }
                                                    androidx.recyclerview.widget.f2 f2Var2 = f2Var;
                                                    f2Var2.notifyItemRemoved(((in5.n0) f2Var2).a0() + i27);
                                                } else {
                                                    db5.t7.makeText(blockListViewCallback3.f122573e, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, 0).show();
                                                }
                                                blockListViewCallback3.o();
                                            }
                                        });
                                    }
                                }
                            }
                        }, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
                        rVar.m();
                        return true;
                    }
                };
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f122575g;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView3.setAdapter(wxRecyclerAdapter3);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f122576h;
            if (refreshLoadMoreLayout6 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout6.setOverCallback(this);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout7 = this.f122576h;
            if (refreshLoadMoreLayout7 != null) {
                refreshLoadMoreLayout7.setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$5
                    @Override // ym5.q3
                    public void b(int i17) {
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this.f122572d.c();
                    }

                    @Override // ym5.q3
                    public void c(ym5.s3 reason) {
                        kotlin.jvm.internal.o.g(reason, "reason");
                    }

                    @Override // ym5.q3
                    public void d(int i17, rn5.a aVar, boolean z18) {
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this;
                        blockListViewCallback.f122572d.c();
                        androidx.recyclerview.widget.RecyclerView recyclerView4 = blockListViewCallback.f122575g;
                        if (recyclerView4 != null) {
                            recyclerView4.setItemAnimator(new uw2.n0());
                        } else {
                            kotlin.jvm.internal.o.o("recyclerView");
                            throw null;
                        }
                    }

                    @Override // ym5.q3
                    public void e(ym5.s3 reason) {
                        kotlin.jvm.internal.o.g(reason, "reason");
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this;
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout8 = blockListViewCallback.f122576h;
                        if (refreshLoadMoreLayout8 == null) {
                            kotlin.jvm.internal.o.o("rlLayout");
                            throw null;
                        }
                        com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout8, null, 1, null);
                        androidx.recyclerview.widget.RecyclerView recyclerView4 = blockListViewCallback.f122575g;
                        if (recyclerView4 != null) {
                            recyclerView4.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$5$onRefreshEnd$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    androidx.recyclerview.widget.RecyclerView recyclerView5 = com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback.this.f122575g;
                                    if (recyclerView5 != null) {
                                        recyclerView5.setItemAnimator(new rs.k());
                                    } else {
                                        kotlin.jvm.internal.o.o("recyclerView");
                                        throw null;
                                    }
                                }
                            }, 1000L);
                        } else {
                            kotlin.jvm.internal.o.o("recyclerView");
                            throw null;
                        }
                    }
                });
            } else {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.f122563a, "[onOverStop]");
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122573e;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.f122563a, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final void l(java.util.List newList, boolean z17) {
            kotlin.jvm.internal.o.g(newList, "newList");
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = this.f122572d.f122567f.size();
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.f122564b;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            pm0.v.V(uptimeMillis >= ((java.lang.Number) t70Var.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis, new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$finishLoadMore$1(z17, this, newList, f0Var));
        }

        public final void o() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f122572d;
            int size = blockListPresenter.f122567f.size();
            android.view.View view = this.f122574f;
            if (size != 0) {
                android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m6e);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.lrd);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.m6e);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.lrd);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lrd)).setText(blockListPresenter.f122565d.k(this.f122573e));
            com.tencent.mm.plugin.finder.view.b0 b0Var = com.tencent.mm.plugin.finder.view.CollapsibleTextView.f130818x;
            android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.lrd);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            b0Var.a((android.widget.TextView) findViewById5);
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract();
        f122563a = "Finder.FinderBlockListContract";
        f122564b = android.os.SystemClock.uptimeMillis();
    }

    private FinderBlockListContract() {
    }
}
