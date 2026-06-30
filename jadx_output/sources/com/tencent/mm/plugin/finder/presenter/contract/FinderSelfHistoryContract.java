package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract;", "", "<init>", "()V", "PlayHistoryPresenter", "PlayHistoryViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSelfHistoryContract {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract f123250a = new com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryPresenter;", "Lcom/tencent/mm/plugin/finder/feed/k0;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static class PlayHistoryPresenter extends com.tencent.mm.plugin.finder.feed.k0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayHistoryPresenter(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
            super(context, i17, i18, loader);
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(loader, "loader");
        }

        @Override // com.tencent.mm.plugin.finder.feed.k0
        public in5.s c() {
            com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
            com.tencent.mm.plugin.finder.storage.vj0 q17 = a1Var != null ? a1Var.q() : null;
            kotlin.jvm.internal.o.d(q17);
            return q17.a();
        }

        @Override // com.tencent.mm.plugin.finder.feed.k0
        public void g() {
            com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
            if (a1Var != null) {
                a1Var.r(this.f107156e.getDataListJustForAdapter());
            }
        }

        @Override // com.tencent.mm.plugin.finder.feed.k0
        public void h() {
            this.f107156e.requestInit(true);
        }

        @Override // com.tencent.mm.plugin.finder.feed.k0
        public void i() {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107156e, false, 1, null);
        }

        @Override // com.tencent.mm.plugin.finder.feed.k0
        public void v() {
            this.f107156e.requestRefresh();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback;", "Lcom/tencent/mm/plugin/finder/feed/a1;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static class PlayHistoryViewCallback extends com.tencent.mm.plugin.finder.feed.a1 {

        /* renamed from: u, reason: collision with root package name */
        public final int f123251u;

        /* renamed from: v, reason: collision with root package name */
        public final androidx.fragment.app.Fragment f123252v;

        /* renamed from: w, reason: collision with root package name */
        public final java.lang.String f123253w;

        /* renamed from: x, reason: collision with root package name */
        public android.widget.FrameLayout f123254x;

        /* renamed from: y, reason: collision with root package name */
        public android.widget.TextView f123255y;

        /* renamed from: z, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$mHellScrollListener$1 f123256z;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r0v6, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$mHellScrollListener$1] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PlayHistoryViewCallback(int r12, com.tencent.mm.ui.MMActivity r13, androidx.fragment.app.Fragment r14, int r15, int r16, boolean r17, int r18, kotlin.jvm.internal.i r19) {
            /*
                r11 = this;
                r9 = r11
                r10 = r14
                r0 = r18 & 32
                if (r0 == 0) goto L9
                r0 = 0
                r4 = r0
                goto Lb
            L9:
                r4 = r17
            Lb:
                java.lang.String r0 = "context"
                r1 = r13
                kotlin.jvm.internal.o.g(r13, r0)
                java.lang.String r0 = "fragment"
                kotlin.jvm.internal.o.g(r14, r0)
                r5 = 0
                r6 = 0
                r7 = 48
                r8 = 0
                r0 = r11
                r2 = r15
                r3 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                r0 = r12
                r9.f123251u = r0
                r9.f123252v = r10
                java.lang.String r0 = "Finder.PlayHistoryViewCallback"
                r9.f123253w = r0
                com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$mHellScrollListener$1 r0 = new com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$mHellScrollListener$1
                r0.<init>()
                r9.f123256z = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback.<init>(int, com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, kotlin.jvm.internal.i):void");
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public android.view.View A() {
            return this.f106174d.findViewById(com.tencent.mm.R.id.f486833v30);
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public java.lang.CharSequence B(ym5.s3 reason) {
            kotlin.jvm.internal.o.g(reason, "reason");
            return null;
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
            java.lang.String str;
            r45.xx0 xx0Var;
            kotlin.jvm.internal.o.g(adapter, "adapter");
            kotlin.jvm.internal.o.g(view, "view");
            int a07 = i17 - ((in5.n0) adapter).a0();
            if (a07 < 0 || a07 >= z().f107156e.getSize()) {
                return;
            }
            so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
            boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            if (!z17) {
                if (j5Var instanceof so2.c0) {
                    r45.vx0 vx0Var = (r45.vx0) ((so2.c0) j5Var).f410286d.getCustom(2);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
                    intent.putExtra("key_ref_object_id", (vx0Var == null || (xx0Var = (r45.xx0) vx0Var.getCustom(23)) == null) ? null : java.lang.Long.valueOf(xx0Var.getLong(1)));
                    intent.putExtra("key_topic_type", vx0Var != null ? java.lang.Integer.valueOf(vx0Var.getInteger(21)) : null);
                    if (vx0Var == null || (str = vx0Var.getString(1)) == null) {
                        str = "";
                    }
                    intent.putExtra("key_topic_title", str);
                    intent.putExtra("KEY_TOPIC_ID", vx0Var != null ? vx0Var.getLong(0) : 0L);
                    intent.putExtra("KEY_COLLECTION_INFO", vx0Var != null ? vx0Var.toByteArray() : null);
                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, this.f106174d, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(mMActivity, intent);
                    return;
                }
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb6.append(baseFinderFeed.getFeedObject().getId());
            sb6.append(", pos:");
            sb6.append(a07);
            com.tencent.mars.xlog.Log.i(this.f123253w, sb6.toString());
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("history_tab_type", this.f123251u);
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent2, a07, null, 4, null);
            iyVar.c(mMActivity, intent2);
            wa2.x.e(intent2, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            i0Var.getClass();
            intent2.setClass(activity, com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryTimeLineUI.class);
            iyVar.c(activity, intent2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPlayHistoryTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterPlayHistoryTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            androidx.fragment.app.Fragment fragment = this.f123252v;
            kotlin.jvm.internal.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long itemId = j5Var.getItemId();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            java.lang.String w17 = baseFinderFeed2.w();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
            java.lang.String jSONObject = baseFinderFeed2.getUdfKv().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, itemId, w17, recyclerView, 0, jSONObject, 0L, null, 208, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public void L(androidx.recyclerview.widget.f2 adapter, final android.view.View view, int i17) {
            kotlin.jvm.internal.o.g(adapter, "adapter");
            kotlin.jvm.internal.o.g(view, "view");
            int a07 = i17 - ((in5.n0) adapter).a0();
            if (a07 < 0 || a07 >= z().f107156e.getSize()) {
                return;
            }
            final so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
            if ((j5Var instanceof so2.u1) || (j5Var instanceof so2.c0)) {
                rl5.r rVar = new rl5.r(view.getContext(), view);
                rVar.C = true;
                rVar.f397355y = new db5.n4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$onGridItemLongClick$1
                    @Override // db5.n4
                    public final void a(db5.g4 g4Var, android.view.View view2, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                        g4Var.c(0, 6, 0, view.getContext().getResources().getString(com.tencent.mm.R.string.map), com.tencent.mm.R.raw.icons_filled_delete);
                    }
                };
                rVar.f397354x = new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$onGridItemLongClick$2
                    @Override // db5.t4
                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                        jz5.f0 f0Var;
                        final com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback.this;
                        if (menuItem != null) {
                            if (menuItem.getItemId() == 6) {
                                playHistoryViewCallback.getClass();
                                com.tencent.mm.ui.MMActivity mMActivity = playHistoryViewCallback.f106174d;
                                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 1, true);
                                k0Var.q(mMActivity.getResources().getString(com.tencent.mm.R.string.maq), 17);
                                k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$handleDelete$1
                                    @Override // db5.o4
                                    public final void onCreateMMMenu(db5.g4 g4Var) {
                                        if (g4Var.z()) {
                                            g4Var.d(4, android.graphics.Color.parseColor("#FA5151"), com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback.this.f106174d.getResources().getString(com.tencent.mm.R.string.map));
                                        }
                                    }
                                };
                                final so2.j5 j5Var2 = j5Var;
                                k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$handleDelete$2
                                    @Override // db5.t4
                                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem2, int i19) {
                                        if (menuItem2.getItemId() == 4) {
                                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                            ya2.r rVar2 = ya2.r.f460525a;
                                            java.util.LinkedList linkedList = new java.util.LinkedList();
                                            final so2.j5 j5Var3 = so2.j5.this;
                                            if (j5Var3 instanceof so2.u1) {
                                                linkedList.add(java.lang.Long.valueOf(j5Var3.getItemId()));
                                            }
                                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                                            if (j5Var3 instanceof so2.c0) {
                                                linkedList2.add(java.lang.Long.valueOf(j5Var3.getItemId()));
                                            }
                                            final com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback2 = playHistoryViewCallback;
                                            rVar2.d(3, linkedList, linkedList2, new zy2.gc() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$handleDelete$2.3
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
                                                /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
                                                /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
                                                /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
                                                /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
                                                /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
                                                /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
                                                @Override // zy2.gc
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public void r5(java.lang.Object r14, r45.ix0 r15) {
                                                    /*
                                                        Method dump skipped, instructions count: 368
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract$PlayHistoryViewCallback$handleDelete$2.AnonymousClass3.r5(java.lang.Object, r45.ix0):void");
                                                }
                                            });
                                        }
                                    }
                                };
                                k0Var.v();
                            }
                            f0Var = jz5.f0.f302826a;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.e(playHistoryViewCallback.f123253w, "[OnMMMenuItemSelectedListener] item = null!!");
                        }
                    }
                };
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rVar.n(iArr[0] + (view.getWidth() / 2), iArr[1]);
                com.tencent.mm.ui.MMActivity context = this.f106174d;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[5];
                lVarArr[0] = new jz5.l("expose_type", 0);
                lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
                lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
                lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
                lVarArr[4] = new jz5.l("feed_id", pm0.v.u(j5Var.getItemId()));
                ((cy1.a) rVar2).Bj("recently_browse_feed_delete", "view_exp", kz5.c1.k(lVarArr), 1, false);
            }
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public void M() {
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public boolean R() {
            return !(this instanceof com.tencent.mm.plugin.finder.feed.xa);
        }

        public final void W() {
            boolean isEmpty = z().f107156e.getDataListJustForAdapter().isEmpty();
            android.view.View view = null;
            com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
            if (!isEmpty) {
                com.tencent.mm.ui.eb E = mMActivity.getController().E(0);
                if (E != null) {
                    android.view.View view2 = E.f208385k;
                    if (view2 != null) {
                        view = view2;
                    } else {
                        android.view.View view3 = E.f208384j;
                        if (view3 != null) {
                            view = view3;
                        }
                    }
                }
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view4 = view;
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback", "refreshTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback", "refreshTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var = z().f107157f;
            if (a1Var != null) {
                a1Var.U();
            }
            android.widget.FrameLayout frameLayout = this.f123254x;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            getRecyclerView().V0(this.f123256z);
            com.tencent.mm.ui.eb E2 = mMActivity.getController().E(0);
            if (E2 != null) {
                android.view.View view5 = E2.f208385k;
                if (view5 != null) {
                    view = view5;
                } else {
                    android.view.View view6 = E2.f208384j;
                    if (view6 != null) {
                        view = view6;
                    }
                }
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view7 = view;
            yj0.a.d(view7, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback", "refreshTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/presenter/contract/FinderSelfHistoryContract$PlayHistoryViewCallback", "refreshTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f106174d;
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public void r(java.util.ArrayList data) {
            fc2.o Z6;
            fc2.o Z62;
            kotlin.jvm.internal.o.g(data, "data");
            super.r(data);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f106180m;
            com.tencent.mm.ui.MMActivity context = this.f106174d;
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dp9, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            refreshLoadMoreLayout.setLoadMoreFooter(inflate);
            kotlin.jvm.internal.o.g(context, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (Z62 = nyVar.Z6(-1)) != null) {
                Z62.d(getRecyclerView());
            }
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            ((cy1.a) rVar).Bj("recently_browse_search", "view_exp", kz5.c1.k(lVarArr), 1, false);
            new rl5.r(context);
            android.view.View A = A();
            this.f123254x = A != null ? (android.widget.FrameLayout) A.findViewById(com.tencent.mm.R.id.q0n) : null;
            android.view.View A2 = A();
            this.f123255y = A2 != null ? (android.widget.TextView) A2.findViewById(com.tencent.mm.R.id.q0s) : null;
            androidx.fragment.app.Fragment fragment = this.f123252v;
            kotlin.jvm.internal.o.g(fragment, "fragment");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar3 == null || (Z6 = nyVar3.Z6(-1)) == null) {
                return;
            }
            Z6.d(getRecyclerView());
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public java.lang.String s(ym5.s3 reason) {
            kotlin.jvm.internal.o.g(reason, "reason");
            return null;
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public android.view.View t() {
            android.view.View A = A();
            if (A != null) {
                return A.findViewById(com.tencent.mm.R.id.f484229dg3);
            }
            return null;
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public android.view.View w() {
            return null;
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public androidx.recyclerview.widget.p2 x() {
            ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
            return new com.tencent.mm.plugin.finder.storage.ij0();
        }

        @Override // com.tencent.mm.plugin.finder.feed.a1
        public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            return this.f106184q.d(context);
        }
    }

    private FinderSelfHistoryContract() {
    }

    public final java.lang.String a(long j17) {
        int b17 = new java.util.GregorianCalendar().get(6) - b(j17);
        if (b17 == 0) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fd_);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (b17 == 1) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdi);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (b17 != 2) {
            return android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492135fc2), j17).toString();
        }
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492141fd2);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }

    public final int b(long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(j17));
        return calendar.get(6);
    }
}
